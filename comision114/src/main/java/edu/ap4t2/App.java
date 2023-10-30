package edu.ap4t2;

import edu.ap4t2.model.Materia;

/**
 * Hello world!
 *
 */
public class App {

  public static void main(String[] args) {
    System.out.println("Hello World!");

    Materia mM = new Materia("Matematica");
    Materia mF = new Materia("Fisica");

    for (int i = 0; i < 10; i++) {
      mM.incrementIdGlobal();
    }
    System.out.println("idGlobal: " + Materia.getIdGlobal());
  }
}
