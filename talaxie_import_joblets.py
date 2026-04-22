# --- Libs ---
import argparse
import os
import shutil
from lxml import etree
from typing import Optional, Dict

# --- Context ---
parser = argparse.ArgumentParser(
    description="Displays the contents of the WORKSPACE folder."
)
parser.add_argument("WORKSPACE", type=str, help="Specify the project to be analyzed using the absolute path of the workspace.")

args = parser.parse_args()
workspace = args.WORKSPACE
process_path = os.path.join(workspace, "process")
joblets_path = os.path.join(workspace, "joblets")
joblets_import = os.path.join(process_path, "JOBLETS_IMPORT")
XMLNS_URI = "http://www.w3.org/2000/xmlns/"
namespaces = {
    "tp": "http://www.talend.org/properties",
    "talendfile": "platform:/resource/org.talend.model/model/TalendFile.xsd",
    "model": "http://www.talend.com/joblet.ecore",
    "sig": "http://www.w3.org/2000/09/xmldsig#"
}

# --- Functions ---

def count_item_files_in_joblets(workspace):

    if not os.path.isdir(joblets_path):
        raise ValueError(f"Joblets introuvables dans : {workspace}")

    item_files = [
        f for f in os.listdir(joblets_path)
        if f.endswith(".item") and os.path.isfile(os.path.join(joblets_path, f))
    ]

    return len(item_files)

def list_joblets(workspace):

    if not os.path.isdir(joblets_path):
        raise ValueError(f"Joblets introuvables dans : {workspace}")

    item_files_trimmed = [
        os.path.splitext(f)[0]
        for f in os.listdir(joblets_path)
        if f.endswith(".item") and os.path.isfile(os.path.join(joblets_path, f))
    ]

    return item_files_trimmed

def ask_confirmation(message="Perform the conversion? ([y]es/[n]o) : "):

    while True:
        choice = input(message).strip().lower()

        if choice in ("o", "oui", "y", "yes"):
            return True
        elif choice in ("n", "non", "no"):
            print("🛑  STOPPED")
            return False
        else:
            print("❗  Invalid response, please answer 'yes' or 'no'")

def copy_joblets_to_import(workspace):

    # Check workspace's folders
    if not os.path.isdir(joblets_path):
        raise ValueError(f"Workspace corrupted : {workspace}")

    if not os.path.isdir(process_path):
        raise ValueError(f"Workspace corrupted : {workspace}")

    # Delete the existing
    if os.path.exists(joblets_import):
        shutil.rmtree(joblets_import)

    # Copy joblets to process
    shutil.copytree(joblets_path, joblets_import)

    return joblets_import

def rename_xml_nodes(file_path: str, xpath: str, new_tag: str, namespaces: dict = None):

    if not os.path.isfile(file_path):
        raise FileNotFoundError(f"Fichier introuvable : {file_path}")

    parser = etree.XMLParser(remove_blank_text=True)
    tree = etree.parse(file_path, parser)
    root = tree.getroot()

    nodes = root.xpath(xpath, namespaces=namespaces)
    if not nodes:
        return 0

    for node in nodes:
        if node.tag.startswith("{"):
            uri = node.tag.split("}")[0].strip("{")
            node.tag = f"{{{uri}}}{new_tag}"
        else:
            node.tag = new_tag

    tree.write(file_path, encoding="UTF-8", xml_declaration=True, pretty_print=True)
    return len(nodes)

def remove_xml_nodes(file_path: str, xpath: str, namespaces: Optional[Dict[str, str]] = None, pretty_print: bool = True) -> int:

    if not os.path.isfile(file_path):
        raise FileNotFoundError(file_path)

    parser = etree.XMLParser(remove_blank_text=True)
    tree = etree.parse(file_path, parser)
    root = tree.getroot()

    # Find XPath nodes
    nodes = root.xpath(xpath, namespaces=namespaces)

    if not nodes:
        return 0

    removed = 0

    for node in nodes:
        parent = node.getparent()
        if parent is not None:
            parent.remove(node)
            removed += 1

    # Clean rewrite
    tree.write(
        file_path,
        pretty_print=pretty_print,
        xml_declaration=True,
        encoding=tree.docinfo.encoding or "UTF-8"
    )

    return removed

# --- MAIN ---
def main():
    # --- Check workspace ---
    if not os.path.exists(workspace):
        print(f"❌ Le chemin '{workspace}' n'existe pas.")
        return

    if not os.path.isdir(workspace):
        print(f"❌ Le chemin '{workspace}' n'est pas un dossier.")
        return

    print(f"\n📁 WORKSPACE : {workspace}\n")

    try:
        nb_joblets = count_item_files_in_joblets(workspace)
        print(f"\n▶️ JOBLETS TROUVÉS : {count_item_files_in_joblets(workspace)}\n")
    except ValueError as e:
        print("Erreur :", e)

    try:
        joblets = list_joblets(workspace)
        for joblet_name in joblets:
            print(" ▶️", joblet_name)
        print(f"\n")
    except ValueError as e:
        print("Erreur :", e)

    # --- Ask to run ---
    if not ask_confirmation():
        exit(0)
    print("♻️  CONVERTING ...")

    # --- Convert ---
    # Create joblets import folder
    try:
        folder_path = copy_joblets_to_import(workspace)
    except ValueError as e:
        print("Erreur :", e)

    # --- Rewrite .properties files ---
    for properties in os.listdir(joblets_import):
        if properties.endswith(".properties") and os.path.isfile(os.path.join(joblets_import, properties)):
            rename_xml_nodes(
                file_path=os.path.join(joblets_import, properties),
                xpath="//tp:JobletProcessItem/jobletProcess",
                new_tag="process",
                namespaces=namespaces
            )

            rename_xml_nodes(
                file_path=os.path.join(joblets_import, properties),
                xpath="//tp:JobletProcessItem",
                new_tag="ProcessItem",
                namespaces=namespaces
            )

    # --- Rewrite .item files ---
    for items in os.listdir(joblets_import):
        if items.endswith(".item") and os.path.isfile(os.path.join(joblets_import, items)):

            remove_xml_nodes(
                file_path=os.path.join(joblets_import, items),
                xpath="//sig:Signature",
                namespaces=namespaces
            )

if __name__ == "__main__":
    main()
