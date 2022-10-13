/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import modelo.*;

public class DEMO1 {

    public static void main(String[] args) {
        Negocio obj=new Negocio();
        for(Articulo x:obj.lisArt())
            System.out.println(x.getDesp());
    }
    
}
