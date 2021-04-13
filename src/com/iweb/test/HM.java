package com.iweb.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HM{
    public static void main(String[] args) {
        HashMap<String,String> hm = new HashMap();
        hm.put("zcx","123");
        hm.put("lzy","111");
        hm.put("mht","222");
        hm.put("wc","333");
        hm.put("qt","444");
        Iterator<Map.Entry<String, String>> iterator = hm.entrySet().iterator();
        while (iterator.hasNext()){
            HashMap.Entry entry = iterator.next();
            String name= (String) entry.getKey();
            String pass = (String) entry.getValue();
            System.out.println("用户名："+name+",密码为："+pass);
        }
    }
}
