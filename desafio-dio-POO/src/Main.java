import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {

		Curso curso1 = new Curso();
		curso1.setTitulo("curso java");
		curso1.setDescricao("descrição curso java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("curso js");
		curso2.setDescricao("descrição curso js");
		curso2.setCargaHoraria(4);
		
		
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("mentoria de java");
		mentoria.setDescricao("descrição mentoria java");
		mentoria.setData(LocalDate.now());
	
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devVini = new Dev();
		devVini.setNome("Vinicius");
		devVini.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos inscritos Vinicius "+ devVini.getConteudosInscritos());
		devVini.progredir();
		System.out.println("Conteúdos concluidos Vinicius "+ devVini.getConteudosConcluidos());
		System.out.println("XP: " + devVini.calcularTotalXp());
		
		
		
		Dev devRadagon = new Dev();
		devRadagon.setNome("Radagon");
		devRadagon.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos inscritos Radagon "+ devRadagon.getConteudosInscritos());
		devRadagon.progredir();
		System.out.println("Conteúdos concluidos Vinicius "+ devVini.getConteudosConcluidos());
		System.out.println("XP: " + devRadagon.calcularTotalXp());

	}

}
