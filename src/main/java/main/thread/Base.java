/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.thread;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SMART
 */
public class Base {
    
    private static volatile int a = 0;
    
    public static int  getA(){
        return a;
    }
    
    public synchronized static void incA(){
        a++;
    }
}
