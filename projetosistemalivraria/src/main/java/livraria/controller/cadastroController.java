package livraria.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class cadastroController {

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
}
