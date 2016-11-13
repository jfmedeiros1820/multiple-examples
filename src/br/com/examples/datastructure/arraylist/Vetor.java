package br.com.examples.datastructure.arraylist;

import java.util.Arrays;

public class Vetor {

  private Aluno[] alunos = new Aluno[100];
  private int totalDeAlunos = 0;

  public void adiciona(Aluno aluno) {
    garanteEspaco();
    this.alunos[totalDeAlunos] = aluno;
    totalDeAlunos++;
  }

  public void adiciona(int posicao, Aluno aluno) {
    garanteEspaco();
    if (!posicaoValida(posicao)) {
      throw new IllegalArgumentException("posição inválida");
    }

    for (int i = totalDeAlunos - 1; i >= posicao; i--) {
      alunos[i + 1] = alunos[i];
    }
    alunos[posicao] = aluno;
    totalDeAlunos++;
  }

  private boolean posicaoValida(int posicao) {
    return posicao >= 0 && posicao <= totalDeAlunos;
  }

  private boolean posicaoOcupada(int posicao) {
    return posicao >= 0 && posicao < totalDeAlunos;
  }

  public Aluno pega(int posicao) {
    if (!posicaoOcupada(posicao)) {
      throw new IllegalArgumentException("posição inválida");
    }
    return alunos[posicao];
  }

  private void garanteEspaco() {
    if (totalDeAlunos == alunos.length) {
      Aluno[] newArray = new Aluno[alunos.length * 2];
      for (int i = 0; i < alunos.length; i++) {
        newArray[i] = alunos[i];
      }
      this.alunos = newArray;
    }
  }

  public void remove(int posicao) {
    for (int i = posicao; i < totalDeAlunos; i++) {
      this.alunos[i] = alunos[i + 1];
    }
    totalDeAlunos--;
  }

  public boolean contem(Aluno aluno) {
    for (int i = 0; i < totalDeAlunos; i++) {
      if (aluno.equals(alunos[i])) {
        return true;
      }
    }
    return false;
  }

  public int tamanho() {
    return totalDeAlunos;
  }

  @Override
  public String toString() {
    return Arrays.toString(alunos);
  }
}
