/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mutasem.factory.general;

/**
 *
 * @author Mutasem
 */
public class SuperFactory {
    public static Super getSuper(String type){
    if(type.equalsIgnoreCase("Sub1"))
        return new Sub1();
    if(type.equalsIgnoreCase("Sub2"))
        return new Sub2();
    if(type.equalsIgnoreCase("Sub3"))
        return new Sub3();
    return null;
    }
}
