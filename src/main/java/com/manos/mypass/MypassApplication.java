package com.manos.mypass;

import com.manos.mypass.controllers.MainController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class MypassApplication {

	@Autowired
	MainController mainController;

	private List<String> argList;

	public static void main(String[] args) {
		new SpringApplicationBuilder(MypassApplication.class).headless(false).run(args);
		//argList = Arrays.asList(args);
	}

	@Bean
	public void startingTheApp(){
		//System.out.println(argList);
		mainController.applicationArgumentsFilter();

		//System.out.println("manos run");
		//Controller.applicationArgumentsFilter(new File(StaticContent.DEFAULT_FILE_PATH));
	}


}
