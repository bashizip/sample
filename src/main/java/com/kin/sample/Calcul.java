/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kin.sample;

/**
 *
 * @author Patrick Bashizi <bashizip@gmail.com>
 */
public class Calcul {

    public int somme(int a, int b) {

        return a + b;
    }

    public double racineCaree(double v) {
        return Math.sqrt(v);
    }

    public static void main(String[] args) {
        Calcul calcul = new Calcul();
        int res = calcul.somme(-10, 60);
        System.out.println("result: " + res);
    }

}
