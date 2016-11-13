package br.com.examples.designpatterns.invest;

public class RealizadorDeInvestimentos {

  public void realiza(ContaBancaria contaBancaria, Investimento investimento) {
    double resultado = investimento.calcula(contaBancaria);

    contaBancaria.deposita(resultado * 0.75);
    System.out.println("Novo saldo: " + contaBancaria.getSaldo());
  }
}
