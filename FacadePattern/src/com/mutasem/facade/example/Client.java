/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mutasem.facade.example;

/**
 *
 * @author Mutasem
 */
public class Client {

    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.drawCircle();
        facade.drawRect();
        facade.drawTri();
    }
//    public static void main(String[] args) {
//        Circle circle = new Circle();
//        Rectangle rectangle = new Rectangle();
//        Triangle triangle = new Triangle();
//        circle.draw();
//        rectangle.draw();
//        triangle.draw();
//    }

}
