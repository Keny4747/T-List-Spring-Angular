package com.k47.demoapi;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.lang.reflect.Array;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class DemoapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoapiApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(TareaRepository tareaRepository){
		return args -> {
			List<Tarea> tareasPrueba = Arrays.asList(
					new Tarea("Aprender Java", true, LocalDateTime.now()),
					new Tarea("Inscribirme al curso Angular", false, LocalDateTime.now()),
					new Tarea("Dar like a la pagina de facebook", true, LocalDateTime.now()),
					new Tarea("Hacer ejercicio durante 10 minutos", false, LocalDateTime.now()),
					new Tarea("Leer un libro", true, LocalDateTime.now())
			);
			tareaRepository.saveAll(tareasPrueba);
		};
	}

}
