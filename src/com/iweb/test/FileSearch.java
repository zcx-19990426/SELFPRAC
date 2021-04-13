package com.iweb.test;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class FileSearch {
    List<File> listall = new LinkedList<>();
    public List<File> list(String str){
        File fr = new File(str);
        File[] files = fr.listFiles();
        List<File> ls = new LinkedList<>();
        for (File fpo:files){
            if (fpo.isDirectory()){
                list(fpo.getAbsolutePath());
            }else{
                ls.add(fpo);
                listall.addAll(ls);
            }
        }
        return listall;
    }

    public static void main(String[] args) {
        String str = "C:\\Users\\Administrator\\Desktop\\艾瑞\\java";
        FileSearch fs = new FileSearch();
        fs.list(str);
        for (File fl:fs.listall
             ) {
            System.out.println(fl);
        }
    }
}
