/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repaso;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ET36
 */

public class Repaso {
    Usuario admin = new Usuario("root", "123");
    private static ArrayList<Auto> runRun = new ArrayList();
    
   public static void menu(){
        Scanner in = new Scanner(System.in);
        int ingreso;
        System.out.println("Bienvenido, 1-para cargar stock 2-comprar: ");
        ingreso = in.nextInt();
        in.nextLine();
        
        if(ingreso==1){
            String nom, con;
            System.out.println("ingrese nombre: ");
            nom = in.nextLine();
            System.out.println("ingrese contraseña: ");
            con = in.nextLine();
            if("root".equals(nom) && "123".equals(con)){
                cargarStock();
            }
            
            
        }
        
    }
    
    public static void cargarStock(){
        int ingresar=0; 
        
        do{
        Scanner in = new Scanner(System.in);
        String marca, modelo, color;
        int ano, km;
        System.out.println("Ingrese marca del auto");
        marca = in.nextLine();
        System.out.println("Ingrese modelo del auto");
        modelo = in.nextLine();
        System.out.println("Ingrese kilometraje del auto");
        km = in.nextInt();
        in.nextLine();
        System.out.println("Ingrese ano del auto");
        ano = in.nextInt();
        in.nextLine();
        System.out.println("Ingrese color del auto");
        color = in.nextLine();
        
        Auto  a = new Auto(marca, modelo, km, ano, color);
        runRun.add(a);
        
        System.out.println("Para seguir cargando ingrese 0, para salir, cualquier otro numero: ");
        ingresar = in.nextInt();
        in.nextLine();
        }while(ingresar==0);
        
        System.out.println("Almacen de autos: ");
        for(/*int i=0; i<runRun.size();i++*/Auto a : runRun){
            System.out.println((a));
        }
        
    }
    public static void main(String[] args) {
        
        
        menu();
    }
    
}
