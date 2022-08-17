package jp.co.illmatics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ShoppingTemplateApplication {
//  @Autowired StaffRepository repository;
//
//  @PersistenceContext
//  private EntityManager entityManager;
//
//  @RequestMapping("/")
//  public String home() {
//      return "Hello World from Docker";
//  }
//  @RequestMapping("/staff")
//  public String staff() {
//      Optional<Staff> optional =  repository.findById(1);
//      Staff staff = optional.orElseGet(() -> new Staff());
//      return "Hello " + staff.getName();
//  }
//
//@SuppressWarnings("unchecked")
//@RequestMapping("/query")
//  public String query() {
//      List<Staff> results = entityManager
//            .createNativeQuery("select * from staff where emp_id = :id ", Staff.class)
//            .setParameter("id",1)
//            .getResultList();
//      String name = "";
//
//      if(results.size() != 0){
//        name = results.get(0).getName();
//      }
//      return "Hello " + name;
//  }
	public static void main(String[] args) {
		SpringApplication.run(ShoppingTemplateApplication.class, args);
	}
}
