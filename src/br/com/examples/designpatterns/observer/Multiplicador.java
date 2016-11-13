package br.com.examples.designpatterns.observer;

import br.com.examples.designpatterns.builder.NotaFiscal;

public class Multiplicador implements AcaoAposGerarNota {

  private double fator;

  public Multiplicador(double fator) {
    this.fator = fator;
  }

  @Override
  public void executa(NotaFiscal notaFiscal) {
    System.out.println("Multiplicado: " + notaFiscal.getValorBruto() * fator);
  }

}
