package br.com.examples.designpatterns.observer;

import java.util.Calendar;

import br.com.examples.designpatterns.builder.ItemDaNota;
import br.com.examples.designpatterns.builder.NotaFiscal;
import br.com.examples.designpatterns.builder.NotaFiscalBuilder;

public class TesteAcao {

  public static void main(String[] args) {
    NotaFiscalBuilder notaFiscalBuilder = new NotaFiscalBuilder();
    notaFiscalBuilder.adicionaAcao(new EnviadorDeEmail());
    notaFiscalBuilder.adicionaAcao(new NotaFiscalDao());
    notaFiscalBuilder.adicionaAcao(new EnviadorDeSms());
    notaFiscalBuilder.adicionaAcao(new Impressora());
    notaFiscalBuilder.adicionaAcao(new Multiplicador(3));

    NotaFiscal notaFiscal = notaFiscalBuilder.paraEmpresa("Caelum").comCnpj("123.456.789-00023")
        .com(new ItemDaNota("Item 1", 200.0)).com(new ItemDaNota("Item 2", 300.0))
        .com(new ItemDaNota("Item 3", 400.0)).comObservacoes("Observacao")
        .naData(Calendar.getInstance()).constroi();

    System.out.println(notaFiscal.getValorBruto());
  }
}
