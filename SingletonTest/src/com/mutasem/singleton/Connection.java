/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mutasem.singleton;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mutasem
 */
public class Connection {
    private static Connection instance = null;
    private Connection() {
        try {
            System.out.println("Construction");
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static Connection getInstance() {
        if (instance == null) {
            instance = new Connection();
        }
        return instance;
    }
    public void connect() {
        System.out.println("Connecting");
    }
}

//class Singleton {
//
//    private static Singleton instance = null;
//
//    private Singleton() {
//    }
//
//    public static Singleton getInstance() {
//        if (instance == null) {
//            instance = new Singleton();
//        }
//        return instance;
//    }
//}
//class Client{
//    public static void main(String[] args) {
//        Singleton singleObject=Singleton.getInstance();
//       // Singleton singleObject=new Singleton(); Error
//    }
//}
