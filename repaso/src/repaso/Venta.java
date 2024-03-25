/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso;

import java.util.ArrayList;

/**
 *
 * @author ET36
 */
public class Venta {
    private String nombre;
    private ArrayList<Auto> venta;

    public Venta(String nombre) {
        this.nombre = nombre;
        this.venta = new ArrayList();
    }
    
    public void carrito(Auto auto){
        venta.add(auto);
    }
}
