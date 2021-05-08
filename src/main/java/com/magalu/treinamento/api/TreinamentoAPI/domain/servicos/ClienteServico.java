package com.magalu.treinamento.api.TreinamentoAPI.domain.servicos;

import java.util.ArrayList;
import java.util.List;

import com.magalu.treinamento.api.TreinamentoAPI.domain.entidades.Cliente;
import com.magalu.treinamento.api.TreinamentoAPI.domain.modelViews.ClienteSimples;
import com.magalu.treinamento.api.TreinamentoAPI.infra.db.ClienteDb;

public class ClienteServico {
  public static void adicionar(Cliente cliente){
    ClienteDb.clientes.add(cliente);
  }

  public static List<ClienteSimples> Lista() {
    List<ClienteSimples> clienteSimples = new ArrayList<ClienteSimples>();
    for (Cliente cli : ClienteDb.clientes) {
      ClienteSimples c = new ClienteSimples();
      c.setId(cli.getId());
      c.setNome(cli.getNome());
      c.setCpf(cli.getCpf());
      c.setTelefone(cli.getTelefone());
      clienteSimples.add(c);
    }
    return clienteSimples;
  }

  public static int getIndex() {
    return ClienteDb.clientes.size() + 1;
  }

  public static void delete(int id) {
    Cliente cliente = null;
    for (Cliente cli : ClienteDb.clientes) {
      if(cli.getId() == id){
        cliente = cli;
        break;
      }
    }
    
    if(cliente != null){
      ClienteDb.clientes.remove(cliente);
    }
  }
}
