package masys.nachhaltigkeits_dashboard.websettings;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("https://nachhaltigkeits-dashboard-frontend.onrender.com")
                .allowedMethods("*");
                // .allowedHeaders("*")
                // .allowCredentials(true);
    }
}