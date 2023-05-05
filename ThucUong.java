package QuanLyThucUongg;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author nguyenkhactrung
 */
public class ThucUong {

    private int id;
    private String tenThucUong;
    private String loaiThucUong;
    private String donViTinh;
    private int soLuong;
    private double donGia;
    private String tongTien;

    public ThucUong(String tenThucUong, String donViTinh, double donGia) {
        this.tenThucUong = tenThucUong;
        this.donViTinh = donViTinh;
        this.donGia = donGia;
    }

    public ThucUong(String tenThucUong, String donViTinh) {
        this.tenThucUong = tenThucUong;
        this.donViTinh = donViTinh;
    }

    public ThucUong(String tenThucUong, String donViTinh, int soLuong, double donGia, String tongTien) {
        this.tenThucUong = tenThucUong;
        this.donViTinh = donViTinh;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.tongTien = tongTien;
    }
    
    public String getTongTien() {
        return tongTien;
    }

    public void setTongTien(String tongTien) {
        this.tongTien = tongTien ;
    }
    public ThucUong() {
    }

    public ThucUong(int id, String tenThucUong, String loaiThucUong, String donViTinh, int soLuong, double donGia) {
        this.id = id;
        this.tenThucUong = tenThucUong;
        this.loaiThucUong = loaiThucUong;
        this.donViTinh = donViTinh;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public ThucUong(String tenThucUong, String loaiThucUong, String donViTinh, int soLuong, double donGia) {
        this.tenThucUong = tenThucUong;
        this.loaiThucUong = loaiThucUong;
        this.donViTinh = donViTinh;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public ThucUong(String tenThucUong, String loaiThucUong, String donViTinh, double donGia) {
        this.tenThucUong = tenThucUong;
        this.loaiThucUong = loaiThucUong;
        this.donViTinh = donViTinh;
        this.donGia = donGia;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenThucUong() {
        return tenThucUong;
    }

    public void setTenThucUong(String tenThucUong) {
        this.tenThucUong = tenThucUong;
    }

    public String getLoaiThucUong() {
        return loaiThucUong;
    }

    public void setLoaiThucUong(String loaiThucUong) {
        this.loaiThucUong = loaiThucUong;
    }

    public String getDonViTinh() {
        return donViTinh;
    }

    public void setDonViTinh(String donViTinh) {
        this.donViTinh = donViTinh;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    @Override
    public String toString() {
        return "ThucUong{" + "id=" + id + ", tenThucUong=" + tenThucUong + ", loaiThucUong=" + loaiThucUong + ", donViTinh=" + donViTinh + ", soLuong=" + soLuong + ", donGia=" + donGia + '}';
    }
}
