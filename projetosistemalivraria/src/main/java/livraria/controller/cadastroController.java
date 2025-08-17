package livraria.controller;

import livraria.model.Usuario;
import livraria.service.UsuarioService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class cadastroController {

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

          usuarioService.salvar(usuario);


        return"";
    }
}
