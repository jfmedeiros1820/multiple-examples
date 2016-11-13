package br.com.examples.designpatterns.tax;

import br.com.examples.designpatterns.chainofresponsibility.Item;
import br.com.examples.designpatterns.state.EmAprovacao;
import br.com.examples.designpatterns.state.EstadoDeUmOrcamento;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Orcamento {

  public double valor;
  private List<Item> itens;

  public EstadoDeUmOrcamento estadoAtual;

  public Orcamento(double valor) {
    this.valor = valor;
    this.itens = new ArrayList<Item>();
    this.estadoAtual = new EmAprovacao();
  }

  public Orcamento() {
    this.estadoAtual = new EmAprovacao();
  }

  public double getValor() {
    return valor;
  }

  public List<Item> getItens() {
    return Collections.unmodifiableList(itens);
  }

  public void adicionaItens(Item item) {
    this.itens.add(item);
  }

  public void aplicaDescontoExtra() {
    estadoAtual.aplicaDescontoExtra(this);
  }

  public void aprova() {
    estadoAtual.aprova(this);
  }

  public void reprova() {
    estadoAtual.reprova(this);
  }

  public void finaliza() {
    estadoAtual.finaliza(this);
  }
}
