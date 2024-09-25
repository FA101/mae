package mae.discentes.controller;

import mae.discentes.model.Conteudo;
import mae.discentes.model.Disciplina;
import mae.discentes.repository.ConteudoRepository;
import mae.discentes.repository.DisciplinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/disciplina")
public class DisciplinaController {
    @Autowired
    private DisciplinaRepository disciplinaRepository;

    @GetMapping
    public List<Disciplina> listarDisciplinas() {
        return disciplinaRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Disciplina> buscarDisciplina(@PathVariable Long id) {
        return disciplinaRepository.findById(id)
                .map(disciplina -> ResponseEntity.ok(disciplina))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Disciplina criarDisciplina(@RequestBody @Valid Disciplina disciplina) {
        return disciplinaRepository.save(disciplina);
    }

}
