/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.util.ArrayList;

/**
 *
 * @author XUÂN THÀNH
 */
public interface DAO {
    public void insert(Product sp);
    public void update(int n,Product sp);
    public void delete(int n);
    public ArrayList<Product> getList();
    public void setList(ArrayList<Product> list);
}
