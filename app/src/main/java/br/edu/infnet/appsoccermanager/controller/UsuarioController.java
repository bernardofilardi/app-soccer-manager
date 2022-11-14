package br.edu.infnet.appsoccermanager.controller;

import br.edu.infnet.appsoccermanager.model.domain.Endereco;
import br.edu.infnet.appsoccermanager.model.domain.Usuario;
import br.edu.infnet.appsoccermanager.model.service.UsuarioService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@SessionAttributes("user")
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

    @PostMapping(value = "/cep")
    public String buscar(@RequestParam String cep, Model model) {
        Endereco endereco = usuarioService.buscarCep(cep);

        model.addAttribute("endereco", endereco);

        return "usuario/cadastro";
    }
}