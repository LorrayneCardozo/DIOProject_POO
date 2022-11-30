import desafio.bootcamp.Bootcamp;
import desafio.bootcamp.Curso;
import desafio.bootcamp.Dev;
import desafio.bootcamp.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setTitulo("Curso java");
        curso.setDescricao("Descrição curso java");
        curso.setCargaHoraria(10);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria java");
        mentoria.setDescricao("Descrição");
        mentoria.setData(LocalDate.now());

        Dev dev = new Dev();
        dev.setNome("Lorrayne");

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootecamp Java Developer");
        bootcamp.setDescricao("Descrição...");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(mentoria);

        dev.inscreverBootcamp(bootcamp);

        System.out.println(dev.getConteudosInscritos());

        System.out.println(dev.getConteudosConcluidos());

    }
}