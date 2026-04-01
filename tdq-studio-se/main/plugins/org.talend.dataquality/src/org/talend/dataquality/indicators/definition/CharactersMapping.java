/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.indicators.definition;

import orgomg.cwm.objectmodel.core.ModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Characters Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Class that contains the mapping of the characters to replace by other generic characters
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.dataquality.indicators.definition.CharactersMapping#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.definition.CharactersMapping#getCharactersToReplace <em>Characters To Replace</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.definition.CharactersMapping#getReplacementCharacters <em>Replacement Characters</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.dataquality.indicators.definition.DefinitionPackage#getCharactersMapping()
 * @model
 * @generated
 */
public interface CharactersMapping extends ModelElement {
    /**
     * Returns the value of the '<em><b>Language</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * the database language for which this replacement must occur.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Language</em>' attribute.
     * @see #setLanguage(String)
     * @see org.talend.dataquality.indicators.definition.DefinitionPackage#getCharactersMapping_Language()
     * @model dataType="orgomg.cwm.objectmodel.core.Name"
     * @generated
     */
    String getLanguage();

    /**
     * Sets the value of the '{@link org.talend.dataquality.indicators.definition.CharactersMapping#getLanguage <em>Language</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Language</em>' attribute.
     * @see #getLanguage()
     * @generated
     */
    void setLanguage(String value);

    /**
     * Returns the value of the '<em><b>Characters To Replace</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * the list of characters to be replaced
     * <!-- end-model-doc -->
     * @return the value of the '<em>Characters To Replace</em>' attribute.
     * @see #setCharactersToReplace(String)
     * @see org.talend.dataquality.indicators.definition.DefinitionPackage#getCharactersMapping_CharactersToReplace()
     * @model dataType="orgomg.cwm.objectmodel.core.String"
     * @generated
     */
    String getCharactersToReplace();

    /**
     * Sets the value of the '{@link org.talend.dataquality.indicators.definition.CharactersMapping#getCharactersToReplace <em>Characters To Replace</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Characters To Replace</em>' attribute.
     * @see #getCharactersToReplace()
     * @generated
     */
    void setCharactersToReplace(String value);

    /**
     * Returns the value of the '<em><b>Replacement Characters</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * the replacement characters
     * <!-- end-model-doc -->
     * @return the value of the '<em>Replacement Characters</em>' attribute.
     * @see #setReplacementCharacters(String)
     * @see org.talend.dataquality.indicators.definition.DefinitionPackage#getCharactersMapping_ReplacementCharacters()
     * @model dataType="orgomg.cwm.objectmodel.core.String"
     * @generated
     */
    String getReplacementCharacters();

    /**
     * Sets the value of the '{@link org.talend.dataquality.indicators.definition.CharactersMapping#getReplacementCharacters <em>Replacement Characters</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Replacement Characters</em>' attribute.
     * @see #getReplacementCharacters()
     * @generated
     */
    void setReplacementCharacters(String value);

} // CharactersMapping
