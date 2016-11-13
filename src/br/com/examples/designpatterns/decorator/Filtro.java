package br.com.examples.designpatterns.decorator;

import java.util.ArrayList;
import java.util.List;

import br.com.examples.designpatterns.chainofresponsibility.webrequest.Conta;

public abstract class Filtro {

  protected Filtro outroFiltro;

  public Filtro(Filtro outroFiltro) {
    this.outroFiltro = outroFiltro;
  }

  public Filtro() {}

  public abstract List<Conta> filtra(List<Conta> contas);

  protected List<Conta> proximo(List<Conta> contas) {
    return outroFiltro == null ? new ArrayList<Conta>() : outroFiltro.filtra(contas);
  }
}
