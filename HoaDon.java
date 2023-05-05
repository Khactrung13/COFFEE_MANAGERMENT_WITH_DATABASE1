/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyHoaDon;

import java.util.Date;

/**
 *
 * @author nguyenkhactrung
 */
public class HoaDon {
    private  int id;
    private String tenNhanvien;
    private String ghiChu;
    private Date ngayLap;
    private String ban;
    private double tongTien;
    private double tienKhachtra;
    private double TienTraKhach;

    public HoaDon() {
    }

    public HoaDon(int id, String tenNhanvien, String ghiChu, Date ngayLap, String ban, double tongTien, double tienKhachtra, double TienTraKhach) {
        this.id = id;
        this.tenNhanvien = tenNhanvien;
        this.ghiChu = ghiChu;
        this.ngayLap = ngayLap;
        this.ban = ban;
        this.tongTien = tongTien;
        this.tienKhachtra = tienKhachtra;
        this.TienTraKhach = TienTraKhach;
    }

    public HoaDon(int id, String tenNhanvien, String ghiChu, String ban, double tongTien, double tienKhachtra, double TienTraKhach) {
        this.id = id;
        this.tenNhanvien = tenNhanvien;
        this.ghiChu = ghiChu;
        this.ban = ban;
        this.tongTien = tongTien;
        this.tienKhachtra = tienKhachtra;
        this.TienTraKhach = TienTraKhach;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenNhanvien() {
        return tenNhanvien;
    }

    public void setTenNhanvien(String tenNhanvien) {
        this.tenNhanvien = tenNhanvien;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public Date getNgayLap() {
        return ngayLap;
    }

    public void setNgayLap(Date ngayLap) {
        this.ngayLap = ngayLap;
    }

    public String getBan() {
        return ban;
    }

    public void setBan(String ban) {
        this.ban = ban;
    }

    public double getTongTien() {
        return tongTien;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }

    public double getTienKhachtra() {
        return tienKhachtra;
    }

    public void setTienKhachtra(double tienKhachtra) {
        this.tienKhachtra = tienKhachtra;
    }

    public double getTienTraKhach() {
        return TienTraKhach;
    }

    public void setTienTraKhach(double TienTraKhach) {
        this.TienTraKhach = TienTraKhach;
    }

    @Override
    public String toString() {
        return "HoaDon{" + "id=" + id + ", tenNhanvien=" + tenNhanvien + ", ghiChu=" + ghiChu + ", ngayLap=" + ngayLap + ", ban=" + ban + ", tongTien=" + tongTien + ", tienKhachtra=" + tienKhachtra + ", TienTraKhach=" + TienTraKhach + '}';
    }
    
    
   
}
