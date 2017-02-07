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
public class ConnectionFactory {
    public static Connection getConnection(String type) throws Exception {
        if (type.equalsIgnoreCase("MYSQL")) {
            MySQLConnection connection = new MySQLConnection();
            connection.MySQLDriver = "MySQL Driver object";
            connection.MySQLConfig = "Specific Config";
            return connection;
        }
        if (type.equalsIgnoreCase("SQLSERVER")) {
            SqlServerConnection connection = new SqlServerConnection();
            connection.ServerDeriver = "Driver object";
            connection.ServerConfig1 = "Specific Config1";
            connection.ServerConfig2 = "Specific Config2";
            return connection;
        }
        if (type.equalsIgnoreCase("ORACLE")) {
            OracleConnection connection = new OracleConnection();
            connection.OracleDriver = "Driver object";
            connection.OracleConfig1 = "Specific Config";
            connection.OracleConfig2 = "Specific Config2";
            connection.OracleConfig3 = "Specific Config2";
            return connection;
        }
        throw new Exception("Unsupported server");
    }
}

