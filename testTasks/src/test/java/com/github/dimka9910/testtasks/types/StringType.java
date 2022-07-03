package com.github.dimka9910.testtasks.types;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class StringType {

    @Test
    void stringMethods() {

        //https://www.w3schools.com/java/java_ref_string.asp

        String ssss;
        ssss = 50 + 50 + "ff"; //100ff
        ssss = 50 + "ff" + 50; //50ff50
        ssss = "ff" + 50 + 50; //ff5050
        ssss = "ff" + (50 + 50); //ff100
        ssss = 100 + 'a' + 1000 + "ff"; //1197ff



        String str = " abcde edcba abab "; //18

        char res1 = str.charAt(1);  // 'a'
        int res2 = str.codePointAt(1);  //97
        int res3 = str.codePointBefore(2); //97
        int res4 = str.codePointCount(0,5); //5

        int c1 = ' '; //32
        int c2 = ','; //44
        int c3 = '-'; //45
        int c4 = '.'; //46
        int c5 = '?'; //63
        int c6 = 'A'; //65
        int c7 = 'Z'; //90
        int c8 = 'a'; //97
        int c9 = 'z'; //122
        String tst = "bb";
        int res5 = tst.compareTo("Ab");  // >0
        int res6 = tst.compareTo("ba");  // >0
        int res7 = tst.compareTo("bb");  // =0
        int res8 = tst.compareTo("bc");  // <0
        int res9 = tst.compareTo("bba"); // <0
        int res10 = tst.compareTo("bbb");// <0
        int res11 = tst.compareTo("bbc");// <0
        int res12 = tst.compareTo("bB"); // >0

        int resresres;
        resresres = " ".compareTo(",a");
        resresres = ",a".compareTo("A");
        resresres = "A".compareTo("Ab");
        resresres = "Ab".compareTo("Z");
        resresres = "Z".compareTo("abZ");
        resresres = "abZ".compareTo("cbZ");
        resresres = "cbz".compareTo("d ,?");



        int res13 = tst.compareToIgnoreCase("Bb"); //  = 0

        str = " hello !?";
        String res14 = str.concat("ff"); // " hello !?ff"
        boolean res15 = str.contains("!?"); //true
        boolean res16 = str.contains("He"); //false

        StringBuilder stringBuilder = new StringBuilder(" hello !?");
        boolean res17 = str.contentEquals(stringBuilder);


//        str.charAt() ;   //	Returns the character at the specified index (position)	char
//        str.codePointAt() ;   //	Returns the Unicode of the character at the specified index	int
//        str.codePointBefore() ;   //	Returns the Unicode of the character Returns the specified index	int
//        str.codePointCount() ;   //	Returns the number of Unicode values Returns in a string.	int
//        str.compareTo() ;   //	Compares two strings lexicographically	int
//        str.compareToIgnoreCase() ;   //	Compares two strings lexicographically, ignoring case differences	int
//        str.concat() ;   //	Appends a string to the end of another string	String
//        str.contains() ;   //	Checks whether a string contains a sequence of characters	boolean
//        str.contentEquals() ;   //	Checks whether a string contains the exact same Checks of characters of the specified CharSequence or StringBuffer	boolean
//        str.copyValueOf() ;   //	Returns a String that represents the characters of Returns character array	String
//        str.endsWith() ;   //	Checks whether a string ends with the specified character(s)	boolean
//        str.equals() ;   //	Compares two strings. Returns true if the strings are equal, and false if not	boolean
//        str.equalsIgnoreCase() ;   //	Compares two strings, ignoring case considerations	boolean
//        str.format() ;   //	Returns a formatted string using the specified locale, format string, and arguments	String
//        str.getBytes() ;   //	Encodes this String into a sequence of bytes using the named charset, storing the result into a new byte array	byte[]
//        str.getChars() ;   //	Copies characters from a string to an array of chars	void
//        str.hashCode() ;   //	Returns the hash code of a string	int
//        str.indexOf() ;   //	Returns the position of the first found occurrence of specified characters in a string	int
//        str.intern() ;   //	Returns the canonical representation for the string object	String
//        str.isEmpty() ;   //	Checks whether a string is empty or not	boolean
//        str.lastIndexOf() ;   //	Returns the position of the last found occurrence of specified characters in a string	int
//        str.length() ;   //	Returns the length of a specified string	int
//        str.matches() ;   //	Searches a string for a match against a regular expression, and returns the matches	boolean
//        str.offsetByCodePoints() ;   //	Returns the index within this String that is offset from the given index by codePointOffset code points	int
//        str.regionMatches() ;   //	Tests if two string regions are equal	boolean
//        str.replace("f", "g") ;   //	Searches a string for a specified value, and returns a new string where the specified values are replaced	String
//        str.replaceFirst("f", "g") ;   //	Replaces the first occurrence of a substring that matches the given regular expression with the given replacement	String
//        str.replaceAll("f", "g") ;   //	Replaces each substring of this string that matches the given regular expression with the given replacement	String
//        str.split("") ;   //	Splits a string into an array of substrings	String[]
//        str.startsWith(1,9) ;   //	Checks whether a string starts with specified characters	boolean
//        str.subSequence(1,8) ;   //	Returns a new character sequence that is a subsequence of this sequence	CharSequence
//        str.substring(1,5) ;   //	Returns a new string which is the substring of a specified string	String
//        str.toCharArray() ;   //	Converts this string to a new character array	char[]
//        str.toLowerCase() ;   //	Converts a string to lower case letters	String
//        str.toString() ;   //	Returns the value of a String object	String
//        str.toUpperCase() ;   //	Converts a string to upper case letters	String
//        str.trim() ;   //	Removes whitespace from both ends of a string	String
//        str.valueOf(12) ;   //	Returns the string representation of the specified value

    }
}
