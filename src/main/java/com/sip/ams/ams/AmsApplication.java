package com.sip.ams.ams;

import com.sip.ams.ams.controllers.ArticleController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;

@SpringBootApplication
public class AmsApplication {

	public static void main(String[] args) {

		new File(ArticleController.uploadDirectory).mkdir();
		SpringApplication.run(AmsApplication.class, args);
	}

}
