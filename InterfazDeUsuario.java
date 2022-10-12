/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.copiadelejemplo1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author crist
 */

public class InterfazDeUsuario {
    Scanner scan; 
    ArrayList<String> colores; 
    public InterfazDeUsuario(){
      scan = new Scanner(System.in); 
      colores = new ArrayList(); 
    }
    
public ArrayList iniciar(){
    for(int i=0; i<5; i++){
        System.out.println("Ingresa color");
        String c = scan.nextLine(); 
        colores.add(c); 
    }
    return colores; 
}

}
