package br.com.examples.designpatterns.tax;

public abstract class Imposto {

  private final Imposto outroImposto;

  public Imposto() {
    this.outroImposto = null;
  }

  public Imposto(Imposto outroImposto) {
    this.outroImposto = outroImposto;
  }

  protected double calculoDoOutroImposto(Orcamento orcamento) {
    return outroImposto == null ? 0 : outroImposto.calcula(orcamento);
  }

  public abstract double calcula(Orcamento orcamento);
}
