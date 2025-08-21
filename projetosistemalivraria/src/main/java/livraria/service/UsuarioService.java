package livraria.service;


import livraria.enums.TipoUsuario;
import livraria.model.Usuario;
import livraria.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

         public Usuario salvar(Usuario usuario) {


            if (usuario != null &&   TipoUsuario.isValido(usuario.getTipo()) ) {


                return usuarioRepository.save(usuario);
            }
            return null;
        }

    }

