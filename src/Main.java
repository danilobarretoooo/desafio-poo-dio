
import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;



public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Curso de Java da Faculdade de candeias");
        curso1.setCargaHoraria(120);
        System.out.println(curso1);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Python");
        curso2.setDescricao("Curso de Javascript da Faculdade de candeias");
        curso2.setCargaHoraria(60);
        System.out.println(curso2);


        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("descricao mentoria de java");
        mentoria1.setData(LocalDate.now());

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("Mentoria Python");
        mentoria2.setDescricao("descricao mentoria de Python");
        mentoria2.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("descricao Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);
        bootcamp.getConteudos().add(mentoria2);

        Dev devDanilo = new Dev();
        devDanilo.setNome("Danilo");
        devDanilo.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Danilo " + devDanilo.getConteudoInscrito());
        devDanilo.progredir();
        System.out.println("Conteudos Concluidos Danilo " + devDanilo.getConteudoConcluido());
        System.out.println("XP: " + devDanilo.calcularXp());

        System.out.println("-----------------------------------------------------------------------------");

        Dev devPedro = new Dev();
        devPedro.setNome("Pedro");
        devPedro.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Pedro " + devPedro.getConteudoInscrito());
        devPedro.progredir();
        devPedro.progredir();
        devPedro.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Pedro " + devPedro.getConteudoInscrito());
        System.out.println("Conteudos Concluidos Pedro " + devPedro.getConteudoConcluido());
        System.out.println("XP: " + devPedro.calcularXp());

    }
}