/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.thread;

import java.util.concurrent.Callable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SMART
 */
public class MyRunnable implements Runnable {

    private int index;

    public MyRunnable(int index) {
        this.index = index;
    }

    @Override
    public void run() {
        doIt();
    }

   

    private void doIt() {
        System.out.println(index + ".runable ise dusdu ve 3 saniye gozleyecek...");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

        System.out.println("runnable isi bitirdi");
    }

}
