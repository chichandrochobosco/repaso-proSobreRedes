
package repaso;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    Usuario admin = new Usuario("root", "123");
    private static ArrayList<Auto> runRun = new ArrayList();
    
   public static void menu(){
        Scanner in = new Scanner(System.in);
        int ingreso;
        System.out.println("Bienvenido, 1-para cargar stock 2-comprar 3-salir: ");
        ingreso = in.nextInt();
        in.nextLine();
        
        if(ingreso==1){
            String nom, con;
            System.out.println("ingrese nombre: ");
            nom = in.nextLine();
            System.out.println("ingrese contraseña: ");
            con = in.nextLine();
            
            int i=0;
            while(i == 0){
                
                if("root".equals(nom) && "123".equals(con)){
                    cargarStock();
                    i++;
                }else{
                    System.out.println("ingrese nuevamente el nombre: ");
                    nom = in.nextLine();
                    System.out.println("ingrese nuevamente la contraseña: ");
                    con = in.nextLine();
                }
                
            }
            
        }else if(ingreso==2){
            comprar();
        }else if(ingreso ==3){
            System.exit(0);
        }else if(ingreso !=1 && ingreso !=2 && ingreso !=3){
            while(ingreso !=1 && ingreso !=2 && ingreso !=3){
                System.out.println("Ingrese nuevamente la opcion:");
                menu();
            }
        }
        
    }
    
    public static void cargarStock(){
        int ingresar=0; 
        
        do{
        Scanner in = new Scanner(System.in);
        String marca, modelo, color;
        int ano, km, id;
        double precio;
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
        System.out.println("Ingrese precio del auto");
        precio = in.nextDouble();
        System.out.println("Ingrese id del auto");
        id = in.nextInt();
        in.nextLine();
        
        Auto  a = new Auto(marca, modelo, km, ano, color, precio, id);
        runRun.add(a);
        
        System.out.println("Para seguir cargando ingrese 0, para salir, cualquier otro numero: ");
        ingresar = in.nextInt();
        in.nextLine();
        }while(ingresar==0);
        
        System.out.println("Almacen de autos: ");
        for(/*int i=0; i<runRun.size();i++*/Auto a : runRun){
            System.out.println((a));
        }
        System.out.println(".............................");
        menu();
    }
    
    public static void comprar(){
        Scanner in = new Scanner(System.in);
        int ingresar =0, id;
        String nombre;
        
        System.out.println("Ingrese nombre: ");
        nombre = in.nextLine();
        Venta v = new Venta(nombre);
        do{
            System.out.println("Almacen de autos: ");
            for(/*int i=0; i<runRun.size();i++*/Auto a : runRun){
            System.out.println((a));
            }
            System.out.println("Ingrese id del vehiculo a comprar: ");
            id = in.nextInt();
            in.nextLine();
            
            for(Auto a : runRun){
                
                if(a.getId() == id){
                    v.carrito(a);
                    //runRun.remove(a);
                }     
            }
            
            System.out.println("0-seguir compra | otro numero-terminar: ");
            ingresar = in.nextInt();
            in.nextLine();
            
        }while(ingresar==0);
        
        System.out.println("El valor total de la venta es de: "+v.facturar());
        runRun.clear();
        menu();
    }
    public static void main(String[] args) {
        menu();
    }
    
}
