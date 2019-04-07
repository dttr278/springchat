package com.dttr.tchat;

import com.dttr.tchat.fileproperty.FileStorageProperties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;


@SpringBootApplication
@EnableAutoConfiguration
@EnableConfigurationProperties({
	FileStorageProperties.class
})
public class TchatApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(TchatApplication.class, args);
	}

}
