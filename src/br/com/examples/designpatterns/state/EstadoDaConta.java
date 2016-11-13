package br.com.examples.designpatterns.state;

import br.com.examples.designpatterns.chainofresponsibility.webrequest.Conta;

public interface EstadoDaConta {

  public void saca(Conta conta, double valor);

  public void deposita(Conta conta, double valor);
}
