package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Slider;

public class SliderDAO extends DBContext {

    public Slider fillSliderDetails(ResultSet rs) throws SQLException {
        return new Slider(rs.getInt("slider_id"),
                rs.getString("slider_image"),
                rs.getString("title"),
                rs.getString("slider_link"),
                rs.getString("status"),
                rs.getString("notes"));
    }

    public List<Slider> getSliders() {
        List<Slider> list = new ArrayList<>();
        String sql = "select * from sliders where status=?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, 1);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Slider s = fillSliderDetails(rs);
                list.add(s);
            }
        } catch (SQLException sqle) {
            System.out.println(sqle);
        }
        return list;
    }

    public Slider getSlider(int id) {
        String sql = "select * from sliders where slider_id=?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, 1);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                Slider s = fillSliderDetails(rs);
                return s;
            }
        } catch (SQLException sqle) {
            System.out.println(sqle);
        }
        return null;
    }
    
    public boolean changeSliderStatus(int id, int status){
        String sql = "update sliders set status = ? where slider_id = ?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, status);
            st.setInt(2, id);
            st.executeUpdate();
            st.close();
            return true;
        } catch (SQLException sqle) {
            System.out.println(sqle);
        }
        return false;
    }
    
    public boolean changeSliderInformation(int id, String title, String backlink, String notes){
        String sql = "update sliders set title = ?, slider_link = ?, notes = ? where slider_id = ?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, title);
            st.setString(2, backlink);
            st.setString(3, notes);
            st.setInt(4, id);
            st.executeUpdate();
            st.close();
            return true;
        } catch (SQLException sqle) {
            System.out.println(sqle);
        }
        return false;
    }
    
    public boolean changeSliderImage(int id, String filename){
        String sql = "update sliders set slider_image = ? where slider_id = ?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, filename);
            st.setInt(2, id);
            st.executeUpdate();
            st.close();
            return true;
        } catch (SQLException sqle) {
            System.out.println(sqle);
        }
        return false;
    }
}
