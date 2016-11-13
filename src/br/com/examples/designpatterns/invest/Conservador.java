package br.com.examples.designpatterns.invest;

public class Conservador implements Investimento {

  @Override
  public double calcula(ContaBancaria contaBancaria) {
    return contaBancaria.getSaldo() * 0.008;
  }
}
