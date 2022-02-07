/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9_ej4;

import entidades.Circulo;
import entidades.Rectangulo;

/**
 *
 * @author cabre
 */
public class Guia9_ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circulo cr = new Circulo(3);
        Rectangulo rl = new Rectangulo(2, 3);
        
        cr.calcularArea();
        cr.calcularPerimetro();
        
        rl.calcularArea();
        rl.calcularPerimetro();
    }
    
}
