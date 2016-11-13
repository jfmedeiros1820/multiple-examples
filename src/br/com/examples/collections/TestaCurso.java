package br.com.examples.collections;


public class TestaCurso {

  public static void main(String[] args) {
    Curso javaColecoes = new Curso("Dominando as coleções do Java", "Joao Felipe");

    javaColecoes.adicionar(new Aula("Trabalhando com Arrays", 21));
    javaColecoes.adicionar(new Aula("Criando uma Aula", 20));
    javaColecoes.adicionar(new Aula("Modelando com coleções", 24));
    System.out.println(javaColecoes.getAulas());

    javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList", 21));
    System.out.println(javaColecoes.getAulas());
  }
}
