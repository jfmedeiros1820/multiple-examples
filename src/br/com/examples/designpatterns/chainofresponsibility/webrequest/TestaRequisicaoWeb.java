package br.com.examples.designpatterns.chainofresponsibility.webrequest;

public class TestaRequisicaoWeb {

  public static void main(String[] args) {
    ProcessaRequisicaoWeb processaRequisicaoWeb = new ProcessaRequisicaoWeb();

    Conta conta = new Conta("João Felipe", 500.0);
    Requisicao requisicao = new Requisicao(Formato.PORCENTO);
    String resposta = processaRequisicaoWeb.processaRequisicao(requisicao, conta);

    System.out.println(resposta);
  }
}
