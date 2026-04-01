/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.resource.express.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import orgomg.cwm.foundation.softwaredeployment.impl.ComponentImpl;
import orgomg.cwmx.resource.express.ExpressPackage;
import orgomg.cwmx.resource.express.Program;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Program</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link orgomg.cwmx.resource.express.impl.ProgramImpl#getProgram <em>Program</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.express.impl.ProgramImpl#getReturnDimension <em>Return Dimension</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProgramImpl extends ComponentImpl implements Program {

    /**
     * The default value of the '{@link #getProgram() <em>Program</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getProgram()
     * @generated
     * @ordered
     */
    protected static final String PROGRAM_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getProgram() <em>Program</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getProgram()
     * @generated
     * @ordered
     */
    protected String program = PROGRAM_EDEFAULT;

    /**
     * The default value of the '{@link #getReturnDimension() <em>Return Dimension</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getReturnDimension()
     * @generated
     * @ordered
     */
    protected static final String RETURN_DIMENSION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getReturnDimension() <em>Return Dimension</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getReturnDimension()
     * @generated
     * @ordered
     */
    protected String returnDimension = RETURN_DIMENSION_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected ProgramImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ExpressPackage.Literals.PROGRAM;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getProgram() {
        return program;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setProgram(String newProgram) {
        String oldProgram = program;
        program = newProgram;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ExpressPackage.PROGRAM__PROGRAM, oldProgram, program));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getReturnDimension() {
        return returnDimension;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setReturnDimension(String newReturnDimension) {
        String oldReturnDimension = returnDimension;
        returnDimension = newReturnDimension;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ExpressPackage.PROGRAM__RETURN_DIMENSION, oldReturnDimension,
                    returnDimension));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case ExpressPackage.PROGRAM__PROGRAM:
            return getProgram();
        case ExpressPackage.PROGRAM__RETURN_DIMENSION:
            return getReturnDimension();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
        case ExpressPackage.PROGRAM__PROGRAM:
            setProgram((String) newValue);
            return;
        case ExpressPackage.PROGRAM__RETURN_DIMENSION:
            setReturnDimension((String) newValue);
            return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
        case ExpressPackage.PROGRAM__PROGRAM:
            setProgram(PROGRAM_EDEFAULT);
            return;
        case ExpressPackage.PROGRAM__RETURN_DIMENSION:
            setReturnDimension(RETURN_DIMENSION_EDEFAULT);
            return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
        case ExpressPackage.PROGRAM__PROGRAM:
            return PROGRAM_EDEFAULT == null ? program != null : !PROGRAM_EDEFAULT.equals(program);
        case ExpressPackage.PROGRAM__RETURN_DIMENSION:
            return RETURN_DIMENSION_EDEFAULT == null ? returnDimension != null : !RETURN_DIMENSION_EDEFAULT
                    .equals(returnDimension);
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy())
            return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (program: ");
        result.append(program);
        result.append(", returnDimension: ");
        result.append(returnDimension);
        result.append(')');
        return result.toString();
    }

} // ProgramImpl
