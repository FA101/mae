package Services;

import Models.Feedback;
import Repositories.FeedbackRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeedbackService {

    @Autowired
    private FeedbackRepositorio feedbackRepository;

    public double calculateAverageFeedback(Long classId) {
        List<Feedback> feedbacks = FeedbackRepositorio.findByClassId(classId);
        return feedbacks.stream()
                .mapToDouble(Feedback::getRating)
                .average()
                .orElse(0.0);
    }
}
