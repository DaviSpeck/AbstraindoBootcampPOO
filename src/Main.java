import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

// Estudando abstração a partir da relaççao Curso - Mentoria

public class Main {

    public static void main(String[] args) {

        // Criando primeiro curso
        Curso boasVindas = new Curso();
        boasVindas.setTitulo("Boas-vindas ao Bootcamp GFT Start #4 Java");
        boasVindas.setDescricao("Apresentando a empresa GFT");
        boasVindas.setCargaHoraria(1);

        // Criando segundo curso
        Curso logicaDeProgramacao = new Curso();
        logicaDeProgramacao.setTitulo("Lógica de Programação Essencial");
        logicaDeProgramacao.setDescricao("Conteúdo essencial de Lógica de Programação");
        logicaDeProgramacao.setCargaHoraria(4);

        // Criando terceiro curso
        Curso estruturaDeDadosAlgoritmos = new Curso();
        estruturaDeDadosAlgoritmos.setTitulo("Aprenda o que são Estrutura de Dados e Algoritmos");
        estruturaDeDadosAlgoritmos.setDescricao("Princípios da Estrutura de Dados e sua aplicação em Algoritmos");
        estruturaDeDadosAlgoritmos.setCargaHoraria(2);

        // Criando quarto curso
        Curso gitGithub = new Curso();
        gitGithub.setTitulo("Aprenda o que são Estrutura de Dados e Algoritmos");
        gitGithub.setDescricao("Princípios da Estrutura de Dados e sua aplicação em Algoritmos");
        gitGithub.setCargaHoraria(2);

        // Criando quinto curso
        Curso documentacaoJava = new Curso();
        documentacaoJava.setTitulo("Introdução ao Ecossistema e Documentação Java");
        documentacaoJava.setDescricao("Entendendo o Ecossistema e a aplicabilidade da Documentação Java");
        documentacaoJava.setCargaHoraria(2);

        // Criando sexto curso
        Curso dominandoIDES = new Curso();
        dominandoIDES.setTitulo("Dominando IDEs Java");
        dominandoIDES.setDescricao("Entendendo o Ecossistema e a aplicabilidade da Documentação Java");
        dominandoIDES.setCargaHoraria(4);

        // Criando sétimo curso
        Curso variaveisTiposDeDadosOperadoresMatematicos = new Curso();
        variaveisTiposDeDadosOperadoresMatematicos.setTitulo("Variáveis, Tipos de Dados e Operadores Matemáticos em Java");
        variaveisTiposDeDadosOperadoresMatematicos.setDescricao("Princípios das Variáveis associada aos seus Tipos e a aplicabilidade em Operadores Matemáticos");
        variaveisTiposDeDadosOperadoresMatematicos.setCargaHoraria(2);

        // Criando oitavo curso
        Curso metodosJava = new Curso();
        metodosJava.setTitulo("Entendendo Métodos Java");
        metodosJava.setDescricao("Princípios de Métodos Java e sua aplicabilidade");
        metodosJava.setCargaHoraria(2);

        // Criando nono curso
        Curso logicaCondicionalControleDeFluxos = new Curso();
        logicaCondicionalControleDeFluxos.setTitulo("Lógica Condicional e Controle de Fluxos em Java");
        logicaCondicionalControleDeFluxos.setDescricao("O que é a Lógica Condicional e como realizar o Controle de Fluxos a partir da mesma");
        logicaCondicionalControleDeFluxos.setCargaHoraria(1);

        // Criando décimo curso
        Curso estruturasDeRepeticaoArrays = new Curso();
        estruturasDeRepeticaoArrays.setTitulo("Estruturas de Repetição e Arrays em Java");
        estruturasDeRepeticaoArrays.setDescricao("Estruturas de Repetição e a sua associação aos Arrays");
        estruturasDeRepeticaoArrays.setCargaHoraria(3);

        // Criando décimo primeiro curso
        Curso programacaoOrientadaAObjetos = new Curso();
        programacaoOrientadaAObjetos.setTitulo("Programação Orientada a Objetos");
        programacaoOrientadaAObjetos.setDescricao("O que é POO? Quais os seus pilares e princípios?");
        programacaoOrientadaAObjetos.setCargaHoraria(4);

        // Criando décimo segundo curso
        Curso debuggingJava = new Curso();
        debuggingJava.setTitulo("Debugging Java");
        debuggingJava.setDescricao("Como Debuggar um código? Análise passo a passo");
        debuggingJava.setCargaHoraria(1);

        // Criando décimo terceiro curso
        Curso tratamentoExcecoes = new Curso();
        tratamentoExcecoes.setTitulo("Tratamento de Exceções em Java");
        tratamentoExcecoes.setDescricao("Como Tratar as Exceções do código? Quais são as modalidades das exceções?");
        tratamentoExcecoes.setCargaHoraria(2);

        // Criando décimo quarto curso
        Curso trabalhandoCollections = new Curso();
        trabalhandoCollections.setTitulo("Trabalhando com Collections Java");
        trabalhandoCollections.setDescricao("O que são Collections e quais são as mais utilizadas do Java?");
        trabalhandoCollections.setCargaHoraria(6);

        // Criando décimo quinto curso
        Curso introducaoHTTPeHTTPS = new Curso();
        introducaoHTTPeHTTPS.setTitulo("Introdução ao HTTP/HTTPS");
        introducaoHTTPeHTTPS.setDescricao("Princípios do protocolo HTTP/HTTPS");
        introducaoHTTPeHTTPS.setCargaHoraria(3);

        // Criando décimo sexto curso
        Curso simplificandoProjetosSpringBoot = new Curso();
        simplificandoProjetosSpringBoot.setTitulo("Simplificando Projetos Java com o Spring Boot");
        simplificandoProjetosSpringBoot.setDescricao("Como utilizar o Spring Boot? O que a ferramenta proporciona?");
        simplificandoProjetosSpringBoot.setCargaHoraria(3);

        // Criando Objeto Curso a partir do pai Conteudo (POLIMORFISMO)
        // Conteudo conteudo1 = new Curso();
        // Conteudo conteudo2 = new Mentoria();

        // Criando primeira mentoria
        Mentoria aulaInaugural = new Mentoria();
        aulaInaugural.setTitulo("Aula Inaugural - GFT Start #4 Java");
        aulaInaugural.setDescricao("Explicando o bootcamp GFT Start #4 Java");
        aulaInaugural.setData(LocalDate.now());

        // Criando segunda mentoria
        Mentoria resolverDesafios = new Mentoria();
        resolverDesafios.setTitulo("Como resolver desafios de código");
        resolverDesafios.setDescricao("Explicando como resolver os desafios e como funciona a plataforma");
        resolverDesafios.setData(LocalDate.now());

        // Criando terceira mentoria
        Mentoria abstraindoSituacoesMundoReal = new Mentoria();
        abstraindoSituacoesMundoReal.setTitulo("Abstraindo Situações do Mundo Real com Orientação a Objetos");
        abstraindoSituacoesMundoReal.setDescricao("Explicando o projeto 'Abstraindo situações do Mundo Real com Orientação a Objetos'");
        abstraindoSituacoesMundoReal.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();

        // Definindo nome e descrição do Bootcamp
        bootcamp.setNome("GFT Start #4 Java");
        bootcamp.setDescricao("Hey Dev, já considerou a possibilidade de se tornar ainda mais potente para o mercado, se especializando na tecnologia de desenvolvimento mais utilizada no mundo? Se sim, este é o seu momento de brilhar! O Bootcamp GFT Start #4 Java foi pensado exclusivamente para o seu desenvolvimento na tecnologia de Java, contendo uma sequência completa de cursos, mentorias e desafios. Não perca essa chance e inscreva-se já!");

        // Adicionando cursos (GFT Start #4 Java)
        bootcamp.getConteudos().add(boasVindas);
        bootcamp.getConteudos().add(logicaDeProgramacao);
        bootcamp.getConteudos().add(estruturaDeDadosAlgoritmos);
        bootcamp.getConteudos().add(gitGithub);
        bootcamp.getConteudos().add(documentacaoJava);
        bootcamp.getConteudos().add(dominandoIDES);
        bootcamp.getConteudos().add(variaveisTiposDeDadosOperadoresMatematicos);
        bootcamp.getConteudos().add(metodosJava);
        bootcamp.getConteudos().add(logicaCondicionalControleDeFluxos);
        bootcamp.getConteudos().add(estruturasDeRepeticaoArrays);
        bootcamp.getConteudos().add(programacaoOrientadaAObjetos);
        bootcamp.getConteudos().add(debuggingJava);
        bootcamp.getConteudos().add(tratamentoExcecoes);
        bootcamp.getConteudos().add(trabalhandoCollections);
        bootcamp.getConteudos().add(introducaoHTTPeHTTPS);
        bootcamp.getConteudos().add(simplificandoProjetosSpringBoot);

        // Adicionando mentorias (GFT Start #4 Java)
        bootcamp.getConteudos().add(aulaInaugural);
        bootcamp.getConteudos().add(resolverDesafios);
        bootcamp.getConteudos().add(abstraindoSituacoesMundoReal);

        // Criando um dev que concluiu o bootcamp (16 cursos e 3 mentorias - 19 progressões)
        Dev devDavi = new Dev();
        devDavi.setNome("Davi");
        devDavi.inscreverBootcamp(bootcamp);
        // Todos os conteúdos do bootcamp
        System.out.println("Conteúdos Inscritos Davi: " + devDavi.getConteudosInscritos());
        devDavi.progredir();
        devDavi.progredir();
        devDavi.progredir();
        devDavi.progredir();
        devDavi.progredir();
        devDavi.progredir();
        devDavi.progredir();
        devDavi.progredir();
        devDavi.progredir();
        devDavi.progredir();
        devDavi.progredir();
        devDavi.progredir();
        devDavi.progredir();
        devDavi.progredir();
        devDavi.progredir();
        devDavi.progredir();
        devDavi.progredir();
        devDavi.progredir();
        devDavi.progredir();
        System.out.println("-");
        // Conteúdos depois da progressão do desenvolvedor
        System.out.println("Conteúdos Inscritos Davi: " + devDavi.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Davi: " + devDavi.getConteudosConcluidos());
        System.out.println("XP: " + devDavi.calcularTotalXp());

    }

}
