package mae.discentes.controller;

import mae.discentes.model.Discentes;
import mae.discentes.service.DiscenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/discentes")
public class LoginController {

    @Autowired
    private DiscenteService discenteService;

    // Endpoint para login
    @GetMapping("/login")
    public ResponseEntity<String> login(@RequestParam String email, @RequestParam String password) {
        if (discenteService.authenticate(email, password)) {
            return ResponseEntity.ok("Login bem-sucedido! Bem-vindo, " + email + "!");
        } else {
            return ResponseEntity.status(401).body("Credenciais inválidas.");
        }
    }

    // Endpoint para criação de conta
    @PostMapping("/criar")
    public ResponseEntity<String> criarConta(@RequestBody Discentes discente) {
        discenteService.saveDiscente(discente);
        return ResponseEntity.ok("Conta criada com sucesso!");
    }
}
