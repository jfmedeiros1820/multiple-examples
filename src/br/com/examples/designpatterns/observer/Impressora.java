package br.com.examples.designpatterns.observer;

import br.com.examples.designpatterns.builder.NotaFiscal;

public class Impressora implements AcaoAposGerarNota {

  @Override
  public void executa(NotaFiscal notaFiscal) {
    System.out.println("imprimindo nota fiscal");
  }
}
