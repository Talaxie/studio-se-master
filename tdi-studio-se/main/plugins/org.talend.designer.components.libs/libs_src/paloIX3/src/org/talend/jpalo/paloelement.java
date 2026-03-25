package org.talend.jpalo;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import com.talend.csv.CSVReader;

@SuppressWarnings("unchecked")
public class paloelement implements Comparable {

    /*
     * private native void JNIupdateElement(paloelement plElem, paloconsolidations plCons, int iAddToConsolidation);
     */

    private paloconnection plConn;

    private long lDatabaseId;

    private int iDimensionId;

    private long lElementIdentifier;

    private String strElementName = "";

    private int iElementType;

    private int iElementLevel;

    private int iElementIndent;

    private int iElementDepth;

    private int iElementPosition;

    private int iElementNumOfParents;

    private int[] iArrElementParents;

    private int iElementNumOfChildren;

    private int[] iArrElementChildren;

    private double[] dArrElementChildrenWeights;

    private long lElementParentIdentifier;

    private paloelements paloElements;

    public paloelement(paloconnection plConn, long lDatabaseId, int iDimensionId, paloelements paloElements,
            long lElementIdentifier, // 0 element identifier Identifier of the element
            String strElementName, // 1 name_element string Name of the element
            int iElementPosition, // 2 position integer Position of the element
            int iElementLevel, // 3 level integer Level of the element
            int iElementIndent, // 4 indent integer Indent of the element
            int iElementDepth, // 5 depth integer Depth of the element
            int iElementType, // 6 type integer Type of the element (1=NUMERIC, 2=STRING, 4=CONSOLIDATED)
            int iElementNumOfParents, // 7 number_parents integer Number of parents
            int[] iArrElementParents, // 8 parents identifier Comma separate list of parent identifiers
            int iElementNumOfChildren, // 9 number_children integer Number of children
            int[] iArrElementChildren, // 10 children identifier Comma separate list of children identifiers
            double[] dArrElementChildrenWeights // 11 weights double Comma separate list of children weight
    ) {
        super();
        this.plConn = plConn;
        this.lDatabaseId = lDatabaseId;
        this.iDimensionId = iDimensionId;
        this.paloElements = paloElements;
        this.lElementIdentifier = lElementIdentifier;
        this.strElementName = strElementName;
        this.iElementPosition = iElementPosition;
        this.iElementLevel = iElementLevel;
        this.iElementIndent = iElementIndent;
        this.iElementDepth = iElementDepth;
        this.iElementType = iElementType;
        this.iElementNumOfParents = iElementNumOfParents;
        this.iArrElementParents = iArrElementParents;
        this.iElementNumOfChildren = iElementNumOfChildren;
        this.iArrElementChildren = iArrElementChildren;
        this.dArrElementChildrenWeights = dArrElementChildrenWeights;

        this.lElementParentIdentifier = (null == this.iArrElementParents) ? this.lElementIdentifier : this.iArrElementParents[0];
    }

    public paloelement(paloelements paloElements) {
        super();
        this.paloElements = paloElements;
    }

    /*
     * public void setPaloElements(paloelements paloElements){ this.paloElements = paloElements; }
     */

    public long getElementIdentifier() {
        return lElementIdentifier;
    }

    public String getName() {
        return strElementName;
    }

    public int getElementType() {
        return iElementType;
    }

    public long getElementLevel() {
        return iElementLevel;
    }

    public long getElementIndent() {
        return iElementIndent;
    }

    public long getElementDepth() {
        return iElementDepth;
    }

    public long getElementPosition() {
        return iElementPosition;
    }

    public long getElementNumOfParents() {
        return iElementNumOfParents;
    }

    public long getElementNumOfChildren() {
        return iElementNumOfChildren;
    }

    public long getElementParentIdentifier() {
        return lElementParentIdentifier;
    }

    public boolean hasChildren() {
        if (iElementNumOfChildren > 0) {
            return true;
        }
        return false;
    }

    public boolean isConsolidation() {
        if (paloelements.ELEMENT_CONSOLIDATION == iElementType) {
            return true;
        }
        return false;
    }

    public boolean isNumeric() {
        if (paloelements.ELEMENT_NUMERIC == iElementType) {
            return true;
        }
        return false;
    }

    public boolean isString() {
        if (paloelements.ELEMENT_STRING == iElementType) {
            return true;
        }
        return false;
    }

    public boolean isRule() {
        if (paloelements.ELEMENT_RULE == iElementType) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuffer sbRC = new StringBuffer();
        sbRC.append(lElementIdentifier + " / ");
        sbRC.append(strElementName + " / ");
        sbRC.append(iElementType + " / ");
        sbRC.append(iElementLevel + " / ");
        sbRC.append(iElementIndent + " / ");
        sbRC.append(iElementDepth + " / ");
        sbRC.append(iElementPosition + " / ");
        sbRC.append(iElementNumOfParents + " / ");
        sbRC.append(iElementNumOfChildren + " / ");
        sbRC.append(lElementParentIdentifier);
        return sbRC.toString();
    }

    public void rename(String strElementNewName) throws paloexception {
        if (null != strElementNewName && strElementNewName.length() > 0 && !strElementName.equals(strElementNewName)) {

            List<NameValuePair> qparams = new ArrayList<NameValuePair>();
            qparams.add(new BasicNameValuePair("sid", this.plConn.getPaloToken()));
            qparams.add(new BasicNameValuePair("database", String.valueOf(lDatabaseId)));
            qparams.add(new BasicNameValuePair("dimension", String.valueOf(this.iDimensionId)));
            qparams.add(new BasicNameValuePair("element", String.valueOf(this.lElementIdentifier)));
            qparams.add(new BasicNameValuePair("new_name", strElementNewName));

            try {
                HttpEntity entity = this.plConn.sendToServer(qparams, "/element/rename");
                CSVReader csv = new CSVReader(entity.getContent(), ';', "UTF-8");
                csv.setQuoteChar('"');
                csv.readNext();
                this.strElementName = csv.get(1);
                csv.close();
                entity.consumeContent();
            } catch (Exception e) {
                throw new paloexception(e.getMessage());
            }
            strElementName = strElementNewName;
        }
    }

    public int[] getElementChildren() {
        return iArrElementChildren;
    }

    public int[] getElementParents() {
        return iArrElementParents;
    }

    public double[] getElementChildrenWeights() {
        return dArrElementChildrenWeights;
    }

    public void move(long lElementNewPosition) throws paloexception {
        if (lElementNewPosition > -1 && lElementNewPosition != iElementPosition) {
            List<NameValuePair> qparams = new ArrayList<NameValuePair>();
            qparams.add(new BasicNameValuePair("sid", this.plConn.getPaloToken()));
            qparams.add(new BasicNameValuePair("database", String.valueOf(lDatabaseId)));
            qparams.add(new BasicNameValuePair("dimension", String.valueOf(this.iDimensionId)));
            qparams.add(new BasicNameValuePair("element", String.valueOf(this.lElementIdentifier)));
            qparams.add(new BasicNameValuePair("position", String.valueOf(lElementNewPosition)));

            try {

                HttpEntity entity = this.plConn.sendToServer(qparams, "/element/move");
                CSVReader csv = new CSVReader(entity.getContent(), ';', "UTF-8");
                csv.setQuoteChar('"');
                while (csv.readNext()) {
                    this.lElementIdentifier = palohelpers.StringToLong(csv.get(0));
                    this.strElementName = csv.get(1);
                    this.iElementPosition = palohelpers.StringToInt(csv.get(2));
                    this.iElementLevel = palohelpers.StringToInt(csv.get(3));
                    this.iElementIndent = palohelpers.StringToInt(csv.get(4));
                    this.iElementDepth = palohelpers.StringToInt(csv.get(5));
                    this.iElementType = palohelpers.StringToInt(csv.get(6));
                    this.iElementNumOfParents = palohelpers.StringToInt(csv.get(7));
                    this.iArrElementParents = palohelpers.StringToIntArray(csv.get(8), palohelpers.StringToInt(csv.get(7)));
                    this.iElementNumOfChildren = palohelpers.StringToInt(csv.get(9));
                    this.iArrElementChildren = palohelpers.StringToIntArray(csv.get(10), palohelpers.StringToInt(csv.get(9)));
                    this.dArrElementChildrenWeights = palohelpers.StringToDoubleArray(csv.get(11),
                            palohelpers.StringToInt(csv.get(9)));
                }
                csv.close();
                entity.consumeContent();
            } catch (Exception e) {
                throw new paloexception(e.getMessage());
            }
        }
    }

    // get father paloelement
    public paloelement getFatherPaloelement() throws paloexception {
        long identifier = getElementParentIdentifier();
        paloelement plElm = null;
        List<NameValuePair> qparams = new ArrayList<NameValuePair>();
        qparams.add(new BasicNameValuePair("sid", this.plConn.getPaloToken()));
        qparams.add(new BasicNameValuePair("database", String.valueOf(lDatabaseId)));
        qparams.add(new BasicNameValuePair("dimension", String.valueOf(this.iDimensionId)));
        qparams.add(new BasicNameValuePair("element", String.valueOf(identifier)));

        try {

            HttpEntity entity = this.plConn.sendToServer(qparams, "/element/info");
            CSVReader csv = new CSVReader(entity.getContent(), ';', "UTF-8");
            csv.setQuoteChar('"');
            while (csv.readNext()) {
                if (palohelpers.StringToLong(csv.get(0)) == identifier) {
                    plElm = new paloelement(this.plConn, this.lDatabaseId, this.iDimensionId, paloElements,
                            palohelpers.StringToLong(csv.get(0)), csv.get(1), palohelpers.StringToInt(csv.get(2)),
                            palohelpers.StringToInt(csv.get(3)), palohelpers.StringToInt(csv.get(4)), palohelpers.StringToInt(csv
                                    .get(5)), palohelpers.StringToInt(csv.get(6)), palohelpers.StringToInt(csv.get(7)),
                            palohelpers.StringToIntArray(csv.get(8), palohelpers.StringToInt(csv.get(7))),
                            palohelpers.StringToInt(csv.get(9)), palohelpers.StringToIntArray(csv.get(10),
                                    palohelpers.StringToInt(csv.get(9))), palohelpers.StringToDoubleArray(csv.get(11),
                                    palohelpers.StringToInt(csv.get(9))));
                }
            }
            csv.close();
            entity.consumeContent();
        } catch (Exception e) {
            throw new paloexception(e.getMessage());
        }
        return plElm;
    }

    public void refreshElementInfo() throws paloexception {

        List<NameValuePair> qparams = new ArrayList<NameValuePair>();
        qparams.add(new BasicNameValuePair("sid", this.plConn.getPaloToken()));
        qparams.add(new BasicNameValuePair("database", String.valueOf(lDatabaseId)));
        qparams.add(new BasicNameValuePair("dimension", String.valueOf(this.iDimensionId)));
        qparams.add(new BasicNameValuePair("element", String.valueOf(this.lElementIdentifier)));

        try {

            HttpEntity entity = this.plConn.sendToServer(qparams, "/element/info");
            CSVReader csv = new CSVReader(entity.getContent(), ';', "UTF-8");
            csv.setQuoteChar('"');
            while (csv.readNext()) {
                this.lElementIdentifier = palohelpers.StringToLong(csv.get(0));
                this.strElementName = csv.get(1);
                this.iElementPosition = palohelpers.StringToInt(csv.get(2));
                this.iElementLevel = palohelpers.StringToInt(csv.get(3));
                this.iElementIndent = palohelpers.StringToInt(csv.get(4));
                this.iElementDepth = palohelpers.StringToInt(csv.get(5));
                this.iElementType = palohelpers.StringToInt(csv.get(6));
                this.iElementNumOfParents = palohelpers.StringToInt(csv.get(7));
                this.iArrElementParents = palohelpers.StringToIntArray(csv.get(8), palohelpers.StringToInt(csv.get(7)));
                this.iElementNumOfChildren = palohelpers.StringToInt(csv.get(9));
                this.iArrElementChildren = palohelpers.StringToIntArray(csv.get(10), palohelpers.StringToInt(csv.get(9)));
                this.dArrElementChildrenWeights = palohelpers.StringToDoubleArray(csv.get(11),
                        palohelpers.StringToInt(csv.get(9)));
            }
            csv.close();
            entity.consumeContent();
        } catch (Exception e) {
            throw new paloexception(e.getMessage());
        }
    }

    public paloconsolidations getConsolidations() {
        return new paloconsolidations(paloElements, this);
    }

    public void updateElement(paloconsolidations plCons, boolean bAddToConsolidation) throws paloexception {

        List<NameValuePair> qparams = new ArrayList<NameValuePair>();
        qparams.add(new BasicNameValuePair("sid", this.plConn.getPaloToken()));
        qparams.add(new BasicNameValuePair("database", String.valueOf(lDatabaseId)));
        qparams.add(new BasicNameValuePair("dimension", String.valueOf(iDimensionId)));
        qparams.add(new BasicNameValuePair("element", String.valueOf(lElementIdentifier)));

        String strURLApiCall = "/element/append";

        if (!bAddToConsolidation) {
            if (plCons != null) {
                iElementType = paloelements.ELEMENT_CONSOLIDATION;
            }
            qparams.add(new BasicNameValuePair("name_element", strElementName));
            qparams.add(new BasicNameValuePair("type", String.valueOf(iElementType)));
            strURLApiCall = "/element/replace";
        }

        // if(plConsiElementType=paloelements.ELEMENT_CONSOLIDATION;

        if (plCons != null) {
            qparams.add(new BasicNameValuePair("children", plCons.getConsolidationStringElementIdentifiers()));
            qparams.add(new BasicNameValuePair("weights", plCons.getConsolidationStringElementWeights()));
        }

        try {

            HttpEntity entity = this.plConn.sendToServer(qparams, strURLApiCall);
            CSVReader csv = new CSVReader(entity.getContent(), ';', "UTF-8");
            csv.setQuoteChar('"');
            csv.readNext();
            // System.out.println(csv.getRawRecord());

            this.lElementIdentifier = palohelpers.StringToLong(csv.get(0));
            this.strElementName = csv.get(1);
            this.iElementPosition = palohelpers.StringToInt(csv.get(2));
            this.iElementLevel = palohelpers.StringToInt(csv.get(3));
            this.iElementIndent = palohelpers.StringToInt(csv.get(4));
            this.iElementDepth = palohelpers.StringToInt(csv.get(5));
            this.iElementType = palohelpers.StringToInt(csv.get(6));
            this.iElementNumOfParents = palohelpers.StringToInt(csv.get(7));
            this.iArrElementParents = palohelpers.StringToIntArray(csv.get(8), palohelpers.StringToInt(csv.get(7)));
            this.iElementNumOfChildren = palohelpers.StringToInt(csv.get(9));
            this.iArrElementChildren = palohelpers.StringToIntArray(csv.get(10), palohelpers.StringToInt(csv.get(9)));
            this.dArrElementChildrenWeights = palohelpers.StringToDoubleArray(csv.get(11), palohelpers.StringToInt(csv.get(9)));

            csv.close();
            entity.consumeContent();

        } catch (Exception e) {
            throw new paloexception(e.getMessage());
        }
    }

    public void updateElementConsolidation(String strElementChildrensId, String strElementChildrenWeights, boolean bReplace)
            throws paloexception {

        List<NameValuePair> qparams = new ArrayList<NameValuePair>();
        qparams.add(new BasicNameValuePair("sid", this.plConn.getPaloToken()));
        qparams.add(new BasicNameValuePair("database", String.valueOf(lDatabaseId)));
        qparams.add(new BasicNameValuePair("dimension", String.valueOf(iDimensionId)));
        qparams.add(new BasicNameValuePair("element", String.valueOf(lElementIdentifier)));

        String strURLApiCall = "/element/append";
        if (bReplace) {
            strURLApiCall = "/element/replace";
        }
        iElementType = paloelements.ELEMENT_CONSOLIDATION;
        qparams.add(new BasicNameValuePair("type", String.valueOf(iElementType)));

        qparams.add(new BasicNameValuePair("children", strElementChildrensId));
        qparams.add(new BasicNameValuePair("weights", strElementChildrenWeights));

        try {
            this.plConn.sendToServerSingleRC(qparams, strURLApiCall);

        } catch (Exception e) {
            throw new paloexception(e.getMessage());
        }
    }

    public void updateElement() throws paloexception {
        updateElement(getConsolidations(), false);
    }

    public void updateElement(paloconsolidations plCons) throws paloexception {
        updateElement(plCons, false);
    }

    @Override
    public boolean equals(Object obj) {
        if (null == obj) {
            throw new IllegalArgumentException();
        }
        if (obj instanceof paloelement) {
            return strElementName.equals(((paloelement) obj).strElementName);
        }
        return false;
    }

    public int compareTo(Object o) {
        if (this.iElementPosition > ((paloelement) o).getElementPosition()) {
            return -1;
        } else {
            return 1;
        }
    }
}
