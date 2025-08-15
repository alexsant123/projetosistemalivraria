package livraria.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class emprestimosController {




    @GetMapping({ "/emprestimos/painel"})
    public String painel(  ) {




        return "emprestimos/painel";
    }
    @GetMapping({  "/emprestimos/registrar"})
    public String registrar(  ) {




        return "emprestimos/registrar";
    }

    @GetMapping({  "/emprestimos/relatorios"})
    public String relatorios(  ) {




        return "emprestimos/relatorios";
    }

}
