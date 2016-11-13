package br.com.examples.designpatterns.chainofresponsibility.webrequest;

import java.util.Calendar;

import br.com.examples.designpatterns.state.EstadoDaConta;

public class Conta {

  private String nome;
  public double saldo;
  private int numero;
  private String agencia;
  private Calendar dataAbertura;
  public EstadoDaConta estado;

  public Conta(String nome, double saldo) {
    this.nome = nome;
    this.saldo = saldo;
  }

  public String getNome() {
    return nome;
  }

  public double getSaldo() {
    return saldo;
  }

  public String toXML() {
    return "<conta><titular>" + nome + "</titular><saldo>" + saldo + "</saldo></conta>";
  }

  public String toCSV() {
    return nome + "," + saldo;
  }

  public String toPorcento() {
    return nome + "%" + saldo;
  }

  public int getNumero() {
    return numero;
  }

  public String getAgencia() {
    return agencia;
  }

  public Calendar getDataAbertura() {
    return dataAbertura;
  }

  public void setDataAbertura(Calendar dataAbertura) {
    this.dataAbertura = dataAbertura;
  }
}
