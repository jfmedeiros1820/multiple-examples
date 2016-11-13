package br.com.examples.designpatterns.chainofresponsibility.webrequest;

public class RespostaCSV implements Resposta {

  private Resposta proxima;

  public RespostaCSV(Resposta proxima) {
    this.proxima = proxima;
  }

  @Override
  public String responde(Requisicao req, Conta conta) {
    if (req.getFormato().equals(Formato.CSV)) {
      return conta.toCSV();
    } else {
      return proxima.responde(req, conta);
    }
  }
}
