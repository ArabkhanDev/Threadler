/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.thread;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SMART
 */
public class MyRunnable2 implements Runnable{
    private int index;
    public MyRunnable2(int index){
        this.index = index;
    }
    @Override
    public void run() {
        System.out.println(index + "runable ise dusdu ve 3 saniye gozleyecek...");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        
        System.out.println("runnable isi bitirdi");
    }
    
}
