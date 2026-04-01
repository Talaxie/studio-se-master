package org.talend.jpalo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import com.talend.csv.CSVReader;

public class paloelements {

    // OK

    public static final int ELEMENT_NUMERIC = 1;

    public static final int ELEMENT_STRING = 2;

    public static final int ELEMENT_CONSOLIDATION = 4;

    public static final int ELEMENT_RULE = 4;

    public static final int ELEMENT_UNKNOWN = -1;

    public static final int MODE_UNKNOWN = 0;

    public static final int MODE_ADD = 1;

    public static final int MODE_FORCE_ADD = 2;

    public static final int MODE_UPDATE = 3;

    public static final int MODE_ADD_OR_UPDATE = 4;

    // D private Hashtable<Integer, String> paloElementsIdentifier = new Hashtable<Integer, String>();
    // D private Hashtable<String, paloelement> paloElements = new Hashtable<String,paloelement>();

    private Hashtable<Long, String> paloElementsIdentifier = new Hashtable<Long, String>();

    private Hashtable<String, paloelement> paloElementsList = new Hashtable<String, paloelement>();

    private ArrayList<paloelement> paloSortedElements = new ArrayList<paloelement>();

    private elementComparator elemComp = new elementComparator();

    private paloconnection plConn;

    private long lDatabaseId;

    private int iDimensionId;

    private List<String> elementNameList = new ArrayList<String>();

    public paloelements(paloconnection plConn, long lDatabaseId, int iDimensionId, HashSet<String> hsFilteredElements)
            throws paloexception {
        super();

        this.plConn = plConn;
        this.lDatabaseId = lDatabaseId;
        this.iDimensionId = iDimensionId;

        List<NameValuePair> qparams = new ArrayList<NameValuePair>();
        qparams.add(new BasicNameValuePair("sid", this.plConn.getPaloToken()));
        qparams.add(new BasicNameValuePair("database", String.valueOf(this.lDatabaseId)));
        qparams.add(new BasicNameValuePair("dimension", String.valueOf(this.iDimensionId)));

        try {

            HttpEntity entity = this.plConn.sendToServer(qparams, "/dimension/elements");
            CSVReader csv = new CSVReader(entity.getContent(), ';', "UTF-8");
            csv.setQuoteChar('"');
            while (csv.readNext()) {

                if (hsFilteredElements.contains(csv.get(1))) {
                    paloelement plElm = new paloelement(this.plConn, this.lDatabaseId, this.iDimensionId, this,
                            palohelpers.StringToLong(csv.get(0)), csv.get(1), palohelpers.StringToInt(csv.get(2)),
                            palohelpers.StringToInt(csv.get(3)), palohelpers.StringToInt(csv.get(4)), palohelpers.StringToInt(csv
                                    .get(5)), palohelpers.StringToInt(csv.get(6)), palohelpers.StringToInt(csv.get(7)),
                            palohelpers.StringToIntArray(csv.get(8), palohelpers.StringToInt(csv.get(7))),
                            palohelpers.StringToInt(csv.get(9)), palohelpers.StringToIntArray(csv.get(10),
                                    palohelpers.StringToInt(csv.get(9))), palohelpers.StringToDoubleArray(csv.get(11),
                                    palohelpers.StringToInt(csv.get(9))));

                    paloElementsList.put(plElm.getName(), plElm);
                    paloElementsIdentifier.put(palohelpers.StringToLong(csv.get(0)), csv.get(1));
                    // plElm.setPaloElements(this);
                    /*
                     * long lElementIdentifier, //0 element identifier Identifier of the element String strElementName,
                     * //1 name_element string Name of the element int iElementPosition, //2 position integer Position
                     * of the element int iElementLevel, //3 level integer Level of the element int iElementIndent, //4
                     * indent integer Indent of the element int iElementDepth, //5 depth integer Depth of the element
                     * int iElementType, //6 type integer Type of the element (1=NUMERIC, 2=STRING, 4=CONSOLIDATED) int
                     * iElementNumOfParents, //7 number_parents integer Number of parents int[] iArrElementParents, //8
                     * parents identifier Comma separate list of parent identifiers int iElementNumOfChildren, //9
                     * number_children integer Number of children int[] iArrElementChildren, //10 children identifier
                     * Comma separate list of children identifiers double[] dArrElementChildrenWeights //11 weights
                     * double Comma separate list of children weight
                     */
                }
            }
            csv.close();
            entity.consumeContent();
        } catch (Exception e) {
            throw new paloexception(e.getMessage());
        }
    }

    public paloelements(paloconnection plConn, long lDatabaseId, int iDimensionId) throws paloexception {
        super();

        this.plConn = plConn;
        this.lDatabaseId = lDatabaseId;
        this.iDimensionId = iDimensionId;

        List<NameValuePair> qparams = new ArrayList<NameValuePair>();
        qparams.add(new BasicNameValuePair("sid", this.plConn.getPaloToken()));
        qparams.add(new BasicNameValuePair("database", String.valueOf(this.lDatabaseId)));
        qparams.add(new BasicNameValuePair("dimension", String.valueOf(this.iDimensionId)));

        try {

            HttpEntity entity = this.plConn.sendToServer(qparams, "/dimension/elements");
            CSVReader csv = new CSVReader(entity.getContent(), ';', "UTF-8");
            csv.setQuoteChar('"');
            while (csv.readNext()) {
                /*
                 * 
                 * paloElementsList.put(csv.get(1), new paloelement( this.plConn, this.lDatabaseId, this.iDimensionId,
                 * this, palohelpers.StringToLong(csv.get(0)), csv.get(1), palohelpers.StringToInt(csv.get(2)),
                 * palohelpers.StringToInt(csv.get(3)), palohelpers.StringToInt(csv.get(4)),
                 * palohelpers.StringToInt(csv.get(5)), palohelpers.StringToInt(csv.get(6)),
                 * palohelpers.StringToInt(csv.get(7)), palohelpers.StringToIntArray(csv.get(8),
                 * palohelpers.StringToInt(csv.get(7))), palohelpers.StringToInt(csv.get(9)),
                 * palohelpers.StringToIntArray(csv.get(10), palohelpers.StringToInt(csv.get(9))),
                 * palohelpers.StringToDoubleArray(csv.get(11), palohelpers.StringToInt(csv.get(9))) ));
                 */

                paloelement plElm = new paloelement(this.plConn, this.lDatabaseId, this.iDimensionId, this,
                        palohelpers.StringToLong(csv.get(0)), csv.get(1), palohelpers.StringToInt(csv.get(2)),
                        palohelpers.StringToInt(csv.get(3)), palohelpers.StringToInt(csv.get(4)), palohelpers.StringToInt(csv
                                .get(5)), palohelpers.StringToInt(csv.get(6)), palohelpers.StringToInt(csv.get(7)),
                        palohelpers.StringToIntArray(csv.get(8), palohelpers.StringToInt(csv.get(7))),
                        palohelpers.StringToInt(csv.get(9)), palohelpers.StringToIntArray(csv.get(10),
                                palohelpers.StringToInt(csv.get(9))), palohelpers.StringToDoubleArray(csv.get(11),
                                palohelpers.StringToInt(csv.get(9))));

                paloElementsList.put(plElm.getName(), plElm);
                paloElementsIdentifier.put(palohelpers.StringToLong(csv.get(0)), csv.get(1));
                // plElm.setPaloElements(this);
                /*
                 * long lElementIdentifier, //0 element identifier Identifier of the element String strElementName, //1
                 * name_element string Name of the element int iElementPosition, //2 position integer Position of the
                 * element int iElementLevel, //3 level integer Level of the element int iElementIndent, //4 indent
                 * integer Indent of the element int iElementDepth, //5 depth integer Depth of the element int
                 * iElementType, //6 type integer Type of the element (1=NUMERIC, 2=STRING, 4=CONSOLIDATED) int
                 * iElementNumOfParents, //7 number_parents integer Number of parents int[] iArrElementParents, //8
                 * parents identifier Comma separate list of parent identifiers int iElementNumOfChildren, //9
                 * number_children integer Number of children int[] iArrElementChildren, //10 children identifier Comma
                 * separate list of children identifiers double[] dArrElementChildrenWeights //11 weights double Comma
                 * separate list of children weight
                 */
            }
            csv.close();
            entity.consumeContent();
        } catch (Exception e) {
            throw new paloexception(e.getMessage());
        }
    }

    public void createElementsBulk(String strElementNames, String strElementTypes) throws paloexception {
        List<NameValuePair> qparams = new ArrayList<NameValuePair>();
        qparams.add(new BasicNameValuePair("sid", this.plConn.getPaloToken()));
        qparams.add(new BasicNameValuePair("database", String.valueOf(this.lDatabaseId)));
        qparams.add(new BasicNameValuePair("dimension", String.valueOf(this.iDimensionId)));

        qparams.add(new BasicNameValuePair("name_elements", strElementNames));
        qparams.add(new BasicNameValuePair("types", strElementTypes));
        this.plConn.sendToServerSingleRC(qparams, "/element/create_bulk");

    }

    public paloelement createElement(String strElementName, int iElementType, int iMode) throws paloexception {
        paloelement plElem = null;

        if (!elementNameList.contains(strElementName)) {
            elementNameList.add(strElementName);
            List<NameValuePair> qparams = new ArrayList<NameValuePair>();
            qparams.add(new BasicNameValuePair("sid", this.plConn.getPaloToken()));
            qparams.add(new BasicNameValuePair("database", String.valueOf(this.lDatabaseId)));
            qparams.add(new BasicNameValuePair("dimension", String.valueOf(this.iDimensionId)));

            qparams.add(new BasicNameValuePair("new_name", strElementName));
            qparams.add(new BasicNameValuePair("type", String.valueOf(iElementType)));

            try {
                HttpEntity entity = null;
                switch (iMode) {
                case MODE_ADD:
                    entity = this.plConn.sendToServer(qparams, "/element/create");
                    break;
                case MODE_UNKNOWN:
                case MODE_ADD_OR_UPDATE:
                    paloelement plElm = getElement(strElementName);
                    if (null == plElm) {
                        entity = this.plConn.sendToServer(qparams, "/element/create");
                    } else {
                        qparams.add(new BasicNameValuePair("element", String.valueOf(plElm.getElementIdentifier())));
                        entity = this.plConn.sendToServer(qparams, "/element/replace");
                    }
                    break;
                case MODE_UPDATE:
                    plElm = getElement(strElementName);
                    if (null == plElm) {
                        throw new paloexception("Element " + strElementName + " does not exists!");
                    }
                    qparams.add(new BasicNameValuePair("element", String.valueOf(plElm.getElementIdentifier())));
                    entity = this.plConn.sendToServer(qparams, "/element/replace");
                    break;
                case MODE_FORCE_ADD:
                    plElm = getElement(strElementName);
                    if (null != plElm) {
                        deleteElement(plElm);
                    }
                    entity = this.plConn.sendToServer(qparams, "/element/create");
                    break;

                }
                CSVReader csv = new CSVReader(entity.getContent(), ';', "UTF-8");
                csv.setQuoteChar('"');
                csv.readNext();
                plElem = new paloelement(this.plConn, this.lDatabaseId, this.iDimensionId, this, palohelpers.StringToLong(csv
                        .get(0)), csv.get(1), palohelpers.StringToInt(csv.get(2)), palohelpers.StringToInt(csv.get(3)),
                        palohelpers.StringToInt(csv.get(4)), palohelpers.StringToInt(csv.get(5)), palohelpers.StringToInt(csv
                                .get(6)), palohelpers.StringToInt(csv.get(7)), palohelpers.StringToIntArray(csv.get(8),
                                palohelpers.StringToInt(csv.get(7))), palohelpers.StringToInt(csv.get(9)),
                        palohelpers.StringToIntArray(csv.get(10), palohelpers.StringToInt(csv.get(9))),
                        palohelpers.StringToDoubleArray(csv.get(11), palohelpers.StringToInt(csv.get(9))));
                csv.close();
                entity.consumeContent();
                paloElementsList.put(plElem.getName(), plElem);
                paloElementsIdentifier.put(plElem.getElementIdentifier(), plElem.getName());
                // plElem.setPaloElements(this);

            } catch (Exception e) {
                System.out.println("Hier " + strElementName);
                throw new paloexception(e.getMessage());
            }
        }
        return plElem;
    }

    public paloelement createElement(String strElementName, int iElementType) throws paloexception {
        return createElement(strElementName, iElementType, MODE_ADD);
    }

    public paloelement createElement(String strElementName) throws paloexception {
        return createElement(strElementName, ELEMENT_NUMERIC, MODE_ADD);
    }

    public void deleteElement(paloelement paloElemToRemove) throws paloexception {
        if (null != paloElemToRemove) {
            List<NameValuePair> qparams = new ArrayList<NameValuePair>();
            qparams.add(new BasicNameValuePair("sid", this.plConn.getPaloToken()));
            qparams.add(new BasicNameValuePair("database", String.valueOf(this.lDatabaseId)));
            qparams.add(new BasicNameValuePair("dimension", String.valueOf(this.iDimensionId)));
            qparams.add(new BasicNameValuePair("element", String.valueOf(paloElemToRemove.getElementIdentifier())));
            plConn.sendToServerSingleRC(qparams, "/element/destroy");
            paloElementsIdentifier.remove(paloElemToRemove.getElementIdentifier());
            paloElementsList.remove(paloElemToRemove.getName());
        }
    }

    public void deleteElement(String strElementName) throws paloexception {
        paloelement paloElemToRemove = getElement(strElementName);
        if (null != paloElemToRemove) {
            List<NameValuePair> qparams = new ArrayList<NameValuePair>();
            qparams.add(new BasicNameValuePair("sid", this.plConn.getPaloToken()));
            qparams.add(new BasicNameValuePair("database", String.valueOf(this.lDatabaseId)));
            qparams.add(new BasicNameValuePair("dimension", String.valueOf(this.iDimensionId)));
            qparams.add(new BasicNameValuePair("element", String.valueOf(paloElemToRemove.getElementIdentifier())));
            plConn.sendToServerSingleRC(qparams, "/element/destroy");
            paloElementsIdentifier.remove(paloElemToRemove.getElementIdentifier());
            paloElementsList.remove(paloElemToRemove.getName());
        }
    }

    public int getNumberOfElements() {
        return paloElementsList.size();
    }

    public paloelement getElement(int iIndex) {
        return paloElementsList.get(iIndex);
    }

    public paloelement getElementByIdentifier(long lElementIdentifier) {
        return paloElementsList.get(paloElementsIdentifier.get(lElementIdentifier));
    }

    public ArrayList<paloelement> getFilteredElements(long lParentPosition) {

        ArrayList<paloelement> paloFilteredElements = new ArrayList<paloelement>();
        for (paloelement plElement : getElements()) {
            if (lParentPosition == plElement.getElementParentIdentifier()) {
                paloFilteredElements.add(plElement);
            }
        }
        return paloFilteredElements;
    }

    @SuppressWarnings("unchecked")
    private void buildSortedElementArray() {
        paloSortedElements = new ArrayList<paloelement>();
        Object[] arObjectsToSort = paloElementsList.entrySet().toArray();
        Arrays.sort(arObjectsToSort, (Comparator) elemComp);
        for (Object element : arObjectsToSort) {
            paloSortedElements.add(((paloelement) ((Map.Entry) element).getValue()));
        }
    }

    public ArrayList<paloelement> getElements() {
        if (paloSortedElements == null || paloSortedElements.size() < 1) {
            buildSortedElementArray();
        }
        return paloSortedElements;

        /*
         * ArrayList<paloelement> rcArrayList = new ArrayList<paloelement>(); Object[] arObjectsToSort =
         * paloElements.entrySet().toArray(); Arrays.sort(arObjectsToSort, (Comparator)elemComp); for(int
         * i=0;i<arObjectsToSort.length;i++){
         * rcArrayList.add(((paloelement)((Map.Entry)arObjectsToSort[i]).getValue())); } return rcArrayList;
         */
    }

    public paloelement getElement(String strElementName) {
        return paloElementsList.get(strElementName);
    }

    class elementComparator implements Comparator<Map.Entry<String, paloelement>> {

        public int compare(Map.Entry<String, paloelement> o1, Map.Entry<String, paloelement> o2) {
            if (o1.getValue().getElementPosition() > o2.getValue().getElementPosition()) {
                return 1;
            } else {
                return -1;
            }
        }
    }
}
