package com.iweb.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Hat {
    public void sort(int n){
        List<Integer> lise=new ArrayList<>();
        int change=0;
        for (int i = 0; i < n; i++) {
            lise.add(rand());
        }
        Collections.sort(lise);
        System.out.println(lise.get(2));
    }

    public int rand(){
        return new Random().nextInt(10000);
    }

    public static void main(String[] args) {
        int n=50;
        new Hat().sort(n);
    }
}
