package br.com.examples.designpatterns.templatemethod;

import br.com.examples.designpatterns.chainofresponsibility.Item;
import br.com.examples.designpatterns.tax.Imposto;
import br.com.examples.designpatterns.tax.Orcamento;

import java.util.ArrayList;
import java.util.List;

public class IHIT extends TemplateDeImpostoCondicional {

  public IHIT() {}

  public IHIT(Imposto outroImposto) {
    super(outroImposto);
  }

  @Override
  public double minimaTaxacao(Orcamento orcamento) {
    return orcamento.getValor() * (0.01 * orcamento.getItens().size());
  }

  @Override
  public double maximaTaxacao(Orcamento orcamento) {
    return orcamento.getValor() * 0.13 + 100;
  }

  @Override
  public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
    return temDoisItensComOMesmoNome(orcamento);
  }

  private boolean temDoisItensComOMesmoNome(Orcamento orcamento) {
    List<String> noOrcamento = new ArrayList<String>();
    for (Item item : orcamento.getItens()) {
      if (noOrcamento.contains(item.getNome())) {
        return true;
      } else {
        noOrcamento.add(item.getNome());
      }
    }
    return false;
  }

}
