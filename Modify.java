/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyHoaDon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Locale;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nguyenkhactrung
 */
public class Modify {

    public static List<Ban> findAll() {
        List<Ban> List = new ArrayList<>();
        Connection connection = null;
        Statement statement = null;

        try {
            //lay tat ca danh 
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/QuanLyBan", "root", "");

            //query
            String sql = "select * from BAN";
            statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                Ban ban = new Ban(resultSet.getInt("id"),
                        resultSet.getString("tenBan"), resultSet.getString("loaiBan"),
                        resultSet.getInt("soNguoiNgoi"), resultSet.getString("tinhTrang")
                );
                List.add(ban);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Modify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc.

        return List;
    }

    public static List<ThucUong> findAllThucUong() {
        List<ThucUong> ThucUongList = new ArrayList<>();
        Connection connection = null;
        Statement statement = null;

        try {
            //lay tat ca danh 
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/QuanLyThucUong1", "root", "");

            //query
            String sql = "select * from ThucUong";
            statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                ThucUong thucuong = new ThucUong(resultSet.getInt("maThucUong"),
                        resultSet.getString("tenThucUong"), resultSet.getString("loatThucUong"),
                        resultSet.getString("donviTinh"), resultSet.getInt("soLuong"),
                        resultSet.getDouble("donGia"));
                ThucUongList.add(thucuong);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Modify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc.

        return ThucUongList;
    }

    public static List<Ban> findByFullname(String fullname) {
        List<Ban> List = new ArrayList<>();

        Connection connection = null;
        PreparedStatement statement = null;

        try {
            //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/QuanLyHoaDon", "root", "");

            //query
            String sql = "select * from BAN where tenBan like ?";
            statement = connection.prepareCall(sql);
            statement.setString(1, "%" + fullname + "%");

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                Ban ban = new Ban(resultSet.getInt("id"),
                        resultSet.getString("tenBan"), resultSet.getString("loaiBan"),
                        resultSet.getInt("soNguoiNgoi"), resultSet.getString("tinhTrang")
                );
                List.add(ban);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Modify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc.

        return List;
    }

    public static List<ThucUong> findByname(String fullname) {
        List<ThucUong> List = new ArrayList<>();

        Connection connection = null;
        PreparedStatement statement = null;

        try {
         
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/QuanLyHoaDon", "root", "");

            //query
            String sql = "select * from ThucUong1 where tenThucUong like ?";
            statement = connection.prepareCall(sql);
            statement.setString(1, "%" + fullname + "%");

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                ThucUong std = new ThucUong(resultSet.getInt("maThucUong"),
                        resultSet.getString("tenThucUong"), resultSet.getString("loaiThucUong"),
                        resultSet.getString("donViTinh"), resultSet.getInt("soLuong"),
                        resultSet.getDouble("donGia"));
                List.add(std);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Modify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc.

        return List;
    }

    public static void insert(HoaDon hd) {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/QuanLyHoaDon", "root", "");

            //query
            String sql = "insert into HoaDon1(id,tenNhanVien,ghiChu,Ban,tongTien,tienKhachTra,tienTraKhach) values( ?, ?, ?, ?, ?, ?, ?)";
            statement = connection.prepareCall(sql);

            statement.setInt(1, hd.getId());
            statement.setString(2, hd.getTenNhanvien());
            statement.setString(3, hd.getGhiChu());
            statement.setString(4, hd.getBan());
            statement.setDouble(5, hd.getTongTien());
            statement.setDouble(6, hd.getTienKhachtra());
            statement.setDouble(7, hd.getTienTraKhach());

            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Modify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc.
    }

    public static void insert1(HoaDon_ThucUong hd) {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/QuanLyHoaDon", "root", "");

            //query
            String sql = "insert into TBTHUCUONG(id,tenThucUong,donViTinh,soLuong,donGia,thanhTien) values(?, ?, ?, ?, ?, ?)";
            statement = connection.prepareCall(sql);
//            statement.setInt(1, hd.getStt());
            statement.setInt(1, hd.getId());
            statement.setString(2, hd.getTenThucUong());
            statement.setString(3, hd.getDonViTinh());
            statement.setString(4, hd.getSoLuong());
            statement.setString(5, hd.getDonGia() + "");
            statement.setString(6, hd.getThanhTien() + "");

            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Modify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc.
    }

    public static double HoaDon(JTable tbHoaDon) {
        double tongTien = 0;
        for (int i = 0; i < tbHoaDon.getRowCount(); i++) {
            tongTien += (double) tbHoaDon.getValueAt(i, 5);
        }
        return tongTien;
    }

    public static void dataHoaDon(JTable tbHoaDon, ThucUong t, int SoLuong) {
        DefaultTableModel tbModel = (DefaultTableModel) tbHoaDon.getModel();

        tbModel.addRow(new Object[]{tbModel.getRowCount() + 1, t.getTenThucUong(),
            t.getDonViTinh(), SoLuong, t.getDonGia(), SoLuong * t.getDonGia()});
    }
}
