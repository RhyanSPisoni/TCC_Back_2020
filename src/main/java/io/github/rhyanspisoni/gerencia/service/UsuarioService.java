package io.github.rhyanspisoni.gerencia.service;

import io.github.rhyanspisoni.gerencia.model.entity.Usuario;
import io.github.rhyanspisoni.gerencia.model.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService implements UserDetailsService {

    @Autowired
    private UsuarioRepository repository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Usuario usuario = repository
                .findByNome(username)
                .orElseThrow(() -> new UsernameNotFoundException("Login não encontrado"));
        return User
                .builder()
                .username(usuario.getNome())
                .password(usuario.getSenha())
                .roles("USER")
                .build();
    }
}
