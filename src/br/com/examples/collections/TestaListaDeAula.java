package br.com.examples.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaListaDeAula {

  public static void main(String[] args) {
    Aula aula1 = new Aula("Revisitando os ArrayLists", 21);
    Aula aula2 = new Aula("Listas de Objetos", 20);
    Aula aula3 = new Aula("Relacionamento de listas e objetos", 15);

    ArrayList<Aula> aulas = new ArrayList<Aula>();
    aulas.add(aula1);
    aulas.add(aula2);
    aulas.add(aula3);

    System.out.println(aulas);

    Collections.sort(aulas);

    System.out.println(aulas);

    Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
    aulas.sort(Comparator.comparing(Aula::getTempo));

    System.out.println(aulas);
  }
}
