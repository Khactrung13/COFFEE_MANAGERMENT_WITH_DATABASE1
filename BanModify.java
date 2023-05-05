/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyBan;

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
public class BanModify {

    public static List<Ban> findAll() {
        List<Ban> List = new ArrayList<>();
        Connection connection = null;
        Statement statement = null;

        try {
            //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/QuanLyBan", "root", "");

            //query
            String sql = "select * from Ban";
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
            Logger.getLogger(BanModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(BanModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(BanModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc.

        return List;
    }

    public static void insert(Ban ban) {
        Connection connection = null;
        PreparedStatement statement = null;

        try {
            //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/QuanLyBan", "root", "");

            //query
            String sql = "insert into Ban(tenBan,loaiBan,soNguoiNgoi,tinhTrang) values( ?, ?, ?, ?)";
            statement = connection.prepareCall(sql);

            statement.setString(1, ban.getTenBan());
            statement.setString(2, ban.getLoaiBan());
            statement.setInt(3, ban.getSoNguoiNgoi());
            statement.setString(4, ban.getTinhTrang());

            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(BanModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(BanModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(BanModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc.
    }

    public static void update(Ban ban) {
        String sql = "update  Ban set tenBan=?,loaiBan=?,soNguoiNgoi=?,tinhTrang=? where id =?";
        Connection connection = null;
        PreparedStatement statement = null;

        try {
            //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/QuanLyBan", "root", "");
            statement = connection.prepareStatement(sql);

            statement.setString(1, ban.getTenBan());
            statement.setString(2, ban.getLoaiBan());
            statement.setInt(3, ban.getSoNguoiNgoi());
            statement.setString(4, ban.getTinhTrang());
            statement.setInt(5, ban.getId());

            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(BanModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(BanModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(BanModify.class.getName()).log(Level.SEVERE, null, ex);
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
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/QuanLyBan", "root", "");

            //query
            String sql = "delete from Ban where id = ?";
            statement = connection.prepareCall(sql);

            statement.setInt(1, id);

            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(BanModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(BanModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(BanModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc.
    }

    public static List<Ban> findByFullname(String fullname) {
        List<Ban> List = new ArrayList<>();

        Connection connection = null;
        PreparedStatement statement = null;

        try {
            //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/QuanLyBan", "root", "");

            //query
            String sql = "select * from Ban where tenBan like ?";
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
            Logger.getLogger(BanModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(BanModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(BanModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc.

        return List;
    }
}
