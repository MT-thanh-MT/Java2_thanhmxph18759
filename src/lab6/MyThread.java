/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author XUÂN THÀNH
 */
public class MyThread implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.print(" " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
    
    public static void main(String[] args) {
        
        Thread t01 = new Thread(new MyThread());
        Thread t02 = new Thread(new MyThread());
        
        t01.setPriority(Thread.MAX_PRIORITY);
        t02.setPriority(Thread.MIN_PRIORITY);
        
        t01.start();
        t02.start();
        
    }
    
}
