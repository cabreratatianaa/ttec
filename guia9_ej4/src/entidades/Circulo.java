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
public class Circulo implements CalculoFormas {
    private double r;

    public Circulo() {
    }
    
    public Circulo(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public void calcularArea() {
        System.out.println("El área del círclo es: " + PI * this.r * this.r);
    }

    @Override
    public void calcularPerimetro() {
        System.out.println("El per{imetro del c{ircul es: " + (PI * 2 * this.r));
    }
   
    
}
