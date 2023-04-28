import java.time.LocalDate;

import br.com.dio.desafio.dominio.*;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("descrição curso JS");
        curso2.setCargaHoraria(6);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Centoria em Java");
        mentoria1.setDescricao("Descrição da mentoria");
        mentoria1.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição do Bootcamp");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devMateus = new Dev();
        devMateus.setNome("Mateus");
        devMateus.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Mateus: " + devMateus.getConteudosInscritos());
        devMateus.progredir();
        devMateus.progredir();
        devMateus.progredir();
        System.out.println("Conteúdos Inscritos Mateus: " + devMateus.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Mateus: " + devMateus.getConteudosConcluidos());
        System.out.println("XP Mateus: " + devMateus.calcularTotalXp());


        Dev devMarcos = new Dev();
        devMarcos.setNome("Marcos");
        devMarcos.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Marcos: " + devMarcos.getConteudosInscritos());
        devMarcos.progredir();
        System.out.println("Conteúdos Inscritos Marcos: " + devMarcos.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Marcos: " + devMarcos.getConteudosConcluidos());
        System.out.println("XP Mateus: " + devMarcos.calcularTotalXp());
    }
    
}
