package com.digital.SantanderProjeto.controller;

import com.digital.SantanderProjeto.model.JornadaTrabalho;
import com.digital.SantanderProjeto.service.JornadaService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController //Requisição HTTP retorna como JSON
@RequestMapping(value = "/jornada") //URI da API
@Api("API REST Jornada")
@CrossOrigin(origins= "*") //libera os domínios que podem acessar a API

public class JornadaTrabalhoController {
    @Autowired
    JornadaService jornadaService;

    @PostMapping
    @ApiOperation("Salva uma Jornada de Trabalho")
    public JornadaTrabalho createJornada(@RequestBody JornadaTrabalho jornadaTrabalho) {
        return jornadaService.saveJornada(jornadaTrabalho);
    }

    @GetMapping
    @ApiOperation("Retorna uma lista Jornada de Trabalho")
    public List<JornadaTrabalho> getJornadaList() {
        return jornadaService.findAll();
    }

    @GetMapping("/{IdJornada}")
    @ApiOperation("Retorna uma Jornada de Trabalho pelo Id")
    public ResponseEntity<JornadaTrabalho> getJornadabyId(@PathVariable("IdJornada") long IdJornada) throws Exception {
        return  ResponseEntity.ok(jornadaService.getByID(IdJornada)
                .orElseThrow(() -> new Exception("Dado não encontrado!")));
    }

    @PutMapping
    @ApiOperation("Atualiza Jornada de Trabalho")
    public JornadaTrabalho updateJornada(@RequestBody JornadaTrabalho jornadaTrabalho) {
        return jornadaService.updateJornada(jornadaTrabalho);
    }

    @DeleteMapping("/{IdJornada}")
    @ApiOperation("Deleta uma Jornada de Trabalho pelo Id")
    public void deleteJornada(@PathVariable("IdJornada") long IdJornada){
         jornadaService.deleteJornada(IdJornada);

    }

}