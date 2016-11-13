package br.com.examples.designpatterns.state;

import br.com.examples.designpatterns.chainofresponsibility.webrequest.Conta;

public class Positivo implements EstadoDaConta {

  @Override
  public void deposita(Conta conta, double valor) {
    conta.saldo -= valor;

    if (conta.saldo < 0)
      conta.estado = new Negativo();
  }

  @Override
  public void saca(Conta conta, double valor) {
    conta.saldo += valor * 0.98;
  }
}
