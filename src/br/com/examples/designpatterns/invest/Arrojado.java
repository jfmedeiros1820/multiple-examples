package br.com.examples.designpatterns.invest;

import java.util.Random;

public class Arrojado implements Investimento {

  private Random random;

  public Arrojado() {
    this.random = new Random();
  }

  @Override
  public double calcula(ContaBancaria contaBancaria) {
    int chute = random.nextInt(10);
    if (chute >= 0 && chute <= 1)
      return contaBancaria.getSaldo() * 0.5;
    else if (chute >= 2 && chute <= 4)
      return contaBancaria.getSaldo() * 0.3;
    else
      return contaBancaria.getSaldo() * 0.006;
  }
}
