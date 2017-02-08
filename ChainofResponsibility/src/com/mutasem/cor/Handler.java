/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mutasem.cor;

/**
 *
 * @author Mutasem
 */
public abstract class Handler {
    public abstract void handle(Request request);
    protected Handler next;

    public Handler(Handler next) {
        this.next = next;
    }
    
}
