package br.com.examples.collections;

import java.util.Iterator;
import java.util.Set;

public class TestaCursoComAluno {

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

    Set<Aluno> alunos = javaColecoes.getAlunos();
    Iterator<Aluno> iterador = alunos.iterator();

    System.out.println("Utilizando iterator");
    while (iterador.hasNext()) {
      System.out.println(iterador.next());

    }

    System.out.println("Todos os alunos matriculados: ");
    javaColecoes.getAlunos().forEach(aluno -> {
      System.out.println(aluno);
    });

    System.out.println("O aluno " + a1.getNome() + " está matriculado?");
    System.out.println(javaColecoes.estaMatriculado(a1));

    Aluno turini = new Aluno("Rodrigo Turini", 340989);
    System.out.println("E esse Turini, está matriculado?");
    System.out.println(javaColecoes.estaMatriculado(turini));

    System.out.println("O a1 é equals ao Turini?");
    System.out.println(a1.equals(turini));
  }
}
