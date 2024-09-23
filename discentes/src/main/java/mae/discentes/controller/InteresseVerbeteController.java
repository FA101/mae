package mae.discentes.controller;

import mae.discentes.model.Discentes;
import mae.discentes.model.InteresseVerbete;
import mae.discentes.model.InteresseVerbeteId;
import mae.discentes.model.Verbete;
import mae.discentes.repository.DiscenteRepository;
import mae.discentes.repository.InteresseVerbeteRepository;
import mae.discentes.repository.VerbeteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/interesses")
public class InteresseVerbeteController {

    @Autowired
    private InteresseVerbeteRepository interesseVerbeteRepository;

    @Autowired
    private DiscenteRepository discenteRepository;

    @Autowired
    private VerbeteRepository verbeteRepository;

    @GetMapping("/discente/{discenteId}")
    public List<Verbete> listarVerbetesInteressados(@PathVariable Long discenteId) {
        return interesseVerbeteRepository.findAll().stream()
                .filter(interesse -> interesse.getDiscente().getId().equals(discenteId))
                .map(InteresseVerbete::getVerbete)
                .collect(Collectors.toList());
    }

    @PostMapping
    public ResponseEntity<InteresseVerbete> adicionarInteresse(@RequestParam Long discenteId, @RequestParam Long verbeteId) {
        Optional<Discentes> discente = discenteRepository.findById(discenteId);
        Optional<Verbete> verbete = verbeteRepository.findById(verbeteId);

        if (discente.isPresent() && verbete.isPresent()) {
            InteresseVerbete interesse = new InteresseVerbete();
            interesse.setDiscente(discente.get());
            interesse.setVerbete(verbete.get());
            interesse.setDataInteresse(LocalDateTime.now());
            interesseVerbeteRepository.save(interesse);
            return ResponseEntity.ok(interesse);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping
    public ResponseEntity<Void> removerInteresse(@RequestParam Long discenteId, @RequestParam Long verbeteId) {
        InteresseVerbeteId id = new InteresseVerbeteId();
        id.setDiscenteId(discenteId);
        id.setVerbeteId(verbeteId);

        if (interesseVerbeteRepository.existsById(id)) {
            interesseVerbeteRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
