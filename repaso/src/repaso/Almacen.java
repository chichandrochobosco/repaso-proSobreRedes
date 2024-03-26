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
public class Almacen {
    private ArrayList<Auto> almacen;

    public Almacen() {
        this.almacen = new ArrayList();
    }
    
    public void cargarAlmacen(Auto a){
        almacen.add(a);
    }
    
    public void mostrarAlmacen(){
        for(Auto a : almacen){
            System.out.println(a);
        }
    }

    public ArrayList<Auto> getAlmacen() {
        return almacen;
    }

    public void setAlmacen(ArrayList<Auto> almacen) {
        this.almacen = almacen;
    }
    
    

    @Override
    public String toString() {
        return "almacen= " + almacen;
    }
    
    
}
