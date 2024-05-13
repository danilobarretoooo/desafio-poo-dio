package br.com.dio.desafio.dominio;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Curso de Java da Faculdade de candeias");
        curso1.setCargaHoraria(8);
        System.out.println(curso1);
    }
}