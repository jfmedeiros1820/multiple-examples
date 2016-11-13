package br.com.examples.designpatterns.chainofresponsibility.webrequest;

public class Requisicao {

  private Formato formato;

  public Requisicao(Formato formato) {
    this.formato = formato;
  }

  public Formato getFormato() {
    return formato;
  }
}
