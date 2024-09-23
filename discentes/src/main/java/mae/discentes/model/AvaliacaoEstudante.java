package mae.discentes.model;

import jakarta.persistence.*;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Entity
public class AvaliacaoEstudante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @ManyToOne
    private Discentes discenteAvaliador;

    @NotNull
    @ManyToOne
    private Disciplina disciplinaDaAvaliacao;

    @NotNull
    private LocalDateTime data;

    @NotNull
    @Min(1)
    @Max(5)
    private Integer didatica;


    @Min(1)
    @Max(5)
    private Integer metodoDeEnsino;


    @Min(0)
    @Max(4)
    private Integer esclarecimentoDuvidas;


    @Min(0)
    @Max(4)
    private Integer ritmoDeAula;

    @Max(800)
    private String comentario; // Comentário anônimo no front

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Discentes getDiscenteAvaliador() {
        return discenteAvaliador;
    }

    public void setDiscenteAvaliador(Discentes discenteAvaliador) {
        this.discenteAvaliador = discenteAvaliador;
    }

    public Disciplina getDisciplinaDaAvaliacao() {
        return disciplinaDaAvaliacao;
    }

    public void setDisciplinaDaAvaliacao(Disciplina disciplinaDaAvaliacao) {
        this.disciplinaDaAvaliacao = disciplinaDaAvaliacao;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public Integer getDidatica() {
        return didatica;
    }

    public void setDidatica(Integer didatica) {
        this.didatica = didatica;
    }

    public Integer getMetodoDeEnsino() {
        return metodoDeEnsino;
    }

    public void setMetodoDeEnsino(Integer metodoDeEnsino) {
        this.metodoDeEnsino = metodoDeEnsino;
    }

    public Integer getEsclarecimentoDuvidas() {
        return esclarecimentoDuvidas;
    }

    public void setEsclarecimentoDuvidas(Integer esclarecimentoDuvidas) {
        this.esclarecimentoDuvidas = esclarecimentoDuvidas;
    }

    public Integer getRitmoDeAula() {
        return ritmoDeAula;
    }

    public void setRitmoDeAula(Integer ritmoDeAula) {
        this.ritmoDeAula = ritmoDeAula;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
}
