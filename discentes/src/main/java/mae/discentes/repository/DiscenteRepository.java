package mae.discentes.repository;

import mae.discentes.model.Discentes;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface DiscenteRepository extends JpaRepository<Discentes, Long> {
    Optional<Discentes> findByEmail(String email);
}
