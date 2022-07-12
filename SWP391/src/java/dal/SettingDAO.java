/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Setting;
import org.jboss.weld.util.collections.ArrayListSupplier;

/**
 *
 * @author Admin
 */
public class SettingDAO extends DBContext {

    public List<Setting> getSettingsByPage(int start, int end, String orderOption) {
        String sql = "select * from (select ROW_NUMBER() over(order by setting_id) as Row, * from settings) a where Row between ? and ?";
        List<Setting> list = new ArrayList<>();
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, start);
            st.setInt(2, end);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Setting s = new Setting(rs.getInt("setting_id"), rs.getString("name"), rs.getString("description"), rs.getString("type"), rs.getString("value"), rs.getString("order"), rs.getInt("status"));
                list.add(s);
            }
        } catch (SQLException e) {

        }
        return list;
    }
//    ) a where Row between ? and ?";

    public List<Setting> getSettingsByPage(int start, int end, String orderOption, String[] type, String[] status, String key) {
        String sql = "select * from (select ROW_NUMBER() over(order by " + orderOption + ") as Row, * from settings where 1 = 1";
        if (type != null) {
            sql += " and type in(";
            for (String string : type) {
                sql += "'"+string+"',";
            }
            sql = sql.substring(0, sql.length() - 1);
            sql += ")";
        }
        if (status != null) {
            sql += " and status in(";
            for (String string : status) {
                sql += string+",";
            }
            sql = sql.substring(0, sql.length() - 1);
            sql += ")";
        }
        sql += " and value like '%"+key+"%'";
        sql += ") a where Row between ? and ?";
        System.out.println(sql);
        List<Setting> list = new ArrayList<>();
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, start);
            st.setInt(2, end);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Setting s = new Setting(rs.getInt("setting_id"), rs.getString("name"), rs.getString("description"), rs.getString("type"), rs.getString("value"), rs.getString("order"), rs.getInt("status"));
                list.add(s);
            }
        } catch (SQLException e) {

        }
        return list;
    }
    public int getTotalSettings(String[] type, String[] status, String key) {
        String sql = "select count(setting_id) from settings where 1 = 1";
        if (type != null) {
            sql += " and type in(";
            for (String string : type) {
                sql += "'"+string+"',";
            }
            sql = sql.substring(0, sql.length() - 1);
            sql += ")";
        }
        if (status != null) {
            sql += " and status in(";
            for (String string : status) {
                sql += string+",";
            }
            sql = sql.substring(0, sql.length() - 1);
            sql += ")";
        }
        sql += " and value like '%"+key+"%'";
        System.out.println(sql);

        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            if(rs.next()){
                return rs.getInt(1);
            }
        } catch (SQLException e) {

        }
        return 0;
    }

    public int getTotalSetting() {
        String sql = "select COUNT(setting_id) from settings";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                return rs.getInt(1);
            }
        } catch (SQLException e) {

        }
        return 0;
    }

    public List getTypes() {
        String sql = "select distinct type from settings";
        List l = new ArrayList();
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                l.add(rs.getString(1));
            }
        } catch (SQLException e) {

        }
        return l;
    }

    public static void main(String[] args) {
        SettingDAO d = new SettingDAO();
        System.out.println(d.getSettingsByPage(0, 10, "setting_id asc", null, null, "ta").size());
        System.out.println(d.getTotalSettings(null, null, "ta"));
    }
}
