package br.com.examples.designpatterns.builder;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.examples.designpatterns.observer.AcaoAposGerarNota;

public class NotaFiscalBuilder {

  private String razaoSocial;
  private String cnpj;

  private List<ItemDaNota> todosItens = new ArrayList<>();
  private double valorBruto;
  private double impostos;
  private String observacoes;
  private Calendar data;

  private List<AcaoAposGerarNota> todasAcoesASeremExecutadas;

  public NotaFiscalBuilder() {
    this.data = Calendar.getInstance();
    todasAcoesASeremExecutadas = new ArrayList<>();
  }

  public NotaFiscalBuilder paraEmpresa(String razaoSocial) {
    this.razaoSocial = razaoSocial;
    return this;
  }

  public NotaFiscalBuilder comCnpj(String cnpj) {
    this.cnpj = cnpj;
    return this;
  }

  public NotaFiscalBuilder com(ItemDaNota itemDaNota) {
    todosItens.add(itemDaNota);
    valorBruto += itemDaNota.getValor();
    impostos += itemDaNota.getValor() * 0.5;
    return this;
  }

  public NotaFiscalBuilder comObservacoes(String observacoes) {
    this.observacoes = observacoes;
    return this;
  }

  public NotaFiscalBuilder naData(Calendar data) {
    this.data = data;
    return this;
  }

  public void adicionaAcao(AcaoAposGerarNota acaoAposGerarNota) {
    this.todasAcoesASeremExecutadas.add(acaoAposGerarNota);
  }

  public NotaFiscal constroi() {
    NotaFiscal notaFiscal =
        new NotaFiscal(razaoSocial, cnpj, valorBruto, impostos, data, observacoes, todosItens);

    for (AcaoAposGerarNota acaoAposGerarNota : todasAcoesASeremExecutadas) {
      acaoAposGerarNota.executa(notaFiscal);
    }

    return notaFiscal;
  }
}
