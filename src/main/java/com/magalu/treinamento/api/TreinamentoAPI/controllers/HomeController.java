package com.magalu.treinamento.api.TreinamentoAPI.controllers;

import com.magalu.treinamento.api.TreinamentoAPI.domain.modelViews.Home;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
  @GetMapping("/")
  public Home index(){
    return new Home();
  }
}
