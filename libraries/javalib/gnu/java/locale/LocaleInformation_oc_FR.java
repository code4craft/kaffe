/* LocaleInformation_oc_FR.java
   Copyright (C) 2002 Free Software Foundation, Inc.

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


// This file was automatically generated by localedef.

package gnu.java.locale;

import java.util.ListResourceBundle;

public class LocaleInformation_oc_FR extends ListResourceBundle
{
  static final String[] weekdays = { null, "dimenge", "diluns", "dimars", "dimecres", "dij\u00F3us", "divendres", "disabte" };
  static final String[] shortWeekdays = { null, "dim", "lun", "mar", "mec", "j\u00F3u", "ven", "sab" };
  static final String[] shortMonths = { "gen", "feb", "mar", "abr", "mai", "jun", "jul", "ag\u00F3", "set", "oct", "nov", "dec", null };
  static final String[] months = { "geni\u00E8r", "febri\u00E8r", "mar\u00E7", "abrial", "mai", "junh", "julhet", "ag\u00F3st", "setembre", "octobre", "novembre", "decembre", null };
  static final String[] ampms = { "", "" };
  static final String currencySymbol = "F";
  static final String intlCurrencySymbol = "FRF";

  private static final Object[][] contents =
  {
    { "weekdays", weekdays },
    { "shortWeekdays", shortWeekdays },
    { "shortMonths", shortMonths },
    { "months", months },
    { "ampms", ampms },
    { "currencySymbol", currencySymbol },
    { "intlCurrencySymbol", intlCurrencySymbol },
  };

  public Object[][] getContents () { return contents; }
}
