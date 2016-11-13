package br.com.examples.designpatterns.decorator;

import br.com.examples.designpatterns.tax.ICMS;
import br.com.examples.designpatterns.tax.Imposto;
import br.com.examples.designpatterns.tax.Orcamento;

public class TestaImpostoMuitoAlto {

  public static void main(String[] args) {
    Imposto imposto = new ImpostoMuitoAlto(new ICMS());

    Orcamento orcamento = new Orcamento(500.0);

    double valor = imposto.calcula(orcamento);

    System.out.println(valor);
  }
}
