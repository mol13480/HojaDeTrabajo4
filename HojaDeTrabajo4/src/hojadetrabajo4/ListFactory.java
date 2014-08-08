/*
Universidad del Valle de Guatemala
Hoja de Trabajo 3 
Irene Molina 13480
Moises Urias 13015
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
            implementacion = EncadenadaSimple.encadenadaSimple;
        }
        /*Si se selecciona el numero 2, entonces se devuelve la implementacion
        * Encadenada doble*/
        else if(entry == 2)
        {
            implementacion = EncadenadaDoble.encadenadaDoble;
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