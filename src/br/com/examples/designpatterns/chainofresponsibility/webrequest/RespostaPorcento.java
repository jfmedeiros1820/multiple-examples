package br.com.examples.designpatterns.chainofresponsibility.webrequest;

public class RespostaPorcento implements Resposta {

  private Resposta proxima;

  public RespostaPorcento(Resposta proxima) {
    this.proxima = proxima;
  }

  @Override
  public String responde(Requisicao req, Conta conta) {
    if (req.getFormato().equals(Formato.PORCENTO)) {
      return conta.toPorcento();
    } else {
      return proxima.responde(req, conta);
    }
  }
}
