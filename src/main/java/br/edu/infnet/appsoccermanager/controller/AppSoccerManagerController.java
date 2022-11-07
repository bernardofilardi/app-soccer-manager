package br.edu.infnet.appsoccermanager.controller;

import br.edu.infnet.appsoccermanager.model.domain.Usuario;
import br.edu.infnet.appsoccermanager.model.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

import javax.servlet.http.HttpSession;

@Controller
@SessionAttributes("user")
public class AppSoccerManagerController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping(value = "/")
    public String home() {
        return "home";
    }

    @GetMapping(value = "/login")
    public String login() {
        return "login";
    }

    @PostMapping(value = "/login")
    public String login(Model model, @RequestParam String email, @RequestParam String senha) {

        Usuario usuario = usuarioService.validar(email, senha);

        if (usuario != null) {
            model.addAttribute("user", usuario);
            return "home";
        }
        return "login";
    }

    @GetMapping(value = "/logout")
    public String logout(HttpSession session, SessionStatus status) {
        status.setComplete();
        session.removeAttribute("user");

        return "redirect:/";
    }
}
