package br.com.examples.threads.textsearch;

import java.io.File;
import java.util.Scanner;

public class TarefaBuscaNome implements Runnable {

  private String nomeArquivo;
  private String nome;

  public TarefaBuscaNome(String nomeArquivo, String nome) {
    this.nomeArquivo = nomeArquivo;
    this.nome = nome;
  }

  @Override
  public void run() {
    try {
      Scanner scanner = new Scanner(new File(nomeArquivo));

      int numeroLinha = 1;

      while (scanner.hasNextLine()) {
        String linha = scanner.nextLine();

        if (linha.matches(nome)) {
          System.out.println(nomeArquivo + " - " + numeroLinha + " - " + linha);
        }

        numeroLinha++;
      }
      scanner.close();
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }
}
