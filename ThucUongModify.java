/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyThucUongg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nguyenkhactrung
 */
public class ThucUongModify {

    public static List<ThucUong> findAll() {
        List<ThucUong> List = new ArrayList<>();
        Connection connection = null;
        Statement statement = null;

        try {
            //lay tat ca danh sach sinh vien
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
                List.add(thucuong);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ThucUongModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ThucUongModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ThucUongModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc.

        return List;
    }

    public static void insert(ThucUong thucuong) {
        Connection connection = null;
        PreparedStatement statement = null;

        try {
            //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/QuanLyThucUong1", "root", "");

            //query
            String sql = "insert into ThucUong(maThucUong,tenThucUong,loatThucUong,donViTinh,soLuong,donGia) values( ?, ?, ?, ?, ?, ?)";
            statement = connection.prepareCall(sql);

            statement.setInt(1, thucuong.getId());
            statement.setString(2, thucuong.getTenThucUong());
            statement.setString(3, thucuong.getLoaiThucUong());
            statement.setString(4, thucuong.getDonViTinh());
            statement.setInt(5, thucuong.getSoLuong());
            statement.setDouble(6, thucuong.getDonGia());

            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ThucUongModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ThucUongModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ThucUongModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc.
    }

    public static void update(ThucUong thucuong) {
        String sql = "update  ThucUong set maThucUong =?,tenThucUong=?,loatThucUong=?,donViTinh=?,soLuong=?,donGia=? where maThucUong = " + thucuong.getId();
        Connection connection = null;
        PreparedStatement statement = null;

        try {
            //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/QuanLyThucUong1", "root", "");
            statement = connection.prepareStatement(sql);
            statement.setInt(1, thucuong.getId());
            statement.setString(2, thucuong.getTenThucUong());
            statement.setString(3, thucuong.getLoaiThucUong());
            statement.setString(4, thucuong.getDonViTinh());
            statement.setInt(5, thucuong.getSoLuong());
            statement.setDouble(6, thucuong.getDonGia());

            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ThucUongModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ThucUongModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ThucUongModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc.
    }

    public static void delete(int id) {
        Connection connection = null;
        PreparedStatement statement = null;

        try {
            //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/QuanLyThucUong1", "root", "");

            //query
            String sql = "delete from ThucUong where maThucUong = ?";
            statement = connection.prepareCall(sql);

            statement.setInt(1, id);

            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ThucUongModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ThucUongModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ThucUongModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc.
    }

    public static List<ThucUong> findByFullname(String fullname) {
        List<ThucUong> List = new ArrayList<>();

        Connection connection = null;
        PreparedStatement statement = null;

        try {
            //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/QuanLyThucUong1", "root", "");

            //query
            String sql = "select * from ThucUong where tenThucUong like ?";
            statement = connection.prepareCall(sql);
            statement.setString(1, "%" + fullname + "%");

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                ThucUong std = new ThucUong(resultSet.getInt("maThucUong"),
                        resultSet.getString("tenThucUong"), resultSet.getString("loatThucUong"),
                        resultSet.getString("donViTinh"), resultSet.getInt("soLuong"),
                        resultSet.getDouble("donGia"));
                List.add(std);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ThucUongModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ThucUongModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ThucUongModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc.

        return List;
    }
}
