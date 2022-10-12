/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.copiadelejemplo1;

import java.util.ArrayList;

/**
 *
 * @author crist
 */
public final class Tablero {
    ArrayList<Square> cuadros1; 
    ArrayList<Square> cuadros2; 
    ArrayList<String> colores; 
    int contador=0; 
    
    public Tablero(ArrayList<String> colores){
        colores= new ArrayList(); 
        this.colores = colores;
        cuadros1 = new ArrayList(); 
        cuadros2 = new ArrayList(); 
        tableroInicial(); 
        crearCuadros();
        crearCuadrosN();
        
    }
    
    public Tablero(){ 
        cuadros1 = new ArrayList(); 
        cuadros2 = new ArrayList(); 
        tableroInicial(); 
        crearCuadros();
        crearCuadrosN();
        
    }
    
    public void crearCuadros(){
        int altura = 0; 
        int base = 0; 
        for(int x=0;  x<6; x++){
            altura = altura +15; 
            base = 0; 
            for (int y=0; y<15; y++){
                base = base +15; 
            Square s = new Square(altura,base); 
            cuadros1.add(s);   
            }
        }
    }
    
        public void crearCuadrosN(){
        int altura = 100; 
        int base = 0; 
        for(int x=0;  x<6; x++){
            altura = altura +15; 
            base = 0; 
            for (int y=0; y<15; y++){
                base = base +15; 
            Square s = new Square(altura,base); 
            s.changeColor("black");
            cuadros2.add(s);   
            }
        }
    }
        
        public void modificarColores(){
            for(int i=0; i<5; i++){
                if(colores.get(i)=="NE"){
                    cuadros1.get(contador).changeColor("black");
                }
                if(colores.get(i)=="RE"){
                    cuadros1.get(contador).changeColor("red");
                }
                if(colores.get(i)=="AZ"){
                    cuadros1.get(contador).changeColor("blue");
                }
                if(colores.get(i)=="AM"){
                    cuadros1.get(contador).changeColor("yellow");
                }
                if(colores.get(i)=="NE"){
                    cuadros1.get(contador).changeColor("white");
                    contador = contador++; 
                }
                
            }
        } 
        
                public void modificarColores(ArrayList<String>colores1){
            for(int i=0; i<5; i++){
                if(colores1.get(i)=="NE"){
                    cuadros1.get(contador).changeColor("black");
                }
                if(colores1.get(i)=="RE"){
                    cuadros1.get(contador).changeColor("red");
                }
                if(colores1.get(i)=="AZ"){
                    cuadros1.get(contador).changeColor("blue");
                }
                if(colores1.get(i)=="AM"){
                    cuadros1.get(contador).changeColor("yellow");
                }
                if(colores1.get(i)=="NE"){
                    cuadros1.get(contador).changeColor("white");
                }
                
            }
        } 
        
        public void tableroInicial(){
           Square s = new Square(300,300);
           s.changeColor("yellow");
           s.changeSize(300);
        }
}
