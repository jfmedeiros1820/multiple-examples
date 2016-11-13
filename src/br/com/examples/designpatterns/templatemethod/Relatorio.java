package br.com.examples.designpatterns.templatemethod;

import java.util.List;

import br.com.examples.designpatterns.chainofresponsibility.webrequest.Conta;

public abstract class Relatorio {

  public void imprime(List<Conta> contas) {
    cabecalho();
    corpo(contas);
    rodape();
  }

  protected abstract void rodape();

  protected abstract void corpo(List<Conta> contas);

  protected abstract void cabecalho();
}
