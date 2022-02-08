/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia11_ej2;

import java.util.ArrayList;

/**
 *
 * @author cabre
 */
public class Guia11_ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList();
        
        String bla = "bla";
        
        al.add(bla);
        
        try {
            System.out.println(al.get(2));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
}
