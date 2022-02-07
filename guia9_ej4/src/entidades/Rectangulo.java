/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import interfaces.CalculoFormas;

/**
 *
 * @author cabre
 */
public class Rectangulo implements CalculoFormas{
    private double b;
    private double h;

    public Rectangulo() {
    }

    public Rectangulo(double b, double h) {
        this.b = b;
        this.h = h;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }
    
    @Override
    public void calcularArea() {
        System.out.println("El {area del rect{angulo es: " + this.b * this.h);
    }

    @Override
    public void calcularPerimetro() {
        System.out.println("El per{imetro del rect{angulo es: " + ((this.b * 2) + (this.h * 2)));
    }
    
}
