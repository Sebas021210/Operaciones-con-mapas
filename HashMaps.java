/**********************************************************************
@File HashMap.java
@Autor: Sebastián José Solorzano Pérez
@Version: 1.0
Última modificación: 20/03/2022

Programa que tendrá las propiedades y métodos de la clase HashMap.
**********************************************************************/

import java.util.*;

public class HashMaps 
{
    HashMap<String, inventario> Categoria1 = new HashMap<>();
    HashMap<String, inventario> Categoria2 = new HashMap<>();
    HashMap<String, inventario> Categoria3 = new HashMap<>();
    HashMap<String, inventario> Categoria4 = new HashMap<>();
    HashMap<String, inventario> Categoria5 = new HashMap<>();
    HashMap<String, inventario> Categoria6 = new HashMap<>();
    HashMap<String, inventario> Categoria7 = new HashMap<>();

    public void Inventario(){
    //Productos de Mueble de terrazas
    Categoria1.put("Mesas de jardín", new inventario("Producto 1:"));
    Categoria1.put("Sillas de jardín", new inventario("Producto 2:"));
    Categoria1.put("Conjuntos mesas y sillas de jardín", new inventario("Producto 3:"));
    Categoria1.put("Mesas de Ping Pong exteriores", new inventario("Producto 4:"));

    //Sillones de masajes
    Categoria2.put("Cojines y colchonetas de masaje", new inventario("Producto 1:"));
    Categoria2.put("Sillones relax y sofás de masajes", new inventario("Producto 2:"));
    Categoria2.put("Sillones de masajes avanzados", new inventario("Producto 3:"));
    Categoria2.put("Sofás camas", new inventario("Producto 4:"));
    
    //Bebidas
    Categoria3.put("Cerveza tibetana Barley", new inventario("Producto 1:"));
    Categoria3.put("Té frios", new inventario("Producto 2:"));
    Categoria3.put("Cocacola 1 litro", new inventario("Producto 3:"));
    Categoria3.put("Cocacola 2 litros", new inventario("Producto 4:"));

    //Condimentos
    Categoria4.put("Sirope de regaliz", new inventario("Producto 1:"));
    Categoria4.put("Especies Cajun del chef", new inventario("Producto 2:"));
    Categoria4.put("Mezcla Gumbo del chef", new inventario("Producto 3:"));

    //Frutas
    Categoria5.put("Peras secas", new inventario("Producto 1:"));
    Categoria5.put("Pasas", new inventario("Producto 2:"));
    Categoria5.put("Manzana roja", new inventario("Producto 3:"));
    Categoria5.put("Manzana verde", new inventario("Producto 4:"));

    //Carnes
    Categoria6.put("Res", new inventario("Producto 1:"));
    Categoria6.put("Pollo", new inventario("Producto 2:"));
    Categoria6.put("Cerdo", new inventario("Producto 3:"));
    Categoria6.put("Camarones", new inventario("Producto 4:"));
    Categoria6.put("Pescado", new inventario("Producto 5:"));

    //Lacteos
    Categoria7.put("Queso de cabra", new inventario("Producto 1:"));
    Categoria7.put("Queso Manchego", new inventario("Producto 2:"));
    Categoria7.put("Leche descremada", new inventario("Producto 3:"));
    Categoria7.put("Leche deslactosada", new inventario("Producto 4:"));
    Categoria7.put("Leche entera", new inventario("Producto 5:"));

    System.out.println("Categoria 1: Mueble de terraza");
    for(Map.Entry<String, inventario> Entrada: Categoria1.entrySet())
    {
        String Product = Entrada.getKey();
        inventario cate = Entrada.getValue();
        System.out.println(cate+" "+Product);
    }
    System.out.println("Categoria 2: Sillones de masaje");
    for(Map.Entry<String, inventario> Entrada: Categoria2.entrySet()){
        String Product = Entrada.getKey();
        inventario cate = Entrada.getValue();
        System.out.println(cate+" "+Product);
    }
    System.out.println("Categoria 3: Bebidas");
    for(Map.Entry<String, inventario> Entrada: Categoria3.entrySet()){
        String Product = Entrada.getKey();
        inventario cate = Entrada.getValue();
        System.out.println(cate+" "+Product);
    }
    System.out.println("Categoria 4: Condimentos");
    for(Map.Entry<String, inventario> Entrada: Categoria4.entrySet()){
        String Product = Entrada.getKey();
        inventario cate = Entrada.getValue();
        System.out.println(cate+" "+Product);
    }
    System.out.println("Categoria 5: Frutas");
    for(Map.Entry<String, inventario> Entrada: Categoria5.entrySet()){
        String Product = Entrada.getKey();
        inventario cate = Entrada.getValue();
        System.out.println(cate+" "+Product);
    }
    System.out.println("Categoria 6: Carnes");
    for(Map.Entry<String, inventario> Entrada: Categoria6.entrySet()){
        String Product = Entrada.getKey();
        inventario cate = Entrada.getValue();
        System.out.println(cate+" "+Product);
    }
    System.out.println("Categoria 7: Lacteos");
    for(Map.Entry<String, inventario> Entrada: Categoria7.entrySet()){
        String Product = Entrada.getKey();
        inventario cate = Entrada.getValue();
        System.out.println(cate+" "+Product);
        }
    }

    public void BuscarCategoria1()
    {
        System.out.println("Mueble de terraza");
        for(Map.Entry<String, inventario> Entrada: Categoria1.entrySet()){
        String Product = Entrada.getKey();
        inventario cate = Entrada.getValue();
        System.out.println(cate+" "+Product);}
    }
    public void BuscarCategoria2(){
        System.out.println("Sillones de Masaje");
        for(Map.Entry<String, inventario> Entrada: Categoria2.entrySet()){
            String Product = Entrada.getKey();
            inventario cate = Entrada.getValue();
            System.out.println(cate+" "+Product);
        }
    }
    public void BuscarCategoria3(){
        System.out.println("Bebidas");
        for(Map.Entry<String, inventario> Entrada: Categoria3.entrySet()){
            String Product = Entrada.getKey();
            inventario cate = Entrada.getValue();
            System.out.println(cate+" "+Product);
        }
    }
    public void BuscarCategoria4(){
        System.out.println("Condimentos");
        for(Map.Entry<String, inventario> Entrada: Categoria4.entrySet()){
            String Product = Entrada.getKey();
            inventario cate = Entrada.getValue();
            System.out.println(cate+" "+Product);
        }
    }
    public void BuscarCategoria5(){
        System.out.println("Frutas");
        for(Map.Entry<String, inventario> Entrada: Categoria5.entrySet()){
            String Product = Entrada.getKey();
            inventario cate = Entrada.getValue();
            System.out.println(cate+" "+Product);
        }
    }
    public void BuscarCategoria6(){
        System.out.println("Carnes");
        for(Map.Entry<String, inventario> Entrada: Categoria6.entrySet()){
            String Product = Entrada.getKey();
            inventario cate = Entrada.getValue();
            System.out.println(cate+" "+Product);
        }
    }
    public void BuscarCategoria7(){
        System.out.println("Lacteos");
        for(Map.Entry<String, inventario> Entrada: Categoria7.entrySet()){
            String Product = Entrada.getKey();
            inventario cate = Entrada.getValue();
            System.out.println(cate+" "+Product);
        }
    }
}
