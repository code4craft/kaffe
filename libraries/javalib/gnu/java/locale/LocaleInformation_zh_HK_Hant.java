/* LocaleInformation_zh_HK_Hant.java --
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


// This file was automatically generated by gnu.localegen from LDML zh_HK_Hant.xml

package gnu.java.locale;

import java.util.ListResourceBundle;

public class LocaleInformation_zh_HK_Hant extends ListResourceBundle
{
  private static final String[] shortMonths = {
    "1\u6708",
    "2\u6708",
    "3\u6708",
    "4\u6708",
    "5\u6708",
    "6\u6708",
    "7\u6708",
    "8\u6708",
    "9\u6708",
    "10\u6708",
    "11\u6708",
    "12\u6708",
    null,
  };

  private static final class Hashtableterritories extends java.util.Hashtable
  {
    public Hashtableterritories()
      {
        super();
        put("MO", "\u6fb3\u9580\u7279\u5225\u884c\u653f\u5340");
      }
  }

  private static final Object territories = new Hashtableterritories();

  private static final Object[][] contents =
  {
    { "currencyFormat", "\u00a4#,##0.00;(\u00a4#,##0.00)" },
    { "shortMonths", shortMonths },
    { "shortDateFormat", "yy'\u5e74'M'\u6708'd'\u65e5'" },
    { "mediumDateFormat", "yyyy'\u5e74'M'\u6708'd'\u65e5'" },
    { "longDateFormat", "yyyy'\u5e74'M'\u6708'd'\u65e5'" },
    { "fullDateFormat", "yyyy'\u5e74'M'\u6708'd'\u65e5' EEEE" },
    { "shortTimeFormat", "ah:mm" },
    { "mediumTimeFormat", "ahh:mm:ss" },
    { "territories", territories },
  };

  public Object[][] getContents() { return contents; }
}
