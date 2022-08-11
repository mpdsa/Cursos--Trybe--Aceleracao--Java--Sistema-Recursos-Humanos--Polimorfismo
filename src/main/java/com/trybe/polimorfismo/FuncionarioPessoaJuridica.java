package com.trybe.polimorfismo;

/** Classe Funcionario - Pessoa Jurídica. */
public class FuncionarioPessoaJuridica extends Funcionario {

  public void setSalarioBruto(double salarioBruto) {
    super.salarioBruto = salarioBruto;
  }

  /** Método escrito da classe abstrata Funcionário. */
  public double calcularSalarioLiquido() {
    double calculo = super.salarioBruto - (super.salarioBruto * 0.10);

    return calculo;
  }
}