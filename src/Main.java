import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

// Estudando abstração a partir da relaççao Curso - Mentoria

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

        // Criando Objeto Curso a partir do pai Conteudo (POLIMORFISMO)
        // Conteudo conteudo1 = new Curso();
        // Conteudo conteudo2 = new Mentoria();

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());


        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Boot Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devDavi = new Dev();
        devDavi.setNome("Davi");
        devDavi.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Davi: " + devDavi.getConteudosInscritos());
        devDavi.progredir();
        devDavi.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Davi: " + devDavi.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Davi: " + devDavi.getConteudosConcluidos());
        System.out.println("XP: " + devDavi.calcularTotalXp());

        System.out.println("-----------");

        Dev devDeborah = new Dev();
        devDeborah.setNome("Déborah");
        devDeborah.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Déborah: " + devDeborah.getConteudosInscritos());
        devDeborah.progredir();
        devDeborah.progredir();
        devDeborah.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Davi: " + devDavi.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Déborah: " + devDeborah.getConteudosConcluidos());
        System.out.println("XP: " + devDeborah.calcularTotalXp());

    }

}
