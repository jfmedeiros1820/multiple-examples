package br.com.examples.designpatterns.chainofresponsibility.webrequest;

interface Resposta {

  String responde(Requisicao requisicao, Conta conta);
}
