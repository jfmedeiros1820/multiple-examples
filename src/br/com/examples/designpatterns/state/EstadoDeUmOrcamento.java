package br.com.examples.designpatterns.state;

import br.com.examples.designpatterns.tax.Orcamento;

public interface EstadoDeUmOrcamento {

  public void aplicaDescontoExtra(Orcamento orcamento);

  void aprova(Orcamento orcamento);

  void reprova(Orcamento orcamento);

  void finaliza(Orcamento orcamento);
}
