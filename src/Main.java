import java.util.Scanner;

public class Main {




    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        VilaManager vilaDaFolha = new VilaManager();

        vilaDaFolha.registrarProfessorTitular("Namikaze","Minato",1234,"KinJutsu");
        vilaDaFolha.registrarProfessorAdjunto("Hatake","Kakashi",4321,"NinJutsu",5000);

        vilaDaFolha.registrarProfessorTitular("Maito","Gai",5678,"TaiJutsu");
        vilaDaFolha.registrarProfessorAdjunto("Hyūga","Neji",8765,"Kekkei Genkai",15000);

        vilaDaFolha.registrarCurso("Full Stack",2001,3);
        vilaDaFolha.registrarCurso("Android Development",2002,3);

        vilaDaFolha.alocarProfessor(2002,1234,4321);
        vilaDaFolha.alocarProfessor(2001,5678,8765);

        vilaDaFolha.registrarAluno("Nohana","Rin",0001);
        vilaDaFolha.registrarAluno("Uchiha","Obito",0002);
        vilaDaFolha.registrarAluno("Uzumaki","Naruto",0005);

        vilaDaFolha.registrarAluno("Rock","Lee",0003);
        vilaDaFolha.registrarAluno("Mitsashi","Tenten",004);


        vilaDaFolha.matricularAluno(0001,2002);
        vilaDaFolha.matricularAluno(0002,2002);
        vilaDaFolha.matricularAluno(0005,2002);

        vilaDaFolha.matricularAluno(0003,2001);
        vilaDaFolha.matricularAluno(0004,2001);

        System.out.println("ESCOLA DE CODING DA VILA OCULTA DA FOLHA");
        System.out.println("_________________________________________________________________");
        System.out.println("RA's Disponiveis - 0001 - 0002 - 0003 - 0004 - 0005");
        System.out.println("_________________________________________________________________");

        System.out.println("Digite seu RA para consultar sua Matricula: ");

        int RA  = scanner.nextInt();

        String nomeDoAluno = vilaDaFolha.getAlunoPorCodigo(RA).getNome();

        String sobrenomeDoAluno = vilaDaFolha.getAlunoPorCodigo(RA).getSobrenome();

        String cursoDoAluno = vilaDaFolha.consultarMatricula(RA).getNome();

        String professorTitular = vilaDaFolha.consultarMatricula(RA).getProfessorTitular().getNome();

        String sobrenomeProfessorTitular = vilaDaFolha.consultarMatricula(RA).getProfessorTitular().getSobrenome();

        String professorAdjunto = vilaDaFolha.consultarMatricula(RA).getProfessorAdjunto().getNome();

        String sobrenomeProfessorAdjunto = vilaDaFolha.consultarMatricula(RA).getProfessorAdjunto().getSobrenome();

        System.out.println("Olá "+nomeDoAluno+" "+sobrenomeDoAluno+",");
        System.out.println("Você está Matriculado(a) no Curso de "+cursoDoAluno+",");
        System.out.println("Com o Professor "+professorTitular+" "+sobrenomeProfessorTitular+" e o Professor "+professorAdjunto+" "+sobrenomeProfessorAdjunto);
        System.out.println("_________________________________________________________________");
        System.out.println("Seja Muito Bem Vindo(a) a nossa Academia Ninja!");
        System.out.println("_________________________________________________________________");



        }
    }

