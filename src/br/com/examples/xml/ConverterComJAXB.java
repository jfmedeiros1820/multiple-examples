package br.com.examples.xml;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

public class ConverterComJAXB {

  public static void main(String[] args) throws Exception {
    JAXBContext jaxbContext = JAXBContext.newInstance(Venda.class);
    Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
    Venda venda = (Venda) unmarshaller.unmarshal(new File("src/vendas.xml"));

    System.out.println(venda);
  }
}
