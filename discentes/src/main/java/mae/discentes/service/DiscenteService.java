package mae.discentes.service;

import mae.discentes.model.Discentes;
import mae.discentes.repository.DiscenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DiscenteService {

    @Autowired
    private DiscenteRepository discenteRepository;

    // Método para autenticar o discente com base no email e senha
    public boolean authenticate(String email, String password) {
        Optional<Discentes> discente = discenteRepository.findByEmail(email);
        // Verifica se o email existe e se a senha está correta
        return discente.isPresent() && discente.get().getPassword().equals(password);
    }

    // Método para criar um novo discente
    public Discentes saveDiscente(Discentes discente) {
        return discenteRepository.save(discente);
    }
}
