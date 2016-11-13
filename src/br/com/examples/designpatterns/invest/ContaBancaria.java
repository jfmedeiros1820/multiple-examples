package br.com.examples.designpatterns.invest;

public class ContaBancaria {

  private double saldo;

  public double getSaldo() {
    return saldo;
  }

  public void deposita(double valor) {
    this.saldo += valor;
  }
}
