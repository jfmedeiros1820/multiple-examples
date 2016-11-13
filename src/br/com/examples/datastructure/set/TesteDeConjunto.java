package br.com.examples.datastructure.set;

import java.util.HashSet;
import java.util.Set;


public class TesteDeConjunto {

  public static void main(String[] args) {
    Conjunto conjunto = new Conjunto();
    conjunto.adiciona("Mauricio");
    System.out.println(conjunto);

    conjunto.adiciona("Mauricio");
    System.out.println(conjunto);

    conjunto.adiciona("Marcelo");
    conjunto.adiciona("Guilherme");
    System.out.println(conjunto);

    conjunto.remove("Mauricio");
    System.out.println(conjunto);

    Set<String> conjuntoDoJava = new HashSet<String>();
    conjuntoDoJava.add("Mauricio");

    String x = "Guilherme";
    System.out.println(x.hashCode());
  }
}
