import java.util.ArrayList;
import java.util.List;

public class VilaManager {

    private List<Aluno> listaAlunos = new ArrayList<>();

    private List<Professor> listaProfessores = new ArrayList<>();

    private List<Curso> listaCursos = new ArrayList<>();

    private List<Matricula> listaMatriculas = new ArrayList<>();

    public void registrarCurso(String nome, Integer codigoCurso, Integer quantidadeMaximaDeAlunos){
        Curso curso = new Curso();
        curso.setNome(nome);
        curso.setCodigoCurso(codigoCurso);
        curso.setQtdMaximaAlunos(quantidadeMaximaDeAlunos);
        listaCursos.add(curso);
    }

    public void excluirCurso(Integer codigoCurso){
        for (Curso curso : listaCursos){
            if (codigoCurso.equals(curso.getCodigoCurso())){
                listaCursos.remove(curso);
            } else {
                System.out.println("Curso não encontrado");
        }
      }
    }

    public void registrarProfessorAdjunto(String nome, String sobrenome, Integer codigoProfessor,String especialidade, Integer quantidadeDeHoras){
        ProfessorAdjunto professor = new ProfessorAdjunto();
        professor.setNome(nome);
        professor.setSobrenome(sobrenome);
        professor.setCodigoProfessor(codigoProfessor);
        professor.setEspecialidade(especialidade);
        professor.setHorasMonitoramento(quantidadeDeHoras);
        listaProfessores.add(professor);
    }

    public void registrarProfessorTitular(String nome, String sobrenome, Integer codigoProfessor, String especialidade){
        ProfessorTitular professor = new ProfessorTitular();
        professor.setNome(nome);
        professor.setSobrenome(sobrenome);
        professor.setCodigoProfessor(codigoProfessor);
        professor.setEspecialidade(especialidade);
        listaProfessores.add(professor);
    }

    public void excluirProfessor(Integer codigoProfessor){
        for (Professor professor : listaProfessores){
            if (codigoProfessor.equals(professor.getCodigoProfessor())){
                listaProfessores.remove(professor);
            } else {
                System.out.println("Professor não encontrado");
            }
        }
    }

    public Aluno getAlunoPorCodigo(Integer codigoAluno){
        for (Aluno aluno : listaAlunos){
            if (codigoAluno.equals(aluno.getCodigoAluno())){
                return aluno;
            }
        }
        System.out.println("Aluno não encontrado");
        return null;
    }

    public Professor getProfessorPorCodigo(Integer codigoProfessor){

        for (Professor professor : listaProfessores){
            if (codigoProfessor.equals(professor.getCodigoProfessor())){
                return professor;
            }
        }
        System.out.println("Professor não encontrado");
        return null;
    }

   public Curso getCursoPorCodigo(Integer codigoCurso){
        for (Curso curso : listaCursos){
            if (codigoCurso.equals(curso.getCodigoCurso())){
                return curso;
            }

        }
        System.out.println("Curso não encontrado");
        return null;
   }

   public void registrarAluno(String nome, String sobrenome, Integer codigoAluno){
        Aluno aluno = new Aluno(nome,sobrenome,codigoAluno);
        listaAlunos.add(aluno);
   }

   public void matricularAluno(Integer codigoAluno, Integer codigoCurso) {

       Aluno aluno = getAlunoPorCodigo(codigoAluno);
       Curso curso = getCursoPorCodigo(codigoCurso);

       if (curso.adicionarUmAluno(aluno)) {

           Matricula novaMatricula = new Matricula(aluno, curso);
           listaMatriculas.add(novaMatricula);
       } else {

           System.out.println(" Não foi possivel realizar a Matricula, não há vagas ");
       }

   }

   public void alocarProfessor(Integer codigoCurso,Integer codigoProfessorTitular, Integer codigoProfessorAdjunto){

        ProfessorTitular professorTitular = (ProfessorTitular) getProfessorPorCodigo(codigoProfessorTitular);
        ProfessorAdjunto professorAjunto = (ProfessorAdjunto) getProfessorPorCodigo(codigoProfessorAdjunto);

        getCursoPorCodigo(codigoCurso).setProfessorTitular(professorTitular);
        getCursoPorCodigo(codigoCurso).setProfessorAdjunto(professorAjunto);
   }

    public Curso consultarMatricula(Integer codigoAluno){
        for (Matricula matricula : listaMatriculas) {
            if (matricula.getAluno().getCodigoAluno().equals(codigoAluno)){
                return matricula.getCurso();
            }

        }return null;

    }

    public List<Aluno> getListaAlunos() {
        return listaAlunos;
    }

    public void setListaAlunos(List<Aluno> listaAlunos) {
        this.listaAlunos = listaAlunos;
    }

    public List<Professor> getListaProfessores() {
        return listaProfessores;
    }

    public void setListaProfessores(List<Professor> listaProfessores) {
        this.listaProfessores = listaProfessores;
    }

    public List<Curso> getListaCursos() {
        return listaCursos;
    }

    public void setListaCursos(List<Curso> listaCursos) {
        this.listaCursos = listaCursos;
    }

    public List<Matricula> getListaMatriculas() {
        return listaMatriculas;
    }

    public void setListaMatriculas(List<Matricula> listaMatriculas) {
        this.listaMatriculas = listaMatriculas;
    }
}
