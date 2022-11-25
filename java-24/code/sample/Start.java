package sample;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

class Start {
    public static void main(String[] data) {
        String driver = "com.mysql.cj.jdbc.Driver";
        String connectionString = "jdbc:mysql://localhost/" + "company?user=jeff&password=bezos";
        String sql = "select * from product";
        try {
            Class.forName(driver);
            Connection cn = DriverManager.getConnection(connectionString);
            PreparedStatement ps = cn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String name = rs.getString("name");
                String size = rs.getString("size");
                double price = rs.getDouble("price");
                System.out.println(name + " " + size + " " + price);               
            }
                rs.close(); 
            ps.close();
            cn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
}