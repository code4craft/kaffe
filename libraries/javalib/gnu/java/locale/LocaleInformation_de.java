/* LocaleInformation_de.java --
   Copyright (C) 2004  Free Software Foundation, Inc.

This file is part of GNU Classpath.

GNU Classpath is free software; you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation; either version 2, or (at your option)
any later version.

GNU Classpath is distributed in the hope that it will be useful, but
WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
General Public License for more details.

You should have received a copy of the GNU General Public License
along with GNU Classpath; see the file COPYING.  If not, write to the
Free Software Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA
02111-1307 USA.

Linking this library statically or dynamically with other modules is
making a combined work based on this library.  Thus, the terms and
conditions of the GNU General Public License cover the whole
combination.

As a special exception, the copyright holders of this library give you
permission to link this library with independent modules to produce an
executable, regardless of the license terms of these independent
modules, and to copy and distribute the resulting executable under
terms of your choice, provided that you also meet, for each linked
independent module, the terms and conditions of the license of that
module.  An independent module is a module which is not derived from
or based on this library.  If you modify this library, you may extend
this exception to your version of the library, but you are not
obligated to do so.  If you do not wish to do so, delete this
exception statement from your version. */


// This file was automatically generated by gnu.localegen from LDML de.xml

package gnu.java.locale;

import java.util.ListResourceBundle;

public class LocaleInformation_de extends ListResourceBundle
{
  private static final String collation_rules = 
    "<0<1<2<3<4<5<6<7<8<9<A,a<b,B<c,C<d,D<e,E<f,F<g,G<h,H<i,I<j,J<k,K" +
    "<l,L<m,M<n,N<o,O<p,P<q,Q<r,R<s,S<t,T<u,U<v,V<w,W<x,X<y,Y<z,Z" + 
    "&ae,\u00e4&Ae,\u00c4&oe,\u00f6&Oe,\u00d6&ue,\u00fc&Ue,\u00dc&ss,\u00df";

  private static final String[] shortMonths = {
    "Jan",
    "Feb",
    "Mrz",
    "Apr",
    "Mai",
    "Jun",
    "Jul",
    "Aug",
    "Sep",
    "Okt",
    "Nov",
    "Dez",
    null,
  };

  private static final String[] months = {
    "Januar",
    "Februar",
    "M\u00e4rz",
    "April",
    "Mai",
    "Juni",
    "Juli",
    "August",
    "September",
    "Oktober",
    "November",
    "Dezember",
    null,
  };

  private static final String[] shortWeekdays = {
    null,
    "So",
    "Mo",
    "Di",
    "Mi",
    "Do",
    "Fr",
    "Sa",
  };

  private static final String[] weekdays = {
    null,
    "Sonntag",
    "Montag",
    "Dienstag",
    "Mittwoch",
    "Donnerstag",
    "Freitag",
    "Samstag",
  };

  private static final String[] eras = {
    "v. Chr.",
    "n. Chr.",
  };

  private static final String[] ampms = {
    "vorm.",
    "nachm.",
  };

  private static final String[][] zoneStrings =
  {
    { "WET", "Westeurop\u00e4ische Zeit", "WEZ", "Westeurop\u00e4ische Sommerzeit", "WESZ", "London" },
    { "CET", "Mitteleurop\u00e4ische Zeit", "MEZ", "Mitteleurop\u00e4ische Sommerzeit", "MESZ", "Berlin" },
    { "EET", "Osteurop\u00e4ische Zeit", "OEZ", "Mitteleurop\u00e4ische Sommerzeit", "OESZ", "Istanbul" },
  };

  private static final class Hashtableterritories extends java.util.Hashtable
  {
    public Hashtableterritories()
      {
        super();
        put("TL", "Osttimor");
        put("TK", "Tokelau");
        put("TJ", "Tadschikistan");
        put("TH", "Thailand");
        put("TG", "Togo");
        put("TF", "Franz\u00f6sische S\u00fcd- und Antarktisgebiete");
        put("GY", "Guyana");
        put("TD", "Tschad");
        put("TC", "Turks- und Caicosinseln");
        put("GW", "Guinea-Bissau");
        put("GU", "Guam");
        put("GT", "Guatemala");
        put("GS", "S\u00fcdgeorgien und die S\u00fcdlichen Sandwichinseln");
        put("GR", "Griechenland");
        put("GQ", "\u00c4quatorialguinea");
        put("GP", "Guadeloupe");
        put("SZ", "Swasiland");
        put("SY", "Syrien");
        put("GN", "Guinea");
        put("GM", "Gambia");
        put("GL", "Gr\u00f6nland");
        put("SV", "El Salvador");
        put("ST", "S\u00e3o Tom\u00e9 und Pr\u00edncipe");
        put("GI", "Gibraltar");
        put("GH", "Ghana");
        put("SR", "Suriname");
        put("GF", "Franz\u00f6sisch-Guayana");
        put("SP", "Serbien");
        put("GE", "Georgien");
        put("SO", "Somalia");
        put("GD", "Grenada");
        put("SN", "Senegal");
        put("SM", "San Marino");
        put("GB", "Vereinigtes K\u00f6nigreich");
        put("SL", "Sierra Leone");
        put("GA", "Gabun");
        put("SK", "Slowakei");
        put("SJ", "Svalbard und Jan Mayen");
        put("SI", "Slowenien");
        put("SH", "St. Helena");
        put("SG", "Singapur");
        put("SE", "Schweden");
        put("SD", "Sudan");
        put("SC", "Seychellen");
        put("SB", "Salomonen");
        put("SA", "Saudi-Arabien");
        put("FR", "Frankreich");
        put("FO", "F\u00e4r\u00f6er");
        put("FM", "Mikronesien");
        put("RW", "Ruanda");
        put("FK", "Falklandinseln");
        put("RU", "Russische F\u00f6deration");
        put("FJ", "Fidschi");
        put("FI", "Finnland");
        put("RO", "Rum\u00e4nien");
        put("RE", "R\u00e9union");
        put("ET", "\u00c4thiopien");
        put("ES", "Spanien");
        put("ER", "Eritrea");
        put("EH", "Westsahara");
        put("EG", "\u00c4gypten");
        put("EE", "Estland");
        put("EC", "Ecuador");
        put("DZ", "Algerien");
        put("QA", "Katar");
        put("DO", "Dominikanische Republik");
        put("PY", "Paraguay");
        put("DM", "Dominica");
        put("PW", "Palau");
        put("DK", "D\u00e4nemark");
        put("DJ", "Dschibuti");
        put("PT", "Portugal");
        put("PS", "Pal\u00e4stinensische Gebiete");
        put("PR", "Puerto Rico");
        put("DE", "Deutschland");
        put("PN", "Pitcairn");
        put("PM", "St. Pierre und Miquelon");
        put("PL", "Polen");
        put("PK", "Pakistan");
        put("PH", "Philippinen");
        put("PG", "Papua-Neuguinea");
        put("PF", "Franz\u00f6sisch-Polynesien");
        put("CZ", "Tschechische Republik");
        put("PE", "Peru");
        put("CY", "Zypern");
        put("CX", "Weihnachtsinsel");
        put("CV", "Kap Verde");
        put("PA", "Panama");
        put("CU", "Kuba");
        put("CR", "Costa Rica");
        put("CO", "Kolumbien");
        put("CN", "China");
        put("CM", "Kamerun");
        put("CL", "Chile");
        put("CK", "Cookinseln");
        put("CI", "C\u00f4te d\u2019Ivoire");
        put("CH", "Schweiz");
        put("CG", "Kongo");
        put("CF", "Zentralafrikanische Republik");
        put("CD", "Demokratische Republik Kongo");
        put("CC", "Kokosinseln (Keeling)");
        put("OM", "Oman");
        put("CA", "Kanada");
        put("BZ", "Belize");
        put("BY", "Belarus");
        put("BW", "Botsuana");
        put("BV", "Bouvetinsel");
        put("BT", "Bhutan");
        put("BS", "Bahamas");
        put("BR", "Brasilien");
        put("NZ", "Neuseeland");
        put("BO", "Bolivien");
        put("BN", "Brunei Darussalam");
        put("BM", "Bermuda");
        put("NU", "Niue");
        put("BJ", "Benin");
        put("BI", "Burundi");
        put("BH", "Bahrain");
        put("NR", "Nauru");
        put("BG", "Bulgarien");
        put("BF", "Burkina Faso");
        put("NP", "Nepal");
        put("BE", "Belgien");
        put("NO", "Norwegen");
        put("BD", "Bangladesch");
        put("BB", "Barbados");
        put("ZW", "Simbabwe");
        put("NL", "Niederlande");
        put("BA", "Bosnien und Herzegowina");
        put("NI", "Nicaragua");
        put("NG", "Nigeria");
        put("NF", "Norfolkinsel");
        put("AZ", "Aserbaidschan");
        put("NE", "Niger");
        put("NC", "Neukaledonien");
        put("AW", "Aruba");
        put("ZM", "Sambia");
        put("NA", "Namibia");
        put("AU", "Australien");
        put("AT", "\u00d6sterreich");
        put("AS", "Amerikanisch-Samoa");
        put("AR", "Argentinien");
        put("AQ", "Antarktis");
        put("MZ", "Mosambik");
        put("AO", "Angola");
        put("MY", "Malaysia");
        put("AN", "Niederl\u00e4ndische Antillen");
        put("MX", "Mexiko");
        put("AM", "Armenien");
        put("MW", "Malawi");
        put("AL", "Albanien");
        put("MV", "Malediven");
        put("ZA", "S\u00fcdafrika");
        put("MU", "Mauritius");
        put("MT", "Malta");
        put("AI", "Anguilla");
        put("MS", "Montserrat");
        put("MR", "Mauretanien");
        put("AG", "Antigua und Barbuda");
        put("MQ", "Martinique");
        put("AF", "Afghanistan");
        put("MP", "N\u00f6rdliche Marianen");
        put("AE", "Vereinigte Arabische Emirate");
        put("MO", "Macau S.A.R., China");
        put("AD", "Andorra");
        put("MN", "Mongolei");
        put("MM", "Myanmar");
        put("ML", "Mali");
        put("MK", "Mazedonien");
        put("YU", "Jugoslawien");
        put("YT", "Mayotte");
        put("MH", "Marshallinseln");
        put("MG", "Madagaskar");
        put("MD", "Republik Moldau");
        put("MC", "Monaco");
        put("MA", "Marokko");
        put("YE", "Jemen");
        put("LY", "Libyen");
        put("LV", "Lettland");
        put("LU", "Luxemburg");
        put("LT", "Litauen");
        put("LS", "Lesotho");
        put("LR", "Liberia");
        put("LK", "Sri Lanka");
        put("LI", "Liechtenstein");
        put("LC", "St. Lucia");
        put("LB", "Libanon");
        put("LA", "Laos");
        put("KZ", "Kasachstan");
        put("KY", "Kaimaninseln");
        put("KW", "Kuwait");
        put("KR", "Republik Korea");
        put("KP", "Demokratische Volksrepublik Korea");
        put("KN", "St. Kitts und Nevis");
        put("KM", "Komoren");
        put("KI", "Kiribati");
        put("WS", "Samoa");
        put("KH", "Kambodscha");
        put("KG", "Kirgisistan");
        put("KE", "Kenia");
        put("WF", "Wallis und Futuna");
        put("JP", "Japan");
        put("JO", "Jordanien");
        put("JM", "Jamaika");
        put("VU", "Vanuatu");
        put("VN", "Vietnam");
        put("VI", "Amerikanische Jungferninseln");
        put("VG", "Britische Jungferninseln");
        put("VE", "Venezuela");
        put("VC", "St. Vincent und die Grenadinen");
        put("VA", "Vatikanstadt");
        put("IT", "Italien");
        put("IS", "Island");
        put("IR", "Iran");
        put("IQ", "Irak");
        put("UZ", "Usbekistan");
        put("IO", "Britisches Territorium im Indischen Ozean");
        put("UY", "Uruguay");
        put("IN", "Indien");
        put("IL", "Israel");
        put("US", "Vereinigte Staaten");
        put("IE", "Irland");
        put("ID", "Indonesien");
        put("UM", "Amerikanisch-Ozeanien");
        put("UG", "Uganda");
        put("UA", "Ukraine");
        put("HU", "Ungarn");
        put("HT", "Haiti");
        put("HR", "Kroatien");
        put("TZ", "Tansania");
        put("HN", "Honduras");
        put("HM", "Heard und McDonaldinseln");
        put("TW", "Taiwan");
        put("TV", "Tuvalu");
        put("HK", "Hong Kong S.A.R., China");
        put("TT", "Trinidad und Tobago");
        put("TR", "T\u00fcrkei");
        put("TO", "Tonga");
        put("TN", "Tunesien");
        put("TM", "Turkmenistan");
      }
  }

  private static final Object territories = new Hashtableterritories();

  private static final Object[][] contents =
  {
    { "decimalSeparator", "," },
    { "groupingSeparator", "." },
    { "shortMonths", shortMonths },
    { "collation_rules", collation_rules },
    { "months", months },
    { "shortWeekdays", shortWeekdays },
    { "weekdays", weekdays },
    { "eras", eras },
    { "ampms", ampms },
    { "shortDateFormat", "dd.MM.yy" },
    { "mediumDateFormat", "dd.MM.yyyy" },
    { "longDateFormat", "d. MMMM yyyy" },
    { "fullDateFormat", "EEEE, d. MMMM yyyy" },
    { "fullTimeFormat", "H:mm' Uhr 'z" },
    { "zoneStrings", zoneStrings },
    { "territories", territories },
  };

  public Object[][] getContents() { return contents; }
}
