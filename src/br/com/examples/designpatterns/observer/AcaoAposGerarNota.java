package br.com.examples.designpatterns.observer;

import br.com.examples.designpatterns.builder.NotaFiscal;

public interface AcaoAposGerarNota {

  public void executa(NotaFiscal notaFiscal);
}
