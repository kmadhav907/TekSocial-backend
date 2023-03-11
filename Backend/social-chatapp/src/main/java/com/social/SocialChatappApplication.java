package com.social;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

@SpringBootApplication
@EnableJpaRepositories
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class SocialChatappApplication {

	public static void main(String[] args) {
		SpringApplication.run(SocialChatappApplication.class, args);
	}
}
