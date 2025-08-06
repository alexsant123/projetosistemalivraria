package model;

import enums.TipoUsuario;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Setter
@Getter
@ToString
@AllArgsConstructor
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String email;

    @Enumerated(EnumType.STRING)
    private TipoUsuario tipo;

     public Usuario() {}

     public Usuario(String nome, String email, TipoUsuario tipo) {
        this.nome = nome;
        this.email = email;
        this.tipo = tipo;
    }


}

