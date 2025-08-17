package livraria.service;


import livraria.model.Usuario;
import livraria.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    private UsuarioRepository usuarioRepository;
    public void salvar(Usuario usuario) {

        usuarioRepository.save(usuario);
    }
}
