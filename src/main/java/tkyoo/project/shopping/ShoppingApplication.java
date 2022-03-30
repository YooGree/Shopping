package tkyoo.project.shopping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

// (exclude={DataSourceAutoConfiguration.class}) => 당장은 사용하는 DB가 없으니 DB 설정정보를 제외
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class ShoppingApplication {

	public static void main(String[] args) {
		System.out.println("Test Output");
		SpringApplication.run(ShoppingApplication.class, args);
	}

}
