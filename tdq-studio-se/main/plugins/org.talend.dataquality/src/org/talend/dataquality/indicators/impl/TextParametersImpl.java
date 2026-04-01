/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.indicators.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.talend.dataquality.indicators.IndicatorsPackage;
import org.talend.dataquality.indicators.MatchingAlgorithm;
import org.talend.dataquality.indicators.TextParameters;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text Parameters</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.dataquality.indicators.impl.TextParametersImpl#isUseBlank <em>Use Blank</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.impl.TextParametersImpl#getMatchingAlgorithm <em>Matching Algorithm</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.impl.TextParametersImpl#isIgnoreCase <em>Ignore Case</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.impl.TextParametersImpl#isUseNulls <em>Use Nulls</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.impl.TextParametersImpl#getCharactersToReplace <em>Characters To Replace</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.impl.TextParametersImpl#getReplacementCharacters <em>Replacement Characters</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.impl.TextParametersImpl#getCountryCode <em>Country Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TextParametersImpl extends EObjectImpl implements TextParameters {
    /**
     * The default value of the '{@link #isUseBlank() <em>Use Blank</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isUseBlank()
     * @generated
     * @ordered
     */
    protected static final boolean USE_BLANK_EDEFAULT = true;

    /**
     * The cached value of the '{@link #isUseBlank() <em>Use Blank</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isUseBlank()
     * @generated
     * @ordered
     */
    protected boolean useBlank = USE_BLANK_EDEFAULT;

    /**
     * The default value of the '{@link #getMatchingAlgorithm() <em>Matching Algorithm</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMatchingAlgorithm()
     * @generated
     * @ordered
     */
    protected static final MatchingAlgorithm MATCHING_ALGORITHM_EDEFAULT = MatchingAlgorithm.EXACT;

    /**
     * The cached value of the '{@link #getMatchingAlgorithm() <em>Matching Algorithm</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMatchingAlgorithm()
     * @generated
     * @ordered
     */
    protected MatchingAlgorithm matchingAlgorithm = MATCHING_ALGORITHM_EDEFAULT;

    /**
     * The default value of the '{@link #isIgnoreCase() <em>Ignore Case</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIgnoreCase()
     * @generated
     * @ordered
     */
    protected static final boolean IGNORE_CASE_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIgnoreCase() <em>Ignore Case</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIgnoreCase()
     * @generated
     * @ordered
     */
    protected boolean ignoreCase = IGNORE_CASE_EDEFAULT;

    /**
     * The default value of the '{@link #isUseNulls() <em>Use Nulls</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isUseNulls()
     * @generated
     * @ordered
     */
    protected static final boolean USE_NULLS_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isUseNulls() <em>Use Nulls</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isUseNulls()
     * @generated
     * @ordered
     */
    protected boolean useNulls = USE_NULLS_EDEFAULT;

    /**
     * The default value of the '{@link #getCharactersToReplace() <em>Characters To Replace</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCharactersToReplace()
     * @generated
     * @ordered
     */
    protected static final String CHARACTERS_TO_REPLACE_EDEFAULT = "abcdefghijklmnopqrstuvwxyz\u00e7\u00e2\u00ea\u00ee\u00f4\u00fb\u00e9\u00e8\u00f9\u00ef\u00f6\u00fcABCDEFGHIJKLMNOPQRSTUVWXYZ\u00c7\u00c2\u00ca\u00ce\u00d4\u00db\u00c9\u00c8\u00d9\u00cf\u00d6\u00dc0123456789";

    /**
     * The cached value of the '{@link #getCharactersToReplace() <em>Characters To Replace</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCharactersToReplace()
     * @generated
     * @ordered
     */
    protected String charactersToReplace = CHARACTERS_TO_REPLACE_EDEFAULT;

    /**
     * The default value of the '{@link #getReplacementCharacters() <em>Replacement Characters</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReplacementCharacters()
     * @generated
     * @ordered
     */
    protected static final String REPLACEMENT_CHARACTERS_EDEFAULT = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA9999999999";

    /**
     * The cached value of the '{@link #getReplacementCharacters() <em>Replacement Characters</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReplacementCharacters()
     * @generated
     * @ordered
     */
    protected String replacementCharacters = REPLACEMENT_CHARACTERS_EDEFAULT;

    /**
     * The default value of the '{@link #getCountryCode() <em>Country Code</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCountryCode()
     * @generated
     * @ordered
     */
    protected static final String COUNTRY_CODE_EDEFAULT = "CN";

    /**
     * The cached value of the '{@link #getCountryCode() <em>Country Code</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCountryCode()
     * @generated
     * @ordered
     */
    protected String countryCode = COUNTRY_CODE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TextParametersImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return IndicatorsPackage.Literals.TEXT_PARAMETERS;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isUseBlank() {
        return useBlank;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setUseBlank(boolean newUseBlank) {
        boolean oldUseBlank = useBlank;
        useBlank = newUseBlank;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, IndicatorsPackage.TEXT_PARAMETERS__USE_BLANK, oldUseBlank, useBlank));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MatchingAlgorithm getMatchingAlgorithm() {
        return matchingAlgorithm;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMatchingAlgorithm(MatchingAlgorithm newMatchingAlgorithm) {
        MatchingAlgorithm oldMatchingAlgorithm = matchingAlgorithm;
        matchingAlgorithm = newMatchingAlgorithm == null ? MATCHING_ALGORITHM_EDEFAULT : newMatchingAlgorithm;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, IndicatorsPackage.TEXT_PARAMETERS__MATCHING_ALGORITHM, oldMatchingAlgorithm, matchingAlgorithm));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isIgnoreCase() {
        return ignoreCase;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIgnoreCase(boolean newIgnoreCase) {
        boolean oldIgnoreCase = ignoreCase;
        ignoreCase = newIgnoreCase;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, IndicatorsPackage.TEXT_PARAMETERS__IGNORE_CASE, oldIgnoreCase, ignoreCase));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isUseNulls() {
        return useNulls;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setUseNulls(boolean newUseNulls) {
        boolean oldUseNulls = useNulls;
        useNulls = newUseNulls;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, IndicatorsPackage.TEXT_PARAMETERS__USE_NULLS, oldUseNulls, useNulls));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getCharactersToReplace() {
        return charactersToReplace;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCharactersToReplace(String newCharactersToReplace) {
        String oldCharactersToReplace = charactersToReplace;
        charactersToReplace = newCharactersToReplace;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, IndicatorsPackage.TEXT_PARAMETERS__CHARACTERS_TO_REPLACE, oldCharactersToReplace, charactersToReplace));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getReplacementCharacters() {
        return replacementCharacters;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setReplacementCharacters(String newReplacementCharacters) {
        String oldReplacementCharacters = replacementCharacters;
        replacementCharacters = newReplacementCharacters;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, IndicatorsPackage.TEXT_PARAMETERS__REPLACEMENT_CHARACTERS, oldReplacementCharacters, replacementCharacters));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCountryCode(String newCountryCode) {
        String oldCountryCode = countryCode;
        countryCode = newCountryCode;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, IndicatorsPackage.TEXT_PARAMETERS__COUNTRY_CODE, oldCountryCode, countryCode));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case IndicatorsPackage.TEXT_PARAMETERS__USE_BLANK:
                return isUseBlank();
            case IndicatorsPackage.TEXT_PARAMETERS__MATCHING_ALGORITHM:
                return getMatchingAlgorithm();
            case IndicatorsPackage.TEXT_PARAMETERS__IGNORE_CASE:
                return isIgnoreCase();
            case IndicatorsPackage.TEXT_PARAMETERS__USE_NULLS:
                return isUseNulls();
            case IndicatorsPackage.TEXT_PARAMETERS__CHARACTERS_TO_REPLACE:
                return getCharactersToReplace();
            case IndicatorsPackage.TEXT_PARAMETERS__REPLACEMENT_CHARACTERS:
                return getReplacementCharacters();
            case IndicatorsPackage.TEXT_PARAMETERS__COUNTRY_CODE:
                return getCountryCode();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case IndicatorsPackage.TEXT_PARAMETERS__USE_BLANK:
                setUseBlank((Boolean)newValue);
                return;
            case IndicatorsPackage.TEXT_PARAMETERS__MATCHING_ALGORITHM:
                setMatchingAlgorithm((MatchingAlgorithm)newValue);
                return;
            case IndicatorsPackage.TEXT_PARAMETERS__IGNORE_CASE:
                setIgnoreCase((Boolean)newValue);
                return;
            case IndicatorsPackage.TEXT_PARAMETERS__USE_NULLS:
                setUseNulls((Boolean)newValue);
                return;
            case IndicatorsPackage.TEXT_PARAMETERS__CHARACTERS_TO_REPLACE:
                setCharactersToReplace((String)newValue);
                return;
            case IndicatorsPackage.TEXT_PARAMETERS__REPLACEMENT_CHARACTERS:
                setReplacementCharacters((String)newValue);
                return;
            case IndicatorsPackage.TEXT_PARAMETERS__COUNTRY_CODE:
                setCountryCode((String)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case IndicatorsPackage.TEXT_PARAMETERS__USE_BLANK:
                setUseBlank(USE_BLANK_EDEFAULT);
                return;
            case IndicatorsPackage.TEXT_PARAMETERS__MATCHING_ALGORITHM:
                setMatchingAlgorithm(MATCHING_ALGORITHM_EDEFAULT);
                return;
            case IndicatorsPackage.TEXT_PARAMETERS__IGNORE_CASE:
                setIgnoreCase(IGNORE_CASE_EDEFAULT);
                return;
            case IndicatorsPackage.TEXT_PARAMETERS__USE_NULLS:
                setUseNulls(USE_NULLS_EDEFAULT);
                return;
            case IndicatorsPackage.TEXT_PARAMETERS__CHARACTERS_TO_REPLACE:
                setCharactersToReplace(CHARACTERS_TO_REPLACE_EDEFAULT);
                return;
            case IndicatorsPackage.TEXT_PARAMETERS__REPLACEMENT_CHARACTERS:
                setReplacementCharacters(REPLACEMENT_CHARACTERS_EDEFAULT);
                return;
            case IndicatorsPackage.TEXT_PARAMETERS__COUNTRY_CODE:
                setCountryCode(COUNTRY_CODE_EDEFAULT);
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case IndicatorsPackage.TEXT_PARAMETERS__USE_BLANK:
                return useBlank != USE_BLANK_EDEFAULT;
            case IndicatorsPackage.TEXT_PARAMETERS__MATCHING_ALGORITHM:
                return matchingAlgorithm != MATCHING_ALGORITHM_EDEFAULT;
            case IndicatorsPackage.TEXT_PARAMETERS__IGNORE_CASE:
                return ignoreCase != IGNORE_CASE_EDEFAULT;
            case IndicatorsPackage.TEXT_PARAMETERS__USE_NULLS:
                return useNulls != USE_NULLS_EDEFAULT;
            case IndicatorsPackage.TEXT_PARAMETERS__CHARACTERS_TO_REPLACE:
                return CHARACTERS_TO_REPLACE_EDEFAULT == null ? charactersToReplace != null : !CHARACTERS_TO_REPLACE_EDEFAULT.equals(charactersToReplace);
            case IndicatorsPackage.TEXT_PARAMETERS__REPLACEMENT_CHARACTERS:
                return REPLACEMENT_CHARACTERS_EDEFAULT == null ? replacementCharacters != null : !REPLACEMENT_CHARACTERS_EDEFAULT.equals(replacementCharacters);
            case IndicatorsPackage.TEXT_PARAMETERS__COUNTRY_CODE:
                return COUNTRY_CODE_EDEFAULT == null ? countryCode != null : !COUNTRY_CODE_EDEFAULT.equals(countryCode);
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (useBlank: ");
        result.append(useBlank);
        result.append(", matchingAlgorithm: ");
        result.append(matchingAlgorithm);
        result.append(", ignoreCase: ");
        result.append(ignoreCase);
        result.append(", useNulls: ");
        result.append(useNulls);
        result.append(", charactersToReplace: ");
        result.append(charactersToReplace);
        result.append(", replacementCharacters: ");
        result.append(replacementCharacters);
        result.append(", countryCode: ");
        result.append(countryCode);
        result.append(')');
        return result.toString();
    }

} //TextParametersImpl
