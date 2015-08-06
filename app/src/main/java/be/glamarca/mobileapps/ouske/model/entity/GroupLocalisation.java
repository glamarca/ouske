package be.glamarca.mobileapps.ouske.model.entity;

/**
 * Created by sarace on 6/08/15.
 */
public class GroupLocalisation {
    private Long id;
    private Group group;
    private Localisation localisation;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public Localisation getLocalisation() {
        return localisation;
    }

    public void setLocalisation(Localisation localisation) {
        this.localisation = localisation;
    }
}
