package ics.ci.authentification.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "v_entreposage_true")
public class VentreposageTrueLivrable {

    @Id
    @Column(name = "entreposage_id")
    private Long entreposageId;

    @Column(name = "est_livrable")
    private Boolean estLivrable;

    @Column(name = "quantite_restante")
    private int quantiteRestante;

    @Column(name = "quantite_verse")
    private int quantiteVerse;

    @Column(name = "entrepot_nom")
    private String entrepotNom;

    @Column(name = "produit_nom")
    private String produitNom;

    @Column(name = "projet_nom")
    private String projetNom;

    @Column(name = "operation_id")
    private Long operationId;

    @Column(name = "entreposage_reference")
    private String entreposageReference;

    @Column(name = "entreposage_date")
    private LocalDateTime entreposageDate;

    public VentreposageTrueLivrable() {
        super();
    }

    public Long getEntreposageId() {
        return entreposageId;
    }

    public void setEntreposageId(Long entreposageId) {
        this.entreposageId = entreposageId;
    }

    public Boolean getEstLivrable() {
        return estLivrable;
    }

    public void setEstLivrable(Boolean estLivrable) {
        this.estLivrable = estLivrable;
    }

    public int getQuantiteRestante() {
        return quantiteRestante;
    }

    public void setQuantiteRestante(int quantiteRestante) {
        this.quantiteRestante = quantiteRestante;
    }

    public int getQuantiteVerse() {
        return quantiteVerse;
    }

    public void setQuantiteVerse(int quantiteVerse) {
        this.quantiteVerse = quantiteVerse;
    }

    public String getEntrepotNom() {
        return entrepotNom;
    }

    public void setEntrepotNom(String entrepotNom) {
        this.entrepotNom = entrepotNom;
    }

    public String getProduitNom() {
        return produitNom;
    }

    public void setProduitNom(String produitNom) {
        this.produitNom = produitNom;
    }

    public String getProjetNom() {
        return projetNom;
    }

    public void setProjetNom(String projetNom) {
        this.projetNom = projetNom;
    }

    public Long getOperationId() {
        return operationId;
    }

    public void setOperationId(Long operationId) {
        this.operationId = operationId;
    }

    public String getEntreposageReference() {
        return entreposageReference;
    }

    public void setEntreposageReference(String entreposageReference) {
        this.entreposageReference = entreposageReference;
    }

    public LocalDateTime getEntreposageDate() {
        return entreposageDate;
    }

    public void setEntreposageDate(LocalDateTime entreposageDate) {
        this.entreposageDate = entreposageDate;
    }
}

