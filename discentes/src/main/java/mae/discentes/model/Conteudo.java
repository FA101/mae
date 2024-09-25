package mae.discentes.model;
import javax.validation.constraints.NotBlank;

import jakarta.persistence.*;
import org.antlr.v4.runtime.misc.NotNull;
@Entity
public class Conteudo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer upvote;

    private Integer downvote;

    @Column(length = 800)
    private String conteudo;

    public Conteudo(Long id, Verbete verbete, Integer upvote, Integer downvote, String conteudo) {
        this.id = id;
        this.upvote = upvote;
        this.downvote = downvote;
        this.conteudo = conteudo;
    }

    public Conteudo() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    

    public Integer getUpvote() {
        return upvote;
    }

    public void setUpvote(Integer upvote) {
        this.upvote = upvote;
    }

    public Integer getDownvote() {
        return downvote;
    }

    public void setDownvote(Integer downvote) {
        this.downvote = downvote;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }
}
