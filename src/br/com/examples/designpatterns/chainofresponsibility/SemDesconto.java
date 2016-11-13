package br.com.examples.designpatterns.chainofresponsibility;

import br.com.examples.designpatterns.tax.Orcamento;

public class SemDesconto implements Desconto {

  @Override
  public double desconta(Orcamento orcamento) {
    return 0;
  }

  @Override
  public void setProximo(Desconto proximo) {
    // Nao tem
  }

}
