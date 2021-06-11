package Entity;

public class StudentMark extends Student{
    
    public String tenMonHoc;
    public float diemChuyenCan;
    public float diemGiuaKy;
    public float diemThi;
    public float diemTongKet;
    public String xepLoai;
    public int maMonHoc;

    public StudentMark() {
    }

    public StudentMark(String tenMonHoc, float diemTongKet, float diemChuyenCan, float diemGiuaKy, float diemthi, String xepLoai, int maMonHoc, int id, String name, String gender, String date, String lop, String address) {
        super(id, name, gender, date, lop, address);
        this.tenMonHoc = tenMonHoc;
        this.diemTongKet = diemTongKet;
        this.diemChuyenCan = diemChuyenCan;
        this.diemGiuaKy = diemGiuaKy;
        this.diemThi = diemthi;
        this.xepLoai = xepLoai;
        this.maMonHoc = maMonHoc;
    }

    public Object[] toObjects(){
        return new Object[] {this.id, this.name, this.tenMonHoc, this.diemChuyenCan, this.diemGiuaKy, this.diemThi, this.diemTongKet, this.xepLoai, this.maMonHoc};
    }
    
    public String getTenMonHoc() {
        return tenMonHoc;
    }

    public void setTenMonHoc(String tenMonHoc) {
        this.tenMonHoc = tenMonHoc;
    }

    public float getDiemChuyenCan() {
        return diemChuyenCan;
    }

    public void setDiemChuyenCan(String diemChuyenCan) {
        this.diemChuyenCan = Float.parseFloat(diemChuyenCan);
    }

    public float getDiemGiuaKy() {
        return diemGiuaKy;
    }

    public void setDiemGiuaKy(String diemGiuaKy) {
        this.diemGiuaKy = Float.parseFloat(diemGiuaKy);
    }

    public float getDiemThi() {
        return diemThi;
    }

    public void setDiemThi(String diemThi) {
        this.diemThi = Float.parseFloat(diemThi);
    }

    public String getXepLoai() {
        return xepLoai;
    }

    public void setXepLoai(String xepLoai) {
        this.xepLoai = xepLoai;
    }

    public int getMaMonHoc() {
        return maMonHoc;
    }

    public void setMaMonHoc(String maMonHoc) {
        this.maMonHoc = Integer.parseInt(maMonHoc);
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = Integer.parseInt(id);
    }

    @Override
    public String getName() {
        return name;
    }

    
    @Override
    public void setName(String name) {
        this.name = name;
    }

    public float getDiemTongKet() {
        return diemTongKet;
    }

    public void setDiemTongKet(String diemTongKet) {
        this.diemTongKet = Float.parseFloat(diemTongKet);
    }
    
    
}
