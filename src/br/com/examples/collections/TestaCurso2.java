package br.com.examples.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {

  public static void main(String[] args) {
    Curso javaColecoes = new Curso("Dominando as coleções do Java", "Joao Felipe");

    javaColecoes.adicionar(new Aula("Trabalhando com Arrays", 21));
    javaColecoes.adicionar(new Aula("Criando uma Aula", 20));
    javaColecoes.adicionar(new Aula("Modelando com coleções", 24));

    List<Aula> aulasImutaveis = javaColecoes.getAulas();
    System.out.println(aulasImutaveis);

    List<Aula> aulas = new ArrayList<>(aulasImutaveis);
    Collections.sort(aulas);
    System.out.println(aulas);

    System.out.println(javaColecoes.getTempoTotal());

    System.out.println(javaColecoes);

  }
}
