package mae.discentes.repository;

import mae.discentes.model.AvaliacaoEstudante;
import org.springframework.data.jpa.repository.JpaRepository;
// Aqui o jpa automatiza as chamadas ao banco utilizando um dos MODEL
public interface AvaliacaoEstudanteRepository extends JpaRepository<AvaliacaoEstudante, Long> {

}
