package br.com.llongo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
 
@Configuration //Marks this class as configuration
//Specifies which package to scan
@ComponentScan("br.com.llongo")
//Enables Spring's annotations
@EnableWebMvc
public class Config {
 
	@Bean
	public InternalResourceViewResolver configureInternalResourceViewResolver() {
	    InternalResourceViewResolver resolver = new InternalResourceViewResolver();
	    resolver.setPrefix("/WEB-INF/");
	    resolver.setSuffix(".jsp");
	    return resolver;
	}
}