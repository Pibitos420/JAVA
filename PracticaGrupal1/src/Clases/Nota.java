package Clases;

import java.util.Date;

public class Nota {
    private int id;
    private Double valor;
    private Date fechaExamen;
    private boolean esRecuperatorio;

    private Catedra catedra;

    public Nota(int id, Double valor, Date fechaExamen, boolean esRecuperatorio) {
        this.id = id;
        this.valor = valor;
        this.fechaExamen = fechaExamen;
        this.esRecuperatorio = esRecuperatorio;
        this.catedra = null;
    }


    public int getId() {
        return id;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Date getFechaExamen() {
        return fechaExamen;
    }

    public void setFechaExamen(Date fechaExamen) {
        this.fechaExamen = fechaExamen;
    }

    public boolean getEsRecuperatorio() {
        return esRecuperatorio;
    }

    public void setEsRecuperatorio(boolean esRecuperatorio) {
        this.esRecuperatorio = esRecuperatorio;
    }

    public Catedra getCatedra() {
        return catedra;
    }

    public void setCatedra(Catedra cat) {
        this.catedra = cat;
    }

    @Override
    public String toString() {
        return "Clases.Nota{" + "id=" + id + ", valor=" + valor + ", fechaExamen=" + fechaExamen + ", esRecuperatorio=" + esRecuperatorio + '}';
    }
}
