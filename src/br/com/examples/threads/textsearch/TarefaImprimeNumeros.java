package br.com.examples.threads.textsearch;

public class TarefaImprimeNumeros implements Runnable {

  @Override
  public void run() {
    for (int i = 1; i <= 1000; i++) {
      Thread threadAtual = Thread.currentThread();
      System.out.println(threadAtual.getId() + " - " + i);
    }
  }

}
