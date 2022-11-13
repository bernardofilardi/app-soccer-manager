package br.edu.infnet.apiusuario.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.apiusuario.model.domain.Usuario;
import br.edu.infnet.apiusuario.model.service.UsuarioService;

@RestController
@RequestMapping("/api/usuario")
public class UsuarioController {

    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping
    public ResponseEntity<String> incluir(@RequestBody Usuario usuario) {
        try {
            usuarioService.incluir(usuario);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<String> excluir(@PathVariable Integer id) {
        try {
            usuarioService.excluir(id);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity buscarUsuario(@PathVariable Integer id) {
        try {
            return ResponseEntity.ok(usuarioService.pesquisar(id));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @GetMapping
    public List<Usuario> obterLista() {
        return usuarioService.listar();
    }

    @PostMapping(value = "/validar")
    public ResponseEntity validar(@RequestParam String email, @RequestParam String senha) {
        try {
            return ResponseEntity.ok(usuarioService.validar(email, senha));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}
