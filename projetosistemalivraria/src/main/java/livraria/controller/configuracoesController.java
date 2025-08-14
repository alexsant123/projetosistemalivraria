package livraria.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class configuracoesController {

    @GetMapping({ "/configuracoes/sistema"})
    public String sistema(  ) {




        return "configuracoes/sistema";
    }
    @GetMapping({"/configuracoes", "/configuracoes/usuario"})
    public String usuario(  ) {




        return "configuracoes/usuario";
    }

}
