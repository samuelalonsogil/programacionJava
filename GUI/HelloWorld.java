package GUI;

import javax.swing.*;
import java.awt.*;

public class HelloWorld {
    public static void main(String[] args) {
        /*nueva ventana y titulo*/
        JFrame frame = new JFrame("Ventana hola mundo");

        /*cierre*/
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        /*creo un label*/
        JLabel label = new JLabel("Hola mundo");

        /*añado la etiqueta al panel de contenido*/
        frame.getContentPane().add(label);

        /*empacas el frame*/
        frame.pack();

        /*tunear window*/
        frame.setBackground(Color.blue);
        frame.setBounds(250,100,600,100);

        frame.setLocationRelativeTo(null);

        /*hazla visible*/
        frame.setVisible(true);
    }
}
