package br.com.examples.collections;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {

  public static void main(String[] args) {
    String aula1 = "Modelando a classe aula";
    String aula2 = "Conhecendo mais de listas";
    String aula3 = "Trabalhando com Cursos e Sets";

    ArrayList<String> aulas = new ArrayList<String>();
    aulas.add(aula1);
    aulas.add(aula2);
    aulas.add(aula3);

    aulas.remove(0);

    System.out.println(aulas);
    System.out.println(aulas.size());

    for (int i = 0; i < aulas.size(); i++) {
      System.out.println("Aula: " + aulas.get(i));
    }

    String primeiraAula = aulas.get(0);
    System.out.println("A primeira aula é: " + primeiraAula);

    aulas.forEach(aula -> {
      System.out.println("Percorrendo:");
      System.out.println("Aula: " + aula);
    });

    Collections.sort(aulas);
    System.out.println("Depois de ordenado:");
    System.out.println(aulas);
  }

}
