/*
Universidad del Valle de Guatemala
Hoja de Trabajo 3 
Irene Molina 13480
Moises Urias 13015
 */
//obtenido de Java Structures


package hojadetrabajo4;

/**
 *
 * @author Irene
 */
public class EncadenadaSimple<E> extends AbstractLista<E> {
    protected int count; // list size
    protected Node<E> head; // ref. to first element

    public EncadenadaSimple()
    // post: generates an empty list
    {
        head = null;
        count = 0;
    }
   
    public int size()
    // post: returns number of elements in list
    {
        return count;
    }
  
    public void addFirst(E value)
    // post: value is added to beginning of list
    {
        // note order that things happen:
        // head is parameter, then assigned
        head = new Node<E>(value, head);
        count++;
    }
  
    public E removeFirst()
    // pre: list is not empty
    // post: removes and returns value from beginning of list
    {
        Node<E> temp = head;
        head = head.next(); // move head down list
        count--;
        return temp.value();
    }
  
    public E getFirst()
    // pre: list is not empty
    // post: returns first value in list
    {
        return head.value();
    }
  
    public void addLast(E value)
    // post: adds value to end of list
    {
        // location for new value
        Node<E> temp = new Node<E>(value,null);
        if (head != null)
        {
            // pointer to possible tail
            Node<E> finger = head;
            while (finger.next() != null)
            {
                finger = finger.next();
            }
		 
        finger.setNext(temp);
        } else head = temp;
	  
            count++;
	  
    }
  
    public E removeLast()
        // pre: !isEmpty()
        // post: returns and removes value from tail of list
    {
        Node <E> finger = head; 
        Node <E> previous = null; 
        while (finger.next() != null){
            previous = finger; 
            finger = finger.next();
        }
        if(previous == null){
            head = null; 
        }
        else{
            previous.setNext(null);
        }
        count --; 
        return finger.value(); 
       
    }
    
}
