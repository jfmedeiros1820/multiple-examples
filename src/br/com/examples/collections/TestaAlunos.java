package br.com.examples.collections;

import java.util.Collection;
import java.util.HashSet;

public class TestaAlunos {

  public static void main(String[] args) {
    Collection<String> alunos = new HashSet<String>();
    alunos.add("Rodrigo Turini");
    alunos.add("Alberto Souza");
    alunos.add("Nico Steppat");
    alunos.add("Sergio Lopes");
    alunos.add("Renan Saggio");
    alunos.add("Mauricio Aniche");
    alunos.add("Mauricio Aniche");

    boolean adicionou = alunos.add("Mauricio Aniche");
    System.out.println("Mauricio foi adicionado ao Set? " + adicionou);

    System.out.println(alunos.size());

    for (String aluno : alunos) {
      System.out.println(aluno);
    }

    System.out.println(alunos);
  }
}
