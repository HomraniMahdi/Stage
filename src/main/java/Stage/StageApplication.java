package Stage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class StageApplication {

	public static void main(String[] args) {
		SpringApplication.run(StageApplication.class, args);
	}

	@Bean
	public WebMvcConfigurer corsConfigurer ()
	{
		return new WebMvcConfigurer() {
		
				@Override
				public void addCorsMappings(CorsRegistry registry) {
			registry.addMapping("/api/v1").allowedOrigins("http://localhost:4200/");
		}
	};
	}
}
