import desafio.bootcamp.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        // Criando curso
        Curso curso = new Curso();
        curso.setTitulo("Curso java");
        curso.setDescricao("Descrição curso java");
        curso.setCargaHoraria(10);

        // Criando mentoria
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria java");
        mentoria.setDescricao("Descrição");
        mentoria.setData(LocalDate.now());

        // Criando dev
        Dev dev = new Dev();
        dev.setNome("Lorrayne");

        // Criando bootcamp
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição...");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(mentoria);

        // Inscrevendo dev em bootcamp
        dev.inscreverBootcamp(bootcamp);

        // Criando topico em forum do bootcamp
        Forum forum = dev.criarTopicoForum(bootcamp, "Duvida no curso de java", "Java", "Como consigo imprimir um 'Hello Word'?");

        // Comentando forum
        dev.comentarForum(forum, "System.out.println('Hello Word')");

        System.out.println("- Bootcamp: \n" + bootcamp.getNome());
        System.out.println("\n- Devs inscritos: \n" + bootcamp.getDevsInscritos());
        System.out.println("\n- Foruns do bootcamp: \n" + bootcamp.getForuns());

    }
}