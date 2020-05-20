package set;
import javax.swing.*;
import java.awt.*;

public class Interfaz {

	public static void main(String args[]) {        

		// Creando el Marco        
		JFrame frame = new JFrame("Chat Frame");       
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       
		frame.setSize(400, 400);        

		// Creando MenuBar y agregando componentes   
		JMenuBar mb = new JMenuBar();       
		JMenu m1 = new JMenu("ARCHIVO");       
		JMenu m2 = new JMenu("Ayuda");       
		mb.add(m1);       
		mb.add(m2);       
		JMenuItem m11 = new JMenuItem("Abrir");       
		JMenuItem m22 = new JMenuItem("Guardar como");       
		m1.add(m11);       
		m1.add(m22);        

		// Creando el panel en la parte inferior y agregando componentes       
		JPanel panel = new JPanel(); // el panel no est� visible en la salida      
		JLabel label = new JLabel("Introducir texto");       
		JTextField tf = new JTextField(10); // acepta hasta 10 caracteres        
		JButton send = new JButton("Enviar");       
		JButton reset = new JButton("Restablecer");       
		panel.add(label); // Componentes agregados usando Flow Layout     
		panel.add(label); // Componentes agregados usando Flow Layout      
		panel.add(tf);       
		panel.add(send);       
		panel.add(reset);     

		// �rea de texto en el centro    
		JTextArea ta = new JTextArea();        

		// Agregar componentes al marco.      
		frame.getContentPane().add(BorderLayout.SOUTH, panel);       
		frame.getContentPane().add(BorderLayout.NORTH, mb);       
		frame.getContentPane().add(BorderLayout.CENTER, ta);       
		frame.setVisible(true);   
	}
}


