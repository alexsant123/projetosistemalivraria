package livraria.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping({"/", "/index"})
    public String index( ) {




        return "index";
    }


    @GetMapping({ "/cadastro/usuarios"})
    public String usuarios( ) {




        return "cadastro/usuarios";
    }

    @GetMapping({ "/cadastro/livros"})
    public String usuarios( ) {




        return "livros/usuarios";
    }
}
