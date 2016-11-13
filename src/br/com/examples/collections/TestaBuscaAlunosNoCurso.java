package br.com.examples.collections;

public class TestaBuscaAlunosNoCurso {

  public static void main(String[] args) {
    Curso javaColecoes = new Curso("Dominando as coleções do Java", "Joao Felipe");

    javaColecoes.adicionar(new Aula("Trabalhando com Arrays", 21));
    javaColecoes.adicionar(new Aula("Criando uma Aula", 20));
    javaColecoes.adicionar(new Aula("Modelando com coleções", 24));

    Aluno a1 = new Aluno("Rodrigo Turini", 340989);
    Aluno a2 = new Aluno("Guilherme Silveira", 5987);
    Aluno a3 = new Aluno("Mauricio Aniche", 17384);

    javaColecoes.matricula(a1);
    javaColecoes.matricula(a2);
    javaColecoes.matricula(a3);

    System.out.println("Quem é o aluno de matrícula 5987?");
    Aluno aluno = javaColecoes.buscaMatriculado(5987);
    System.out.println("Aluno: " + aluno);
  }
}
