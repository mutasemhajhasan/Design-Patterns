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
public class Client {

    public static void main(String[] args) {
        /* A lot of code here */
         
//        MySQLConnection connection=new MySQLConnection();
//        connection.MySQLDriver="MySQL Driver object";
//        connection.MySQLConfig="Specific Config";
        OracleConnection connection = new OracleConnection();
        connection.OracleDriver = "Oracle Driver";
        connection.OracleConfig1 = "Some Value";
        connection.OracleConfig2 = "Some Value";
        connection.OracleConfig3 = "Some Value";
        connection.connect();
        /* ...... */
    }
}
