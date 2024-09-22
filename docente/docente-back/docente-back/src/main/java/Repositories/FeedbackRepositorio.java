package Repositories;

import Models.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface FeedbackRepositorio extends JpaRepository<Feedback, Long> {
    List<Feedback> findByClassId(Long classId); // Custom query method
}
