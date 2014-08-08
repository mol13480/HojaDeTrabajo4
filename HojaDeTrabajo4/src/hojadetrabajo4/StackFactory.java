/*
Universidad del Valle de Guatemala
Hoja de Trabajo 3 
Irene Molina 13480
Moises Urias 13015
 */


package hojadetrabajo4;

/**
 * Esta clase selecciona la implementacino que se va a utilizar para una pila,
 * dependiendo de lo que seleccino el usuario. Esta clase utiliza el pratron
 * Factory
 * 
 * @author Irene Molina
 * @author Moises Urias
 */
public class StackFactory<E> {
    
    
    /**
     * Selecciona la implementacion a utilizar dependiendo del parametro que se
     * ingrese
     * 
     * @param entry es un numero con el patro que se desea utilizar
     * @return implementacion. Es la implementacion que se va utilizar
     */
    public Pila<String> getStack(int entry)
    {
        /*La implementacion que se va a devolver*/
        Pila<String> implementacion = null;
        
        /*Si se selecciona el numero 1, entonces se devuelve la implementacion
        * StackArrayList*/
        if (entry == 1)
        {
            implementacion =  StackArrayList.stackarraylist;
        }
        /*Si se selecciona el numero 2, entonces se devuelve la implementacion
        * StackVector*/
        else if(entry == 2)
        {
            implementacion = StackVector.stackvector;
        }
        /*Si se selecciona el numero 3, entonces se devuelve la implementacion
        * Encadenada simple*/
        else if(entry == 3)
        {
            implementacion = StackList.stacklist;
        }
       
        
        /*Se devuelve la implementacion deseada*/
        return implementacion;
    }
    
}
