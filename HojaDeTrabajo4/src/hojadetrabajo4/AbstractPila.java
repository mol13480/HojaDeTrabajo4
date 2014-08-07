/*
Universidad del Valle de Guatemala
Hoja de Trabajo 3 
Irene Molina 13480
Moises Urias 13015
 */


package hojadetrabajo4;

import java.util.ArrayList;

/**
 *
 * @author Irene
 */
public abstract class AbstractPila<E> implements Pila<E>{
   
    public AbstractPila(){
        
    } 
    public boolean empty()
    // post: returns true if and only if the stack is empty
    {
            return size() == 0;
    }
}
