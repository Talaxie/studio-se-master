
package com.netsuite.webservices.platform.common.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Country.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Country"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_afghanistan"/&gt;
 *     &lt;enumeration value="_alandIslands"/&gt;
 *     &lt;enumeration value="_albania"/&gt;
 *     &lt;enumeration value="_algeria"/&gt;
 *     &lt;enumeration value="_americanSamoa"/&gt;
 *     &lt;enumeration value="_andorra"/&gt;
 *     &lt;enumeration value="_angola"/&gt;
 *     &lt;enumeration value="_anguilla"/&gt;
 *     &lt;enumeration value="_antarctica"/&gt;
 *     &lt;enumeration value="_antiguaAndBarbuda"/&gt;
 *     &lt;enumeration value="_argentina"/&gt;
 *     &lt;enumeration value="_armenia"/&gt;
 *     &lt;enumeration value="_aruba"/&gt;
 *     &lt;enumeration value="_australia"/&gt;
 *     &lt;enumeration value="_austria"/&gt;
 *     &lt;enumeration value="_azerbaijan"/&gt;
 *     &lt;enumeration value="_bahamas"/&gt;
 *     &lt;enumeration value="_bahrain"/&gt;
 *     &lt;enumeration value="_bangladesh"/&gt;
 *     &lt;enumeration value="_barbados"/&gt;
 *     &lt;enumeration value="_belarus"/&gt;
 *     &lt;enumeration value="_belgium"/&gt;
 *     &lt;enumeration value="_belize"/&gt;
 *     &lt;enumeration value="_benin"/&gt;
 *     &lt;enumeration value="_bermuda"/&gt;
 *     &lt;enumeration value="_bhutan"/&gt;
 *     &lt;enumeration value="_bolivia"/&gt;
 *     &lt;enumeration value="_bonaireSaintEustatiusAndSaba"/&gt;
 *     &lt;enumeration value="_bosniaAndHerzegovina"/&gt;
 *     &lt;enumeration value="_botswana"/&gt;
 *     &lt;enumeration value="_bouvetIsland"/&gt;
 *     &lt;enumeration value="_brazil"/&gt;
 *     &lt;enumeration value="_britishIndianOceanTerritory"/&gt;
 *     &lt;enumeration value="_bruneiDarussalam"/&gt;
 *     &lt;enumeration value="_bulgaria"/&gt;
 *     &lt;enumeration value="_burkinaFaso"/&gt;
 *     &lt;enumeration value="_burundi"/&gt;
 *     &lt;enumeration value="_cambodia"/&gt;
 *     &lt;enumeration value="_cameroon"/&gt;
 *     &lt;enumeration value="_canada"/&gt;
 *     &lt;enumeration value="_canaryIslands"/&gt;
 *     &lt;enumeration value="_capeVerde"/&gt;
 *     &lt;enumeration value="_caymanIslands"/&gt;
 *     &lt;enumeration value="_centralAfricanRepublic"/&gt;
 *     &lt;enumeration value="_ceutaAndMelilla"/&gt;
 *     &lt;enumeration value="_chad"/&gt;
 *     &lt;enumeration value="_chile"/&gt;
 *     &lt;enumeration value="_china"/&gt;
 *     &lt;enumeration value="_christmasIsland"/&gt;
 *     &lt;enumeration value="_cocosKeelingIslands"/&gt;
 *     &lt;enumeration value="_colombia"/&gt;
 *     &lt;enumeration value="_comoros"/&gt;
 *     &lt;enumeration value="_congoDemocraticPeoplesRepublic"/&gt;
 *     &lt;enumeration value="_congoRepublicOf"/&gt;
 *     &lt;enumeration value="_cookIslands"/&gt;
 *     &lt;enumeration value="_costaRica"/&gt;
 *     &lt;enumeration value="_coteDIvoire"/&gt;
 *     &lt;enumeration value="_croatiaHrvatska"/&gt;
 *     &lt;enumeration value="_cuba"/&gt;
 *     &lt;enumeration value="_curacao"/&gt;
 *     &lt;enumeration value="_cyprus"/&gt;
 *     &lt;enumeration value="_czechRepublic"/&gt;
 *     &lt;enumeration value="_denmark"/&gt;
 *     &lt;enumeration value="_djibouti"/&gt;
 *     &lt;enumeration value="_dominica"/&gt;
 *     &lt;enumeration value="_dominicanRepublic"/&gt;
 *     &lt;enumeration value="_eastTimor"/&gt;
 *     &lt;enumeration value="_ecuador"/&gt;
 *     &lt;enumeration value="_egypt"/&gt;
 *     &lt;enumeration value="_elSalvador"/&gt;
 *     &lt;enumeration value="_equatorialGuinea"/&gt;
 *     &lt;enumeration value="_eritrea"/&gt;
 *     &lt;enumeration value="_estonia"/&gt;
 *     &lt;enumeration value="_ethiopia"/&gt;
 *     &lt;enumeration value="_falklandIslands"/&gt;
 *     &lt;enumeration value="_faroeIslands"/&gt;
 *     &lt;enumeration value="_fiji"/&gt;
 *     &lt;enumeration value="_finland"/&gt;
 *     &lt;enumeration value="_france"/&gt;
 *     &lt;enumeration value="_frenchGuiana"/&gt;
 *     &lt;enumeration value="_frenchPolynesia"/&gt;
 *     &lt;enumeration value="_frenchSouthernTerritories"/&gt;
 *     &lt;enumeration value="_gabon"/&gt;
 *     &lt;enumeration value="_gambia"/&gt;
 *     &lt;enumeration value="_georgia"/&gt;
 *     &lt;enumeration value="_germany"/&gt;
 *     &lt;enumeration value="_ghana"/&gt;
 *     &lt;enumeration value="_gibraltar"/&gt;
 *     &lt;enumeration value="_greece"/&gt;
 *     &lt;enumeration value="_greenland"/&gt;
 *     &lt;enumeration value="_grenada"/&gt;
 *     &lt;enumeration value="_guadeloupe"/&gt;
 *     &lt;enumeration value="_guam"/&gt;
 *     &lt;enumeration value="_guatemala"/&gt;
 *     &lt;enumeration value="_guernsey"/&gt;
 *     &lt;enumeration value="_guinea"/&gt;
 *     &lt;enumeration value="_guineaBissau"/&gt;
 *     &lt;enumeration value="_guyana"/&gt;
 *     &lt;enumeration value="_haiti"/&gt;
 *     &lt;enumeration value="_heardAndMcDonaldIslands"/&gt;
 *     &lt;enumeration value="_holySeeCityVaticanState"/&gt;
 *     &lt;enumeration value="_honduras"/&gt;
 *     &lt;enumeration value="_hongKong"/&gt;
 *     &lt;enumeration value="_hungary"/&gt;
 *     &lt;enumeration value="_iceland"/&gt;
 *     &lt;enumeration value="_india"/&gt;
 *     &lt;enumeration value="_indonesia"/&gt;
 *     &lt;enumeration value="_iranIslamicRepublicOf"/&gt;
 *     &lt;enumeration value="_iraq"/&gt;
 *     &lt;enumeration value="_ireland"/&gt;
 *     &lt;enumeration value="_isleOfMan"/&gt;
 *     &lt;enumeration value="_israel"/&gt;
 *     &lt;enumeration value="_italy"/&gt;
 *     &lt;enumeration value="_jamaica"/&gt;
 *     &lt;enumeration value="_japan"/&gt;
 *     &lt;enumeration value="_jersey"/&gt;
 *     &lt;enumeration value="_jordan"/&gt;
 *     &lt;enumeration value="_kazakhstan"/&gt;
 *     &lt;enumeration value="_kenya"/&gt;
 *     &lt;enumeration value="_kiribati"/&gt;
 *     &lt;enumeration value="_koreaDemocraticPeoplesRepublic"/&gt;
 *     &lt;enumeration value="_koreaRepublicOf"/&gt;
 *     &lt;enumeration value="_kosovo"/&gt;
 *     &lt;enumeration value="_kuwait"/&gt;
 *     &lt;enumeration value="_kyrgyzstan"/&gt;
 *     &lt;enumeration value="_laoPeoplesDemocraticRepublic"/&gt;
 *     &lt;enumeration value="_latvia"/&gt;
 *     &lt;enumeration value="_lebanon"/&gt;
 *     &lt;enumeration value="_lesotho"/&gt;
 *     &lt;enumeration value="_liberia"/&gt;
 *     &lt;enumeration value="_libya"/&gt;
 *     &lt;enumeration value="_liechtenstein"/&gt;
 *     &lt;enumeration value="_lithuania"/&gt;
 *     &lt;enumeration value="_luxembourg"/&gt;
 *     &lt;enumeration value="_macau"/&gt;
 *     &lt;enumeration value="_macedonia"/&gt;
 *     &lt;enumeration value="_madagascar"/&gt;
 *     &lt;enumeration value="_malawi"/&gt;
 *     &lt;enumeration value="_malaysia"/&gt;
 *     &lt;enumeration value="_maldives"/&gt;
 *     &lt;enumeration value="_mali"/&gt;
 *     &lt;enumeration value="_malta"/&gt;
 *     &lt;enumeration value="_marshallIslands"/&gt;
 *     &lt;enumeration value="_martinique"/&gt;
 *     &lt;enumeration value="_mauritania"/&gt;
 *     &lt;enumeration value="_mauritius"/&gt;
 *     &lt;enumeration value="_mayotte"/&gt;
 *     &lt;enumeration value="_mexico"/&gt;
 *     &lt;enumeration value="_micronesiaFederalStateOf"/&gt;
 *     &lt;enumeration value="_moldovaRepublicOf"/&gt;
 *     &lt;enumeration value="_monaco"/&gt;
 *     &lt;enumeration value="_mongolia"/&gt;
 *     &lt;enumeration value="_montenegro"/&gt;
 *     &lt;enumeration value="_montserrat"/&gt;
 *     &lt;enumeration value="_morocco"/&gt;
 *     &lt;enumeration value="_mozambique"/&gt;
 *     &lt;enumeration value="_myanmar"/&gt;
 *     &lt;enumeration value="_namibia"/&gt;
 *     &lt;enumeration value="_nauru"/&gt;
 *     &lt;enumeration value="_nepal"/&gt;
 *     &lt;enumeration value="_netherlands"/&gt;
 *     &lt;enumeration value="_newCaledonia"/&gt;
 *     &lt;enumeration value="_newZealand"/&gt;
 *     &lt;enumeration value="_nicaragua"/&gt;
 *     &lt;enumeration value="_niger"/&gt;
 *     &lt;enumeration value="_nigeria"/&gt;
 *     &lt;enumeration value="_niue"/&gt;
 *     &lt;enumeration value="_norfolkIsland"/&gt;
 *     &lt;enumeration value="_northernMarianaIslands"/&gt;
 *     &lt;enumeration value="_norway"/&gt;
 *     &lt;enumeration value="_oman"/&gt;
 *     &lt;enumeration value="_pakistan"/&gt;
 *     &lt;enumeration value="_palau"/&gt;
 *     &lt;enumeration value="_palestinianTerritories"/&gt;
 *     &lt;enumeration value="_panama"/&gt;
 *     &lt;enumeration value="_papuaNewGuinea"/&gt;
 *     &lt;enumeration value="_paraguay"/&gt;
 *     &lt;enumeration value="_peru"/&gt;
 *     &lt;enumeration value="_philippines"/&gt;
 *     &lt;enumeration value="_pitcairnIsland"/&gt;
 *     &lt;enumeration value="_poland"/&gt;
 *     &lt;enumeration value="_portugal"/&gt;
 *     &lt;enumeration value="_puertoRico"/&gt;
 *     &lt;enumeration value="_qatar"/&gt;
 *     &lt;enumeration value="_reunionIsland"/&gt;
 *     &lt;enumeration value="_romania"/&gt;
 *     &lt;enumeration value="_russianFederation"/&gt;
 *     &lt;enumeration value="_rwanda"/&gt;
 *     &lt;enumeration value="_saintBarthelemy"/&gt;
 *     &lt;enumeration value="_saintHelena"/&gt;
 *     &lt;enumeration value="_saintKittsAndNevis"/&gt;
 *     &lt;enumeration value="_saintLucia"/&gt;
 *     &lt;enumeration value="_saintMartin"/&gt;
 *     &lt;enumeration value="_saintVincentAndTheGrenadines"/&gt;
 *     &lt;enumeration value="_samoa"/&gt;
 *     &lt;enumeration value="_sanMarino"/&gt;
 *     &lt;enumeration value="_saoTomeAndPrincipe"/&gt;
 *     &lt;enumeration value="_saudiArabia"/&gt;
 *     &lt;enumeration value="_senegal"/&gt;
 *     &lt;enumeration value="_serbia"/&gt;
 *     &lt;enumeration value="_seychelles"/&gt;
 *     &lt;enumeration value="_sierraLeone"/&gt;
 *     &lt;enumeration value="_singapore"/&gt;
 *     &lt;enumeration value="_sintMaarten"/&gt;
 *     &lt;enumeration value="_slovakRepublic"/&gt;
 *     &lt;enumeration value="_slovenia"/&gt;
 *     &lt;enumeration value="_solomonIslands"/&gt;
 *     &lt;enumeration value="_somalia"/&gt;
 *     &lt;enumeration value="_southAfrica"/&gt;
 *     &lt;enumeration value="_southGeorgia"/&gt;
 *     &lt;enumeration value="_southSudan"/&gt;
 *     &lt;enumeration value="_spain"/&gt;
 *     &lt;enumeration value="_sriLanka"/&gt;
 *     &lt;enumeration value="_stPierreAndMiquelon"/&gt;
 *     &lt;enumeration value="_sudan"/&gt;
 *     &lt;enumeration value="_suriname"/&gt;
 *     &lt;enumeration value="_svalbardAndJanMayenIslands"/&gt;
 *     &lt;enumeration value="_swaziland"/&gt;
 *     &lt;enumeration value="_sweden"/&gt;
 *     &lt;enumeration value="_switzerland"/&gt;
 *     &lt;enumeration value="_syrianArabRepublic"/&gt;
 *     &lt;enumeration value="_taiwan"/&gt;
 *     &lt;enumeration value="_tajikistan"/&gt;
 *     &lt;enumeration value="_tanzania"/&gt;
 *     &lt;enumeration value="_thailand"/&gt;
 *     &lt;enumeration value="_togo"/&gt;
 *     &lt;enumeration value="_tokelau"/&gt;
 *     &lt;enumeration value="_tonga"/&gt;
 *     &lt;enumeration value="_trinidadAndTobago"/&gt;
 *     &lt;enumeration value="_tunisia"/&gt;
 *     &lt;enumeration value="_turkey"/&gt;
 *     &lt;enumeration value="_turkmenistan"/&gt;
 *     &lt;enumeration value="_turksAndCaicosIslands"/&gt;
 *     &lt;enumeration value="_tuvalu"/&gt;
 *     &lt;enumeration value="_uganda"/&gt;
 *     &lt;enumeration value="_ukraine"/&gt;
 *     &lt;enumeration value="_unitedArabEmirates"/&gt;
 *     &lt;enumeration value="_unitedKingdomGB"/&gt;
 *     &lt;enumeration value="_unitedStates"/&gt;
 *     &lt;enumeration value="_uruguay"/&gt;
 *     &lt;enumeration value="_uSMinorOutlyingIslands"/&gt;
 *     &lt;enumeration value="_uzbekistan"/&gt;
 *     &lt;enumeration value="_vanuatu"/&gt;
 *     &lt;enumeration value="_venezuela"/&gt;
 *     &lt;enumeration value="_vietnam"/&gt;
 *     &lt;enumeration value="_virginIslandsBritish"/&gt;
 *     &lt;enumeration value="_virginIslandsUSA"/&gt;
 *     &lt;enumeration value="_wallisAndFutunaIslands"/&gt;
 *     &lt;enumeration value="_westernSahara"/&gt;
 *     &lt;enumeration value="_yemen"/&gt;
 *     &lt;enumeration value="_zambia"/&gt;
 *     &lt;enumeration value="_zimbabwe"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Country", namespace = "urn:types.common_2014_2.platform.webservices.netsuite.com")
@XmlEnum
public enum Country {

    @XmlEnumValue("_afghanistan")
    AFGHANISTAN("_afghanistan"),
    @XmlEnumValue("_alandIslands")
    ALAND_ISLANDS("_alandIslands"),
    @XmlEnumValue("_albania")
    ALBANIA("_albania"),
    @XmlEnumValue("_algeria")
    ALGERIA("_algeria"),
    @XmlEnumValue("_americanSamoa")
    AMERICAN_SAMOA("_americanSamoa"),
    @XmlEnumValue("_andorra")
    ANDORRA("_andorra"),
    @XmlEnumValue("_angola")
    ANGOLA("_angola"),
    @XmlEnumValue("_anguilla")
    ANGUILLA("_anguilla"),
    @XmlEnumValue("_antarctica")
    ANTARCTICA("_antarctica"),
    @XmlEnumValue("_antiguaAndBarbuda")
    ANTIGUA_AND_BARBUDA("_antiguaAndBarbuda"),
    @XmlEnumValue("_argentina")
    ARGENTINA("_argentina"),
    @XmlEnumValue("_armenia")
    ARMENIA("_armenia"),
    @XmlEnumValue("_aruba")
    ARUBA("_aruba"),
    @XmlEnumValue("_australia")
    AUSTRALIA("_australia"),
    @XmlEnumValue("_austria")
    AUSTRIA("_austria"),
    @XmlEnumValue("_azerbaijan")
    AZERBAIJAN("_azerbaijan"),
    @XmlEnumValue("_bahamas")
    BAHAMAS("_bahamas"),
    @XmlEnumValue("_bahrain")
    BAHRAIN("_bahrain"),
    @XmlEnumValue("_bangladesh")
    BANGLADESH("_bangladesh"),
    @XmlEnumValue("_barbados")
    BARBADOS("_barbados"),
    @XmlEnumValue("_belarus")
    BELARUS("_belarus"),
    @XmlEnumValue("_belgium")
    BELGIUM("_belgium"),
    @XmlEnumValue("_belize")
    BELIZE("_belize"),
    @XmlEnumValue("_benin")
    BENIN("_benin"),
    @XmlEnumValue("_bermuda")
    BERMUDA("_bermuda"),
    @XmlEnumValue("_bhutan")
    BHUTAN("_bhutan"),
    @XmlEnumValue("_bolivia")
    BOLIVIA("_bolivia"),
    @XmlEnumValue("_bonaireSaintEustatiusAndSaba")
    BONAIRE_SAINT_EUSTATIUS_AND_SABA("_bonaireSaintEustatiusAndSaba"),
    @XmlEnumValue("_bosniaAndHerzegovina")
    BOSNIA_AND_HERZEGOVINA("_bosniaAndHerzegovina"),
    @XmlEnumValue("_botswana")
    BOTSWANA("_botswana"),
    @XmlEnumValue("_bouvetIsland")
    BOUVET_ISLAND("_bouvetIsland"),
    @XmlEnumValue("_brazil")
    BRAZIL("_brazil"),
    @XmlEnumValue("_britishIndianOceanTerritory")
    BRITISH_INDIAN_OCEAN_TERRITORY("_britishIndianOceanTerritory"),
    @XmlEnumValue("_bruneiDarussalam")
    BRUNEI_DARUSSALAM("_bruneiDarussalam"),
    @XmlEnumValue("_bulgaria")
    BULGARIA("_bulgaria"),
    @XmlEnumValue("_burkinaFaso")
    BURKINA_FASO("_burkinaFaso"),
    @XmlEnumValue("_burundi")
    BURUNDI("_burundi"),
    @XmlEnumValue("_cambodia")
    CAMBODIA("_cambodia"),
    @XmlEnumValue("_cameroon")
    CAMEROON("_cameroon"),
    @XmlEnumValue("_canada")
    CANADA("_canada"),
    @XmlEnumValue("_canaryIslands")
    CANARY_ISLANDS("_canaryIslands"),
    @XmlEnumValue("_capeVerde")
    CAPE_VERDE("_capeVerde"),
    @XmlEnumValue("_caymanIslands")
    CAYMAN_ISLANDS("_caymanIslands"),
    @XmlEnumValue("_centralAfricanRepublic")
    CENTRAL_AFRICAN_REPUBLIC("_centralAfricanRepublic"),
    @XmlEnumValue("_ceutaAndMelilla")
    CEUTA_AND_MELILLA("_ceutaAndMelilla"),
    @XmlEnumValue("_chad")
    CHAD("_chad"),
    @XmlEnumValue("_chile")
    CHILE("_chile"),
    @XmlEnumValue("_china")
    CHINA("_china"),
    @XmlEnumValue("_christmasIsland")
    CHRISTMAS_ISLAND("_christmasIsland"),
    @XmlEnumValue("_cocosKeelingIslands")
    COCOS_KEELING_ISLANDS("_cocosKeelingIslands"),
    @XmlEnumValue("_colombia")
    COLOMBIA("_colombia"),
    @XmlEnumValue("_comoros")
    COMOROS("_comoros"),
    @XmlEnumValue("_congoDemocraticPeoplesRepublic")
    CONGO_DEMOCRATIC_PEOPLES_REPUBLIC("_congoDemocraticPeoplesRepublic"),
    @XmlEnumValue("_congoRepublicOf")
    CONGO_REPUBLIC_OF("_congoRepublicOf"),
    @XmlEnumValue("_cookIslands")
    COOK_ISLANDS("_cookIslands"),
    @XmlEnumValue("_costaRica")
    COSTA_RICA("_costaRica"),
    @XmlEnumValue("_coteDIvoire")
    COTE_D_IVOIRE("_coteDIvoire"),
    @XmlEnumValue("_croatiaHrvatska")
    CROATIA_HRVATSKA("_croatiaHrvatska"),
    @XmlEnumValue("_cuba")
    CUBA("_cuba"),
    @XmlEnumValue("_curacao")
    CURACAO("_curacao"),
    @XmlEnumValue("_cyprus")
    CYPRUS("_cyprus"),
    @XmlEnumValue("_czechRepublic")
    CZECH_REPUBLIC("_czechRepublic"),
    @XmlEnumValue("_denmark")
    DENMARK("_denmark"),
    @XmlEnumValue("_djibouti")
    DJIBOUTI("_djibouti"),
    @XmlEnumValue("_dominica")
    DOMINICA("_dominica"),
    @XmlEnumValue("_dominicanRepublic")
    DOMINICAN_REPUBLIC("_dominicanRepublic"),
    @XmlEnumValue("_eastTimor")
    EAST_TIMOR("_eastTimor"),
    @XmlEnumValue("_ecuador")
    ECUADOR("_ecuador"),
    @XmlEnumValue("_egypt")
    EGYPT("_egypt"),
    @XmlEnumValue("_elSalvador")
    EL_SALVADOR("_elSalvador"),
    @XmlEnumValue("_equatorialGuinea")
    EQUATORIAL_GUINEA("_equatorialGuinea"),
    @XmlEnumValue("_eritrea")
    ERITREA("_eritrea"),
    @XmlEnumValue("_estonia")
    ESTONIA("_estonia"),
    @XmlEnumValue("_ethiopia")
    ETHIOPIA("_ethiopia"),
    @XmlEnumValue("_falklandIslands")
    FALKLAND_ISLANDS("_falklandIslands"),
    @XmlEnumValue("_faroeIslands")
    FAROE_ISLANDS("_faroeIslands"),
    @XmlEnumValue("_fiji")
    FIJI("_fiji"),
    @XmlEnumValue("_finland")
    FINLAND("_finland"),
    @XmlEnumValue("_france")
    FRANCE("_france"),
    @XmlEnumValue("_frenchGuiana")
    FRENCH_GUIANA("_frenchGuiana"),
    @XmlEnumValue("_frenchPolynesia")
    FRENCH_POLYNESIA("_frenchPolynesia"),
    @XmlEnumValue("_frenchSouthernTerritories")
    FRENCH_SOUTHERN_TERRITORIES("_frenchSouthernTerritories"),
    @XmlEnumValue("_gabon")
    GABON("_gabon"),
    @XmlEnumValue("_gambia")
    GAMBIA("_gambia"),
    @XmlEnumValue("_georgia")
    GEORGIA("_georgia"),
    @XmlEnumValue("_germany")
    GERMANY("_germany"),
    @XmlEnumValue("_ghana")
    GHANA("_ghana"),
    @XmlEnumValue("_gibraltar")
    GIBRALTAR("_gibraltar"),
    @XmlEnumValue("_greece")
    GREECE("_greece"),
    @XmlEnumValue("_greenland")
    GREENLAND("_greenland"),
    @XmlEnumValue("_grenada")
    GRENADA("_grenada"),
    @XmlEnumValue("_guadeloupe")
    GUADELOUPE("_guadeloupe"),
    @XmlEnumValue("_guam")
    GUAM("_guam"),
    @XmlEnumValue("_guatemala")
    GUATEMALA("_guatemala"),
    @XmlEnumValue("_guernsey")
    GUERNSEY("_guernsey"),
    @XmlEnumValue("_guinea")
    GUINEA("_guinea"),
    @XmlEnumValue("_guineaBissau")
    GUINEA_BISSAU("_guineaBissau"),
    @XmlEnumValue("_guyana")
    GUYANA("_guyana"),
    @XmlEnumValue("_haiti")
    HAITI("_haiti"),
    @XmlEnumValue("_heardAndMcDonaldIslands")
    HEARD_AND_MC_DONALD_ISLANDS("_heardAndMcDonaldIslands"),
    @XmlEnumValue("_holySeeCityVaticanState")
    HOLY_SEE_CITY_VATICAN_STATE("_holySeeCityVaticanState"),
    @XmlEnumValue("_honduras")
    HONDURAS("_honduras"),
    @XmlEnumValue("_hongKong")
    HONG_KONG("_hongKong"),
    @XmlEnumValue("_hungary")
    HUNGARY("_hungary"),
    @XmlEnumValue("_iceland")
    ICELAND("_iceland"),
    @XmlEnumValue("_india")
    INDIA("_india"),
    @XmlEnumValue("_indonesia")
    INDONESIA("_indonesia"),
    @XmlEnumValue("_iranIslamicRepublicOf")
    IRAN_ISLAMIC_REPUBLIC_OF("_iranIslamicRepublicOf"),
    @XmlEnumValue("_iraq")
    IRAQ("_iraq"),
    @XmlEnumValue("_ireland")
    IRELAND("_ireland"),
    @XmlEnumValue("_isleOfMan")
    ISLE_OF_MAN("_isleOfMan"),
    @XmlEnumValue("_israel")
    ISRAEL("_israel"),
    @XmlEnumValue("_italy")
    ITALY("_italy"),
    @XmlEnumValue("_jamaica")
    JAMAICA("_jamaica"),
    @XmlEnumValue("_japan")
    JAPAN("_japan"),
    @XmlEnumValue("_jersey")
    JERSEY("_jersey"),
    @XmlEnumValue("_jordan")
    JORDAN("_jordan"),
    @XmlEnumValue("_kazakhstan")
    KAZAKHSTAN("_kazakhstan"),
    @XmlEnumValue("_kenya")
    KENYA("_kenya"),
    @XmlEnumValue("_kiribati")
    KIRIBATI("_kiribati"),
    @XmlEnumValue("_koreaDemocraticPeoplesRepublic")
    KOREA_DEMOCRATIC_PEOPLES_REPUBLIC("_koreaDemocraticPeoplesRepublic"),
    @XmlEnumValue("_koreaRepublicOf")
    KOREA_REPUBLIC_OF("_koreaRepublicOf"),
    @XmlEnumValue("_kosovo")
    KOSOVO("_kosovo"),
    @XmlEnumValue("_kuwait")
    KUWAIT("_kuwait"),
    @XmlEnumValue("_kyrgyzstan")
    KYRGYZSTAN("_kyrgyzstan"),
    @XmlEnumValue("_laoPeoplesDemocraticRepublic")
    LAO_PEOPLES_DEMOCRATIC_REPUBLIC("_laoPeoplesDemocraticRepublic"),
    @XmlEnumValue("_latvia")
    LATVIA("_latvia"),
    @XmlEnumValue("_lebanon")
    LEBANON("_lebanon"),
    @XmlEnumValue("_lesotho")
    LESOTHO("_lesotho"),
    @XmlEnumValue("_liberia")
    LIBERIA("_liberia"),
    @XmlEnumValue("_libya")
    LIBYA("_libya"),
    @XmlEnumValue("_liechtenstein")
    LIECHTENSTEIN("_liechtenstein"),
    @XmlEnumValue("_lithuania")
    LITHUANIA("_lithuania"),
    @XmlEnumValue("_luxembourg")
    LUXEMBOURG("_luxembourg"),
    @XmlEnumValue("_macau")
    MACAU("_macau"),
    @XmlEnumValue("_macedonia")
    MACEDONIA("_macedonia"),
    @XmlEnumValue("_madagascar")
    MADAGASCAR("_madagascar"),
    @XmlEnumValue("_malawi")
    MALAWI("_malawi"),
    @XmlEnumValue("_malaysia")
    MALAYSIA("_malaysia"),
    @XmlEnumValue("_maldives")
    MALDIVES("_maldives"),
    @XmlEnumValue("_mali")
    MALI("_mali"),
    @XmlEnumValue("_malta")
    MALTA("_malta"),
    @XmlEnumValue("_marshallIslands")
    MARSHALL_ISLANDS("_marshallIslands"),
    @XmlEnumValue("_martinique")
    MARTINIQUE("_martinique"),
    @XmlEnumValue("_mauritania")
    MAURITANIA("_mauritania"),
    @XmlEnumValue("_mauritius")
    MAURITIUS("_mauritius"),
    @XmlEnumValue("_mayotte")
    MAYOTTE("_mayotte"),
    @XmlEnumValue("_mexico")
    MEXICO("_mexico"),
    @XmlEnumValue("_micronesiaFederalStateOf")
    MICRONESIA_FEDERAL_STATE_OF("_micronesiaFederalStateOf"),
    @XmlEnumValue("_moldovaRepublicOf")
    MOLDOVA_REPUBLIC_OF("_moldovaRepublicOf"),
    @XmlEnumValue("_monaco")
    MONACO("_monaco"),
    @XmlEnumValue("_mongolia")
    MONGOLIA("_mongolia"),
    @XmlEnumValue("_montenegro")
    MONTENEGRO("_montenegro"),
    @XmlEnumValue("_montserrat")
    MONTSERRAT("_montserrat"),
    @XmlEnumValue("_morocco")
    MOROCCO("_morocco"),
    @XmlEnumValue("_mozambique")
    MOZAMBIQUE("_mozambique"),
    @XmlEnumValue("_myanmar")
    MYANMAR("_myanmar"),
    @XmlEnumValue("_namibia")
    NAMIBIA("_namibia"),
    @XmlEnumValue("_nauru")
    NAURU("_nauru"),
    @XmlEnumValue("_nepal")
    NEPAL("_nepal"),
    @XmlEnumValue("_netherlands")
    NETHERLANDS("_netherlands"),
    @XmlEnumValue("_newCaledonia")
    NEW_CALEDONIA("_newCaledonia"),
    @XmlEnumValue("_newZealand")
    NEW_ZEALAND("_newZealand"),
    @XmlEnumValue("_nicaragua")
    NICARAGUA("_nicaragua"),
    @XmlEnumValue("_niger")
    NIGER("_niger"),
    @XmlEnumValue("_nigeria")
    NIGERIA("_nigeria"),
    @XmlEnumValue("_niue")
    NIUE("_niue"),
    @XmlEnumValue("_norfolkIsland")
    NORFOLK_ISLAND("_norfolkIsland"),
    @XmlEnumValue("_northernMarianaIslands")
    NORTHERN_MARIANA_ISLANDS("_northernMarianaIslands"),
    @XmlEnumValue("_norway")
    NORWAY("_norway"),
    @XmlEnumValue("_oman")
    OMAN("_oman"),
    @XmlEnumValue("_pakistan")
    PAKISTAN("_pakistan"),
    @XmlEnumValue("_palau")
    PALAU("_palau"),
    @XmlEnumValue("_palestinianTerritories")
    PALESTINIAN_TERRITORIES("_palestinianTerritories"),
    @XmlEnumValue("_panama")
    PANAMA("_panama"),
    @XmlEnumValue("_papuaNewGuinea")
    PAPUA_NEW_GUINEA("_papuaNewGuinea"),
    @XmlEnumValue("_paraguay")
    PARAGUAY("_paraguay"),
    @XmlEnumValue("_peru")
    PERU("_peru"),
    @XmlEnumValue("_philippines")
    PHILIPPINES("_philippines"),
    @XmlEnumValue("_pitcairnIsland")
    PITCAIRN_ISLAND("_pitcairnIsland"),
    @XmlEnumValue("_poland")
    POLAND("_poland"),
    @XmlEnumValue("_portugal")
    PORTUGAL("_portugal"),
    @XmlEnumValue("_puertoRico")
    PUERTO_RICO("_puertoRico"),
    @XmlEnumValue("_qatar")
    QATAR("_qatar"),
    @XmlEnumValue("_reunionIsland")
    REUNION_ISLAND("_reunionIsland"),
    @XmlEnumValue("_romania")
    ROMANIA("_romania"),
    @XmlEnumValue("_russianFederation")
    RUSSIAN_FEDERATION("_russianFederation"),
    @XmlEnumValue("_rwanda")
    RWANDA("_rwanda"),
    @XmlEnumValue("_saintBarthelemy")
    SAINT_BARTHELEMY("_saintBarthelemy"),
    @XmlEnumValue("_saintHelena")
    SAINT_HELENA("_saintHelena"),
    @XmlEnumValue("_saintKittsAndNevis")
    SAINT_KITTS_AND_NEVIS("_saintKittsAndNevis"),
    @XmlEnumValue("_saintLucia")
    SAINT_LUCIA("_saintLucia"),
    @XmlEnumValue("_saintMartin")
    SAINT_MARTIN("_saintMartin"),
    @XmlEnumValue("_saintVincentAndTheGrenadines")
    SAINT_VINCENT_AND_THE_GRENADINES("_saintVincentAndTheGrenadines"),
    @XmlEnumValue("_samoa")
    SAMOA("_samoa"),
    @XmlEnumValue("_sanMarino")
    SAN_MARINO("_sanMarino"),
    @XmlEnumValue("_saoTomeAndPrincipe")
    SAO_TOME_AND_PRINCIPE("_saoTomeAndPrincipe"),
    @XmlEnumValue("_saudiArabia")
    SAUDI_ARABIA("_saudiArabia"),
    @XmlEnumValue("_senegal")
    SENEGAL("_senegal"),
    @XmlEnumValue("_serbia")
    SERBIA("_serbia"),
    @XmlEnumValue("_seychelles")
    SEYCHELLES("_seychelles"),
    @XmlEnumValue("_sierraLeone")
    SIERRA_LEONE("_sierraLeone"),
    @XmlEnumValue("_singapore")
    SINGAPORE("_singapore"),
    @XmlEnumValue("_sintMaarten")
    SINT_MAARTEN("_sintMaarten"),
    @XmlEnumValue("_slovakRepublic")
    SLOVAK_REPUBLIC("_slovakRepublic"),
    @XmlEnumValue("_slovenia")
    SLOVENIA("_slovenia"),
    @XmlEnumValue("_solomonIslands")
    SOLOMON_ISLANDS("_solomonIslands"),
    @XmlEnumValue("_somalia")
    SOMALIA("_somalia"),
    @XmlEnumValue("_southAfrica")
    SOUTH_AFRICA("_southAfrica"),
    @XmlEnumValue("_southGeorgia")
    SOUTH_GEORGIA("_southGeorgia"),
    @XmlEnumValue("_southSudan")
    SOUTH_SUDAN("_southSudan"),
    @XmlEnumValue("_spain")
    SPAIN("_spain"),
    @XmlEnumValue("_sriLanka")
    SRI_LANKA("_sriLanka"),
    @XmlEnumValue("_stPierreAndMiquelon")
    ST_PIERRE_AND_MIQUELON("_stPierreAndMiquelon"),
    @XmlEnumValue("_sudan")
    SUDAN("_sudan"),
    @XmlEnumValue("_suriname")
    SURINAME("_suriname"),
    @XmlEnumValue("_svalbardAndJanMayenIslands")
    SVALBARD_AND_JAN_MAYEN_ISLANDS("_svalbardAndJanMayenIslands"),
    @XmlEnumValue("_swaziland")
    SWAZILAND("_swaziland"),
    @XmlEnumValue("_sweden")
    SWEDEN("_sweden"),
    @XmlEnumValue("_switzerland")
    SWITZERLAND("_switzerland"),
    @XmlEnumValue("_syrianArabRepublic")
    SYRIAN_ARAB_REPUBLIC("_syrianArabRepublic"),
    @XmlEnumValue("_taiwan")
    TAIWAN("_taiwan"),
    @XmlEnumValue("_tajikistan")
    TAJIKISTAN("_tajikistan"),
    @XmlEnumValue("_tanzania")
    TANZANIA("_tanzania"),
    @XmlEnumValue("_thailand")
    THAILAND("_thailand"),
    @XmlEnumValue("_togo")
    TOGO("_togo"),
    @XmlEnumValue("_tokelau")
    TOKELAU("_tokelau"),
    @XmlEnumValue("_tonga")
    TONGA("_tonga"),
    @XmlEnumValue("_trinidadAndTobago")
    TRINIDAD_AND_TOBAGO("_trinidadAndTobago"),
    @XmlEnumValue("_tunisia")
    TUNISIA("_tunisia"),
    @XmlEnumValue("_turkey")
    TURKEY("_turkey"),
    @XmlEnumValue("_turkmenistan")
    TURKMENISTAN("_turkmenistan"),
    @XmlEnumValue("_turksAndCaicosIslands")
    TURKS_AND_CAICOS_ISLANDS("_turksAndCaicosIslands"),
    @XmlEnumValue("_tuvalu")
    TUVALU("_tuvalu"),
    @XmlEnumValue("_uganda")
    UGANDA("_uganda"),
    @XmlEnumValue("_ukraine")
    UKRAINE("_ukraine"),
    @XmlEnumValue("_unitedArabEmirates")
    UNITED_ARAB_EMIRATES("_unitedArabEmirates"),
    @XmlEnumValue("_unitedKingdomGB")
    UNITED_KINGDOM_GB("_unitedKingdomGB"),
    @XmlEnumValue("_unitedStates")
    UNITED_STATES("_unitedStates"),
    @XmlEnumValue("_uruguay")
    URUGUAY("_uruguay"),
    @XmlEnumValue("_uSMinorOutlyingIslands")
    U_S_MINOR_OUTLYING_ISLANDS("_uSMinorOutlyingIslands"),
    @XmlEnumValue("_uzbekistan")
    UZBEKISTAN("_uzbekistan"),
    @XmlEnumValue("_vanuatu")
    VANUATU("_vanuatu"),
    @XmlEnumValue("_venezuela")
    VENEZUELA("_venezuela"),
    @XmlEnumValue("_vietnam")
    VIETNAM("_vietnam"),
    @XmlEnumValue("_virginIslandsBritish")
    VIRGIN_ISLANDS_BRITISH("_virginIslandsBritish"),
    @XmlEnumValue("_virginIslandsUSA")
    VIRGIN_ISLANDS_USA("_virginIslandsUSA"),
    @XmlEnumValue("_wallisAndFutunaIslands")
    WALLIS_AND_FUTUNA_ISLANDS("_wallisAndFutunaIslands"),
    @XmlEnumValue("_westernSahara")
    WESTERN_SAHARA("_westernSahara"),
    @XmlEnumValue("_yemen")
    YEMEN("_yemen"),
    @XmlEnumValue("_zambia")
    ZAMBIA("_zambia"),
    @XmlEnumValue("_zimbabwe")
    ZIMBABWE("_zimbabwe");
    private final String value;

    Country(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Country fromValue(String v) {
        for (Country c: Country.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
