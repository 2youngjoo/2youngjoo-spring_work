package com.example.boot07.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.example.boot07.interceptor.LoginInterceptor;

@Configuration
public class WebConfig implements WebMvcConfigurer {
   
   //LoginInterceptor DI
   @Autowired
   LoginInterceptor loginInter;
   
   //Interceptor를 추가할 때 오버라이드 하는 메소드
   @Override
   public void addInterceptors(InterceptorRegistry registry) {
      // 메소드의 인자로 전달되는 InteceptorRegistry 객체를 이용해서 Interceptor를 등록하면 된다.
	  // 메소드 인자 패턴이  String....pattern 으로 되어있으면 인자를 , 붙여서 여러개를 한줄로 표현할 수 있다.
      registry.addInterceptor(loginInter)
         .addPathPatterns("/users/*","/cafe/*")
         .excludePathPatterns("/users/loginform", "/users/login", "/users/signup_form", "/users/signup", 
        		 "/cafe/list", "/cafe/detail", "/cafe/ajax_comment_list");

   }
   
// webapp/resources 폴더 설정
   @Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
		
	}
}


