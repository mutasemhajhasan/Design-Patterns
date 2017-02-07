/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mutasem.nosinglton;

/**
 *
 * @author Mutasem
 */
public class Clients {

    public static void main(String[] args) {
        Connection client1 = new Connection();
        Connection client2 = new Connection();
        Connection client3 = new Connection();
        Connection client4 = new Connection();
        client1.connect();
        client2.connect();
        client3.connect();
        client4.connect();
    }
}
