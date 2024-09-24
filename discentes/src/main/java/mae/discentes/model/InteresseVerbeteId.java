package mae.discentes.model;

import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class InteresseVerbeteId implements Serializable {
    private Long discenteId;
    private Long verbeteId;

    public InteresseVerbeteId() {
        this.discenteId = discenteId;
        this.verbeteId = verbeteId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof InteresseVerbeteId that)) return false;

        if (!discenteId.equals(that.discenteId)) return false;
        return verbeteId.equals(that.verbeteId);
    }

    @Override
    public int hashCode() {
        int result = discenteId.hashCode();
        result = 31 * result + verbeteId.hashCode();
        return result;
    }

    public InteresseVerbeteId(Long discenteId, Long verbeteId) {
        this.discenteId = discenteId;
        this.verbeteId = verbeteId;
    }

    public Long getDiscenteId() {
        return discenteId;
    }

    public void setDiscenteId(Long discenteId) {
        this.discenteId = discenteId;
    }

    public Long getVerbeteId() {
        return verbeteId;
    }

    public void setVerbeteId(Long verbeteId) {
        this.verbeteId = verbeteId;
    }

}