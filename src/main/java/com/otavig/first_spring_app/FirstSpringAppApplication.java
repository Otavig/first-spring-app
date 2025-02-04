package com.otavig.first_spring_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@Configuration // configuraçoẽs de bins
//@EnableAutoConfiguration  //Vai ativar a auta-configuração do spring
//@ComponentScan // Permitir que escaneie todos os arquivos do projeto
@SpringBootApplication
public class FirstSpringAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstSpringAppApplication.class, args);
	}

}
