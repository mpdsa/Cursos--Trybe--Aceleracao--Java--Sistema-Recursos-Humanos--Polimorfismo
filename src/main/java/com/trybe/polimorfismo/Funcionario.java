package com.trybe.polimorfismo;

/** Classe abstrata Funcionario. */
public abstract class Funcionario {
  protected String nome;
  protected String cpf;
  protected double salarioBruto;

  public String getNome() {
    return nome;
  }

  public String getCpf() {
    return cpf;
  }

  public double getSalarioBruto() {
    return salarioBruto;
  }

  public abstract double calcularSalarioLiquido();
}
