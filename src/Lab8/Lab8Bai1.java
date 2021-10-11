/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab8;

import java.util.ArrayList;

/**
 *
 * @author XUÂN THÀNH
 */
public class Lab8Bai1 {
    
    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        
        a.add(1);
        a.add(1,1);
        a.add(true);
        a.add("abcxyz");
        for (Object object : a) {
            System.out.println(object);
        }
        
    }
}
