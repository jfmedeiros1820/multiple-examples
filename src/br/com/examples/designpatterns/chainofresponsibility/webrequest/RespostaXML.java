package br.com.examples.designpatterns.chainofresponsibility.webrequest;

public class RespostaXML implements Resposta {

  private Resposta proxima;

  public RespostaXML(Resposta proxima) {
    this.proxima = proxima;
  }

  @Override
  public String responde(Requisicao req, Conta conta) {
    if (req.getFormato().equals(Formato.XML)) {
      return conta.toXML();
    } else {
      return proxima.responde(req, conta);
    }
  }
}
