package sample;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.data.repository.CrudRepository;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

class Start {
	public static void main(String[] data) {
		ApplicationContext context = SpringApplication.run(Setup.class);
	}
}
@RestController
class Sample {
	@RequestMapping("/list-branch")
	Iterable listBranch() {
		return repository.findAll();
	}
	@RequestMapping("/list-product")
	Iterable listProduct() {
		return product.findAll();
	}
	@Autowired BranchRepository repository;
	@Autowired ProductRepository product;
}

@Repository
interface ProductRepository extends CrudRepository<Product, Long> { }

@Table(name="product")
class Product {
	@Id public long number;
	public String name;
	public String size;
	public double price;
}

@Component
interface BranchRepository extends CrudRepository<Branch, Integer> { }

@Table(name="branch")
class Branch {
	@Id public int number;
	public String name;
	public double area;
}

@SpringBootApplication
class Setup {
	@Bean
	DriverManagerDataSource connect() {
		return new DriverManagerDataSource(connectionString);
	}
	String connectionString = "jdbc:mysql://localhost/" +
			"company?user=jeff&password=bezos";	
}



//class Start {
//    public static void main(String[] data) {
//        String driver = "com.mysql.cj.jdbc.Driver";
//        String connectionString = "jdbc:mysql://localhost/" + "company?user=jeff&password=bezos";
//        String sql = "select * from product";
//        try {
//            Class.forName(driver);
//            Connection cn = DriverManager.getConnection(connectionString);
//            PreparedStatement ps = cn.prepareStatement(sql);
//            ResultSet rs = ps.executeQuery();
//            while (rs.next()) {
//                String name = rs.getString("name");
//                String size = rs.getString("size");
//                double price = rs.getDouble("price");
//                System.out.println(name + " " + size + " " + price);               
//            }
//                rs.close(); 
//            ps.close();
//            cn.close();
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//        
//    }
//}