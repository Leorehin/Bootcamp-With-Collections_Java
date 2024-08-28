## Challenge - Bootcamp Implementing

Este foi um desafio de implementar um bootcamp com alunos, cursos e mentorias utilizando as collections do JAVA.

en:This was a challenge about implement a bootcamp with studentes, courses and mentories using collections in JAVA.

## Folder Structure

en:This project have 5 objects represented through classes that come from an abstraction of a Bootcamp as the follow diagram:

O projeto possui 5 objetos a partir de uma abstração de um bootcamp de acordo com o diagrama a seguir:
```
classDiagram
    class Bootcamp {
        String nome
        -String descricao
        -LocalDate dataInicio
        -LocalDate dataFinal
        -Set<Dev> devsInscritos
        -Set<Conteudo> conteudos
    }

    class Conteudo {
        <<abstract>>
        -static double XP_PADRAO
        -String titulo
        -String descricao
    }

    class Curso {
        int cargaHoraria
    }

    class Mentoria {
        LocalDate data
    }

    class Dev {
        String nome
        -Set<Conteudo> conteudosInscritos
        -Set<Conteudo> conteudosConcluidos
    }

    Bootcamp --> Dev : inscreve
    Bootcamp --> Conteudo : inclui
    Conteudo <|-- Curso
    Conteudo <|-- Mentoria
    Dev --> Conteudo : participa
```

  A classe bootcamp é o maior nivel de abstração e nele estão as informacaoes do "negocio". Assim, além das informacoes como nome, descrição, data de inicio e fim ele possui duas SET's de dev's(alunos) e conteúdos. Por que set? Dessa forma garate-se que apenas um registro foi implantado.
  No objeto conteúdo é possibel perceber que ele é abstrato, pois é o nivel hierarquico mais alto de mentorias e cursos. Nele podemos ver informações comuns as duas classes que seguem como nome e descrição.
  Já no objeto curso que extende de conteúdo podemos ver uma carga horária e isso é o que o torna diferente, pois o curso são as aulas teoricas que o dev aprenderá durante a trilha do bootcamp.
  Avançando para mentoria que tambem é um conteúdo podemos perceber apenas uma data de realização porque essa seria uma Live com um conteudo especifico.
  Por fim temos dev que aqui representa o aluno/cliente e nele temos Set de conteúdos concluidos e inscritos, pois toda vez que um dev se cadastra em um bootcamp ele recebe uma lista de conteudos para finaliza-los até o prazo final e esses ao serem completados vao calculando um XP como forma de gameficação do negócio.

  en: The class bootcamp is the greater level of abstraction and in there are the informations of the "bussines". This form informations like name, description, initial and final date there is two SET's dev and contend. We used SET's because it's a way to garantee that only one register of dev and contend will exist on our bootcamp avoinding duplicates.
  On the objetct contend we can see that it's abstract and a abstration of what the conted offered in our bootcamp. Their

