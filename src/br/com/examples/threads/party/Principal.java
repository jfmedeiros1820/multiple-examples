package br.com.examples.threads.party;

public class Principal {

  public static void main(String[] args) {
    Banheiro banheiro = new Banheiro();

    Thread convidado1 = new Thread(new TarefaNumero1(banheiro), "Joao");
    Thread convidado2 = new Thread(new TarefaNumero2(banheiro), "Pedro");
    Thread convidado3 = new Thread(new TarefaNumero1(banheiro), "Maria");
    Thread convidado4 = new Thread(new TarefaNumero2(banheiro), "Ana");
    Thread limpeza = new Thread(new TarefaLimpeza(banheiro), "Limpeza");

    limpeza.setDaemon(true);
    limpeza.setPriority(Thread.MAX_PRIORITY);

    convidado1.start();
    convidado2.start();
    convidado3.start();
    convidado4.start();
    limpeza.start();
  }
}
