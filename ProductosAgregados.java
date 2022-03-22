/******************************************************************************
@File ProductosAgregados.java
@Autor: Sebastián José Solorzano Pérez
@Version: 1.0
Última modificación: 20/03/2022

Programa que tendrá las propiedades y métodos de la clase ProductosAgregados.
******************************************************************************/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProductosAgregados 
{
    Scanner scan = new Scanner(System.in);
    HashMaps hashmap = new HashMaps();
    HashMap<String, inventario> ProductoHashMap = new HashMap<>();
    String categoria = "";
    String producto = "";


    public void Agregar(){
        System.out.println("Productos agregados");
        System.out.println("Ingrese el numero de categoria: ");
        int category = scan.nextInt();
        System.out.println("Ingrese el numero de producto: ");
        int product = scan.nextInt();
        System.out.println("¿Cuantos desea agregar?");
        int Total = scan.nextInt();

        switch (category) {
            case 1:
                categoria = "Mueble de terraza";
                switch (product) {
                    case 1:
                        producto = "Mesas de jardín";
                        break;
                    case 2:
                        producto = "Sillas de jardín";
                        break;
                    case 3:
                        producto = "Conjuntos mesas y sillas de jardín";
                        break;
                    case 4:
                        producto = "Mesas de Ping Pong exteriores";
                        break;
                    default:
                        System.out.println("Solo existen 4 productos");
                        break;
            }
            break;

            case 2:
                categoria = "Sillones de masaje";
                switch (product) {
                    case 1:
                        producto = "Cojines y colchonetas de masaje";
                        break;
                    case 2:
                        producto = "Sillones relax y sofás de masajes";
                        break;
                    case 3:
                        producto = "Sillones de masajes avanzados";
                        break;
                    case 4:
                        producto = "Sofás camas";
                        break;
                    default:
                        System.out.println("Solo existen 4 productos");
                        break;
                }
            break;

            case 3:
                categoria = "Bebidas";
                switch (product) {
                    case 1:
                        producto = "Cerveza tibetana Barley";
                        break;
                    case 2:
                        producto = "Té frios";
                        break;
                    case 3:
                        producto = "Cocacola 1 litro";
                        break;
                    case 4:
                        producto = "Cocacola 2 litros";
                        break;
                    default:
                        System.out.println("Solo existen 4 productos");
                        break;
                }
            break;

            case 4:
                categoria = "Condimentos";
                switch (product) {
                    case 1:
                        producto = "Sirope de regaliz";
                        break;
                    case 2:
                        producto = "Especies Cajun del chef";
                        break;
                    case 3:
                        producto = "Mezcla Gumbo del chef";
                        break;
                    default:
                        System.out.println("Solo existen 3 productos");
                        break;
                }
            break;

            case 5:
                categoria = "Frutas";
                switch (product) {
                    case 1:
                        producto = "Peras secas";
                        break;
                    case 2:
                        producto = "Pasas";
                        break;
                    case 3:
                        producto = "Manzana roja";
                        break;
                    case 4:
                        producto = "Manzana verde";
                        break;
                    default:
                        System.out.println("Solo existen 4 productos");
                        break;
                }
            break;

            case 6:
                categoria = "Carnes";
                switch (product) {
                    case 1:
                        producto = "Res";
                        break;
                    case 2:
                        producto = "Pollo";
                        break;
                    case 3:
                        producto = "Cerdo";
                        break;
                    case 4:
                        producto = "Camarones";
                        break;
                    case 5:
                        producto = "Pescado";
                        break;
                    default:
                        System.out.println("Solo existen 5 productos");
                        break;
                }
            break;

            case 7:
                categoria = "Lacteos";
                switch (product) {
                    case 1:
                        producto = "Queso de cabra";
                        break;
                    case 2:
                        producto = "Queso Manchego";
                        break;
                    case 3:
                        producto = "Leche descremada";
                        break;
                    case 4:
                        producto = "Leche deslactosada";
                        break;
                    case 5:
                        producto = "Leche entera";
                        break;
                    default:
                        System.out.println("Solo existen 5 productos");
                        break;
                }
            break;

            default:
                System.out.println("Solo existen 7 categorias");
                System.exit(0);
        }
        System.out.println("Se agregaron"+" "+Total+" "+producto+" de Categoria: "+categoria);
        String TotalProductosStr = Integer.toString(Total);
        ProductoHashMap.put(producto,new inventario(TotalProductosStr));
    }
    public void CompraTotal(){
        System.out.println("Total");
        for(Map.Entry<String, inventario> Entrada: ProductoHashMap.entrySet()){
            String MapProduct = Entrada.getKey();
            inventario cate = Entrada.getValue();
            System.out.println(cate+" "+producto);
        }
    }
    public void BuscarProducto(){
        System.out.println("Busca Productos");
        System.out.println("1. Ver el inventario Completo\n" +
                           "2.Buscar por categoria");
        int Buscar = scan.nextInt();
        
        if(Buscar ==1){
            hashmap.Inventario();
        }
        else if(Buscar ==2){
            System.out.println("En que categoria desea buscar: ");
            int Buscar2 = scan.nextInt();
            switch (Buscar2) {
                case 1:
                    hashmap.BuscarCategoria1();
                    break;
                case 2:
                    hashmap.BuscarCategoria2();
                    break;
                case 3:
                    hashmap.BuscarCategoria3();
                    break;
                case 4:
                    hashmap.BuscarCategoria4();
                    break;
                case 5:
                    hashmap.BuscarCategoria5();
                    break;
                case 6:
                    hashmap.BuscarCategoria6();
                    break;
                case 7:
                    hashmap.BuscarCategoria7();
                    break;
                default:
                    System.out.println("Solo existen 7 categorias");
                    break;
            }
        } 
    }
}
