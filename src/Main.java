import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
            curso1.setTitulo("curso js");
        curso1.setDescrição("descrição curso js");
        curso1.setCargaHoraria(4);

        Curso curso2 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescrição("descrição curso java");
        curso1.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescrição("descrição mentoria de java");
        mentoria.setData(LocalDate.now());


        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
    }
}