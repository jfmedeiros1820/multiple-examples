package br.com.examples.datastructure.linkedlist;

public class Celula {

  private Object elemento;
  private Celula anterior;
  private Celula proximo;

  public Celula(Object elemento) {
    this(null, elemento);
  }

  public Celula(Celula proximo, Object elemento) {
    super();
    this.elemento = elemento;
    this.proximo = proximo;
  }

  public Object getElemento() {
    return elemento;
  }

  public void setProximo(Celula proximo) {
    this.proximo = proximo;
  }

  public Celula getProximo() {
    return proximo;
  }

  public Celula getAnterior() {
    return anterior;
  }

  public void setAnterior(Celula anterior) {
    this.anterior = anterior;
  }

}
