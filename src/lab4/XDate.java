/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author XUÂN THÀNH
 */
public class XDate {
    private static SimpleDateFormat sdf = new SimpleDateFormat();
    
    public static Date parse(String tex, String pattern) throws RuntimeException{
        try {
            sdf.applyPattern(pattern);
            return sdf.parse(tex);
        } catch (Exception e) {
            
            throw new RuntimeException(e);
        }
    }
    
    public static Date parse(String tex) throws RuntimeException{
        return XDate.parse(tex, "dd-MM-yyyy");
    }
}
