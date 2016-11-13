package br.com.examples.designpatterns.templatemethod;

import br.com.examples.designpatterns.tax.Imposto;
import br.com.examples.designpatterns.tax.Orcamento;

public abstract class TemplateDeImpostoCondicional extends Imposto {

  public TemplateDeImpostoCondicional() {}

  public TemplateDeImpostoCondicional(Imposto outroImposto) {
    super(outroImposto);
  }

  @Override
  public double calcula(Orcamento orcamento) {

    if (deveUsarMaximaTaxacao(orcamento)) {
      return maximaTaxacao(orcamento);
    } else {
      return minimaTaxacao(orcamento);
    }

  }

  public abstract double minimaTaxacao(Orcamento orcamento);

  public abstract double maximaTaxacao(Orcamento orcamento);

  public abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);
}
