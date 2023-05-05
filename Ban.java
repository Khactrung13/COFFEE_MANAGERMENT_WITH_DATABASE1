/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyHoaDon;

/**
 *
 * @author nguyenkhactrung
 */
public class Ban {
    private int id;
    private String tenBan;
    private String loaiBan;
    private int soNguoiNgoi;
    private String tinhTrang;

    public Ban() {
    }

    public Ban(String tenBan, String loaiBan, int soNguoiNgoi, String tinhTrang) {
        this.tenBan = tenBan;
        this.loaiBan = loaiBan;
        this.soNguoiNgoi = soNguoiNgoi;
        this.tinhTrang = tinhTrang;
    }

    public Ban(int id, String tenBan, String loaiBan, int soNguoiNgoi, String tinhTrang) {
        this.id = id;
        this.tenBan = tenBan;
        this.loaiBan = loaiBan;
        this.soNguoiNgoi = soNguoiNgoi;
        this.tinhTrang = tinhTrang;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenBan() {
        return tenBan;
    }

    public void setTenBan(String tenBan) {
        this.tenBan = tenBan;
    }

    public String getLoaiBan() {
        return loaiBan;
    }

    public void setLoaiBan(String loaiBan) {
        this.loaiBan = loaiBan;
    }

    public int getSoNguoiNgoi() {
        return soNguoiNgoi;
    }

    public void setSoNguoiNgoi(int soNguoiNgoi) {
        this.soNguoiNgoi = soNguoiNgoi;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    @Override
    public String toString() {
        return "Ban{" + "id=" + id + ", tenBan=" + tenBan + ", loaiBan=" + loaiBan + ", soNguoiNgoi=" + soNguoiNgoi + ", tinhTrang=" + tinhTrang + '}';
    }

}
