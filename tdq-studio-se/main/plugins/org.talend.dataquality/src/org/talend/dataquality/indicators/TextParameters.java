/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.indicators;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text Parameters</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.dataquality.indicators.TextParameters#isUseBlank <em>Use Blank</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.TextParameters#getMatchingAlgorithm <em>Matching Algorithm</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.TextParameters#isIgnoreCase <em>Ignore Case</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.TextParameters#isUseNulls <em>Use Nulls</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.TextParameters#getCharactersToReplace <em>Characters To Replace</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.TextParameters#getReplacementCharacters <em>Replacement Characters</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.TextParameters#getCountryCode <em>Country Code</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.dataquality.indicators.IndicatorsPackage#getTextParameters()
 * @model
 * @generated
 */
public interface TextParameters extends EObject {
    /**
     * Returns the value of the '<em><b>Use Blank</b></em>' attribute.
     * The default value is <code>"true"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Use Blank</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Use Blank</em>' attribute.
     * @see #setUseBlank(boolean)
     * @see org.talend.dataquality.indicators.IndicatorsPackage#getTextParameters_UseBlank()
     * @model default="true"
     * @generated
     */
    boolean isUseBlank();

    /**
     * Sets the value of the '{@link org.talend.dataquality.indicators.TextParameters#isUseBlank <em>Use Blank</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Use Blank</em>' attribute.
     * @see #isUseBlank()
     * @generated
     */
    void setUseBlank(boolean value);

    /**
     * Returns the value of the '<em><b>Matching Algorithm</b></em>' attribute.
     * The literals are from the enumeration {@link org.talend.dataquality.indicators.MatchingAlgorithm}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Matching Algorithm</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Matching Algorithm</em>' attribute.
     * @see org.talend.dataquality.indicators.MatchingAlgorithm
     * @see #setMatchingAlgorithm(MatchingAlgorithm)
     * @see org.talend.dataquality.indicators.IndicatorsPackage#getTextParameters_MatchingAlgorithm()
     * @model
     * @generated
     */
    MatchingAlgorithm getMatchingAlgorithm();

    /**
     * Sets the value of the '{@link org.talend.dataquality.indicators.TextParameters#getMatchingAlgorithm <em>Matching Algorithm</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Matching Algorithm</em>' attribute.
     * @see org.talend.dataquality.indicators.MatchingAlgorithm
     * @see #getMatchingAlgorithm()
     * @generated
     */
    void setMatchingAlgorithm(MatchingAlgorithm value);

    /**
     * Returns the value of the '<em><b>Ignore Case</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ignore Case</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ignore Case</em>' attribute.
     * @see #setIgnoreCase(boolean)
     * @see org.talend.dataquality.indicators.IndicatorsPackage#getTextParameters_IgnoreCase()
     * @model
     * @generated
     */
    boolean isIgnoreCase();

    /**
     * Sets the value of the '{@link org.talend.dataquality.indicators.TextParameters#isIgnoreCase <em>Ignore Case</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ignore Case</em>' attribute.
     * @see #isIgnoreCase()
     * @generated
     */
    void setIgnoreCase(boolean value);

    /**
     * Returns the value of the '<em><b>Use Nulls</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Use Nulls</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Use Nulls</em>' attribute.
     * @see #setUseNulls(boolean)
     * @see org.talend.dataquality.indicators.IndicatorsPackage#getTextParameters_UseNulls()
     * @model
     * @generated
     */
    boolean isUseNulls();

    /**
     * Sets the value of the '{@link org.talend.dataquality.indicators.TextParameters#isUseNulls <em>Use Nulls</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Use Nulls</em>' attribute.
     * @see #isUseNulls()
     * @generated
     */
    void setUseNulls(boolean value);

    /**
     * Returns the value of the '<em><b>Characters To Replace</b></em>' attribute.
     * The default value is <code>"abcdefghijklmnopqrstuvwxyz\u00e7\u00e2\u00ea\u00ee\u00f4\u00fb\u00e9\u00e8\u00f9\u00ef\u00f6\u00fcABCDEFGHIJKLMNOPQRSTUVWXYZ\u00c7\u00c2\u00ca\u00ce\u00d4\u00db\u00c9\u00c8\u00d9\u00cf\u00d6\u00dc0123456789"</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The characters to be replaced in a pattern finder indicator
     * <!-- end-model-doc -->
     * @return the value of the '<em>Characters To Replace</em>' attribute.
     * @see #setCharactersToReplace(String)
     * @see org.talend.dataquality.indicators.IndicatorsPackage#getTextParameters_CharactersToReplace()
     * @model default="abcdefghijklmnopqrstuvwxyz\u00e7\u00e2\u00ea\u00ee\u00f4\u00fb\u00e9\u00e8\u00f9\u00ef\u00f6\u00fcABCDEFGHIJKLMNOPQRSTUVWXYZ\u00c7\u00c2\u00ca\u00ce\u00d4\u00db\u00c9\u00c8\u00d9\u00cf\u00d6\u00dc0123456789"
     * @generated
     */
    String getCharactersToReplace();

    /**
     * Sets the value of the '{@link org.talend.dataquality.indicators.TextParameters#getCharactersToReplace <em>Characters To Replace</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Characters To Replace</em>' attribute.
     * @see #getCharactersToReplace()
     * @generated
     */
    void setCharactersToReplace(String value);

    /**
     * Returns the value of the '<em><b>Replacement Characters</b></em>' attribute.
     * The default value is <code>"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA9999999999"</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The replacement characters used to replace the characters of charactersToReplace. The length of this string must be the same as the length of the string in charactersToReplace.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Replacement Characters</em>' attribute.
     * @see #setReplacementCharacters(String)
     * @see org.talend.dataquality.indicators.IndicatorsPackage#getTextParameters_ReplacementCharacters()
     * @model default="aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA9999999999"
     * @generated
     */
    String getReplacementCharacters();

    /**
     * Sets the value of the '{@link org.talend.dataquality.indicators.TextParameters#getReplacementCharacters <em>Replacement Characters</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Replacement Characters</em>' attribute.
     * @see #getReplacementCharacters()
     * @generated
     */
    void setReplacementCharacters(String value);

    /**
     * Returns the value of the '<em><b>Country Code</b></em>' attribute.
     * The default value is <code>"CN"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Country Code</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Country Code</em>' attribute.
     * @see #setCountryCode(String)
     * @see org.talend.dataquality.indicators.IndicatorsPackage#getTextParameters_CountryCode()
     * @model default="CN"
     * @generated
     */
    String getCountryCode();

    /**
     * Sets the value of the '{@link org.talend.dataquality.indicators.TextParameters#getCountryCode <em>Country Code</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Country Code</em>' attribute.
     * @see #getCountryCode()
     * @generated
     */
    void setCountryCode(String value);

} // TextParameters
