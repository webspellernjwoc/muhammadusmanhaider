package com.finalexam.exam2.Models;
import javax.persistence.*;

@Entity
@Table(name = "viruses")

public class Virus {

    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "virusname")
    private String virusName;

    @Column(name = "virusdescription")
    private String virusDescription;

    @Column(name = "virussymtoms")
    private String virusSymptoms;

    @Column(name = "virusduration")
    private String virusDuration;

    @Column(name = "virusmortalityrate")
    private String virusMortalityrate;

    @Column(name = "virusimage")
    private String virusImage;

    @Column(name = "virusimageURL")
    private String virusImageURL;

    public Virus() {
    }

    public Virus (String id, String virusName, String virusDescription, String virusSymptoms, String virusDuration, String virusMortalityrate, String virusImage, String virusImageURL) {
        this.id = id;
        this.virusName = virusName;
        this.virusDescription = virusDescription;
        this.virusSymptoms = virusSymptoms;
        this.virusDuration = virusDuration;
        this.virusMortalityrate = virusMortalityrate;
        this.virusImage = virusImage;
        this.virusImageURL = virusImageURL;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getVirusName() {
        return virusName;
    }

    public void setVirusName(String virusName) {
        this.virusName = virusName;
    }

    public String getVirusDescription() {
        return virusDescription;
    }

    public void setVirusDescription(String virusDescription) {
        this.virusDescription = virusDescription;
    }

    public String getVirusSymptoms() {
        return virusSymptoms;
    }

    public void setVirusSymptoms(String virusSymptoms) {
        this.virusSymptoms = virusSymptoms;
    }

    public String getVirusDuration() {
        return virusDuration;
    }

    public void setVirusDuration(String virusDuration) {
        this.virusDuration = virusDuration;
    }

    public String getVirusMortalityrate() {
        return virusMortalityrate;
    }

    public void setVirusMortalityrate(String virusMortalityrate) {
        this.virusMortalityrate = virusMortalityrate;
    }

    public String getVirusImage() {
        return virusImage;
    }

    public void setVirusImage(String virusImage) {
        this.virusImage = virusImage;
    }

    public String getVirusImageURL() {
        return virusImageURL;
    }

    public void setVirusImageURL(String virusImageURL) {
        this.virusImageURL = virusImageURL;
    }
}