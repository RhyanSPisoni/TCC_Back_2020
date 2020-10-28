package br.com.rhyan14.api_Clientes.model.api.rest;

import br.com.rhyan14.api_Clientes.model.entity.Cliente;
import br.com.rhyan14.api_Clientes.model.repository.ClienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/clientes")
@RequiredArgsConstructor
@CrossOrigin("*")
public class ClienteController {
    private final ClienteRepository repository;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente save( @RequestBody Cliente cliente){
        return repository.save(cliente);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete( @PathVariable int id ){
        repository.deleteById(id);
    }

    @GetMapping
    public List<Cliente> list(){
        return repository.findAll();
    }


}
