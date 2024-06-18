package Desafio;

import java.time.LocalDate;

import Desafio.Dominio.Bootcamp;
import Desafio.Dominio.Conteudo;
import Desafio.Dominio.Curso;
import Desafio.Dominio.Dev;
import Desafio.Dominio.Mentoria;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Conteudo curso1 = new Curso("java basico na pratica", "Dominando lacos, repeticoes e condicionais", 3);
        
        Conteudo curso2 = new Curso("Java orientado a objeto","Dominando Java orientado a objeto", 8);
        
        Mentoria mentoria1 = new Mentoria("Java no mercado de trabalho", "como as empresas usam a linguagem em sua cotidiano", LocalDate.now());
        
        Bootcamp bootcamp = new Bootcamp("Java developer bootcamp", "Torne-se um java developer");
        bootcamp.getConteudos().add(mentoria1);
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);

        Dev devLeo = new Dev("Leonardo");
        devLeo.inscreverBootcamp(bootcamp);
        System.out.println("conteudos inscritos:"+ devLeo.getConteudosInscritos());

        System.out.println("conteudos concluidos:"+ devLeo.getConteudosConcluidos());
        devLeo.progredir();
        devLeo.progredir();
        devLeo.progredir();
        System.out.println("conteudos concluidos:"+ devLeo.getConteudosConcluidos());
        System.out.println("Xp de: "+ devLeo.getNome() +" = "+devLeo.calcularTotalXp());
        System.out.println("_________________");

        Dev devCamila = new Dev("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos:"+ devCamila.getConteudosInscritos());
        System.out.println("conteudos concluidos:"+ devCamila.getConteudosConcluidos());
        devCamila.progredir();
        System.out.println("conteudos concluidos:"+ devCamila.getConteudosConcluidos());
        System.out.println("Xp de: "+ devCamila.getNome() +" = "+devCamila.calcularTotalXp());


    }
}
