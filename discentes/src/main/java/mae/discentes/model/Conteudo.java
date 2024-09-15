package mae.discentes.model;
import javax.validation.constraints.NotBlank;

import org.antlr.v4.runtime.misc.NotNull;

public class Conteudo {
    @NotBlank
    Integer upvote;
    @NotBlank
    Integer downvote;

}
