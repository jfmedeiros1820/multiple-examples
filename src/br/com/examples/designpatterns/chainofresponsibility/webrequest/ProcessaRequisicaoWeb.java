package br.com.examples.designpatterns.chainofresponsibility.webrequest;

public class ProcessaRequisicaoWeb {

  public String processaRequisicao(Requisicao requisicao, Conta conta) {
    Resposta r3 = new RespostaPorcento(null);
    Resposta r2 = new RespostaCSV(r3);
    Resposta r1 = new RespostaXML(r2);

    return r1.responde(requisicao, conta);
  }
}
