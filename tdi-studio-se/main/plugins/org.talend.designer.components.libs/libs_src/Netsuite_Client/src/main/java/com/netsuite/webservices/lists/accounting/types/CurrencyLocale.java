
package com.netsuite.webservices.lists.accounting.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CurrencyLocale.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CurrencyLocale"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_afghanistanPashto"/&gt;
 *     &lt;enumeration value="_afghanistanPersian"/&gt;
 *     &lt;enumeration value="_alandIslandsSwedish"/&gt;
 *     &lt;enumeration value="_albaniaAlbanian"/&gt;
 *     &lt;enumeration value="_algeriaArabic"/&gt;
 *     &lt;enumeration value="_angolaPortuguese"/&gt;
 *     &lt;enumeration value="_anguillaEnglish"/&gt;
 *     &lt;enumeration value="_antiguaAndBarbudaEnglish"/&gt;
 *     &lt;enumeration value="_argentinaSpanish"/&gt;
 *     &lt;enumeration value="_armeniaArmenian"/&gt;
 *     &lt;enumeration value="_arubaEnglish"/&gt;
 *     &lt;enumeration value="_arubaPortuguese"/&gt;
 *     &lt;enumeration value="_australiaEnglish"/&gt;
 *     &lt;enumeration value="_austriaGerman"/&gt;
 *     &lt;enumeration value="_azerbaijanAzerbaijani"/&gt;
 *     &lt;enumeration value="_bahamasEnglish"/&gt;
 *     &lt;enumeration value="_bahrainArabic"/&gt;
 *     &lt;enumeration value="_barbadosEnglish"/&gt;
 *     &lt;enumeration value="_belarusByelorussian"/&gt;
 *     &lt;enumeration value="_belgiumDutch"/&gt;
 *     &lt;enumeration value="_belgiumFrench"/&gt;
 *     &lt;enumeration value="_belizeEnglish"/&gt;
 *     &lt;enumeration value="_bengali"/&gt;
 *     &lt;enumeration value="_beninFrench"/&gt;
 *     &lt;enumeration value="_bermudaEnglish"/&gt;
 *     &lt;enumeration value="_bhutanDzongkha"/&gt;
 *     &lt;enumeration value="_boliviaSpanish"/&gt;
 *     &lt;enumeration value="_bonaireSaintEustatiusAndSabaDutch"/&gt;
 *     &lt;enumeration value="_bosniaAndHerzegovinaBosnian"/&gt;
 *     &lt;enumeration value="_botswanaEnglish"/&gt;
 *     &lt;enumeration value="_brazilPortuguese"/&gt;
 *     &lt;enumeration value="_bruneiMalay"/&gt;
 *     &lt;enumeration value="_bulgariaBulgarian"/&gt;
 *     &lt;enumeration value="_burkinaFasoFrench"/&gt;
 *     &lt;enumeration value="_burundiFrench"/&gt;
 *     &lt;enumeration value="_cambodiaKhmer"/&gt;
 *     &lt;enumeration value="_cameroonFrench"/&gt;
 *     &lt;enumeration value="_canadaEnglish"/&gt;
 *     &lt;enumeration value="_canadaFrench"/&gt;
 *     &lt;enumeration value="_canaryIslandsSpanish"/&gt;
 *     &lt;enumeration value="_capeVerdePortuguese"/&gt;
 *     &lt;enumeration value="_caymanIslandsEnglish"/&gt;
 *     &lt;enumeration value="_centralAfricanRepublicFrench"/&gt;
 *     &lt;enumeration value="_ceutaAndMelillaSpanish"/&gt;
 *     &lt;enumeration value="_chadFrench"/&gt;
 *     &lt;enumeration value="_chileSpanish"/&gt;
 *     &lt;enumeration value="_chinaChinese"/&gt;
 *     &lt;enumeration value="_colombiaSpanish"/&gt;
 *     &lt;enumeration value="_comorosFrench"/&gt;
 *     &lt;enumeration value="_congoDemocraticRepublicEnglish"/&gt;
 *     &lt;enumeration value="_congoDemocraticRepublicFrench"/&gt;
 *     &lt;enumeration value="_congoRepublicOfFrench"/&gt;
 *     &lt;enumeration value="_costaRicaSpanish"/&gt;
 *     &lt;enumeration value="_coteDivoireFrench"/&gt;
 *     &lt;enumeration value="_croatiaCroatian"/&gt;
 *     &lt;enumeration value="_cubaSpanish"/&gt;
 *     &lt;enumeration value="_curacaoDutch"/&gt;
 *     &lt;enumeration value="_cyprusEnglish"/&gt;
 *     &lt;enumeration value="_cyprusEnglishEuro"/&gt;
 *     &lt;enumeration value="_czechRepublicCzech"/&gt;
 *     &lt;enumeration value="_denmarkDanish"/&gt;
 *     &lt;enumeration value="_djiboutiArabic"/&gt;
 *     &lt;enumeration value="_djiboutiFrench"/&gt;
 *     &lt;enumeration value="_dominicaEnglish"/&gt;
 *     &lt;enumeration value="_dominicanRepublicSpanish"/&gt;
 *     &lt;enumeration value="_ecuadorSpanish"/&gt;
 *     &lt;enumeration value="_egyptArabic"/&gt;
 *     &lt;enumeration value="_elSalvadorSpanish"/&gt;
 *     &lt;enumeration value="_equatorialGuineaSpanish"/&gt;
 *     &lt;enumeration value="_eritreaAfar"/&gt;
 *     &lt;enumeration value="_estoniaEstonian"/&gt;
 *     &lt;enumeration value="_ethiopiaAmharic"/&gt;
 *     &lt;enumeration value="_falklandIslandsEnglish"/&gt;
 *     &lt;enumeration value="_fijiFijian"/&gt;
 *     &lt;enumeration value="_finlandFinnish"/&gt;
 *     &lt;enumeration value="_finlandFinnishEuro"/&gt;
 *     &lt;enumeration value="_franceFrench"/&gt;
 *     &lt;enumeration value="_franceFrenchEuro"/&gt;
 *     &lt;enumeration value="_frenchPolynesiaFrench"/&gt;
 *     &lt;enumeration value="_gabonFrench"/&gt;
 *     &lt;enumeration value="_gambiaEnglish"/&gt;
 *     &lt;enumeration value="_georgiaGeorgian"/&gt;
 *     &lt;enumeration value="_germanyGerman"/&gt;
 *     &lt;enumeration value="_germanyGermanEuro"/&gt;
 *     &lt;enumeration value="_ghanaEnglish"/&gt;
 *     &lt;enumeration value="_gibraltarEnglish"/&gt;
 *     &lt;enumeration value="_goldOunce"/&gt;
 *     &lt;enumeration value="_greeceGreek"/&gt;
 *     &lt;enumeration value="_grenadaEnglish"/&gt;
 *     &lt;enumeration value="_guatemalaSpanish"/&gt;
 *     &lt;enumeration value="_guineaBissauPortuguese"/&gt;
 *     &lt;enumeration value="_guineaFrench"/&gt;
 *     &lt;enumeration value="_guyanaEnglish"/&gt;
 *     &lt;enumeration value="_haitian"/&gt;
 *     &lt;enumeration value="_hondurasSpanish"/&gt;
 *     &lt;enumeration value="_hongKongChinese"/&gt;
 *     &lt;enumeration value="_hungaryHungarian"/&gt;
 *     &lt;enumeration value="_icelandIcelandic"/&gt;
 *     &lt;enumeration value="_indiaEnglish"/&gt;
 *     &lt;enumeration value="_indiaGujarati"/&gt;
 *     &lt;enumeration value="_indiaHindi"/&gt;
 *     &lt;enumeration value="_indiaKannada"/&gt;
 *     &lt;enumeration value="_indiaMarathi"/&gt;
 *     &lt;enumeration value="_indiaPanjabi"/&gt;
 *     &lt;enumeration value="_indiaTamil"/&gt;
 *     &lt;enumeration value="_indiaTelugu"/&gt;
 *     &lt;enumeration value="_indonesiaIndonesian"/&gt;
 *     &lt;enumeration value="_iranPersian"/&gt;
 *     &lt;enumeration value="_iraqArabic"/&gt;
 *     &lt;enumeration value="_irelandEnglish"/&gt;
 *     &lt;enumeration value="_israelHebrew"/&gt;
 *     &lt;enumeration value="_italyItalian"/&gt;
 *     &lt;enumeration value="_italyItalianEuro"/&gt;
 *     &lt;enumeration value="_jamaicaEnglish"/&gt;
 *     &lt;enumeration value="_japanJapanese"/&gt;
 *     &lt;enumeration value="_jordanArabic"/&gt;
 *     &lt;enumeration value="_jordanEnglish"/&gt;
 *     &lt;enumeration value="_kazakhstanRussian"/&gt;
 *     &lt;enumeration value="_kenyaEnglish"/&gt;
 *     &lt;enumeration value="_kuwaitArabic"/&gt;
 *     &lt;enumeration value="_kuwaitEnglish"/&gt;
 *     &lt;enumeration value="_kyrgyzstanRussian"/&gt;
 *     &lt;enumeration value="_laosLao"/&gt;
 *     &lt;enumeration value="_latviaLatvianLettish"/&gt;
 *     &lt;enumeration value="_lebanonArabic"/&gt;
 *     &lt;enumeration value="_lesothoEnglish"/&gt;
 *     &lt;enumeration value="_liberiaEnglish"/&gt;
 *     &lt;enumeration value="_libyaArabic"/&gt;
 *     &lt;enumeration value="_lithuaniaLithuanian"/&gt;
 *     &lt;enumeration value="_luxembourgFrench"/&gt;
 *     &lt;enumeration value="_luxembourgGerman"/&gt;
 *     &lt;enumeration value="_luxembourgLuxembourgish"/&gt;
 *     &lt;enumeration value="_macauChinese"/&gt;
 *     &lt;enumeration value="_macedoniaMacedonian"/&gt;
 *     &lt;enumeration value="_malawiEnglish"/&gt;
 *     &lt;enumeration value="_malaysiaMalay"/&gt;
 *     &lt;enumeration value="_maldivesDhivehi"/&gt;
 *     &lt;enumeration value="_maliFrench"/&gt;
 *     &lt;enumeration value="_mauritiusEnglish"/&gt;
 *     &lt;enumeration value="_mexicoSpanish"/&gt;
 *     &lt;enumeration value="_moldovaRomanian"/&gt;
 *     &lt;enumeration value="_moldovaRussian"/&gt;
 *     &lt;enumeration value="_mongoliaMongolian"/&gt;
 *     &lt;enumeration value="_moroccoArabic"/&gt;
 *     &lt;enumeration value="_mozambiquePortuguese"/&gt;
 *     &lt;enumeration value="_myanmarBurmese"/&gt;
 *     &lt;enumeration value="_namibiaEnglish"/&gt;
 *     &lt;enumeration value="_nepalNepali"/&gt;
 *     &lt;enumeration value="_netherlandsAntillesDutch"/&gt;
 *     &lt;enumeration value="_netherlandsDutch"/&gt;
 *     &lt;enumeration value="_netherlandsDutchEuro"/&gt;
 *     &lt;enumeration value="_newCaledoniaFrench"/&gt;
 *     &lt;enumeration value="_newZealandEnglish"/&gt;
 *     &lt;enumeration value="_nicaraguaSpanish"/&gt;
 *     &lt;enumeration value="_nigerFrench"/&gt;
 *     &lt;enumeration value="_nigeriaEnglish"/&gt;
 *     &lt;enumeration value="_northKoreaKorean"/&gt;
 *     &lt;enumeration value="_norwayNorwegian"/&gt;
 *     &lt;enumeration value="_omanArabic"/&gt;
 *     &lt;enumeration value="_pakistanUrdu"/&gt;
 *     &lt;enumeration value="_palladiumOunce"/&gt;
 *     &lt;enumeration value="_panamaSpanish"/&gt;
 *     &lt;enumeration value="_papuaNewGuineaEnglish"/&gt;
 *     &lt;enumeration value="_paraguaySpanish"/&gt;
 *     &lt;enumeration value="_peruSpanish"/&gt;
 *     &lt;enumeration value="_philippinesEnglish"/&gt;
 *     &lt;enumeration value="_philippinesTagalog"/&gt;
 *     &lt;enumeration value="_platinumOunce"/&gt;
 *     &lt;enumeration value="_polandPolish"/&gt;
 *     &lt;enumeration value="_portugalPortuguese"/&gt;
 *     &lt;enumeration value="_portugalPortugueseEuro"/&gt;
 *     &lt;enumeration value="_puertoRicoSpanish"/&gt;
 *     &lt;enumeration value="_qatarArabic"/&gt;
 *     &lt;enumeration value="_qatarEnglish"/&gt;
 *     &lt;enumeration value="_romaniaRomanian"/&gt;
 *     &lt;enumeration value="_russiaRussian"/&gt;
 *     &lt;enumeration value="_rwandaFrench"/&gt;
 *     &lt;enumeration value="_saintBarthelemyFrench"/&gt;
 *     &lt;enumeration value="_saintHelenaEnglish"/&gt;
 *     &lt;enumeration value="_saintKittsAndNevisEnglish"/&gt;
 *     &lt;enumeration value="_saintLuciaEnglish"/&gt;
 *     &lt;enumeration value="_saintMartinEnglish"/&gt;
 *     &lt;enumeration value="_saintVincentAndTheGrenadinesEnglish"/&gt;
 *     &lt;enumeration value="_samoaSamoan"/&gt;
 *     &lt;enumeration value="_saoTomeAndPrincipePortuguese"/&gt;
 *     &lt;enumeration value="_saudiArabiaArabic"/&gt;
 *     &lt;enumeration value="_senegalFrench"/&gt;
 *     &lt;enumeration value="_serbiaAndMontenegroSerbian"/&gt;
 *     &lt;enumeration value="_serbiaSerbian"/&gt;
 *     &lt;enumeration value="_serbiaSerboCroatian"/&gt;
 *     &lt;enumeration value="_seychellesEnglish"/&gt;
 *     &lt;enumeration value="_seychellesFrench"/&gt;
 *     &lt;enumeration value="_sierraLeoneEnglish"/&gt;
 *     &lt;enumeration value="_silverOunce"/&gt;
 *     &lt;enumeration value="_singaporeEnglish"/&gt;
 *     &lt;enumeration value="_sintMaartenDutch"/&gt;
 *     &lt;enumeration value="_slovakiaSlovak"/&gt;
 *     &lt;enumeration value="_slovakiaSlovakEuro"/&gt;
 *     &lt;enumeration value="_sloveniaSlovenian"/&gt;
 *     &lt;enumeration value="_sloveniaSlovenianEuro"/&gt;
 *     &lt;enumeration value="_solomonIslandsEnglish"/&gt;
 *     &lt;enumeration value="_somaliaSomali"/&gt;
 *     &lt;enumeration value="_southAfricaAfrikaans"/&gt;
 *     &lt;enumeration value="_southAfricaEnglish"/&gt;
 *     &lt;enumeration value="_southKoreaKorean"/&gt;
 *     &lt;enumeration value="_southSudanEnglish"/&gt;
 *     &lt;enumeration value="_spainCatalan"/&gt;
 *     &lt;enumeration value="_spainSpanish"/&gt;
 *     &lt;enumeration value="_spainSpanishEuro"/&gt;
 *     &lt;enumeration value="_sriLankaSinhalese"/&gt;
 *     &lt;enumeration value="_sudanArabic"/&gt;
 *     &lt;enumeration value="_surinameDutch"/&gt;
 *     &lt;enumeration value="_swazilandSwati"/&gt;
 *     &lt;enumeration value="_swedenSwedish"/&gt;
 *     &lt;enumeration value="_switzerlandFrench"/&gt;
 *     &lt;enumeration value="_switzerlandGerman"/&gt;
 *     &lt;enumeration value="_switzerlandItalian"/&gt;
 *     &lt;enumeration value="_syriaArabic"/&gt;
 *     &lt;enumeration value="_taiwanChinese"/&gt;
 *     &lt;enumeration value="_tajikistanTajik"/&gt;
 *     &lt;enumeration value="_tanzaniaEnglish"/&gt;
 *     &lt;enumeration value="_thailandThai"/&gt;
 *     &lt;enumeration value="_togoFrench"/&gt;
 *     &lt;enumeration value="_tongaTonga"/&gt;
 *     &lt;enumeration value="_trinidadAndTobagoEnglish"/&gt;
 *     &lt;enumeration value="_tunisiaArabic"/&gt;
 *     &lt;enumeration value="_turkeyTurkish"/&gt;
 *     &lt;enumeration value="_turkmenistanTurkmen"/&gt;
 *     &lt;enumeration value="_turksAndCaicosIslandsEnglish"/&gt;
 *     &lt;enumeration value="_ugandaEnglish"/&gt;
 *     &lt;enumeration value="_ukraineUkrainian"/&gt;
 *     &lt;enumeration value="_unitedArabEmiratesArabic"/&gt;
 *     &lt;enumeration value="_unitedArabEmiratesEnglish"/&gt;
 *     &lt;enumeration value="_unitedKingdomEnglish"/&gt;
 *     &lt;enumeration value="_unitedStatesEnglish"/&gt;
 *     &lt;enumeration value="_uruguaySpanish"/&gt;
 *     &lt;enumeration value="_uzbekistanUzbek"/&gt;
 *     &lt;enumeration value="_vanuatuEnglish"/&gt;
 *     &lt;enumeration value="_vanuatuFrench"/&gt;
 *     &lt;enumeration value="_venezuelaSpanish"/&gt;
 *     &lt;enumeration value="_vietnamVietnamese"/&gt;
 *     &lt;enumeration value="_wallisAndFutunaFrench"/&gt;
 *     &lt;enumeration value="_yemenArabic"/&gt;
 *     &lt;enumeration value="_zambiaEnglish"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CurrencyLocale", namespace = "urn:types.accounting_2014_2.lists.webservices.netsuite.com")
@XmlEnum
public enum CurrencyLocale {

    @XmlEnumValue("_afghanistanPashto")
    AFGHANISTAN_PASHTO("_afghanistanPashto"),
    @XmlEnumValue("_afghanistanPersian")
    AFGHANISTAN_PERSIAN("_afghanistanPersian"),
    @XmlEnumValue("_alandIslandsSwedish")
    ALAND_ISLANDS_SWEDISH("_alandIslandsSwedish"),
    @XmlEnumValue("_albaniaAlbanian")
    ALBANIA_ALBANIAN("_albaniaAlbanian"),
    @XmlEnumValue("_algeriaArabic")
    ALGERIA_ARABIC("_algeriaArabic"),
    @XmlEnumValue("_angolaPortuguese")
    ANGOLA_PORTUGUESE("_angolaPortuguese"),
    @XmlEnumValue("_anguillaEnglish")
    ANGUILLA_ENGLISH("_anguillaEnglish"),
    @XmlEnumValue("_antiguaAndBarbudaEnglish")
    ANTIGUA_AND_BARBUDA_ENGLISH("_antiguaAndBarbudaEnglish"),
    @XmlEnumValue("_argentinaSpanish")
    ARGENTINA_SPANISH("_argentinaSpanish"),
    @XmlEnumValue("_armeniaArmenian")
    ARMENIA_ARMENIAN("_armeniaArmenian"),
    @XmlEnumValue("_arubaEnglish")
    ARUBA_ENGLISH("_arubaEnglish"),
    @XmlEnumValue("_arubaPortuguese")
    ARUBA_PORTUGUESE("_arubaPortuguese"),
    @XmlEnumValue("_australiaEnglish")
    AUSTRALIA_ENGLISH("_australiaEnglish"),
    @XmlEnumValue("_austriaGerman")
    AUSTRIA_GERMAN("_austriaGerman"),
    @XmlEnumValue("_azerbaijanAzerbaijani")
    AZERBAIJAN_AZERBAIJANI("_azerbaijanAzerbaijani"),
    @XmlEnumValue("_bahamasEnglish")
    BAHAMAS_ENGLISH("_bahamasEnglish"),
    @XmlEnumValue("_bahrainArabic")
    BAHRAIN_ARABIC("_bahrainArabic"),
    @XmlEnumValue("_barbadosEnglish")
    BARBADOS_ENGLISH("_barbadosEnglish"),
    @XmlEnumValue("_belarusByelorussian")
    BELARUS_BYELORUSSIAN("_belarusByelorussian"),
    @XmlEnumValue("_belgiumDutch")
    BELGIUM_DUTCH("_belgiumDutch"),
    @XmlEnumValue("_belgiumFrench")
    BELGIUM_FRENCH("_belgiumFrench"),
    @XmlEnumValue("_belizeEnglish")
    BELIZE_ENGLISH("_belizeEnglish"),
    @XmlEnumValue("_bengali")
    BENGALI("_bengali"),
    @XmlEnumValue("_beninFrench")
    BENIN_FRENCH("_beninFrench"),
    @XmlEnumValue("_bermudaEnglish")
    BERMUDA_ENGLISH("_bermudaEnglish"),
    @XmlEnumValue("_bhutanDzongkha")
    BHUTAN_DZONGKHA("_bhutanDzongkha"),
    @XmlEnumValue("_boliviaSpanish")
    BOLIVIA_SPANISH("_boliviaSpanish"),
    @XmlEnumValue("_bonaireSaintEustatiusAndSabaDutch")
    BONAIRE_SAINT_EUSTATIUS_AND_SABA_DUTCH("_bonaireSaintEustatiusAndSabaDutch"),
    @XmlEnumValue("_bosniaAndHerzegovinaBosnian")
    BOSNIA_AND_HERZEGOVINA_BOSNIAN("_bosniaAndHerzegovinaBosnian"),
    @XmlEnumValue("_botswanaEnglish")
    BOTSWANA_ENGLISH("_botswanaEnglish"),
    @XmlEnumValue("_brazilPortuguese")
    BRAZIL_PORTUGUESE("_brazilPortuguese"),
    @XmlEnumValue("_bruneiMalay")
    BRUNEI_MALAY("_bruneiMalay"),
    @XmlEnumValue("_bulgariaBulgarian")
    BULGARIA_BULGARIAN("_bulgariaBulgarian"),
    @XmlEnumValue("_burkinaFasoFrench")
    BURKINA_FASO_FRENCH("_burkinaFasoFrench"),
    @XmlEnumValue("_burundiFrench")
    BURUNDI_FRENCH("_burundiFrench"),
    @XmlEnumValue("_cambodiaKhmer")
    CAMBODIA_KHMER("_cambodiaKhmer"),
    @XmlEnumValue("_cameroonFrench")
    CAMEROON_FRENCH("_cameroonFrench"),
    @XmlEnumValue("_canadaEnglish")
    CANADA_ENGLISH("_canadaEnglish"),
    @XmlEnumValue("_canadaFrench")
    CANADA_FRENCH("_canadaFrench"),
    @XmlEnumValue("_canaryIslandsSpanish")
    CANARY_ISLANDS_SPANISH("_canaryIslandsSpanish"),
    @XmlEnumValue("_capeVerdePortuguese")
    CAPE_VERDE_PORTUGUESE("_capeVerdePortuguese"),
    @XmlEnumValue("_caymanIslandsEnglish")
    CAYMAN_ISLANDS_ENGLISH("_caymanIslandsEnglish"),
    @XmlEnumValue("_centralAfricanRepublicFrench")
    CENTRAL_AFRICAN_REPUBLIC_FRENCH("_centralAfricanRepublicFrench"),
    @XmlEnumValue("_ceutaAndMelillaSpanish")
    CEUTA_AND_MELILLA_SPANISH("_ceutaAndMelillaSpanish"),
    @XmlEnumValue("_chadFrench")
    CHAD_FRENCH("_chadFrench"),
    @XmlEnumValue("_chileSpanish")
    CHILE_SPANISH("_chileSpanish"),
    @XmlEnumValue("_chinaChinese")
    CHINA_CHINESE("_chinaChinese"),
    @XmlEnumValue("_colombiaSpanish")
    COLOMBIA_SPANISH("_colombiaSpanish"),
    @XmlEnumValue("_comorosFrench")
    COMOROS_FRENCH("_comorosFrench"),
    @XmlEnumValue("_congoDemocraticRepublicEnglish")
    CONGO_DEMOCRATIC_REPUBLIC_ENGLISH("_congoDemocraticRepublicEnglish"),
    @XmlEnumValue("_congoDemocraticRepublicFrench")
    CONGO_DEMOCRATIC_REPUBLIC_FRENCH("_congoDemocraticRepublicFrench"),
    @XmlEnumValue("_congoRepublicOfFrench")
    CONGO_REPUBLIC_OF_FRENCH("_congoRepublicOfFrench"),
    @XmlEnumValue("_costaRicaSpanish")
    COSTA_RICA_SPANISH("_costaRicaSpanish"),
    @XmlEnumValue("_coteDivoireFrench")
    COTE_DIVOIRE_FRENCH("_coteDivoireFrench"),
    @XmlEnumValue("_croatiaCroatian")
    CROATIA_CROATIAN("_croatiaCroatian"),
    @XmlEnumValue("_cubaSpanish")
    CUBA_SPANISH("_cubaSpanish"),
    @XmlEnumValue("_curacaoDutch")
    CURACAO_DUTCH("_curacaoDutch"),
    @XmlEnumValue("_cyprusEnglish")
    CYPRUS_ENGLISH("_cyprusEnglish"),
    @XmlEnumValue("_cyprusEnglishEuro")
    CYPRUS_ENGLISH_EURO("_cyprusEnglishEuro"),
    @XmlEnumValue("_czechRepublicCzech")
    CZECH_REPUBLIC_CZECH("_czechRepublicCzech"),
    @XmlEnumValue("_denmarkDanish")
    DENMARK_DANISH("_denmarkDanish"),
    @XmlEnumValue("_djiboutiArabic")
    DJIBOUTI_ARABIC("_djiboutiArabic"),
    @XmlEnumValue("_djiboutiFrench")
    DJIBOUTI_FRENCH("_djiboutiFrench"),
    @XmlEnumValue("_dominicaEnglish")
    DOMINICA_ENGLISH("_dominicaEnglish"),
    @XmlEnumValue("_dominicanRepublicSpanish")
    DOMINICAN_REPUBLIC_SPANISH("_dominicanRepublicSpanish"),
    @XmlEnumValue("_ecuadorSpanish")
    ECUADOR_SPANISH("_ecuadorSpanish"),
    @XmlEnumValue("_egyptArabic")
    EGYPT_ARABIC("_egyptArabic"),
    @XmlEnumValue("_elSalvadorSpanish")
    EL_SALVADOR_SPANISH("_elSalvadorSpanish"),
    @XmlEnumValue("_equatorialGuineaSpanish")
    EQUATORIAL_GUINEA_SPANISH("_equatorialGuineaSpanish"),
    @XmlEnumValue("_eritreaAfar")
    ERITREA_AFAR("_eritreaAfar"),
    @XmlEnumValue("_estoniaEstonian")
    ESTONIA_ESTONIAN("_estoniaEstonian"),
    @XmlEnumValue("_ethiopiaAmharic")
    ETHIOPIA_AMHARIC("_ethiopiaAmharic"),
    @XmlEnumValue("_falklandIslandsEnglish")
    FALKLAND_ISLANDS_ENGLISH("_falklandIslandsEnglish"),
    @XmlEnumValue("_fijiFijian")
    FIJI_FIJIAN("_fijiFijian"),
    @XmlEnumValue("_finlandFinnish")
    FINLAND_FINNISH("_finlandFinnish"),
    @XmlEnumValue("_finlandFinnishEuro")
    FINLAND_FINNISH_EURO("_finlandFinnishEuro"),
    @XmlEnumValue("_franceFrench")
    FRANCE_FRENCH("_franceFrench"),
    @XmlEnumValue("_franceFrenchEuro")
    FRANCE_FRENCH_EURO("_franceFrenchEuro"),
    @XmlEnumValue("_frenchPolynesiaFrench")
    FRENCH_POLYNESIA_FRENCH("_frenchPolynesiaFrench"),
    @XmlEnumValue("_gabonFrench")
    GABON_FRENCH("_gabonFrench"),
    @XmlEnumValue("_gambiaEnglish")
    GAMBIA_ENGLISH("_gambiaEnglish"),
    @XmlEnumValue("_georgiaGeorgian")
    GEORGIA_GEORGIAN("_georgiaGeorgian"),
    @XmlEnumValue("_germanyGerman")
    GERMANY_GERMAN("_germanyGerman"),
    @XmlEnumValue("_germanyGermanEuro")
    GERMANY_GERMAN_EURO("_germanyGermanEuro"),
    @XmlEnumValue("_ghanaEnglish")
    GHANA_ENGLISH("_ghanaEnglish"),
    @XmlEnumValue("_gibraltarEnglish")
    GIBRALTAR_ENGLISH("_gibraltarEnglish"),
    @XmlEnumValue("_goldOunce")
    GOLD_OUNCE("_goldOunce"),
    @XmlEnumValue("_greeceGreek")
    GREECE_GREEK("_greeceGreek"),
    @XmlEnumValue("_grenadaEnglish")
    GRENADA_ENGLISH("_grenadaEnglish"),
    @XmlEnumValue("_guatemalaSpanish")
    GUATEMALA_SPANISH("_guatemalaSpanish"),
    @XmlEnumValue("_guineaBissauPortuguese")
    GUINEA_BISSAU_PORTUGUESE("_guineaBissauPortuguese"),
    @XmlEnumValue("_guineaFrench")
    GUINEA_FRENCH("_guineaFrench"),
    @XmlEnumValue("_guyanaEnglish")
    GUYANA_ENGLISH("_guyanaEnglish"),
    @XmlEnumValue("_haitian")
    HAITIAN("_haitian"),
    @XmlEnumValue("_hondurasSpanish")
    HONDURAS_SPANISH("_hondurasSpanish"),
    @XmlEnumValue("_hongKongChinese")
    HONG_KONG_CHINESE("_hongKongChinese"),
    @XmlEnumValue("_hungaryHungarian")
    HUNGARY_HUNGARIAN("_hungaryHungarian"),
    @XmlEnumValue("_icelandIcelandic")
    ICELAND_ICELANDIC("_icelandIcelandic"),
    @XmlEnumValue("_indiaEnglish")
    INDIA_ENGLISH("_indiaEnglish"),
    @XmlEnumValue("_indiaGujarati")
    INDIA_GUJARATI("_indiaGujarati"),
    @XmlEnumValue("_indiaHindi")
    INDIA_HINDI("_indiaHindi"),
    @XmlEnumValue("_indiaKannada")
    INDIA_KANNADA("_indiaKannada"),
    @XmlEnumValue("_indiaMarathi")
    INDIA_MARATHI("_indiaMarathi"),
    @XmlEnumValue("_indiaPanjabi")
    INDIA_PANJABI("_indiaPanjabi"),
    @XmlEnumValue("_indiaTamil")
    INDIA_TAMIL("_indiaTamil"),
    @XmlEnumValue("_indiaTelugu")
    INDIA_TELUGU("_indiaTelugu"),
    @XmlEnumValue("_indonesiaIndonesian")
    INDONESIA_INDONESIAN("_indonesiaIndonesian"),
    @XmlEnumValue("_iranPersian")
    IRAN_PERSIAN("_iranPersian"),
    @XmlEnumValue("_iraqArabic")
    IRAQ_ARABIC("_iraqArabic"),
    @XmlEnumValue("_irelandEnglish")
    IRELAND_ENGLISH("_irelandEnglish"),
    @XmlEnumValue("_israelHebrew")
    ISRAEL_HEBREW("_israelHebrew"),
    @XmlEnumValue("_italyItalian")
    ITALY_ITALIAN("_italyItalian"),
    @XmlEnumValue("_italyItalianEuro")
    ITALY_ITALIAN_EURO("_italyItalianEuro"),
    @XmlEnumValue("_jamaicaEnglish")
    JAMAICA_ENGLISH("_jamaicaEnglish"),
    @XmlEnumValue("_japanJapanese")
    JAPAN_JAPANESE("_japanJapanese"),
    @XmlEnumValue("_jordanArabic")
    JORDAN_ARABIC("_jordanArabic"),
    @XmlEnumValue("_jordanEnglish")
    JORDAN_ENGLISH("_jordanEnglish"),
    @XmlEnumValue("_kazakhstanRussian")
    KAZAKHSTAN_RUSSIAN("_kazakhstanRussian"),
    @XmlEnumValue("_kenyaEnglish")
    KENYA_ENGLISH("_kenyaEnglish"),
    @XmlEnumValue("_kuwaitArabic")
    KUWAIT_ARABIC("_kuwaitArabic"),
    @XmlEnumValue("_kuwaitEnglish")
    KUWAIT_ENGLISH("_kuwaitEnglish"),
    @XmlEnumValue("_kyrgyzstanRussian")
    KYRGYZSTAN_RUSSIAN("_kyrgyzstanRussian"),
    @XmlEnumValue("_laosLao")
    LAOS_LAO("_laosLao"),
    @XmlEnumValue("_latviaLatvianLettish")
    LATVIA_LATVIAN_LETTISH("_latviaLatvianLettish"),
    @XmlEnumValue("_lebanonArabic")
    LEBANON_ARABIC("_lebanonArabic"),
    @XmlEnumValue("_lesothoEnglish")
    LESOTHO_ENGLISH("_lesothoEnglish"),
    @XmlEnumValue("_liberiaEnglish")
    LIBERIA_ENGLISH("_liberiaEnglish"),
    @XmlEnumValue("_libyaArabic")
    LIBYA_ARABIC("_libyaArabic"),
    @XmlEnumValue("_lithuaniaLithuanian")
    LITHUANIA_LITHUANIAN("_lithuaniaLithuanian"),
    @XmlEnumValue("_luxembourgFrench")
    LUXEMBOURG_FRENCH("_luxembourgFrench"),
    @XmlEnumValue("_luxembourgGerman")
    LUXEMBOURG_GERMAN("_luxembourgGerman"),
    @XmlEnumValue("_luxembourgLuxembourgish")
    LUXEMBOURG_LUXEMBOURGISH("_luxembourgLuxembourgish"),
    @XmlEnumValue("_macauChinese")
    MACAU_CHINESE("_macauChinese"),
    @XmlEnumValue("_macedoniaMacedonian")
    MACEDONIA_MACEDONIAN("_macedoniaMacedonian"),
    @XmlEnumValue("_malawiEnglish")
    MALAWI_ENGLISH("_malawiEnglish"),
    @XmlEnumValue("_malaysiaMalay")
    MALAYSIA_MALAY("_malaysiaMalay"),
    @XmlEnumValue("_maldivesDhivehi")
    MALDIVES_DHIVEHI("_maldivesDhivehi"),
    @XmlEnumValue("_maliFrench")
    MALI_FRENCH("_maliFrench"),
    @XmlEnumValue("_mauritiusEnglish")
    MAURITIUS_ENGLISH("_mauritiusEnglish"),
    @XmlEnumValue("_mexicoSpanish")
    MEXICO_SPANISH("_mexicoSpanish"),
    @XmlEnumValue("_moldovaRomanian")
    MOLDOVA_ROMANIAN("_moldovaRomanian"),
    @XmlEnumValue("_moldovaRussian")
    MOLDOVA_RUSSIAN("_moldovaRussian"),
    @XmlEnumValue("_mongoliaMongolian")
    MONGOLIA_MONGOLIAN("_mongoliaMongolian"),
    @XmlEnumValue("_moroccoArabic")
    MOROCCO_ARABIC("_moroccoArabic"),
    @XmlEnumValue("_mozambiquePortuguese")
    MOZAMBIQUE_PORTUGUESE("_mozambiquePortuguese"),
    @XmlEnumValue("_myanmarBurmese")
    MYANMAR_BURMESE("_myanmarBurmese"),
    @XmlEnumValue("_namibiaEnglish")
    NAMIBIA_ENGLISH("_namibiaEnglish"),
    @XmlEnumValue("_nepalNepali")
    NEPAL_NEPALI("_nepalNepali"),
    @XmlEnumValue("_netherlandsAntillesDutch")
    NETHERLANDS_ANTILLES_DUTCH("_netherlandsAntillesDutch"),
    @XmlEnumValue("_netherlandsDutch")
    NETHERLANDS_DUTCH("_netherlandsDutch"),
    @XmlEnumValue("_netherlandsDutchEuro")
    NETHERLANDS_DUTCH_EURO("_netherlandsDutchEuro"),
    @XmlEnumValue("_newCaledoniaFrench")
    NEW_CALEDONIA_FRENCH("_newCaledoniaFrench"),
    @XmlEnumValue("_newZealandEnglish")
    NEW_ZEALAND_ENGLISH("_newZealandEnglish"),
    @XmlEnumValue("_nicaraguaSpanish")
    NICARAGUA_SPANISH("_nicaraguaSpanish"),
    @XmlEnumValue("_nigerFrench")
    NIGER_FRENCH("_nigerFrench"),
    @XmlEnumValue("_nigeriaEnglish")
    NIGERIA_ENGLISH("_nigeriaEnglish"),
    @XmlEnumValue("_northKoreaKorean")
    NORTH_KOREA_KOREAN("_northKoreaKorean"),
    @XmlEnumValue("_norwayNorwegian")
    NORWAY_NORWEGIAN("_norwayNorwegian"),
    @XmlEnumValue("_omanArabic")
    OMAN_ARABIC("_omanArabic"),
    @XmlEnumValue("_pakistanUrdu")
    PAKISTAN_URDU("_pakistanUrdu"),
    @XmlEnumValue("_palladiumOunce")
    PALLADIUM_OUNCE("_palladiumOunce"),
    @XmlEnumValue("_panamaSpanish")
    PANAMA_SPANISH("_panamaSpanish"),
    @XmlEnumValue("_papuaNewGuineaEnglish")
    PAPUA_NEW_GUINEA_ENGLISH("_papuaNewGuineaEnglish"),
    @XmlEnumValue("_paraguaySpanish")
    PARAGUAY_SPANISH("_paraguaySpanish"),
    @XmlEnumValue("_peruSpanish")
    PERU_SPANISH("_peruSpanish"),
    @XmlEnumValue("_philippinesEnglish")
    PHILIPPINES_ENGLISH("_philippinesEnglish"),
    @XmlEnumValue("_philippinesTagalog")
    PHILIPPINES_TAGALOG("_philippinesTagalog"),
    @XmlEnumValue("_platinumOunce")
    PLATINUM_OUNCE("_platinumOunce"),
    @XmlEnumValue("_polandPolish")
    POLAND_POLISH("_polandPolish"),
    @XmlEnumValue("_portugalPortuguese")
    PORTUGAL_PORTUGUESE("_portugalPortuguese"),
    @XmlEnumValue("_portugalPortugueseEuro")
    PORTUGAL_PORTUGUESE_EURO("_portugalPortugueseEuro"),
    @XmlEnumValue("_puertoRicoSpanish")
    PUERTO_RICO_SPANISH("_puertoRicoSpanish"),
    @XmlEnumValue("_qatarArabic")
    QATAR_ARABIC("_qatarArabic"),
    @XmlEnumValue("_qatarEnglish")
    QATAR_ENGLISH("_qatarEnglish"),
    @XmlEnumValue("_romaniaRomanian")
    ROMANIA_ROMANIAN("_romaniaRomanian"),
    @XmlEnumValue("_russiaRussian")
    RUSSIA_RUSSIAN("_russiaRussian"),
    @XmlEnumValue("_rwandaFrench")
    RWANDA_FRENCH("_rwandaFrench"),
    @XmlEnumValue("_saintBarthelemyFrench")
    SAINT_BARTHELEMY_FRENCH("_saintBarthelemyFrench"),
    @XmlEnumValue("_saintHelenaEnglish")
    SAINT_HELENA_ENGLISH("_saintHelenaEnglish"),
    @XmlEnumValue("_saintKittsAndNevisEnglish")
    SAINT_KITTS_AND_NEVIS_ENGLISH("_saintKittsAndNevisEnglish"),
    @XmlEnumValue("_saintLuciaEnglish")
    SAINT_LUCIA_ENGLISH("_saintLuciaEnglish"),
    @XmlEnumValue("_saintMartinEnglish")
    SAINT_MARTIN_ENGLISH("_saintMartinEnglish"),
    @XmlEnumValue("_saintVincentAndTheGrenadinesEnglish")
    SAINT_VINCENT_AND_THE_GRENADINES_ENGLISH("_saintVincentAndTheGrenadinesEnglish"),
    @XmlEnumValue("_samoaSamoan")
    SAMOA_SAMOAN("_samoaSamoan"),
    @XmlEnumValue("_saoTomeAndPrincipePortuguese")
    SAO_TOME_AND_PRINCIPE_PORTUGUESE("_saoTomeAndPrincipePortuguese"),
    @XmlEnumValue("_saudiArabiaArabic")
    SAUDI_ARABIA_ARABIC("_saudiArabiaArabic"),
    @XmlEnumValue("_senegalFrench")
    SENEGAL_FRENCH("_senegalFrench"),
    @XmlEnumValue("_serbiaAndMontenegroSerbian")
    SERBIA_AND_MONTENEGRO_SERBIAN("_serbiaAndMontenegroSerbian"),
    @XmlEnumValue("_serbiaSerbian")
    SERBIA_SERBIAN("_serbiaSerbian"),
    @XmlEnumValue("_serbiaSerboCroatian")
    SERBIA_SERBO_CROATIAN("_serbiaSerboCroatian"),
    @XmlEnumValue("_seychellesEnglish")
    SEYCHELLES_ENGLISH("_seychellesEnglish"),
    @XmlEnumValue("_seychellesFrench")
    SEYCHELLES_FRENCH("_seychellesFrench"),
    @XmlEnumValue("_sierraLeoneEnglish")
    SIERRA_LEONE_ENGLISH("_sierraLeoneEnglish"),
    @XmlEnumValue("_silverOunce")
    SILVER_OUNCE("_silverOunce"),
    @XmlEnumValue("_singaporeEnglish")
    SINGAPORE_ENGLISH("_singaporeEnglish"),
    @XmlEnumValue("_sintMaartenDutch")
    SINT_MAARTEN_DUTCH("_sintMaartenDutch"),
    @XmlEnumValue("_slovakiaSlovak")
    SLOVAKIA_SLOVAK("_slovakiaSlovak"),
    @XmlEnumValue("_slovakiaSlovakEuro")
    SLOVAKIA_SLOVAK_EURO("_slovakiaSlovakEuro"),
    @XmlEnumValue("_sloveniaSlovenian")
    SLOVENIA_SLOVENIAN("_sloveniaSlovenian"),
    @XmlEnumValue("_sloveniaSlovenianEuro")
    SLOVENIA_SLOVENIAN_EURO("_sloveniaSlovenianEuro"),
    @XmlEnumValue("_solomonIslandsEnglish")
    SOLOMON_ISLANDS_ENGLISH("_solomonIslandsEnglish"),
    @XmlEnumValue("_somaliaSomali")
    SOMALIA_SOMALI("_somaliaSomali"),
    @XmlEnumValue("_southAfricaAfrikaans")
    SOUTH_AFRICA_AFRIKAANS("_southAfricaAfrikaans"),
    @XmlEnumValue("_southAfricaEnglish")
    SOUTH_AFRICA_ENGLISH("_southAfricaEnglish"),
    @XmlEnumValue("_southKoreaKorean")
    SOUTH_KOREA_KOREAN("_southKoreaKorean"),
    @XmlEnumValue("_southSudanEnglish")
    SOUTH_SUDAN_ENGLISH("_southSudanEnglish"),
    @XmlEnumValue("_spainCatalan")
    SPAIN_CATALAN("_spainCatalan"),
    @XmlEnumValue("_spainSpanish")
    SPAIN_SPANISH("_spainSpanish"),
    @XmlEnumValue("_spainSpanishEuro")
    SPAIN_SPANISH_EURO("_spainSpanishEuro"),
    @XmlEnumValue("_sriLankaSinhalese")
    SRI_LANKA_SINHALESE("_sriLankaSinhalese"),
    @XmlEnumValue("_sudanArabic")
    SUDAN_ARABIC("_sudanArabic"),
    @XmlEnumValue("_surinameDutch")
    SURINAME_DUTCH("_surinameDutch"),
    @XmlEnumValue("_swazilandSwati")
    SWAZILAND_SWATI("_swazilandSwati"),
    @XmlEnumValue("_swedenSwedish")
    SWEDEN_SWEDISH("_swedenSwedish"),
    @XmlEnumValue("_switzerlandFrench")
    SWITZERLAND_FRENCH("_switzerlandFrench"),
    @XmlEnumValue("_switzerlandGerman")
    SWITZERLAND_GERMAN("_switzerlandGerman"),
    @XmlEnumValue("_switzerlandItalian")
    SWITZERLAND_ITALIAN("_switzerlandItalian"),
    @XmlEnumValue("_syriaArabic")
    SYRIA_ARABIC("_syriaArabic"),
    @XmlEnumValue("_taiwanChinese")
    TAIWAN_CHINESE("_taiwanChinese"),
    @XmlEnumValue("_tajikistanTajik")
    TAJIKISTAN_TAJIK("_tajikistanTajik"),
    @XmlEnumValue("_tanzaniaEnglish")
    TANZANIA_ENGLISH("_tanzaniaEnglish"),
    @XmlEnumValue("_thailandThai")
    THAILAND_THAI("_thailandThai"),
    @XmlEnumValue("_togoFrench")
    TOGO_FRENCH("_togoFrench"),
    @XmlEnumValue("_tongaTonga")
    TONGA_TONGA("_tongaTonga"),
    @XmlEnumValue("_trinidadAndTobagoEnglish")
    TRINIDAD_AND_TOBAGO_ENGLISH("_trinidadAndTobagoEnglish"),
    @XmlEnumValue("_tunisiaArabic")
    TUNISIA_ARABIC("_tunisiaArabic"),
    @XmlEnumValue("_turkeyTurkish")
    TURKEY_TURKISH("_turkeyTurkish"),
    @XmlEnumValue("_turkmenistanTurkmen")
    TURKMENISTAN_TURKMEN("_turkmenistanTurkmen"),
    @XmlEnumValue("_turksAndCaicosIslandsEnglish")
    TURKS_AND_CAICOS_ISLANDS_ENGLISH("_turksAndCaicosIslandsEnglish"),
    @XmlEnumValue("_ugandaEnglish")
    UGANDA_ENGLISH("_ugandaEnglish"),
    @XmlEnumValue("_ukraineUkrainian")
    UKRAINE_UKRAINIAN("_ukraineUkrainian"),
    @XmlEnumValue("_unitedArabEmiratesArabic")
    UNITED_ARAB_EMIRATES_ARABIC("_unitedArabEmiratesArabic"),
    @XmlEnumValue("_unitedArabEmiratesEnglish")
    UNITED_ARAB_EMIRATES_ENGLISH("_unitedArabEmiratesEnglish"),
    @XmlEnumValue("_unitedKingdomEnglish")
    UNITED_KINGDOM_ENGLISH("_unitedKingdomEnglish"),
    @XmlEnumValue("_unitedStatesEnglish")
    UNITED_STATES_ENGLISH("_unitedStatesEnglish"),
    @XmlEnumValue("_uruguaySpanish")
    URUGUAY_SPANISH("_uruguaySpanish"),
    @XmlEnumValue("_uzbekistanUzbek")
    UZBEKISTAN_UZBEK("_uzbekistanUzbek"),
    @XmlEnumValue("_vanuatuEnglish")
    VANUATU_ENGLISH("_vanuatuEnglish"),
    @XmlEnumValue("_vanuatuFrench")
    VANUATU_FRENCH("_vanuatuFrench"),
    @XmlEnumValue("_venezuelaSpanish")
    VENEZUELA_SPANISH("_venezuelaSpanish"),
    @XmlEnumValue("_vietnamVietnamese")
    VIETNAM_VIETNAMESE("_vietnamVietnamese"),
    @XmlEnumValue("_wallisAndFutunaFrench")
    WALLIS_AND_FUTUNA_FRENCH("_wallisAndFutunaFrench"),
    @XmlEnumValue("_yemenArabic")
    YEMEN_ARABIC("_yemenArabic"),
    @XmlEnumValue("_zambiaEnglish")
    ZAMBIA_ENGLISH("_zambiaEnglish");
    private final String value;

    CurrencyLocale(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CurrencyLocale fromValue(String v) {
        for (CurrencyLocale c: CurrencyLocale.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
