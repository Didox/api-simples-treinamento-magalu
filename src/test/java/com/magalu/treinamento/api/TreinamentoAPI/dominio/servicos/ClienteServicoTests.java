package com.magalu.treinamento.api.TreinamentoAPI.dominio.servicos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.magalu.treinamento.api.TreinamentoAPI.domain.entidades.Cliente;
import com.magalu.treinamento.api.TreinamentoAPI.domain.servicos.ClienteServico;

import org.apache.tomcat.util.threads.TaskThread;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ClienteServicoTests {
  @Test
	void salvarCliente() throws InterruptedException {
    // TaskThread.sleep(100);

    Cliente cliente = new Cliente();
    cliente.setId(1);
    cliente.setNome("Aluno");
    cliente.setCpf("0000000");
    cliente.setTelefone("(00)00000-0000");
    cliente.setSenha("1234321");

    ClienteServico.adicionar(cliente);
    
    assertEquals(ClienteServico.Lista().size(), 1);
	}

  // @Test
	// void apagaCliente() throws InterruptedException {

  //   Cliente cliente = new Cliente();
  //   cliente.setId(1);
  //   cliente.setNome("Aluno");
  //   cliente.setCpf("0000000");
  //   cliente.setTelefone("(00)00000-0000");
  //   cliente.setSenha("1234321");
  //   ClienteServico.adicionar(cliente);

  //   ClienteServico.delete(1);

  //   assertEquals(ClienteServico.Lista().size(), 0);
	// }
}
