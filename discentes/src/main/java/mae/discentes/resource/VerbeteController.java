package mae.discentes.resource;

import mae.discentes.model.Verbete;
import mae.discentes.repository.VerbeteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/verbetes")
public class VerbeteController {

    @Autowired
    private VerbeteRepository verbeteRepository;

    @GetMapping
    public List<Verbete> listarVerbetes() {
        return verbeteRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Verbete> buscarVerbete(@PathVariable Long id) {
        return verbeteRepository.findById(id)
                .map(verbete -> ResponseEntity.ok(verbete))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Verbete criarVerbete(@RequestBody @Valid Verbete verbete) {
        return verbeteRepository.save(verbete);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Verbete> atualizarVerbete(@PathVariable Long id, @RequestBody @Valid Verbete verbete) {
        if (!verbeteRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        verbete.setId(id);
        return ResponseEntity.ok(verbeteRepository.save(verbete));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarVerbete(@PathVariable Long id) {
        if (!verbeteRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        verbeteRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}

