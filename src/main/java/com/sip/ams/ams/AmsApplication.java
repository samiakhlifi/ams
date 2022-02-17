package com.sip.ams.ams;

import com.sip.ams.ams.controllers.ArticleController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.io.File;

@SpringBootApplication
@EnableSwagger2
public class AmsApplication {

	public static void main(String[] args) {

		new File(ArticleController.uploadDirectory).mkdir();
		SpringApplication.run(AmsApplication.class, args);
	}

}
