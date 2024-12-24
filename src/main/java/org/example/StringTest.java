package org.example;

import java.sql.SQLOutput;

public class StringTest {
    public static void main(String[] args) {

        String s = "abc";
        String s1 = new String("abc");
        System.out.println(s==s1);
        System.out.println(s.equals(s1));

        System.out.println("===================================");
        StringBuffer sb = new StringBuffer("fruit");
        StringBuffer sb1 = new StringBuffer("fruit");

        System.out.println(sb==sb1);
        System.out.println(sb.equals(sb1));
    }
}
