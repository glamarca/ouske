package be.glamarca.mobileapps.ouske.model.entity;

/**
 * Created by sarace on 6/08/15.
 */
public class Localisation {

    private Long id;
    private String coordonnee;
    private String adresse;
    private String localisationName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCoordonnee() {
        return coordonnee;
    }

    public void setCoordonnee(String coordonnee) {
        this.coordonnee = coordonnee;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getLocalisationName() {
        return localisationName;
    }

    public void setLocalisationName(String localisationName) {
        this.localisationName = localisationName;
    }
}
