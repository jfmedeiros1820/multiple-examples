package br.com.examples.datastructure.linkedlist;

public class TestaListaLigada {

  public static void main(String[] args) {
    ListaLigada lista = new ListaLigada();

    System.out.println(lista);
    lista.adicionarNoComeco("mauricio");
    System.out.println(lista);
    lista.adicionarNoComeco("paulo");
    System.out.println(lista);
    lista.adicionarNoComeco("guilherme");
    System.out.println(lista);

    lista.adiciona("marcelo");
    System.out.println(lista);

    lista.adiciona(2, "gabriel");
    System.out.println(lista);

    Object x = lista.pega(2);
    System.out.println(x);

    System.out.println(lista.tamanho());

    lista.removeDoComeco();
    System.out.println(lista);

    lista.removeDoFim();
    System.out.println(lista);

    lista.adiciona("joao");
    System.out.println(lista);
    lista.adiciona("jose");
    System.out.println(lista);

    lista.remove(1);
    System.out.println(lista);

    System.out.println(lista.contem("mauricio"));
    System.out.println(lista.contem("danilo"));
  }
}
