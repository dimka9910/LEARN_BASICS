package com.github.dimka9910.testtasks.regexp;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {

    @Test
    public void name() {

        System.out.println("ab\r\ncd\n\ref\ngh\rij\bkl\tmn\fopqr");

        int a;
        a = '\t'; //9
        a = '\n'; //10
        a = '\f'; //12
        a = '\r'; //13

        String regex = "([\\w-]+\\.)*[\\w-]+";
        "d12dd.dfd.as-d".matches(regex); // true
        "d12dd.dfd.as-d".replaceAll("\\.", "\\\\."); // d12dd\.dfd\.as-d
        "d12dd.dfd.as-d".replace(".", "\\."); // d12dd\.dfd\.as-d

        String  s;//?????????????\n??????????
        s = "abc\nacd".replaceAll(".", "?"); // ???\n???
        s = "abca\nc".replaceAll("a.c", "?"); // ?a\nc
        s = "abc_ayb_b".replaceAll("ay?b", "?"); // ?c_?_b
        s = "abc_ayb_b".replaceAll("(ay)?b", "?"); // a?c_?_?

        s = "a1b2c3".replaceAll("\\d","?"); // a?b?c?
        s = "a\nb\r\nc\rd\n\re\f".replaceAll("\\s","_"); // a_b__c_d__e_
        s = "a\nb\r\nc\rd\n\re\f12_34?%^-".replaceAll("\\w","_");//_\n_\r\n_\r_\n\r_\f_____?%^-
        s = "abc_acb aef\nefc?acc,acc".replaceAll("\\ba", "#"); //#bc_acb #ef\nefc?#cc,#cc
        s = "abc_acb aef\nefc?acc,acc".replaceAll("c\\b", "#"); //abc_acb aef\nef#?ac#,ac#
        s = "abc_acb aef\nefc?acc,acc".replaceAll("\\Bc", "#"); //ab#_a#b aef\nef#?a##,a##
        s = "abc_acb aef\nefc?acc,acc".replaceAll("c\\B", "#"); // ab#_a#b aef\nefc?a#c,a#c
        s = "ab c-123?".replaceAll("\\D", "#"); //#####123#
        s = "ab c-123?".replaceAll("\\S", "#"); //## ######
        s = "ab c-123?".replaceAll("\\W", "#"); //ab#c#123#


        String line1 = "abc?123";
        Pattern pattern1 = Pattern.compile("a.y?c\\?\\d{2,10}");
        Matcher matcher1 =  pattern1.matcher(line1);
        matcher1.reset(line1);
        boolean b1 = matcher1.matches(); //true

        String line = "name1=gil;name2=orit;";
        Pattern p = Pattern.compile("(n)(am)(e)(\\d?)");
        Matcher m = p.matcher(line);
        while (m.find()) {
            System.out.println(m.group(0)); //name1     name2
            System.out.println(m.group(1)); //n         n
            System.out.println(m.group(2)); //am        am
            System.out.println(m.group(3)); //e         e
            System.out.println(m.group(4)); //1         2
        }
        //name1
        //gil
        //name2
        //orit


        line = "This order was placed for QT3000! OK?";
        String pattern = "(.*)(\\d+)(.*)";

        // Create a Pattern object
        Pattern r = Pattern.compile(pattern);

        // Now create matcher object.
        m = r.matcher(line);
        if (m.find( )) {
            System.out.println(m.group(0) );
            System.out.println(m.group(1) );
            System.out.println(m.group(2) );
        }else {
            System.out.println("NO MATCH");
        }

    }
}
