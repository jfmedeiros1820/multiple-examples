package br.com.examples.threads.textsearch;

public class ImprimeNumeros {

  public static void main(String[] args) {
    Thread threadTarefaNumeros1 = new Thread(new TarefaImprimeNumeros());
    Thread threadTarefaNumeros2 = new Thread(new TarefaImprimeNumeros());

    threadTarefaNumeros1.start();
    threadTarefaNumeros2.start();
  }
}
