package livraria.controller;

import livraria.model.Usuario;
import livraria.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class cadastroController {

    @Autowired
    private  UsuarioService usuarioService;

    @GetMapping({"/", "/index"})
    public String index( ) {




        return "index";
    }


    @GetMapping({ "/cadastro/usuarios"})
    public String usuarios( ) {




        return "cadastro/usuarios";
    }

    @GetMapping({ "/cadastro/livros"})
    public String livros( ) {




        return "cadastro/livros";
    }
    @GetMapping({ "/cadastro/relatorios"})
    public String relatorios( ) {




        return "cadastro/relatorios";
    }

    @GetMapping({ "/cadastrarUsuario"})
    public String cadastrarusuario(Usuario usuario, Model model ) {


        Usuario usuarioSalvo = usuarioService.salvar(usuario);

         if (usuarioSalvo != null) {
            model.addAttribute("message", "Salvo com sucesso!");
        } else {
            model.addAttribute("message", "Erro ao salvar usuário.");
        }

        return "cadastro/usuarios";
    }
}
