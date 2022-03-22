/**********************************************************************
@File Factory.java
@Autor: Sebastián José Solorzano Pérez
@Version: 1.0
Última modificación: 20/03/2022

Programa que tendrá las propiedades y métodos de la clase Factory.
**********************************************************************/

import java.util.*;

public class Factory <K, V>
{
    public Map getInstance(int type)
    {
        switch(type)
        {
            case 1 -> 
            {
                return new Hashtable<K,V>();
            }                
                
            case 2 -> 
            {
                return new TreeMap<K,V>();
            }
                
            case 3 -> 
            {
                return new LinkedHashMap<K,V>();
            }
                
        }
        return null;
    }
}
