package br.com.examples.threads.threads;

public class ThreadSimples {

  public static void main(String[] args) {
    ImprimeString imprimeString = new ImprimeString();

    Thread novaThread = new Thread(imprimeString, "Nova Thread");

    novaThread.start();

    new Thread(new Runnable() {

      @Override
      public void run() {
        System.out.println("Segunda Thread");
      }
    }).start();
  }
}
