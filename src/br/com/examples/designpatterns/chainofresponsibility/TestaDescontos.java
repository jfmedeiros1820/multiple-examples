package br.com.examples.designpatterns.chainofresponsibility;

import br.com.examples.designpatterns.tax.Orcamento;

public class TestaDescontos {

  public static void main(String[] args) {
    CalculadorDeDescontos calculadorDeDescontos = new CalculadorDeDescontos();

    Orcamento orcamento = new Orcamento(500.0);

    Item lapis = new Item("LAPIS", 15.00);
    Item caneta = new Item("CANETA", 15.00);
    Item borracha = new Item("borracha", 15.00);

    orcamento.adicionaItens(caneta);
    orcamento.adicionaItens(borracha);
    orcamento.adicionaItens(lapis);

    double desconto = calculadorDeDescontos.calcula(orcamento);

    System.out.println(desconto);
  }
}
