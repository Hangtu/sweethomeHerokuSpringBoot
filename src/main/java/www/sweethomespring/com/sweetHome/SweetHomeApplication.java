package www.sweethomespring.com.sweetHome;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
// @ComponentScan(basePackages = {"www.sweethomespring.com.sweetHome.Controllers"})
public class SweetHomeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SweetHomeApplication.class, args);
	}

}
