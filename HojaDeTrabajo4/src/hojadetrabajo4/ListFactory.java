/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hojadetrabajo4;

/**
 *@author Irene Molinna
 * @author Samuel Urias
 */
public class ListFactory<E>{
    
     public Lista<String> getLista(int entry)
    {
        /*La implementacion que se va a devolver*/
        Lista<String> implementacion = null;
        
        /*Si se selecciona el numero 1, entonces se devuelve la implementacion
        * StackArrayList*/
        if (entry == 1)
        {
            
        }
        /*Si se selecciona el numero 2, entonces se devuelve la implementacion
        * StackVector*/
        else if(entry == 2)
        {
            
        }
        /*Si se selecciona el numero 3, entonces se devuelve la implementacion
        * Encadenada simple*/
        else if(entry == 3)
        {
            
        }
       
        
        /*Se devuelve la implementacion deseada*/
        return implementacion;
    }
    
}
