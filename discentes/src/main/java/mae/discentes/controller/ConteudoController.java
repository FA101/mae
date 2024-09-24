package mae.discentes.controller;

import mae.discentes.model.Conteudo;
import mae.discentes.repository.ConteudoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/conteudos")
public class ConteudoController {

    @Autowired
    private ConteudoRepository conteudoRepository;

    @GetMapping
    public List<Conteudo> listarConteudos() {
        return conteudoRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Conteudo> buscarConteudo(@PathVariable Long id) {
        return conteudoRepository.findById(id)
                .map(conteudo -> ResponseEntity.ok(conteudo))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Conteudo criarConteudo(@RequestBody @Valid Conteudo conteudo) {
        return conteudoRepository.save(conteudo);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Conteudo> atualizarConteudo(@PathVariable Long id, @RequestBody @Valid Conteudo conteudo) {
        if (!conteudoRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        conteudo.setId(id);
        return ResponseEntity.ok(conteudoRepository.save(conteudo));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarConteudo(@PathVariable Long id) {
        if (!conteudoRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        conteudoRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
