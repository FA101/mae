package mae.discentes.controller;

import mae.discentes.model.AvaliacaoEstudante;
import mae.discentes.repository.AvaliacaoEstudanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/avaliacoes")    // localhost:8080/avaliacoes
public class AvaliacaoEstudanteController {

    @Autowired
    private AvaliacaoEstudanteRepository avaliacaoEstudanteRepository;

    @GetMapping
    public List<AvaliacaoEstudante> listarAvaliacoes() {
        return avaliacaoEstudanteRepository.findAll();
    }

    @GetMapping("/{id}")// localhost:8080/avaliacoes/2            sendo 2 para achar a pessoa com id 2 no banco
    public ResponseEntity<AvaliacaoEstudante> buscarAvaliacao(@PathVariable Long id) {  //pathvariable indica que o dado vai vir pelo URL
        return avaliacaoEstudanteRepository.findById(id)
                .map(avaliacao -> ResponseEntity.ok(avaliacao))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public AvaliacaoEstudante criarAvaliacao(@RequestBody @Valid AvaliacaoEstudante avaliacaoEstudante) {
        return avaliacaoEstudanteRepository.save(avaliacaoEstudante);
    }

    @PutMapping("/{id}")
    public ResponseEntity<AvaliacaoEstudante> atualizarAvaliacao(@PathVariable Long id, @RequestBody @Valid AvaliacaoEstudante avaliacaoEstudante) {
        if (!avaliacaoEstudanteRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        avaliacaoEstudante.setId(id);
        return ResponseEntity.ok(avaliacaoEstudanteRepository.save(avaliacaoEstudante));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarAvaliacao(@PathVariable Long id) {
        if (!avaliacaoEstudanteRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        avaliacaoEstudanteRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}

