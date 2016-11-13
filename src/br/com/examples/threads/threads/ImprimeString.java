package br.com.examples.threads.threads;

public class ImprimeString implements Runnable {

  @Override
  public void run() {
    System.out.println("String a partir de uma nova thread");
  }
}
