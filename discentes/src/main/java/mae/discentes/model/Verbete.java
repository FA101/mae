package mae.discentes.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Verbete {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "verbete", cascade = CascadeType.ALL)
    private List<Conteudo> conteudos = new ArrayList<>();

    private Integer upvote = 0;
    private Integer downvote = 0;
    private String descricaoVerbete;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Conteudo> getConteudos() {
        return conteudos;
    }

    public void setConteudos(List<Conteudo> conteudos) {
        this.conteudos = conteudos;
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

    public String getDescricaoVerbete() {
        return descricaoVerbete;
    }

    public void setDescricaoVerbete(String descricaoVerbete) {
        this.descricaoVerbete = descricaoVerbete;
    }
}
