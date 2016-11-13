package br.com.examples.designpatterns.decorator;

import java.util.ArrayList;
import java.util.List;

import br.com.examples.designpatterns.chainofresponsibility.webrequest.Conta;

public class FiltroMenorQue100Reais extends Filtro {

  public FiltroMenorQue100Reais() {}

  public FiltroMenorQue100Reais(Filtro outroFiltro) {
    super(outroFiltro);
  }

  @Override
  public List<Conta> filtra(List<Conta> contas) {
    List<Conta> filtrada = new ArrayList<Conta>();
    for (Conta conta : contas) {
      if (conta.getSaldo() < 100)
        filtrada.add(conta);
    }

    filtrada.addAll(proximo(contas));
    return filtrada;
  }

}
