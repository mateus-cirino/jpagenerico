package modelos;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class ObjetoBase {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    protected int id;

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public abstract void stringToObjetoBase(String... dados);

    public abstract String[] objetoToString();
}
