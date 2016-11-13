package br.com.examples.xml;

import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

import java.io.FileInputStream;
import java.io.InputStream;

public class LeXmlComSAX {

  public static void main(String[] args) throws Exception {
    XMLReader reader = XMLReaderFactory.createXMLReader();
    ProdutosHandler handler = new ProdutosHandler();
    reader.setContentHandler(handler);

    InputStream is = new FileInputStream("src/vendas.xml");
    InputSource arquivo = new InputSource(is);
    reader.parse(arquivo);

    System.out.println(handler.getProdutos());
  }
}
