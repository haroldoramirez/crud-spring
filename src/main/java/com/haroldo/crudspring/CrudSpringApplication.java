package com.haroldo.crudspring;

import java.util.Date;

import com.haroldo.crudspring.models.Course;
import com.haroldo.crudspring.models.TrilhaHistorico;
import com.haroldo.crudspring.repositories.CourseRepository;
import com.haroldo.crudspring.repositories.TrilhaHistoricoRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CrudSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudSpringApplication.class, args);
	}

	@Bean
	CommandLineRunner initDataBase(CourseRepository courseRepository, TrilhaHistoricoRepository trilhaHistoricoRepository) {
		return args -> {

			courseRepository.deleteAll();

			Course c = new Course();
			c.setName("Angular com Spring BackEnd");
			c.setCategory("front-end");

			courseRepository.save(c);

			trilhaHistoricoRepository.deleteAll();

			TrilhaHistorico t = new TrilhaHistorico();

			t.setResponsavelAcao("Matrícula do usuário 123");
			t.setDataAcao(new Date());
			t.setIpUsuario("192.168.1.1");
			t.setIcFuncionalidade("INCLUSAO");
			t.setNoFuncionalidade("INCLUSAO DE CURSOS");
			t.setCamposVelhos("[vrCampo1=][dataAlteracao=]");
			t.setCamposNovos("[vrCampo1=123][dataAlteracao=14-11-2021 00:00:00]");
			t.setInformacaoAdicional("informacaoAdicional");

			trilhaHistoricoRepository.save(t);

		};
	}

}
