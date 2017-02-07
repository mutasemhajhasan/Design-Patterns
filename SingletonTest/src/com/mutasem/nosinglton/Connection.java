package com.mutasem.nosinglton;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mutasem
 */
public class Connection {

    private static Connection instance = null;

    public Connection() {
        try {
            System.out.println("Construction");
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    

    public void connect() {
        System.out.println("Connecting");
    }
}
