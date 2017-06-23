package com.application.survy.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

/*import com.application.hrms.config.SwaggerConfiguration;
import com.application.hrms.config.WebConfigurer;
import com.application.hrms.config.WebMvcConfig;
import com.application.hrms.config.WebSecurityConfiguration;*/

/*import com.application.configuration.OAuth2ServerConfiguration;
import com.application.configuration.RedisSessionConfigration;
import com.application.configuration.ServletInitializer;
import com.application.configuration.SwaggerConfiguration;
import com.application.configuration.WebMvcConfig;
import com.application.configuration.WebSecurityConfiguration;
import com.application.configuration.security.AjaxAuthenticationFailureHandler;
import com.application.configuration.security.AjaxAuthenticationSuccessHandler;
import com.application.configuration.security.AjaxLogoutSuccessHandler;
import com.application.configuration.security.AppUserDetails;
import com.application.controller.LoginController;
import com.application.controller.UserNamePasswordService;
import com.application.model.Authority;
import com.application.model.User;
import com.application.pac4j.spring.config.CustomAuthorizer;
import com.application.pac4j.spring.config.Pac4jConfiguration;
import com.application.repository.UserRepository;
import com.application.security.api.CustomAuthenticationEntryPoint;
import com.application.security.api.UserNotActivatedException;
import com.application.solr.config.SolrConfiguration;
import com.application.solr.repo.PersonRepository;
import com.application.solr.service.impl.PersonService;
import com.application.solr.service.impl.PersonServiceImpl;
import com.application.util.session.management.SessionUtil;*/

@Configuration
@ComponentScan(basePackages = { "com.application.*",""})
@Component

public class WebAppInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		WebApplicationContext context = getContext();
		servletContext.addListener(new ContextLoaderListener(context));
		ServletRegistration.Dynamic dispatcher = servletContext.addServlet("DispatcherServlet",
				new DispatcherServlet(context));
		dispatcher.setLoadOnStartup(1);
		dispatcher.addMapping("/*");
	}

	private AnnotationConfigWebApplicationContext getContext() {
		AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
		context.register(RootConfig.class);
		
		
		
		/*context.register(SwaggerConfiguration.class);
		context.register(WebConfigurer.class);
		context.register(WebMvcConfig.class);
		
		context.register(WebSecurityConfiguration.class);
		
		context.register(Oauth2Config.class);*/
		

		/*context.register(RedisSessionConfigration.class);
		context.register(WebMvcConfig.class);
		context.register(WebSecurityConfiguration.class);
		context.register(CustomAuthenticationEntryPoint.class);
		context.register(UserNamePasswordService.class);
		context.register(SessionUtil.class);
		context.register(OAuth2ServerConfiguration.class);
		context.register(ServletInitializer.class);
		context.register(PersonServiceImpl.class);
		context.register(PersonRepository.class);
		context.register(AjaxAuthenticationSuccessHandler.class);
		context.register(AjaxAuthenticationFailureHandler.class);
		context.register(AjaxLogoutSuccessHandler.class);
		context.register(CustomAuthorizer.class);
		context.register(Pac4jConfiguration.class);
		context.register(SwaggerConfiguration.class);

		context.register(SolrConfiguration.class);
		context.register(LoginController.class);*/

		return context;
	}

}
