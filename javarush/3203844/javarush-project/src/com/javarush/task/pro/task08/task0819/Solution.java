package com.javarush.task.pro.task08.task0819;

import java.util.Random;

/* 
Амиголятор и Био-диего
*/

import static com.javarush.task.pro.task08.task0819.CosmicAnomaly.*;

public class Solution {

    public static void main(String[] args) {
        Random random = new Random();
        int r ;
        do{
            r = random.nextInt(upperBound - lowerBound) + lowerBound;// 1000 - 331 +331
        } while (r !=nextAttempt(r));
    }
}
