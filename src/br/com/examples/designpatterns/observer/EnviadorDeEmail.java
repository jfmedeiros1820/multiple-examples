package br.com.examples.designpatterns.observer;

import br.com.examples.designpatterns.builder.NotaFiscal;

public class EnviadorDeEmail implements AcaoAposGerarNota {

  @Override
  public void executa(NotaFiscal notaFiscal) {
    System.out.println("enviando por e-mail");
  }
}
