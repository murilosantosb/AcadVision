package br.com.notelab.backend.Model;

public class Caderno {
    private Long id;
    private String name;
    private String description;
    private String matter;

    public Caderno(Long id, String name, String description, String matter) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.matter = matter;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMatter() {
        return matter;
    }

    public void setMatter(String matter) {
        this.matter = matter;
    }
}
