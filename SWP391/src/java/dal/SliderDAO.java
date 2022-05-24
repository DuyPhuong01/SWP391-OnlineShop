
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Slider;

public class SliderDAO extends DBContext {
    public List<Slider> getSliders() {
        List<Slider> list = new ArrayList<>();
        String sql = "select * from sliders where status=?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, 1);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Slider s = new Slider(rs.getInt("slider_id"), 
                        rs.getString("slider_image"), 
                        rs.getString("title"), 
                        rs.getString("slider_link"),
                        rs.getString("status"));
                list.add(s);
            }
        } catch (SQLException sqle) {
            System.out.println(sqle);
        }
        return list;
    }
}
