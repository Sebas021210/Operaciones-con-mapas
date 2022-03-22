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
    static String archivo;
    
    public static void main(String[] args)
    {
        //Propiedades//
        Vista vista = new Vista();
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
                    System.out.println("Hola");
                    vista.LeerArchivo("C:\\Users\\S.Solorzano\\Documents\\Universidad\\Segundo Año\\Algoritmos y Estructura de Datos\\Hoja de trabajo #6\\ListadoProducto.txt");
                    //System.out.println(archivo);
                    while (opcion2 != 7)
                    {
                        opcion2 = vista.MenuOpciones2();
                        switch (opcion2)
                        {
                            case 1:
                                System.out.println("Hola");
                                break;
                                
                            case 2:
                                System.out.println("Hola");
                                break;
                            
                            case 3:
                                System.out.println("Hola");
                                break;
                            
                            case 4:
                                System.out.println("Hola");
                                break;
                            
                            case 5:
                                System.out.println("Hola");
                                break;
                            
                            case 6:
                                System.out.println("Hola");
                                break;
                            
                            case 7:
                                opcion2 = 7;
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
                    vista.LeerArchivo("C:\\Users\\S.Solorzano\\Documents\\Universidad\\Segundo Año\\Algoritmos y Estructura de Datos\\Hoja de trabajo #6\\ListadoProducto.txt");
                    //System.out.println(archivo);
                    while (opcion3 != 7)
                    {
                        opcion3 = vista.MenuOpciones2();
                        switch (opcion3)
                        {
                            case 1:
                                System.out.println("Hola");
                                break;
                                
                            case 2:
                                System.out.println("Hola");
                                break;
                            
                            case 3:
                                System.out.println("Hola");
                                break;
                            
                            case 4:
                                System.out.println("Hola");
                                break;
                            
                            case 5:
                                System.out.println("Hola");
                                break;
                            
                            case 6:
                                System.out.println("Hola");
                                break;
                            
                            case 7:
                                opcion2 = 7;
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
                    vista.LeerArchivo("C:\\Users\\S.Solorzano\\Documents\\Universidad\\Segundo Año\\Algoritmos y Estructura de Datos\\Hoja de trabajo #6\\ListadoProducto.txt");
                    //System.out.println(archivo);
                    while (opcion4 != 7)
                    {
                        opcion4 = vista.MenuOpciones2();
                        switch (opcion4)
                        {
                            case 1:
                                System.out.println("Hola");
                                break;
                                
                            case 2:
                                System.out.println("Hola");
                                break;
                            
                            case 3:
                                System.out.println("Hola");
                                break;
                            
                            case 4:
                                System.out.println("Hola");
                                break;
                            
                            case 5:
                                System.out.println("Hola");
                                break;
                            
                            case 6:
                                System.out.println("Hola");
                                break;
                            
                            case 7:
                                opcion2 = 7;
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
