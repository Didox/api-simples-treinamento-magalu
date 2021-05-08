package com.magalu.treinamento.api.TreinamentoAPI.controllers;

import java.util.List;

import com.magalu.treinamento.api.TreinamentoAPI.domain.entidades.Cliente;
import com.magalu.treinamento.api.TreinamentoAPI.domain.modelViews.ClienteMessage;
import com.magalu.treinamento.api.TreinamentoAPI.domain.modelViews.ClienteSimples;
import com.magalu.treinamento.api.TreinamentoAPI.domain.servicos.ClienteServico;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientesController {
  @GetMapping("/clientes")
  public List<ClienteSimples> index(){
    return ClienteServico.Lista();
  }

  @PostMapping("/clientes")
  public Cliente criar(@RequestBody Cliente cliente){
    int index = ClienteServico.getIndex();
    cliente.setId(index);
    ClienteServico.adicionar(cliente);
    return cliente;
  }

  @DeleteMapping("/clientes/{id}")
  public ClienteMessage delete(@PathVariable int id){
    ClienteServico.delete(id);
    return new ClienteMessage("Cliente apagado com sucesso");
  }
}
