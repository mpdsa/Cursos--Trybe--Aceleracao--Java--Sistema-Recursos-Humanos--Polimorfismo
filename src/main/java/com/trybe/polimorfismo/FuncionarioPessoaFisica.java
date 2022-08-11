package com.trybe.polimorfismo;

/** Classe Funcionario - Pessoa Física. */
public class FuncionarioPessoaFisica extends Funcionario {
  
  public void setSalarioBruto(double salarioBruto) {
    super.salarioBruto = salarioBruto;
  }
  
  /** Método escrito da classe abstrata Funcionário. */
  public double calcularSalarioLiquido() {
    double calculo = super.salarioBruto - (super.salarioBruto * 0.20);
    
    return calculo;
  }

}