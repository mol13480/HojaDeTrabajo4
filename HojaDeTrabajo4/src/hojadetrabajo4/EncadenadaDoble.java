/*
Universidad del Valle de Guatemala
Hoja de Trabajo 3 
Irene Molina 13480
Moises Urias 13015
 */

package hojadetrabajo4;

/**
 *jkl
 * @author Irene
 */
public class EncadenadaDoble<E> extends AbstractLista<E> {
    protected int count;
    protected DoubleLinkedNode<E> head;
    protected DoubleLinkedNode<E> tail;
    
    public EncadenadaDoble(){
        head = null;
        tail = null;
        count = 0;
    }
    
    public void addFirst(E value)
        // pre: value is not null
        // post: adds element to head of list
    {
        // construct a new element, making it head
        head = new DoubleLinkedNode<E>(value, head, null);
        // fix tail, if necessary
        if (tail == null) tail = head;
        count++;
}


    public void addLast(E value)
    // pre: value is not null
    // post: adds new value to tail of list
    {
        // construct new element
        tail = new DoubleLinkedNode<E>(value, null, tail);
        // fix up head
        if (head == null) head = tail;
        count++;
    }


    public E removeLast()
    // pre: list is not empty
    // post: removes value from tail of list
    {
        DoubleLinkedNode<E> temp = tail;
        tail = tail.previous();
        if (tail == null) {
            head = null;
        } else {
             tail.setNext(null);
        }
        count--;
        return temp.value();
    }
    
    public int size(){
        return count; 
    }
}
