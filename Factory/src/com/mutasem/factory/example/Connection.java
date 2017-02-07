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
public abstract class Connection {
    public abstract void connect();
}
class SqlServerConnection extends Connection {
    public Object ServerDeriver, ServerConfig1, ServerConfig2;
    @Override
    public void connect() {
//Sql server connection logic
    }
}
class MySQLConnection extends Connection {
    public Object MySQLDriver,MySQLConfig;

    @Override
    public void connect() {
//MySQL connection logic
    }
}
class OracleConnection extends Connection {
    public Object OracleDriver,OracleConfig1, OracleConfig2, OracleConfig3;
    @Override
    public void connect() {
//Oracle connection logic
    }
}
