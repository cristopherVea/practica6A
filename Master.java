/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.copiadelejemplo1;

/**
 *
 * @author crist
 */
import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Master extends JFrame implements ActionListener
{
   
    /**
     *
     * @param colores
     */
    
    Tablero tablero;
    public Master(ArrayList<String> colores) { 
        tablero = new Tablero(colores); 
         
         
        JTextField Resultado = new JTextField("hola");
        JTextField t12, t22;
        t12=new JTextField("Welcome!");
        add(t12);
        t12.setBounds(10, 10, 10, 10);
        setTitle("MasterMind by JB");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        //setSize(1200, 1200);
        setLocationRelativeTo(null);
        setVisible(true);
        add(tablero);
    }
   
        public Master() { 
        tablero = new Tablero(); 
         
         
        JTextField Resultado = new JTextField("hola");
        JTextField t12, t22;
        //t12=new JTextField("Welcome!");
        //add(t12);
        //t12.setBounds(10, 10, 10, 10);
        setTitle("MasterMind by JB");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        //setSize(1200, 1200);
        setLocationRelativeTo(null);
        setVisible(true);
        add(tablero);
    }

        public void cambiarColor(){
            tablero.modificarColores();
        }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        //
    }

    private void add(Tablero tablero) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
