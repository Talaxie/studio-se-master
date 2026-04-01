/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.analysis.informationset.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import orgomg.cwmx.analysis.informationset.*;
import orgomg.cwmx.analysis.informationset.InfoSetAdministration;
import orgomg.cwmx.analysis.informationset.InfoSetDate;
import orgomg.cwmx.analysis.informationset.InformationSet;
import orgomg.cwmx.analysis.informationset.InformationsetFactory;
import orgomg.cwmx.analysis.informationset.InformationsetPackage;
import orgomg.cwmx.analysis.informationset.Rule;
import orgomg.cwmx.analysis.informationset.Segment;
import orgomg.cwmx.analysis.informationset.SegmentRegion;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class InformationsetFactoryImpl extends EFactoryImpl implements InformationsetFactory {

    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    public static InformationsetFactory init() {
        try {
            InformationsetFactory theInformationsetFactory = (InformationsetFactory) EPackage.Registry.INSTANCE
                    .getEFactory("http:///orgomg/cwmx/analysis/informationset.ecore");
            if (theInformationsetFactory != null) {
                return theInformationsetFactory;
            }
        } catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new InformationsetFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    public InformationsetFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
        case InformationsetPackage.INFORMATION_SET:
            return createInformationSet();
        case InformationsetPackage.SEGMENT:
            return createSegment();
        case InformationsetPackage.SEGMENT_REGION:
            return createSegmentRegion();
        case InformationsetPackage.RULE:
            return createRule();
        case InformationsetPackage.INFO_SET_ADMINISTRATION:
            return createInfoSetAdministration();
        case InformationsetPackage.INFO_SET_DATE:
            return createInfoSetDate();
        default:
            throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public InformationSet createInformationSet() {
        InformationSetImpl informationSet = new InformationSetImpl();
        return informationSet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Segment createSegment() {
        SegmentImpl segment = new SegmentImpl();
        return segment;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public SegmentRegion createSegmentRegion() {
        SegmentRegionImpl segmentRegion = new SegmentRegionImpl();
        return segmentRegion;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Rule createRule() {
        RuleImpl rule = new RuleImpl();
        return rule;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public InfoSetAdministration createInfoSetAdministration() {
        InfoSetAdministrationImpl infoSetAdministration = new InfoSetAdministrationImpl();
        return infoSetAdministration;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public InfoSetDate createInfoSetDate() {
        InfoSetDateImpl infoSetDate = new InfoSetDateImpl();
        return infoSetDate;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public InformationsetPackage getInformationsetPackage() {
        return (InformationsetPackage) getEPackage();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static InformationsetPackage getPackage() {
        return InformationsetPackage.eINSTANCE;
    }

} // InformationsetFactoryImpl
