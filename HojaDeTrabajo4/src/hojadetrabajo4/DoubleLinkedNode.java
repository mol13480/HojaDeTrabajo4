/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hojadetrabajo4;

/**
 *
 * @author Irene
 */
public class DoubleLinkedNode<E> {
    protected E data; 
    protected DoubleLinkedNode<E> nextElement; 
    protected DoubleLinkedNode<E> previousElement;
    
    public DoubleLinkedNode(E object, DoubleLinkedNode<E> next, DoubleLinkedNode<E> previous){
        data= object; 
        nextElement=next; 
        if(nextElement != null){
            nextElement.previousElement=this; 
            previousElement = previous; 
        }
        if(previousElement != null){
            previousElement.nextElement = this; 
        }
    }
    public DoubleLinkedNode(E object){
        this(object,null,null); 
    }
    
    public DoubleLinkedNode<E> next()
   // post: returns reference to next value in list
    {
      return nextElement;
    }

    public void setNext(DoubleLinkedNode<E> next)
   // post: sets reference to new next value
    {
      nextElement = next;
    }
    public E value()
   // post: returns value associated with this element
    {
      return data;
    }
}
