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
 * @author Irene
 */
public class StackList<E> implements Pila<E> {
   
    
    
   

	public StackArrayList()
	// post: constructs a new, empty stack
	{
		data = new StackList<E>();
	}

	public void push(E item)
	// post: the value is added to the stack
	//          will be popped next if no intervening push
	{
		data.add(item);
	}

	public E pop()
	// pre: stack is not empty
	// post: most recently pushed item is removed and returned
	{
		return data.remove(size()-1);
	}

	public E peek()
	// pre: stack is not empty
	// post: top value (next to be popped) is returned
	{
		return data.get(size() - 1);
	}
	
	public int size()
	// post: returns the number of elements in the stack
	{
		return data.size();
	}
  
	public boolean empty()
	// post: returns true if and only if the stack is empty
	{
		return size() == 0;
	}
}
