package br.com.examples.designpatterns.templatemethod;

import java.util.Calendar;
import java.util.List;

import br.com.examples.designpatterns.chainofresponsibility.webrequest.Conta;

public class RelatorioComplexo extends Relatorio {

  @Override
  protected void rodape() {
    System.out.println("banco@xyz.com.br");
    System.out.println(Calendar.getInstance().getTime());
  }

  @Override
  protected void corpo(List<Conta> contas) {
    for (Conta conta : contas) {
      System.out.println(conta.getNome() + " - " + conta.getNumero() + " - " + conta.getAgencia()
          + " - " + conta.getSaldo());
    }
  }

  @Override
  protected void cabecalho() {
    System.out.println("Banco XYZ");
    System.out.println("Avenida Paulista, 1234");
    System.out.println("(11) 1234-5678");
  }

}
