package com.github.cvmob.CvMob.service;

import com.github.cvmob.CvMob.controller.ExportarRequest;
import org.springframework.stereotype.Service;

@Service
public class ExportarService {

  //TODO: criar uma interface ExportarStrategy com um método exportar que recebe uma String como parâmetro
  //TODO: criar as classes concretas para cada tipo de exportação e implementar o método. Utilize apenas um System.out.println para diferenciar
  //TODO: criar uma ExportarStrategyFactory para instanciar todos as classes concretas e um método publico para retornar a estratégia de acordo com o request
  //TODO: utilize aqui o ExportarStrategyFactory para pegar a estratégia correta na hora de exportar.
  public void exportar(ExportarRequest exportarRequest) {
    System.out.println(exportarRequest);
  }
}
