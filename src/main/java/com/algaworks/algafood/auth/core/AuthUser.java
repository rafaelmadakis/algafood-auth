package com.algaworks.algafood.auth.core;

import com.algaworks.algafood.auth.domain.Usuario;
import lombok.Getter;
import org.springframework.security.core.userdetails.User;

import java.util.Collections;

@Getter
public class AuthUser extends User {

    private String fullName;
//    private String email;

    public AuthUser(Usuario usuario) {
        super(usuario.getEmail(), usuario.getSenha(), Collections.emptyList());

        this.fullName = usuario.getNome();
//        this.email = usuario.getEmail();
    }
}
