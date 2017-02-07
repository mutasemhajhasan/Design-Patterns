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
public class Facade {
    Circle circle;
    Triangle triangle;
    Rectangle rectangle;

    public Facade() {
        circle=new Circle();
        triangle=new Triangle();
        rectangle=new Rectangle();
    }
    public void drawCircle(){
    circle.draw();
    }
    public  void drawRect(){
    rectangle.draw();
    }
    public  void drawTri(){
    triangle.draw();
    }
}
