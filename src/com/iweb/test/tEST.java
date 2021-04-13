package com.iweb.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class tEST {
    public static void main(String[] args) {
        String s1 = new String("amit");
        System.out.println(s1.replace('m', 'r'));
        System.out.println(s1);
        String s3 = "arit";
        String s4 = "arit";
        String s2 = s1.replace('m', 'r');
        System.out.println(s2);
        System.out.println(s2 == s3);
        System.out.println(s3 == s4);
        Set set= new HashSet();
        set.add("aaa");
        set.add("bbb");
        set.add("aaa");
        System.out.println(set.size());
    }
}
