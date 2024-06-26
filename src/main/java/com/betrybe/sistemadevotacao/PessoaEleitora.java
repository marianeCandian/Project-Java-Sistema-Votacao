package com.betrybe.sistemadevotacao;

public class PessoaEleitora extends Pessoa {

  private String cpf;

  /**
   * Construtor.
   */
  public PessoaEleitora(String nome, String cpf) {
    super(nome);
    this.cpf = cpf;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }
}
