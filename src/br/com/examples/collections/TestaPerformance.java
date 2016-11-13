package br.com.examples.collections;

import java.util.Collection;
import java.util.HashSet;

public class TestaPerformance {

  public static void main(String[] args) {
    Collection<Integer> numeros = new HashSet<Integer>();

    long inicioAdd = System.currentTimeMillis();

    for (int i = 1; i <= 50000; i++) {
      numeros.add(i);
    }

    long fimAdd = System.currentTimeMillis();

    long inicioContains = System.currentTimeMillis();

    for (Integer numero : numeros) {
      numeros.contains(numero);
    }

    long fimContains = System.currentTimeMillis();

    long tempoDeExecucaoAdd = fimAdd - inicioAdd;
    long tempoDeExecucaoContains = fimContains - inicioContains;

    System.out.println("Tempo gasto add: " + tempoDeExecucaoAdd);
    System.out.println("Tempo gasto contains: " + tempoDeExecucaoContains);
  }
}
