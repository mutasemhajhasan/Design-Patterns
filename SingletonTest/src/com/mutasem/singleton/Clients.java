/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mutasem.singleton;

/**
 *
 * @author Mutasem
 */
public class Clients {

    public static void main(String[] args) {
        Connection client1 = Connection.getInstance();
        Connection client2 = Connection.getInstance();
        Connection client3 = Connection.getInstance();
        Connection client4 = Connection.getInstance();
        client1.connect();
        client2.connect();
        client3.connect();
        client4.connect();
    }
}
