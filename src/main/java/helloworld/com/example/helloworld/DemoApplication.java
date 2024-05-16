package helloworld.com.example.helloworld;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Value;

@SpringBootApplication
public class DemoApplication {
final static Logger log = LoggerFactory.getLogger(DemoApplication.class);

	 @Value("${enable_adminclien}")
    private String version;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		 
log.info("logger settings: version);
	}

}
