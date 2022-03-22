/**********************************************************************
@File Vista.java
@Autor: Sebastián José Solorzano Pérez
@Version: 1.0
Última modificación: 20/03/2022

Programa que mostrará a los usuarios el menú de opciones para la
implementación de MAP.
**********************************************************************/

import java.util.*;
import java.io.*;

public class Vista 
{
    //Propiedades
    String texto;
    private Scanner scan;
    Scanner entrada = new Scanner(System.in);
	
    //Métodos 
	
    //Constructor
    public Vista()
    {
        scan = new Scanner(System.in);
        texto = "";
    }

    public void bienvenida()
    {
        System.out.println("\nBienvendi@ a la implementacion de MAP");
    }

    public int MenuOpciones()
    {
            int op;
            String s = "\nQue desea utilizar?\n" +
                        "1. HashMap\n" +
                        "2. TreeMap\n" +
                        "3. LinkedHashMap\n" +
                        "4. Salir\n";
            System.out.println(s);
            op = scan.nextInt();

            return op;
    }

    public String LeerArchivo(String direccion)
    {
        try
        {
            BufferedReader bf = new BufferedReader(new FileReader(direccion));
            String temp = "";
            String bfRead;
            while((bfRead = bf.readLine()) != null)
            {
                temp = temp + bfRead;
            }
            
            texto = temp;
        }
        catch(Exception e)
        {
            System.err.println("No se encontro el archivo");
        }
        return texto;
    }
    
    public int MenuOpciones2()
    {
            int op2;
            String s = "\nQue desea hacer?\n" +
                        "1. Agregar  un  producto\n" +
                        "2. Mostrar  los  productos agregados\n" +
                        "3. Buscar productos y la categoría de todo el inventario\n" +
                        "4. Mostrar productos y la categoría de todo el inventario\n" +
                        "5. Regresar\n";
            System.out.println(s);
            op2 = scan.nextInt();

            return op2;
    }
    
    public void opcionInvalida()
    {
            System.out.println("Ha elegido una opcion invalida.");
    }

    public void despedida()
    {
            System.out.println("Adios, que tenga feliz dia!\n");
    }
}
