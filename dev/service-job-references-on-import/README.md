# Références des jobs dans les services après import

## Analyse

Lors du remplacement d'un élément de même nom, `ImportExportHandlersManager`
peut conserver l'identifiant de l'élément présent dans le projet de destination.
Il transmet la correspondance entre identifiants à `ChangeIdManager`, après
l'import des éléments et leurs traitements de migration.

Un `ServiceItem` est un `ConnectionItem`. Avant cette correction, le gestionnaire
ne recherchait dans les connexions que la référence à un contexte. Il ne
découvrait donc pas les jobs référencés par les opérations du service, et ne
réécrivait pas leur `referenceJobId`. Une seconde condition excluait aussi un
élément dont l'identifiant était explicitement conservé, même lorsque ses
dépendances changeaient.

Dans le cas observé, l'identifiant du job importé dans Talaxie différait du
`referenceJobId` du service. `ESBService.getValue` ne trouvait donc aucune
opération associée au job et ne recalculait pas son `WSDL_LOCATION`. Le chemin
relatif était ensuite utilisé depuis le répertoire de lancement du Studio.
Dans l'import Talend comparé, l'identifiant du job était resté identique à celui
référencé par le service ; cela ne démontre pas à lui seul un comportement
différent de Talend lors d'un remplacement avec changement d'identifiant.

## Correction

- L'importeur commun utilise l'interface ESB existante pour découvrir les jobs
  référencés par les services sélectionnés pour l'import, dans toutes leurs versions.
- `IESBService.updateServiceJobReferences` possède une implémentation par défaut
  sans effet pour préserver la compatibilité avec les autres implémentations.
- Le plugin ESB réécrit les correspondances exactes dans toutes les opérations,
  sur tous les ports. Une référence absente de la table, vide ou inchangée est
  préservée. Les remplacements sont simultanés, sans propagation en cascade.
- Le chemin de sauvegarde existant de `ChangeIdManager` enregistre les services
  modifiés et actualise l'index des relations.
- Un service conserve la possibilité d'être actualisé même si son propre
  identifiant ne change pas. Les dépendances aux contextes restent prises en charge.

Aucune dépendance ESB obligatoire n'est ajoutée aux plugins communs. Aucun
chemin absolu de WSDL n'est ajouté au projet généré. La correction concerne les
services sélectionnés pour l'import ; elle ne parcourt pas les autres services
déjà présents pour modifier leurs associations.

## Validation ciblée

Depuis la racine du dépôt agrégé, avec Java 21 et le cache Maven existant :

```sh
mvn -B -o \
  -pl :org.talend.core.runtime,:org.talend.repository.items.importexport,:org.talend.repository.services,:org.talend.esb.repository.services.test \
  -DskipTests package
```

Le plugin de tests existant utilise le packaging `eclipse-plugin` : cette
commande compile les tests mais ne les exécute pas. Pour les exécuter sans lancer
le Studio, fournir le répertoire des plugins d'une installation Talaxie :

```sh
python3 dev/service-job-references-on-import/run_tests.py \
  --plugins /chemin/vers/TOS_ESB.app/Contents/Eclipse/plugins
```

Le lanceur utilise en priorité les classes des quatre modules compilés ; les
plugins de l'installation ne servent qu'à fournir les bibliothèques. Il ne
modifie pas cette installation. JUnit 4.13.2 et Hamcrest 1.3 doivent être présents
dans le cache Maven (option `--maven-repository` si nécessaire).

Les tests couvrent la découverte sans index préalable des relations, le parcours
`add` → changement des identifiants → `changeIds`, le service conservé ou renommé,
les références non concernées, les ports multiples, les contextes et la
sérialisation/relecture XMI du service. Le dépôt et les sauvegardes du parcours
d'import sont remplacés par un dépôt en mémoire ; le test ne lance pas l'assistant
d'import Eclipse.

Pour vérifier le comportement complet dans une distribution reconstruite :

1. Importer un job et son service dans un projet de test.
2. Réimporter les deux avec le même nom mais un nouvel identifiant de job,
   en autorisant leur remplacement.
3. Vérifier que chaque `referenceJobId` correspond au job effectivement importé.
4. Ouvrir et exécuter le job sans utiliser « Assigner un job ».
5. Vérifier que le WSDL est retrouvé et que le service démarre.

La compilation ciblée ne remplace pas une reconstruction complète des produits
ni ce contrôle dans l'interface. Aucun changement des POM ou des dépendances de
production n'est nécessaire.
