/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.seriesnumericasjava;

/**
 *
 * @author fer
 */
public class Serie {
    public void imprimirSerie(){
        int a = 0; //2 numeros antes
        int b = 1; //1 numero antes
        int var = 1;
        System.out.println(b);
        for(int i=0; i<20; i++ )
        {
            System.out.println(var);  
            a = b;
            b = var;
            var = a +b;
        }
    }
    
}
