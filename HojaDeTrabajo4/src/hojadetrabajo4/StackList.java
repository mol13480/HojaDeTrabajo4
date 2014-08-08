/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hojadetrabajo4;

import javax.swing.JOptionPane;

/**
 *
 * @author Samuel Urias
 */
public class StackList<E> extends AbstractPila{
    
    /**
     * Este atributo se utiliza para implementar el patron de 
     * diseño Singleton
     */
    public static final StackList stacklist = new StackList();
    private Lista<String> implementacion; 
    /**
     * Constructor de la clase
    */
    private StackList()
    {
        /*Llamada al factory*/
        ListFactory<String> lFactory = new ListFactory<String>();

       
        
        /*Depende si el usuarion ingreso una opcion correcta o no*/
        boolean incorrecta = true;
        
                
        /*Se escoge la implentacion a utilizar, dependiendo de lo que ingrese
        el usuario. El ciclo se repite hasta que el usuario ingrese una opcion
        correcta.
        
        Esta parte del codigo solo crea una implentacion para ArrayList y Vector*/
        while(incorrecta == true) 
        {
            /*El usuario escoge la implentacion que desea utilizar*/
            int opcion1 = Integer.parseInt(JOptionPane.showInputDialog("1.Simplemente encadenada 2.Doblemente encadenada  3.Circular"));

        
            switch (opcion1)
            {
                /*Si el usuario selecciono 1 o 2*/
                case 1: /*Si el usuario escogio arraylist*/
                case 2: /*Si el usuario escogio vector*/
                case 3: /*Si el usuario escogio Lista*/
                {
                    incorrecta = false; /*Sale del ciclo*/
                    implementacion = lFactory.getLista(opcion1);
                    break;
                }
               
                default:
                {
                    incorrecta = true;
                    break;
                }
            }
        }
        System.out.println("Se ha salido del siclo DEBUG");
        // TODO code application logic here
    }

    
    /*Medodos de la interface pila*/
    @Override
    public void push(Object item) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object pop() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object peek() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int size() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
