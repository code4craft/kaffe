/* LocaleInformation.java -- Default locale information
   Copyright (C) 1998, 2002 Free Software Foundation, Inc.

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


package gnu.java.locale;

import java.util.ListResourceBundle;

public class LocaleInformation extends ListResourceBundle
{
  private static final String[] ampms = { "AM", "PM" };

  private static final String[][] zoneStrings =
  {
    { "GMT", "Greenwich Mean Time", "GMT",
      /**/   "Greenwich Mean Time", "GMT", "GMT" },
    { "PST", "Pacific Standard Time", "PST",
      /**/   "Pacific Daylight Time", "PDT", "San Francisco" },
    { "MST", "Mountain Standard Time", "MST",
      /**/   "Mountain Daylight Time", "MDT", "Denver" },
    { "PNT", "Mountain Standard Time", "MST",
      /**/   "Mountain Standard Time", "MST", "Phoenix" },
    { "CST", "Central Standard Time", "CST",
      /**/   "Central Daylight Time", "CDT", "Chicago" },
    { "EST", "Eastern Standard Time", "EST",
      /**/   "Eastern Daylight Time", "EDT", "Boston" },
    { "IET", "Eastern Standard Time", "EST",
      /**/   "Eastern Standard Time", "EST", "Indianapolis" },
    { "PRT", "Atlantic Standard Time", "AST",
      /**/   "Atlantic Daylight Time", "ADT", "Halifax" },
    { "CNT", "Newfoundland Standard Time", "NST",
      /**/   "Newfoundland Daylight Time", "NDT", "St. Johns" },
    { "ECT", "Central European Standard Time", "CET",
      /**/   "Central European Daylight Time", "CEST", "Paris" },
    { "CTT", "China Standard Time", "CST",
      /**/   "China Standard Time", "CST", "Shanghai" },
    { "JST", "Japan Standard Time", "JST",
      /**/   "Japan Standard Time", "JST", "Tokyo" },
    { "HST", "Hawaii Standard Time", "HST",
      /**/   "Hawaii Standard Time", "HST", "Honolulu" },
    { "AST", "Alaska Standard Time", "AKST",
      /**/   "Alaska Daylight Time", "AKDT", "Anchorage" }
  };

  private static final class HashtableCurrencySymbols extends java.util.Hashtable
  {
    public HashtableCurrencySymbols()
    {
      super();
      put("EUR", "\u20ac");
      put("GBP", "\u00a3");
      put("INR", "=0#Rs.|1#Re.|1<Rs.");
      put("ITL", "\u20A4");
      put("JPY", "\u20A5");
      put("USD", "US$");
    }
  }

  private static final Object currencySymbols = new HashtableCurrencySymbols();
  
  private static final Object[][] contents =
  {
    { "localPatternChars", "GyMdkHmsSEDFwWahKz" },
    { "currencySymbols", currencySymbols },
    { "decimalSeparator", "." },
    { "groupingSeparator", "," },
    { "patternSeparator", ";" },
    { "percent", "%" },
    { "zeroDigit", "0" },
    { "digit", "#" },
    { "minusSign", "-" },
    { "exponential", "E" },
    { "perMill", "\u2030" },
    { "infinity", "\u221e" },
    { "NaN", "\ufffd" },
    { "numberFormat", "#,##0.###;-#,##0.###" },
    { "percentFormat", "#,##0%" },
    { "shortDateFormat", "M/d/yy" },
    { "mediumDateFormat", "MMM d, yyyy" },
    { "longDateFormat", "MMMM d, yyyy" },
    { "fullDateFormat", "EEEE, MMMM d, yyyy" },
    { "shortTimeFormat", "h:mm a" },
    { "mediumTimeFormat", "h:mm:ss a" },
    { "longTimeFormat", "h:mm:ss a z" },
    { "fullTimeFormat", "h:mm:ss a z" },
    { "ampms", ampms },
    { "zoneStrings", zoneStrings },
  };

  public Object[][] getContents() { return contents; }
}
