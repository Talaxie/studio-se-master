/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.indicators.definition.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.talend.dataquality.indicators.definition.CharactersMapping;
import org.talend.dataquality.indicators.definition.DefinitionPackage;
import orgomg.cwm.objectmodel.core.impl.ModelElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Characters Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.dataquality.indicators.definition.impl.CharactersMappingImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.definition.impl.CharactersMappingImpl#getCharactersToReplace <em>Characters To Replace</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.definition.impl.CharactersMappingImpl#getReplacementCharacters <em>Replacement Characters</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CharactersMappingImpl extends ModelElementImpl implements CharactersMapping {
    /**
     * The default value of the '{@link #getLanguage() <em>Language</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLanguage()
     * @generated
     * @ordered
     */
    protected static final String LANGUAGE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLanguage() <em>Language</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLanguage()
     * @generated
     * @ordered
     */
    protected String language = LANGUAGE_EDEFAULT;

    /**
     * The default value of the '{@link #getCharactersToReplace() <em>Characters To Replace</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCharactersToReplace()
     * @generated
     * @ordered
     */
    protected static final String CHARACTERS_TO_REPLACE_EDEFAULT = null;

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
    protected static final String REPLACEMENT_CHARACTERS_EDEFAULT = null;

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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CharactersMappingImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DefinitionPackage.Literals.CHARACTERS_MAPPING;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getLanguage() {
        return language;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLanguage(String newLanguage) {
        String oldLanguage = language;
        language = newLanguage;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DefinitionPackage.CHARACTERS_MAPPING__LANGUAGE, oldLanguage, language));
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
            eNotify(new ENotificationImpl(this, Notification.SET, DefinitionPackage.CHARACTERS_MAPPING__CHARACTERS_TO_REPLACE, oldCharactersToReplace, charactersToReplace));
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
            eNotify(new ENotificationImpl(this, Notification.SET, DefinitionPackage.CHARACTERS_MAPPING__REPLACEMENT_CHARACTERS, oldReplacementCharacters, replacementCharacters));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case DefinitionPackage.CHARACTERS_MAPPING__LANGUAGE:
                return getLanguage();
            case DefinitionPackage.CHARACTERS_MAPPING__CHARACTERS_TO_REPLACE:
                return getCharactersToReplace();
            case DefinitionPackage.CHARACTERS_MAPPING__REPLACEMENT_CHARACTERS:
                return getReplacementCharacters();
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
            case DefinitionPackage.CHARACTERS_MAPPING__LANGUAGE:
                setLanguage((String)newValue);
                return;
            case DefinitionPackage.CHARACTERS_MAPPING__CHARACTERS_TO_REPLACE:
                setCharactersToReplace((String)newValue);
                return;
            case DefinitionPackage.CHARACTERS_MAPPING__REPLACEMENT_CHARACTERS:
                setReplacementCharacters((String)newValue);
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
            case DefinitionPackage.CHARACTERS_MAPPING__LANGUAGE:
                setLanguage(LANGUAGE_EDEFAULT);
                return;
            case DefinitionPackage.CHARACTERS_MAPPING__CHARACTERS_TO_REPLACE:
                setCharactersToReplace(CHARACTERS_TO_REPLACE_EDEFAULT);
                return;
            case DefinitionPackage.CHARACTERS_MAPPING__REPLACEMENT_CHARACTERS:
                setReplacementCharacters(REPLACEMENT_CHARACTERS_EDEFAULT);
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
            case DefinitionPackage.CHARACTERS_MAPPING__LANGUAGE:
                return LANGUAGE_EDEFAULT == null ? language != null : !LANGUAGE_EDEFAULT.equals(language);
            case DefinitionPackage.CHARACTERS_MAPPING__CHARACTERS_TO_REPLACE:
                return CHARACTERS_TO_REPLACE_EDEFAULT == null ? charactersToReplace != null : !CHARACTERS_TO_REPLACE_EDEFAULT.equals(charactersToReplace);
            case DefinitionPackage.CHARACTERS_MAPPING__REPLACEMENT_CHARACTERS:
                return REPLACEMENT_CHARACTERS_EDEFAULT == null ? replacementCharacters != null : !REPLACEMENT_CHARACTERS_EDEFAULT.equals(replacementCharacters);
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
        result.append(" (language: ");
        result.append(language);
        result.append(", charactersToReplace: ");
        result.append(charactersToReplace);
        result.append(", replacementCharacters: ");
        result.append(replacementCharacters);
        result.append(')');
        return result.toString();
    }

} //CharactersMappingImpl
