/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hojadetrabajo4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/**
 *
 * @author Samuel Urias
 */
public class Main {
    
    /*La implementacion deseada*/
    private  Pila<String> implementacion; 
        
     public void Main() {       
        
        /*Llamada al factory*/
        StackFactory<String> sFactory = new StackFactory<String>();

       
        
        /*Depende si el usuarion ingreso una opcion correcta o no*/
        boolean incorrecta = true;
        
                
        /*Se escoge la implentacion a utilizar, dependiendo de lo que ingrese
        el usuario. El ciclo se repite hasta que el usuario ingrese una opcion
        correcta.
        
        Esta parte del codigo solo crea una implentacion para ArrayList y Vector*/
        while(incorrecta == true) 
        {
            /*El usuario escoge la implentacion que desea utilizar*/
            int opcion1 = Integer.parseInt(JOptionPane.showInputDialog("1.ArrayList  2.StackVector  3.List"));

        
            switch (opcion1)
            {
                /*Si el usuario selecciono 1 o 2*/
                case 1: /*Si el usuario escogio arraylist*/
                case 2: /*Si el usuario escogio vector*/
                {
                    incorrecta = false; /*Sale del ciclo*/
                    implementacion = sFactory.getStack(opcion1);
                    break;
                }
                case 3: /*Si el usuario selecciona que quiere utilizar listas*/
                {
                    /*Se dice que lo que ingreso el usuario estubo bien*/
                    incorrecta = false;
                    
                    /*Se le vuelve a solicitar al usuario que ingrese una
                    opcion. Esta vez que tipo de lista desea implementar*/
                    opcion1 = Integer.parseInt(JOptionPane.showInputDialog("1.Simplemente enlazadas  2.Doblemente enlazadas  3.Circular"));
                    
                    /*Si el usuario escogio una opcion correca se ejecuta, de 
                    lo contrario se vuelve a iniciar el ciclo*/
                    if (opcion1 == 1)
                    {
                        /*Lisa simplemente encadenada*/
                        implementacion = sFactory.getStack(3);
                    }
                    else if (opcion1 == 2)
                    {
                        /*Lisa doblemente encadenada*/
                        implementacion = sFactory.getStack(4);
                    }
                    else if (opcion1 == 3)
                    {
                        /*Lista circualr*/
                        implementacion = sFactory.getStack(5);
                    }
                    else
                    {
                        /*Se dice que lo que ingreso el usuario estubo mal y se
                        comienza de nuevo el ciclo*/
                        incorrecta = true;
                    }
                    break;
                }
                /*Si el usuario selecciono algo que no es valido*/
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
    
    
//metodo para leer el archivo de texto 
    public void leerArchivo(Pila<String> imp){
    
         Pila<String> miStack = imp;
       
         /*Declaracion de variables*/
        String micadena = null;
        String linea=null;
        
        
        FileReader fr;
        BufferedReader br;
                
        
        try
        {
            /*Lectura del archivo*/
            fr = new FileReader("datos.txt");
            br = new BufferedReader(fr);
            
            while ((micadena = br.readLine())!=null)
            {
                linea = micadena;
                System.out.println(micadena);
            }
          
        }
        
        /*Error en caso de que no se pueda leer el archivo*/
        catch(Exception e)
        {
            System.out.println("Hubo un error leyendo el archivo. No se"
                    + "encuentra el archivo 'datos.txt'");
            
            
             /*Si hubo error cargando el archivo, termina el programa*/
            System.exit(0);
        }
        
        /*Despues de leer el archivo*/
        /*Se crea un string tokenizer*/
        System.out.println(linea);
        StringTokenizer tokens = new StringTokenizer(linea," ");
        
        
        
        
        /*Se revisan los caracteres del archivo uno por uno*/
        while (tokens.hasMoreTokens())
        {
            
            /*Se almacena el caracter en un string para comprarlo
             ya sea con un '+' o '-' o '*' o '/'*/
            String token;
            token = tokens.nextToken();
            
            System.out.println("El token actual es: " + token);
            /*Si es un caracter de operacion se sacan dos elementos de la pila,
             se almacenan en variables y depues se operan*/
            if ((token.equals("+")) ||(token.equals("-"))|| (token.equals("*"))||(token.equals("/")))
            {
                  int operando1 = 0;
                  int operando2 = 0;
                  int suma;
                  
                  operando1 = Integer.parseInt(miStack.pop());
                  operando2 = Integer.parseInt(miStack.pop());
                  
                  if (token.equals("+"))
                  {
                      suma = operando1 + operando2;
                      miStack.push(String.valueOf(suma));
                  }
                  else if (token.equals("-"))
                  {
                      suma = operando1 - operando2;
                      miStack.push(String.valueOf(suma));
 
                  }
                  else if (token.equals("*"))
                  {
                      suma = operando1 * operando2;
                      miStack.push(String.valueOf(suma));
 
                  }
                  else
                  {
                      suma = operando1 / operando2;
                      miStack.push(String.valueOf(suma));
 
                  }
            }
            else 
            {
                /*Si no es un caracter de operacion, se asume que es un numero y
             se almacena en la pila*/
                miStack.push(token);
            }
        }
        
        String moi = miStack.pop();
        System.out.println(moi);
        JOptionPane.showMessageDialog(null, "El resultado de las operaciones fue:\n" + moi, "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
    //metodo para leer el archivo

    
    
  
    
}