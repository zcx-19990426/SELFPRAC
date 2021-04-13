package com.iweb.test;

import java.io.*;

public class Copy {
    public static void main(String[] args) throws IOException {
        File f1 = new File("C:\\Users\\Administrator\\Desktop\\艾瑞\\java\\a.txt");
        File f2 = new File("C:\\Users\\Administrator\\Desktop\\艾瑞\\java\\b.txt");

        FileReader fr = new FileReader(f1);
        BufferedReader br = new BufferedReader(fr);
        FileWriter fw = new FileWriter(f2);
        BufferedWriter bw = new BufferedWriter(fw);
        String msg=null;

        while((msg=br.readLine())!=null){
            bw.write(msg);
            bw.newLine();
            bw.flush();
        }
    }
}
