/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kin.sample;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Patrick Bashizi <bashizip@gmail.com>
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("Formation JavaEE");
      
        System.out.println("20 Participants");
       
        System.out.println("Nous sommes le "
                + new SimpleDateFormat("dd MM yyyy").format(new Date()));

    }
}
