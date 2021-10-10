/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab5;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author XUÂN THÀNH
 */
public class XFileDemo {

    public static void main(String[] args)  {
        
        byte[] data = XFile.read("E:\\hoctap\\JAVA2\\DEMO\\demo_data_file_io.txt");
        System.out.println("đọc thành công");

        XFile.writer("E:\\hoctap\\JAVA2\\DEMO\\demo_file_io.txt", data);
        System.out.println("ghi thành công");

        QLSV list = new QLSV();
        
        SinhVien sv = new SinhVien("thành", "Thiết Kế WEB", 10);
        SinhVien sv1 = new SinhVien("trung", "QTKS", 1);
        SinhVien sv2 = new SinhVien("nhi", "Thiết Kế WEB", 7);
        SinhVien sv3 = new SinhVien("lan", "UDPM", 5);
        
        list.Add(sv);
        list.Add(sv1);
        list.Add(sv2);
        list.Add(sv3);
        
        try {
            XFile.writeQLSV("sinh_vien.txt", list);
        } catch (IOException ex) {
            ex.printStackTrace();
            System.out.println("faile");
            return;
        }
        System.out.println("ok");
        QLSV ListSV = new QLSV();
        try {
            ListSV = (QLSV)XFile.readQLSV("sinh_vien.txt");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
            System.out.println("đọc file thất bại");
        } catch (IOException ex) {
            ex.printStackTrace();
            System.out.println("đọc file thất bại");
        }
        for (SinhVien sinhVien : ListSV.getList()) {
                System.out.println(sinhVien.getName() + sinhVien.getDiem() + sinhVien.getNganhHoc() + sinhVien.getHocLuc() + sinhVien.isBonus());
        }
        System.out.println("ok");
        
        
    }
}
