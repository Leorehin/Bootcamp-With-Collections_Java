package Desafio;

import java.time.LocalDate;

import Desafio.Dominio.Curso;
import Desafio.Dominio.Mentoria;

public class Main {
    public static void main(String[] args) throws Exception {
        Curso curso = new Curso();

        curso.setTitulo("curso java");
        curso.setDescricao("descricao do curso java");
        curso.setCargaHoraria(8);

        Curso curso2 = new Curso();

        curso2.setTitulo("curso python");
        curso2.setDescricao("descricao do curso python");
        curso2.setCargaHoraria(20);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Java no mercado financeiro");
        mentoria.setDescricao("explicando como usa java no mf");
        mentoria.setData(LocalDate.now());
        
        System.out.println(curso.toString() + curso2.toString() + mentoria.toString());
    }
}
