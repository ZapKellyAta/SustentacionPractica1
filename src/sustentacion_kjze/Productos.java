/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sustentacion_kjze;

import java.util.ArrayList;
import java.util.Scanner;

public class Productos 
{
    public static String NombreP, NombrePBuscar;
    static Productos Pro = new Productos();
    public static int CantidadP,i=0;
    public int j=0, Vendidos = 0, unid;;
    public static double ValorP;
    static Scanner keyboard = new Scanner(System.in);
    
    //Suponiendo se tienen 100 objetos
    public Productos arrayObjetos[] = new Productos[100];
    static ArrayList <Productos> arrayObjetos2= new ArrayList <Productos> ();
    
    public String getNombreP() {
        return NombreP;
    }

    public static void setNombreP(String NombreP) {
        Productos.NombreP = NombreP;
    }

    public String getNombrePBuscar() {
        return NombrePBuscar;
    }

    public static void setNombrePBuscar(String NombrePBuscar) {
        Productos.NombrePBuscar = NombrePBuscar;
    }

    public int getCantidadP() {
        return CantidadP;
    }

    public static void setCantidadP(int CantidadP) {
        Productos.CantidadP = CantidadP;
    }

    public  double getValorP() {
        return ValorP;
    }

    public static void setValorP(double ValorP) {
        Productos.ValorP = ValorP;
    }

    public int getVendidos() {
        return Vendidos;
    }

    public void setVendidos(int Vendidos) {
        this.Vendidos = Vendidos;
    }

    
    //Se crea el constructor
    public Productos(String NombreP, int CantidadP, double ValorP) {

    }

    Productos() {
    }
    
    public void AgregarP()
    {
        System.out.println("Ingrese el nombre del producto");
        String NombreP =keyboard.next(); 
        Pro.setNombreP(NombreP);
        System.out.println("Cantidad de unidades de este producto");
        int Cantidad = keyboard.nextInt();
        Pro.setCantidadP(Cantidad);
        System.out.println("Valor por unidad del producto");
        double Valor = keyboard.nextDouble();
        Pro.setValorP(Valor);
        arrayObjetos2.add(Pro);
        arrayObjetos[j] = new Productos(NombreP,Cantidad,Valor);
        j++;
        System.out.println("Producto agregado correctamente");
        //System.out.println(arrayObjetos[j].getNombreP());
    }
    
    public void BuscarP()
    {
        //System.out.println(arrayObjetos[j].getNombreP());
        System.out.println("Ingrese el nombre del producto que desea buscar");
        String nombrePBuscar = keyboard.next();
        
        for(i = 0;i<=arrayObjetos2.size();i++)
        {
            //System.out.println(arrayObjetos[i].getNombreP());
            if(arrayObjetos2.get(i).getNombreP().equals(nombrePBuscar))
            {
                System.out.println("Producto encontrado satisfactoriamente");
                System.out.println("Nombre del producto " + arrayObjetos2.get(i).getNombreP());
                System.out.println("Cantidad del producto " + arrayObjetos2.get(i).getCantidadP());
                System.out.println("Valor del producto " + arrayObjetos2.get(i).getValorP());
                break;
            }
            else
            {
                System.out.println("Producto NO encontrado");
                break;
            }
        }
    }
    
    public void EliminarP()
    {
        System.out.println("Ingrese el nombre del producto que desea buscar y eliminar");
        String nombrePBuscar = keyboard.next();
        
        for(i = 0;i<arrayObjetos2.size();i++)
        {
            if(arrayObjetos2.get(i).equals(nombrePBuscar))
            {
                arrayObjetos2.remove(i);
                System.out.println("El producto fue eliminado correctamente");
            }
            else
            {
                System.out.println("Producto NO encontrado");
                break;
            }
        }
    }
    
    public void Mostrar()
    {
        if(arrayObjetos2.size() < 1)
        {
           System.out.println("No hay ningun producto");
        }
        else
        {
            System.out.println("Los productos almacenados son: \n");
            for (Productos Pro : arrayObjetos2)
            {
                System.out.println("Producto encontrado satisfactoriamente");
                System.out.println("Nombre del producto " + arrayObjetos2.get(i).getNombreP());
                System.out.println("Cantidad del producto " + arrayObjetos2.get(i).getCantidadP());
                System.out.println("Valor del producto " + arrayObjetos2.get(i).getValorP());
            }
        }
    }
    
    public void Ventas()
    {
        System.out.println("Ingrese el nombre del producto que desea comprar");
        String nombrePBuscar = keyboard.next();
        //recorro el array list de productos
        for(i = 0;i<arrayObjetos2.size();i++)
        {
            if(arrayObjetos2.get(i).equals(nombrePBuscar))
            {
                boolean k = true;
                System.out.println("La cantidad del producto buscado es: ");
                System.out.println("Cantidad : "+arrayObjetos2.get(i).getCantidadP());
                if(arrayObjetos2.get(i).getCantidadP() == 0 )
                {
                    System.out.println("No hay unidades disponibles del producto: \n");
                    break;
                }
                do{
                    System.out.println("Cuantas unidades desea comprar?:");
                    unid = keyboard.nextInt();
                    if(unid > arrayObjetos2.get(i).getCantidadP())
                    {
                        System.out.println("La cantidad deseada es mayor a la disponible para vender \n");
                    }
                    else if(unid <= arrayObjetos2.get(i).getCantidadP()){
                        Pro.Vendidos+=unid;
                        Pro.unid-=unid;
                        System.out.println("Compra realizada exitosamente");
                        k = false;
                    }
                }while(k == true);
            }
            else
            System.out.println("El producto no fue encontrado");
        }  
    }
    
    public void Ganancias()
    {
        long total = 0;
        System.out.println("La cantidad de productos vendidos son: ");
        for (Productos Pro : arrayObjetos2)
        {
            System.out.println("Nombre del producto " + arrayObjetos2.get(i).getNombreP());
            System.out.println("Cantidad vendida del producto " + arrayObjetos2.get(i).getVendidos());
            System.out.println("Valor del producto " + arrayObjetos2.get(i).getValorP());
            total += arrayObjetos2.get(i).getVendidos()*arrayObjetos2.get(i).getValorP(); 
        }
        System.out.println("El total de ganancias es : "+total);
    }
}
