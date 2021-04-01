package entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;



/**
 * The type Character.
 * @author whurd
 */
@Entity(name = "Character")
@Table(name = "characters") // case sensitive!
public class Character {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO, generator="native")
    @GenericGenerator(name = "native",strategy = "native")
    private int id;

    @Column (name="name")
    private String name;

    @Column (name="media")
    private String media;

    @Column (name="franchise")
    private String franchise;

    @Column (name="species")
    private String species;

    @Column (name="alignment")
    private String alignment;

    public Character() {
    }

    public Character(String name, String media, String franchise, String species, String alignment) {
        this.name = name;
        this.media = media;
        this.franchise = franchise;
        this.species = species;
        this.alignment = alignment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMedia() {
        return media;
    }

    public void setMedia(String media) {
        this.media = media;
    }

    public String getFranchise() {
        return franchise;
    }

    public void setFranchise(String franchise) {
        this.franchise = franchise;
    }

    public String getSpecies() { return species; }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getAlignment() {
        return alignment;
    }

    public void setAlignment(String alignment) {
        this.alignment = alignment;
    }

    @Override
    public String toString() {
        return "Character{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", media='" + media + '\'' +
                ", franchise='" + franchise + '\'' +
                ", species=" + species +
                ", alignment=" + alignment +
                '}';
    }
}
