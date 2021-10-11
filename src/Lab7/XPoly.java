package Lab7;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author XUÂN THÀNH
 */
public class XPoly {
    
    @Deprecated
    public static boolean isCardNumber(String number, JFrame a) {
        String s = number;
        boolean chan = true;
        try {
            int n = Integer.parseInt(s);
            int tong = 0;
            while (n > 0) {
                int a1 = n % 10;
                n = n / 10;
                tong += a1;
            }
            if (tong % 2 == 0) {
                return chan = true;
            }
            if (tong % 2 == 1) {
                return chan = false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(a, "số không hợp lệ hoặc để trống!");
             
            
        }

        return chan;
    }

}
