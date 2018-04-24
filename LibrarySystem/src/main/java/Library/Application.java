package Library;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by rajalakshmi on 23/4/18.
 */
@EnableAutoConfiguration
@ComponentScan
@Configuration
/*
@EnableGlobalMethodSecurity(securedEnabled = true, proxyTargetClass = true)
*/

class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}