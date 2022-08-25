package com.trybe.acc.java;

/** Classe NullGuard. */
public class NullGuard {

  /** Retorna o resultado da divisão, se o valor for impar, trata o erro. */
  public String printName(int divisor) {
    NullGenerator ng = new NullGenerator();
    
    try {
      return ng.getNome(divisor);
    } catch (Error e) {
      return e.getMessage();
    }
  }
}
