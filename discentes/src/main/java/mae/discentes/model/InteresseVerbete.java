package mae.discentes.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
public class InteresseVerbete {
    @EmbeddedId
    private InteresseVerbeteId id = new InteresseVerbeteId();

    @ManyToOne
    @MapsId("discenteId")
    private Discentes discente;

    @ManyToOne
    @MapsId("verbeteId")
    private Verbete verbete;

    private LocalDateTime dataInteresse;

    public InteresseVerbeteId getId() {
        return id;
    }

    public void setId(InteresseVerbeteId id) {
        this.id = id;
    }

    public Discentes getDiscente() {
        return discente;
    }

    public void setDiscente(Discentes discente) {
        this.discente = discente;
    }

    public Verbete getVerbete() {
        return verbete;
    }

    public void setVerbete(Verbete verbete) {
        this.verbete = verbete;
    }

    public LocalDateTime getDataInteresse() {
        return dataInteresse;
    }

    public void setDataInteresse(LocalDateTime dataInteresse) {
        this.dataInteresse = dataInteresse;
    }
}


