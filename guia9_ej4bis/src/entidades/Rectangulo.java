/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import interfaces.CalculosFormas;

/**
 *
 * @author cabre
 */
public class Rectangulo implements CalculosFormas {
    private Integer h;
    private Integer b;

    public Rectangulo() {
    }

    public Rectangulo(Integer h, Integer b) {
        this.h = h;
        this.b = b;
    }

    public Integer getH() {
        return h;
    }

    public void setH(Integer h) {
        this.h = h;
    }

    public Integer getB() {
        return b;
    }

    public void setB(Integer b) {
        this.b = b;
    }

    @Override
    public void calcularArrea() {
        System.out.println("El area es: " + this.b*this.h);
    }

    @Override
    public void calcularPerimetro() {
        System.out.println("El per{imetro del rect{angulo es: " + ((b*2) + (h*2)));
    }
    
    
}
