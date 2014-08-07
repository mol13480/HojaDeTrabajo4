/*
Universidad del Valle de Guatemala
Hoja de Trabajo 3 
Irene Molina 13480
Moises Urias 13015
 */

package hojadetrabajo4;

import java.util.Vector;


/**
 *
 * @author Irene
 */
public class StackVector<E> extends AbstractPila<E>{
    
    protected Vector<E> data;

    public StackVector() 
    // post: constructs a new, empty stack
    {
        this.data = new Vector<E>();
    }
    
    @Override
    public void push(E item) 
    // post: the value is added to the stack
    //          will be popped next if no intervening push
    {
        data.addElement(item);
    }

    @Override
    public E pop() 
    // pre: stack is not empty
    // post: most recently pushed item is removed and returned
    {
        return data.remove(size() -1);
    }

    @Override
    public E peek() 
    // pre: stack is not empty
    // post: top value (next to be popped) is returned
    {
        return data.get(size() - 1);
    }
    @Override
    public int size() 
    // post: returns the number of elements in the stack
    {
        return data.size();
    }
    /*BORRAR*/
    public void clear()
    {
        data.clear();
    }
}
