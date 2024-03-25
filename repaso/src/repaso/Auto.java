/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso;

/**
 *
 * @author ET36
 */
public class Auto {
    private String marca;
    private String modelo;
    private int ano;
    private int km;
    private String color;

    public Auto(String marca, String modelo, int ano, int km, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.km = km;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Auto{" + "marca=" + marca + ", modelo=" + modelo + ", ano=" + ano + ", km=" + km + ", color=" + color + '}';
    }
    
    
}
