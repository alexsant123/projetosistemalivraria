package livraria.enums;

import java.util.EnumSet;
import java.util.Set;

public enum TipoUsuario {
    ALUNO,
    FUNCIONARIO,
    PROFESSOR,
    USUARIOCOMUM,
    ADMIN;

    private static final Set<TipoUsuario> TIPOS_PERMITIDOS =
            EnumSet.of(ALUNO, FUNCIONARIO, PROFESSOR, USUARIOCOMUM);

    public static boolean isValido(TipoUsuario tipo) {
        return tipo != null && TIPOS_PERMITIDOS.contains(tipo);
    }

}
