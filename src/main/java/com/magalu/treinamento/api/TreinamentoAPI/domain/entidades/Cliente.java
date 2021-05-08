package com.magalu.treinamento.api.TreinamentoAPI.domain.entidades;

public class Cliente {
  private int id;
  private String nome;
  private String cpf;
  private String telefone;
  private String senha;

  public int getId() {
    return id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public String getTelefone() {
    return telefone;
  }
  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }
  public String getCpf() {
    return cpf;
  }
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }
  public String getSenha() {
    return senha;
  }
  public void setSenha(String senha) {
    this.senha = senha;
  }
}
