/*
Universidad del Valle de Guatemala
Hoja de Trabajo 3 
Irene Molina 13480
Jorge Garcia 13175
Moises Urias 13015
 */


package hojadetrabajo4;

/**
 *
 * @author Irene Molina
 * @author Moises Urias
 */
public interface Pila<E> {
   public void push(E item);
   // pre: 
   // post: item is added to stack
   // will be popped next if no intervening push
   
   public E pop();
   // pre: stack is not empty
   // post: most recently pushed item is removed and returned
   
   public E peek();
   // pre: stack is not empty
   // post: top value (next to be popped) is returned
   
   public boolean empty();
   // post: returns true if and only if the stack is empty
   
   public int size();
   // post: returns the number of elements in the stack
   

}
