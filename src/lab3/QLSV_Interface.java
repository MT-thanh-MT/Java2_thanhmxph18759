/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.util.ArrayList;

/**
 *
 * @author XUÂN THÀNH
 */
public interface QLSV_Interface {
    public void Add(SinhVien sv);
    public void Update(int n,SinhVien sv);
    public void Remove(int n);
    public ArrayList<SinhVien> getList();
    public void setList(ArrayList<SinhVien> list);
    public ArrayList<SinhVien> orderByDiem();
    public ArrayList<SinhVien> orderByName();
    
}
