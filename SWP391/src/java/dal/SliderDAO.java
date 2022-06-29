
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
                        rs.getInt("status"));
                list.add(s);
            }
        } catch (SQLException sqle) {
            System.out.println(sqle);
        }
        return list;
    }
     
    private Slider fillSliderDetails(ResultSet rs){
        try {
            return new Slider(rs.getInt("slider_id"),
                    rs.getString("slider_image"),
                    rs.getString("title"),
                    rs.getString("slider_link"),
                    rs.getInt("status"));
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return null;
        }
    
      //get slider pagging
    public List<Slider>getSliders(String word,int searchOption,int status,int page,int numperpage){
         List<Slider> list = new ArrayList<>();
         String sql="select * from sliders\n" +
        "where slider_id=slider_id";
         
        if(!word.equals("")&&searchOption==1){ //have option word
         sql+=" and  title like '%"
                 + word
                 + "%'";
        }
        if(!word.equals("")&&searchOption==2){ //have option word
         sql+=" and  slider_link like '%"
                 + word
                 + "%'";
        }
        if(status==1){ 
            sql+=" and status ="
                    + 1;
        }
        if(status==0){
            sql+=" and status ="
                    + 0;
        }
        sql+=" \norder by slider_id";
          sql += " OFFSET "
                + (page - 1) * numperpage
                + " ROWS FETCH NEXT "
                + numperpage
                + " ROWS ONLY";
        try {
             PreparedStatement st = connection.prepareStatement(sql);
             ResultSet rs = st.executeQuery();
             while (rs.next()) {                
                Slider slider=fillSliderDetails(rs);
                list.add(slider);
            }
             
        } catch (Exception e) {
            System.out.println(e);
        }
        return list;
        }
            // count filter and paging
    public int countSliderPaging(String word,int searchOption,int status,int numperpage){
         List<Slider> list = new ArrayList<>();
         int num = 1;
         String sql="select count(slider_id) from sliders\n" +
        "where slider_id=slider_id";
         
        if(!word.equals("")&&searchOption==1){ //have option word
         sql+=" and  title like '%"
                 + word
                 + "%'";
        }
        if(!word.equals("")&&searchOption==2){ //have option word
         sql+=" and  slider_link like '%"
                 + word
                 + "%'";
        }
        if(status==1){ 
            sql+=" and status ="
                    + 1;
        }
        if(status==0){
            sql+=" and status ="
                    + 0;
        }
        System.out.println(sql);
        try {
             PreparedStatement st = connection.prepareStatement(sql);
             ResultSet rs = st.executeQuery();
             if(rs.next()){
                 num=rs.getInt(1);
             }
             
        } catch (Exception e) {
            System.out.println(e);
        }
        
         if (num == 0) {
            return 1;//minimum=1
        } else if (num % numperpage == 0) { //number full page
            return num / numperpage;
        }
        return num / numperpage + 1;
        }
    
          //update status of slider
    public boolean updateStatusSlider(int id, int status) {
        String sql = "UPDATE sliders\n"
                + "SET status = "
                + status
                + "\n"
                + "WHERE slider_id="
                + id;
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.executeUpdate();
            return true;
        } catch (Exception e) {
            System.out.println(e);
        }

        return false;//exception
    }

}
