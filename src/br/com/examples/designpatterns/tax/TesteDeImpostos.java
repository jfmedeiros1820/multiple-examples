package br.com.examples.designpatterns.tax;

public class TesteDeImpostos {

  public static void main(String[] args) {
    ICMS icms = new ICMS();
    ISS iss = new ISS();

    Imposto impostoComplexo = new ISS(new ICMS());

    Orcamento orcamento = new Orcamento(500.0);

    double valor = impostoComplexo.calcula(orcamento);

    System.out.println(valor);

    CalculadorDeImpostos calculadorDeImpostos = new CalculadorDeImpostos();

    // Calcula ICMS
    calculadorDeImpostos.realizaCalculo(orcamento, icms);

    // Calcula ISS
    calculadorDeImpostos.realizaCalculo(orcamento, iss);
  }
}
