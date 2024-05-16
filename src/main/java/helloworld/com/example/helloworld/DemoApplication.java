package helloworld.com.example.helloworld;
import org.slf4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
final static Logger log = LoggerFactory.getLogger(CSApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		 
log.info("Hi Welcome to Lifetrenz ");
	}

}
