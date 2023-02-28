package com.github.cvmob.CvMob.controller;

import com.github.cvmob.CvMob.service.ExportarService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/exportar")
public class ExportarController {

  private final ExportarService exportarService;

  public ExportarController(ExportarService exportarService) {
    this.exportarService = exportarService;
  }

  @PostMapping
  public void exportar(@RequestBody ExportarRequest exportarRequest){
      exportarService.exportar(exportarRequest);
  }
}
