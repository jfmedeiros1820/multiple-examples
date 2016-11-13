package br.com.examples.designpatterns.templatemethod;

import br.com.examples.designpatterns.chainofresponsibility.Item;
import br.com.examples.designpatterns.tax.Imposto;
import br.com.examples.designpatterns.tax.Orcamento;

public class IKCV extends TemplateDeImpostoCondicional {

  public IKCV() {}

  public IKCV(Imposto outroImposto) {
    super(outroImposto);
  }

  @Override
  public double minimaTaxacao(Orcamento orcamento) {
    return orcamento.getValor() * 0.06;
  }

  @Override
  public double maximaTaxacao(Orcamento orcamento) {
    return orcamento.getValor() * 0.1;
  }

  @Override
  public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
    return orcamento.getValor() > 500 && temItemMaiorQue100ReaisNo(orcamento);
  }

  private boolean temItemMaiorQue100ReaisNo(Orcamento orcamento) {
    for (Item item : orcamento.getItens()) {
      if (item.getValor() > 100)
        return true;
    }

    return false;
  }
}
