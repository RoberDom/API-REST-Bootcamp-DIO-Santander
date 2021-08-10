package com.digital.SantanderProjeto.controller;

import com.digital.SantanderProjeto.model.JornadaTrabalho;
import com.digital.SantanderProjeto.model.Usuario;
import com.digital.SantanderProjeto.service.UsuarioService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/usuário")
@CrossOrigin(origins= "*") //libera os domínios que podem acessar a API

public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @PostMapping
    @ApiOperation("Salva um usuário")
    public Usuario createUsuario(@RequestBody Usuario usuario){
        return usuarioService.saveUsuario(usuario);
    }

    @GetMapping
    @ApiOperation("Retorna uma lista de usuários")
    public List<Usuario> getUsuarioList(){ return usuarioService.findAll(); }


    @GetMapping("/{idUsuario}")
    @ApiOperation("Retorna um usuário pelo Id")
    public ResponseEntity<Usuario> getUsuarioByID(@PathVariable("idUsuario") Long idusuario) throws Exception {
        return ResponseEntity.ok(usuarioService.getById(idusuario).orElseThrow(() -> new Exception("Usuário não encontrado.")));
    }

    @PutMapping
    @ApiOperation("Atualiza um usuário")
    public Usuario updateUsuario(@RequestBody Usuario usuario){
        return usuarioService.updateUsuario(usuario);
    }

    @DeleteMapping("/{idUsuario}")
    @ApiOperation("Deleta um usuário pelo Id")
    public void deleteUsuario(@PathVariable("IdUsuario") long IdUsuario){
        usuarioService.deleteUsuario(IdUsuario);

    }

}
