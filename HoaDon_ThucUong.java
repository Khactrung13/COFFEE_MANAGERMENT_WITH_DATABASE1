/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyHoaDon;

/**
 *
 * @author nguyenkhactrung
 */
public class HoaDon_ThucUong {
    private int stt;
    private int id;
    private String tenThucUong;
    private String donViTinh;
    private String SoLuong;
    private String DonGia;
    private String thanhTien;

    public HoaDon_ThucUong() {
    }
    public HoaDon_ThucUong(int stt, int id, String tenThucUong, String donViTinh, String SoLuong, String DonGia, String thanhTien) {
        this.stt = stt;
        this.id = id;
        this.tenThucUong = tenThucUong;
        this.donViTinh = donViTinh;
        this.SoLuong = SoLuong;
        this.DonGia = DonGia;
        this.thanhTien = thanhTien;
    }

    public HoaDon_ThucUong(int id, String tenThucUong, String donViTinh, String SoLuong, String DonGia, String thanhTien) {
        this.id = id;
        this.tenThucUong = tenThucUong;
        this.donViTinh = donViTinh;
        this.SoLuong = SoLuong;
        this.DonGia = DonGia;
        this.thanhTien = thanhTien;
    }
    
    public int getStt() {
        return stt;
    }

    public void setStt(int stt) {
        this.stt = stt;
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

    public String getDonViTinh() {
        return donViTinh;
    }

    public void setDonViTinh(String donViTinh) {
        this.donViTinh = donViTinh;
    }

    public String getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(String SoLuong) {
        this.SoLuong = SoLuong;
    }

    public String getDonGia() {
        return DonGia;
    }

    public void setDonGia(String DonGia) {
        this.DonGia = DonGia;
    }

    public String getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(String thanhTien) {
        this.thanhTien = thanhTien;
    }


    @Override
    public String toString() {
        return "HoaDon_ThucUong{" + "stt=" + stt + ", id=" + id + ", tenThucUong=" + tenThucUong + ", donViTinh=" + donViTinh + ", SoLuong=" + SoLuong + ", DonGia=" + DonGia + ", thanhTien=" + thanhTien + '}';
    }
    
}