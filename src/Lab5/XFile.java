package Lab5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class XFile {

    public static byte[] read(String path) {
        try {
            FileInputStream fis = new FileInputStream(path);
            int n = fis.available();
            byte[] data = new byte[n];
            fis.read(data);

            fis.close();

            return data;

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    public static void writer(String path, byte[] data) {
        try {
            FileOutputStream fos = new FileOutputStream(path);

            fos.write(data);

            fos.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    public static QLSV readQLSV(String path) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path));
        QLSV ob = new QLSV();
        ob.setList((ArrayList<SinhVien>) ois.readObject());

        ois.close();
        return ob;

    }

    public static void writeQLSV(String path, QLSV ob) throws FileNotFoundException, IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path, false));

        oos.writeObject(ob.getList());

        oos.close();

    }

    public static void writeObject(String path, Object ob) throws FileNotFoundException, IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path, false));
        
        oos.writeObject(ob);
        
        oos.close();
        
    }
    
    public static Object readObject( String path) throws FileNotFoundException, IOException, ClassNotFoundException{
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path));
        
        Object ob = ois.readObject();
        
        ois.close();
        
        return ob;
    }
}
