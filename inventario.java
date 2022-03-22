/**********************************************************************
@File Inventario.java
@Autor: Sebastián José Solorzano Pérez
@Version: 1.0
Última modificación: 20/03/2022

Programa que tendrá las propiedades y métodos de la clase inventario.
**********************************************************************/

import java.util.*;

public class inventario 
{
    public String total;
    public int totalInt;

    public inventario(String n)
    {
        total = n;
    }   

    public inventario(int totalProductos) 
    {
        totalInt = totalProductos;
    }

    @Override
    public String toString()
    {
    return total;
    }
}
