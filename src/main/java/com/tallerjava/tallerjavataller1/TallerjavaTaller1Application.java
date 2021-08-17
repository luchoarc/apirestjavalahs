package com.tallerjava.tallerjavataller1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Para ejecutar la aplicacion tenemos 02 servicios todos los registros con all, o registro filtrado por Id Oficina
//1.http://localhost:9000/offices/alls
//2. http://localhost:9000/offices/71
//Con la siguiente URL accedemos a la documentación de la API REST creada con la API swagger descargada de https://mvnrepository.com/artifact/io.springfox/springfox-swagger-ui/2.9.2
//3. http://localhost:9000/swagger-ui.html
//4. https://apirestoacarc.herokuapp.com/offices/alls
//5. https://apirestoacarc.herokuapp.com/offices/10


//Para ajecutar el .jar directo se ejecuta el siguiente comando desde consola de windows cmd
//D:\Documents\JS y JAVA\JAVA\tallerjava-taller1\build\libs> java -jar tallerjava-taller1-1.0.0.jar



@SpringBootApplication
public class TallerjavaTaller1Application {

	public static void main(String[] args) {
		SpringApplication.run(TallerjavaTaller1Application.class, args);
	}

}
