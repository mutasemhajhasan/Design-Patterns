/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mutasem.factory.example;

/**
 *
 * @author Mutasem
 */
public class FactoryClient {

    public static void main(String[] args) throws Exception {
        Connection connection = ConnectionFactory.getConnection("MYSQL");
        //or Connection connection=ConnectionFactory.getConnection("SQLSEVER");
        // or Connection connection=ConnectionFactory.getConnection("ORACLE");
        connection.connect();
    }
}
