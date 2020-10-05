package com.proway.desafio.modelo;


    import javax.persistence.Column;
    import javax.persistence.Entity;
    import javax.persistence.GeneratedValue;
    import javax.persistence.GenerationType;
    import javax.persistence.Id;
    import javax.persistence.Table;

@Table(name="partidas")
    @Entity
    public class PartidaModelo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "jogo")
    private Integer jogo;

    @Column(name = "placar")
    private Integer placar;

    @Column(name = "minimoTemporada")
    private Integer minimoTemporada;

    @Column(name = "maximoTemporada")
    private Integer maximoTemporada;

    @Column(name = "quebraRecordeMinimo")
    private Boolean quebraRecordeMinimo;

    @Column(name = "quebraRecordeMaximo")
    private Boolean quebraRecordeMaximo;

    public Integer getJogo() {
        return jogo;
    }

    public void setJogo(Integer jogo) {
        this.jogo = jogo;
    }

    public Integer getPlacar() {
        return placar;
    }

    public void setPlacar(Integer placar) {
        if (placar >= 0 && placar < 1000) {
            this.placar = placar;
        }
    }

    public Integer getMinimoTemporada() {
        return minimoTemporada;
    }

    public void setMinimoTemporada(Integer minimoTemporada) {
                this.minimoTemporada = minimoTemporada;
    }

    public Integer getMaximoTemporada() {
        return maximoTemporada;
    }

    public void setMaximoTemporada(Integer maximoTemporada) {
            this.maximoTemporada = maximoTemporada;
    }

    public Boolean getQuebraRecordeMaximo() {
        return quebraRecordeMaximo;
    }

    public void setQuebraRecordeMaximo(Boolean quebraRecordeMaximo) {
            this.quebraRecordeMaximo = quebraRecordeMaximo;
    }

    public Boolean getQuebraRecordeMinimo() {
        return quebraRecordeMinimo;
    }

    public void setQuebraRecordeMinimo(Boolean quebraRecordeMinimo) {
            this.quebraRecordeMinimo = quebraRecordeMinimo;
    }
}
