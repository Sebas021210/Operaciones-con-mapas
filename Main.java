/********************************************************************
@File Main.java 
@Autor: Sebastián José Solorzano Pérez
@Version: 1.0
Última modificación: 20/03/2022

Driver program que servira como controlador e implementa el menú 
de opciones para la implementación de MAP. 
********************************************************************/

public class Main 
{   
    public static void main(String[] args)
    {
        //Propiedades//
        Vista vista = new Vista();
        HashMaps HashMap = new HashMaps();
        ProductosAgregados productos = new ProductosAgregados();
        vista.bienvenida();
        int opcion = 0;
        int opcion2 = 0;
        int opcion3 = 0;
        int opcion4 = 0;

        while (opcion != 4)
        {
            opcion = vista.MenuOpciones();
          
            switch (opcion) 
            {
                case 1:
                    //HashMap
                    System.out.println("HashMap");
                    while (opcion2 != 5)
                    {
                        opcion2 = vista.MenuOpciones2();
                        switch (opcion2)
                        {
                            case 1:
                                productos.Agregar();
                                break;
                                
                            case 2:
                                productos.CompraTotal();
                                break;
                            
                            case 3:
                                productos.BuscarProducto();
                                break;
                            
                            case 4:
                                HashMap.Inventario();
                                break;
                            
                            case 5:
                                opcion2 = 5;
                                System.out.println("Se regresara al menú principal");
                                break;
                            
                            default:
                                vista.opcionInvalida();
                                break;
                        }
                    }
                    break;                
            
                case 2:
                    //TreeMap
                    System.out.println("Hola");
                    while (opcion3 != 5)
                    {
                        opcion3 = vista.MenuOpciones2();
                        switch (opcion3)
                        {
                            case 1:
                                productos.Agregar();
                                break;
                                
                            case 2:
                                productos.CompraTotal();
                                break;
                            
                            case 3:
                                productos.BuscarProducto();
                                break;
                            
                            case 4:
                                HashMap.Inventario();
                                break;
                            
                            case 5:
                                opcion3 = 5;
                                System.out.println("Se regresara al menú principal");
                                break;
                            
                            default:
                                vista.opcionInvalida();
                                break;
                        }
                    }
                    break;
            
                case 3:
                    //LinkedHashMap
                    System.out.println("Hola");
                    while (opcion4 != 5)
                    {
                        opcion4 = vista.MenuOpciones2();
                        switch (opcion4)
                        {
                            case 1:
                                productos.Agregar();
                                break;
                                
                            case 2:
                                productos.CompraTotal();
                                break;
                            
                            case 3:
                                productos.BuscarProducto();
                                break;
                            
                            case 4:
                                HashMap.Inventario();
                                break;
                            
                            case 5:
                                opcion2 = 5;
                                System.out.println("Se regresara al menú principal");
                                break;
                            
                            default:
                                vista.opcionInvalida();
                                break;
                        }
                    }
                    break;
            
                case 4:
                    vista.despedida();
                    break;
                
                default:
                    vista.opcionInvalida();
                    break;
            }
        }
    } 
}
