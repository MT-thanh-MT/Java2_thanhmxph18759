package lab2;

public class SinhVien {

    private String name, nganhHoc;
    private float diem;

    public SinhVien() {
    }

    public SinhVien(String name, String nganhHoc, float diem) {
        this.name = name;
        this.nganhHoc = nganhHoc;
        this.diem = diem;
    }

    public String getHocLuc() {
        if (this.diem < 3) {
            return "Kém";
        }
        if (this.diem < 5) {
            return "Yếu";
        }
        if (this.diem < 6.5) {
            return "Trung bình";
        }
        if (this.diem < 7.5) {
            return "Khá";
        }
        if (this.diem < 9) {
            return "Giỏi";
        }
        return "Xuất sắc";
    }

    public boolean isBonus() {
        return this.diem >= 7.5;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNganhHoc() {
        return nganhHoc;
    }

    public void setNganhHoc(String nganhHoc) {
        this.nganhHoc = nganhHoc;
    }

    public float getDiem() {
        return diem;
    }

    public void setDiem(float diem) {
        this.diem = diem;
    }

}
