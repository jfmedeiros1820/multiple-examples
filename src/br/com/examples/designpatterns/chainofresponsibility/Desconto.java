package br.com.examples.designpatterns.chainofresponsibility;

import br.com.examples.designpatterns.tax.Orcamento;

public interface Desconto {

  public double desconta(Orcamento orcamento);

  public void setProximo(Desconto proximo);
}
