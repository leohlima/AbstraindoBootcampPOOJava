import model.entities.domain.*;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Dev dev = new Dev();

        Conteudo cursoJava = new Curso();
        cursoJava.setTitulo("Aprenda tudo sobre Java");
        ((Curso) cursoJava).setCargaHoraria(8);
        cursoJava.setDescricao("Com esse curso você estará apto para colaborar com o grupo GVT");

        Conteudo mentoriaJava = new Mentoria();
        mentoriaJava.setTitulo("Aprenda sobre carreira Java");
        mentoriaJava.setDescricao("Aprenda com as experiências dos melhores programadores!");
        ((Mentoria) mentoriaJava).setData(LocalDate.now());


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("GVT Bootcamp");
        bootcamp.setDescricao("Nesse bootcamp você estará apto para estagiar em nosso grupo");
        bootcamp.getConteudos().add(cursoJava);
        bootcamp.getConteudos().add(mentoriaJava);

        System.out.print("Olá dev!! Deseja se inscrever em nosso Bootcamp da DIO com apoio do Grupo GVT? (s/n): ");
        char resposta = sc.next().charAt(0);
        sc.nextLine();

        if (resposta == 's') {

            System.out.println("Ficamos contentes pela escolha!");
            System.out.println("Agora precisaremos de alguns dados seus para a inscrição!");
            System.out.print("Qual o seu nome?: ");
            String nome = sc.nextLine();
            dev.setNome(nome);
            dev.inscreverBootcamp(bootcamp);

            System.out.println("Legal " + dev.getNome() + "!");
            System.out.print("Deseja finalizar sua primeira atividade?: (s/n): ");
            resposta = sc.next().charAt(0);
            if (resposta == 's') {
                dev.progredir();
                System.out.println("Parabéns " +
                        dev.getNome() + ", esse é o seu XP adquirido até o momento: " + dev.calcularTotalXp());
                System.out.print("E terminar nossa mentoria? (s/n): ");
                resposta = sc.next().charAt(0);
                if (resposta == 's') {
                    dev.progredir();
                    System.out.println("Parabéns, você terminou nosso Bootcamp!!! Aguarde nosso contato.");
                    System.out.println("Esse é o seu XP adquirido durante o curso: " + dev.calcularTotalXp());
                }
            } else {
                System.out.print("Que pena, estaremos sempre aqui para te ajudar evoluir, volte quando quiser!!");
            }
        } else {
            System.out.println("Uma pena não termos conosco um talento igual você. Mas estaremos aqui sempre que precisar!!");
        }

        sc.close();
    }
}
