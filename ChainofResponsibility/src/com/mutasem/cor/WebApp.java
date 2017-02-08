/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mutasem.cor;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mutasem
 */
public class WebApp {

    AuthorizationHandler authorizationHandler;
    AuthenticationHandler authenticationHandler;
    AntiDoSHandler antiDoSHandler;

    public WebApp() {

    }

    private void startUp() {
        authorizationHandler = new AuthorizationHandler(null);
        authenticationHandler = new AuthenticationHandler(authorizationHandler);
        antiDoSHandler = new AntiDoSHandler(authenticationHandler);
    }
    public void recieve(Request request){
    antiDoSHandler.handle(request);
    }

}
