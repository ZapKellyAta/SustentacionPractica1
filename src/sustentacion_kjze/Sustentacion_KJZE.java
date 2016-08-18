/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sustentacion_kjze;

import java.util.Scanner;

/**
 *
 * @author practi12
 */
public class Sustentacion_KJZE extends Productos
{
    //static Productos Pro = new Productos(); //Creo instancia del objeto
    //Variables a utilizar
    static Scanner keyboard = new Scanner(System.in);
    static String NombreP, NombrePBuscar;
    static int UnidadesP;
    static double ValorP;
    
    public static void main(String[] args) 
    {
        int i=0;
        int option=0;
        while(i!=7)
        {
            System.out.println("Bienvenido a Peluchitos.com, ingrese la opcion que desea consultar");
            System.out.println("1 Agregar Producto");
            System.out.println("2 Buscar Producto");
            System.out.println("3 Eliminar Producto");
            System.out.println("4 Mostrar Inventario");
            System.out.println("5 Mostrar Ventas");
            System.out.println("6 Mostrar Ganancias");
            
            
            option = keyboard.nextInt();
            
            switch(option)
            {
                case 1:
                    //Se llama a la funcion para ingresar los datos
                    Pro.AgregarP();
                    break;
                    
                    case 2:
                    //Se llama a la funcion para ingresar los datos
                    Pro.BuscarP();
                    break;
                        
                    case 3:
                    //Se llama a la funcion para ingresar los datos
                    Pro.EliminarP();
                    break;
                    
                    case 4:
                    //Se llama a la funcion para ingresar los datos
                    Pro.Mostrar();
                    break;
                    case 5:
                    //Se llama a la funcion para ingresar los datos
                    Pro.Ventas();
                    break;
                    case 6:
                    //Se llama a la funcion para ingresar los datos
                    Pro.Ganancias();
                    break;
            }     
        }

    }
}
