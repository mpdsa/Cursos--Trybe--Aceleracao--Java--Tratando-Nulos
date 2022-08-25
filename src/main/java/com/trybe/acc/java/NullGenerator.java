package com.trybe.acc.java;

/** Classe NullGenerator. */
public class NullGenerator {

  /** Recebe um número, se for par retorna "BOB" caso contrário gera uma exceção. */
  public String getNome(int odd) {
    if ((odd % 2) == 0) {
      return "BOB";
    } else {
      throw new Error("Nome nulo");
    }
  }

}
