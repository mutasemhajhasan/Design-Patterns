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
public class AuthorizationHandler extends Handler{

    public AuthorizationHandler(Handler next) {
        super(next);
    }

    @Override
    public void handle(Request request) {
        //Authorization logic
        next.handle(request);
    }
    
}
