package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        Pattern val = Pattern.compile("..g");
            Matcher match = val.matcher("adg");
            //boolean bool = match.matches();
            //System.out.println(bool);

            System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "sdfvsuidfofikldf"));
            System.out.println(Pattern.matches("[a-zA-Z0-9]{3,}", "sdfvsuidfofikldf"));
            System.out.println(Pattern.matches("[a-zA-Z0-9]{3,10}", "sdfvsuidfofikldf"));
            System.out.println(Pattern.matches("[6789]{1}[0-9]{9}", "8105457812"));
            System.out.println(Pattern.matches("[6789]{1}[0-9]{9}", "3878540909"));
            System.out.println(Pattern.matches("[6789]{1}[0-9]{9}", "28766657700"));
            System.out.println(Pattern.matches("[9][1][ ]{1}[0-9]{10}", "91 9876543210"));
            System.out.println(Pattern.matches("[9][1][ ]{1}[789]{1}[0-9]{9}", "91 78766543210"));
            System.out.println(Pattern.matches("[A-Z]{1}[a-z]{2,}", "Go"));
            System.out.println(Pattern.matches("[A-Z]{1}[a-z]{2,}", "Go"));
            String st ="My name is Name"+"Allen is Good";
            String regex="Allen";
            String replace="Name";
            //System.out.println(Pattern.matches("[A]{1}[a-z]{2,4}", replacement "Krish"));
            //System.out.println(Pattern.matches("[abc]{1}[a-z]{2,4}", replacement "Krish"));
            Pattern name=Pattern.compile(st);
            Matcher mat=name.matcher(replace);
            st=mat.replaceAll(replace);
            System.out.println(st);
            System.out.println(Pattern.matches("[a-zA-Z0-9.]{1,}[@]{1}[a-zA-Z]{1,}[.][c]{1}[o]{1}[m]{1}","goutham.y@bridgelabz.com"));

        }
}
