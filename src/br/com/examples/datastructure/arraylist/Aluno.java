package br.com.examples.datastructure.arraylist;

public class Aluno {

  private String nome;

  public Aluno(String nome) {
    this.nome = nome;
  }

  public String getNome() {
    return nome;
  }

  @Override
  public boolean equals(Object obj) {
    Aluno aluno = (Aluno) obj;
    return aluno.getNome().equals(this.nome);
  }

  @Override
  public String toString() {
    return nome;
  }
}
