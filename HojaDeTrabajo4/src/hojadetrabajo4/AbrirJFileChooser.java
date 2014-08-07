/*
Universidad del Valle de Guatemala
Hoja de Trabajo 3 
Irene Molina 13480
Moises Urias 13015
 */

package hojadetrabajo4;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

/**
 *
 * @author Moises Urias
 */
public class AbrirJFileChooser extends JFrame {
    private JButton botonFile;
    private String path;

    public AbrirJFileChooser() {
    }
   
    public void Abrir() {
        JFileChooser elegir = new JFileChooser();
        int opcion = elegir.showOpenDialog(botonFile);

        //Si presionamos el boton ABRIR en pathArchivo obtenemos el path del archivo
        if (opcion == JFileChooser.APPROVE_OPTION) {
            path = elegir.getSelectedFile().getPath(); //Obtiene path del archivo
            String nombrthArchivo = elegir.getSelectedFile().getPath(); //Obtiene path del archivo
            String nombre = elegir.getSelectedFile().getName(); //obtiene nombre del archivo
            String path = elegir.getSelectedFile().getPath();
            System.out.println("El nombre del archivo es: "+ nombre);
            System.out.println("El path del archivo es: "+ path);
        }
        
    }

    public String getPath() {
        return path;
    }
}