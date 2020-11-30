package io.github.rhyanspisoni.gerencia.rest;

import io.github.rhyanspisoni.gerencia.model.entity.Usuario;
import io.github.rhyanspisoni.gerencia.model.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/usuario")
@RequiredArgsConstructor
@CrossOrigin("*")
public class UsuarioController {
    private final UsuarioRepository repository;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void salvar(@RequestBody @Valid Usuario usuario){
        repository.save(usuario);
    }

}
