package br.edu.infnet.appsoccermanager.controller;

import br.edu.infnet.appsoccermanager.model.domain.Usuario;
import br.edu.infnet.appsoccermanager.model.service.UsuarioService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UsuarioController {

    private UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping(value = "/usuario/lista")
    public String lista(Model model) {
        model.addAttribute("listagem", usuarioService.obterLista());

        return "usuario/lista";
    }

    @GetMapping(value = "/usuario")
    public String novo() {
        return "usuario/cadastro";
    }

    @PostMapping(value = "/usuario/incluir")
    public String incluir(Usuario usuario) {

        usuarioService.incluir(usuario);

        return "redirect:/usuario/lista";
    }

    @GetMapping(value = "/usuario/{id}/excluir")
    public String excluir(@PathVariable Integer id) {
        usuarioService.excluir(id);

        return "redirect:/usuario/lista";
    }
}