/**
 * @author Julie Burger - jaburger
 * CIS175 - Spring 2023
 * Mar 16, 2023
 */
package dmacc.controller;

import javax.sql.DataSource;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.Albums;

@Configuration
public class BeanConfiguration {
	
	@Bean
	public Albums albums() {
		Albums bean = new Albums();
		return bean;
	}
	
	@Bean
	public DataSource getDataSource() {
		return DataSourceBuilder.create()
				 .driverClassName("com.mysql.cj.jdbc.Driver")
		          .url("jdbc:mysql://localhost:3306/albums?useSSL=false")
		          .username("root")
		          .password("NEW$tudent0821")
		          .build();	
	}
}
