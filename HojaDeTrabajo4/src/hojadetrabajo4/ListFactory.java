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
    
     public Lista<E> getLista(int entry)
    {
        /*La implementacion que se va a devolver*/
        Lista<E> implementacion = null;
        
        /*Si se selecciona el numero 1, entonces se devuelve la implementacion
        * Encadenada simple*/
        if (entry == 1)
        {
            
        }
        /*Si se selecciona el numero 2, entonces se devuelve la implementacion
        * Encadenada doble*/
        else if(entry == 2)
        {
            
        }
        /*Si se selecciona el numero 3, entonces se devuelve la implementacion
        * Circular*/
        else if(entry == 3)
        {
            implementacion = Circular.circular;
        }
       
        
        /*Se devuelve la implementacion deseada*/
        return implementacion;
    }
    
}
