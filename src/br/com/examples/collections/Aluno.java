package br.com.examples.collections;

public class Aluno {

  private String nome;
  private int matricula;

  public Aluno(String nome, int matricula) {
    if (nome == null) {
      throw new NullPointerException();
    }
    this.nome = nome;
    this.matricula = matricula;
  }

  public String getNome() {
    return nome;
  }

  public int getMatricula() {
    return matricula;
  }

  @Override
  public String toString() {
    return "[Aluno: " + this.nome + ", matricula: " + this.matricula + "]";
  }

  @Override
  public boolean equals(Object obj) {
    if (obj != null && obj instanceof Aluno) {
      Aluno outro = (Aluno) obj;
      return this.nome.equals(outro.getNome());
    }
    return super.equals(obj);
  }

  @Override
  public int hashCode() {
    return this.nome.hashCode();
  }
}
