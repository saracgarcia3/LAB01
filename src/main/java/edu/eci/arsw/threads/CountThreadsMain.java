/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.threads;

/**
 *
 * @author hcadavid
 */
public class CountThreadsMain {
    
    public static void main(String[] args){
        CountThread hilo1= new CountThread(2,5);
        CountThread hilo2= new CountThread(6,8);
        CountThread hilo3= new CountThread(11,13);

        hilo1.start();
        hilo2.start();
        hilo3.start();

        System.out.println("Hilos creados e iniciados");
        
    }
    
}

public class countMainThreads {
    public static void main (String[] args){
        CountThread hilo1 = new CountThread (0, 99);
        CountThread hilo2 = new CountThread (99, 199);
        CountThread hilo3 = new CountThread (200, 299);

        hilo1.start();
        hilo2.start();
        hilo3.start();

        System.out.println(Hilos creados e iniciados);
        

    }
}