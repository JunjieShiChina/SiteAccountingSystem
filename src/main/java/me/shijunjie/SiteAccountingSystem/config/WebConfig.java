package me.shijunjie.SiteAccountingSystem.config;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import me.shijunjie.SiteAccountingSystem.Interceptor.LoginInterceptor;

@Configuration
@ComponentScan
public class WebConfig extends WebMvcConfigurerAdapter implements ApplicationContextAware {

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new LoginInterceptor()).addPathPatterns("/**")
		.excludePathPatterns("/toLogin").excludePathPatterns("/login").excludePathPatterns("/logout");
		super.addInterceptors(registry);
	}

	@Override
	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		
	}
	
}
