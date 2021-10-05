/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.util.ArrayList;

/**
 *
 * @author XUÂN THÀNH
 */
public interface QLND_Interface {
    public void Add(User user);
    public void Update(int n,User user);
    public void Remove(int n);
    public ArrayList<User> getList();
    public void setList(ArrayList<User> list);
}
