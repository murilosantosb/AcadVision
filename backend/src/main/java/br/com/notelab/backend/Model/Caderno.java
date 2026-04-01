package br.com.notelab.backend.Model;

public class Caderno {
    private Long id;
    private Long userId;
    private String name;
    private String description;
    private String matter;

    public Caderno(Long id, Long userId, String name, String description, String matter) {
        this.id = id;
        this.userId = userId;
        this.name = name;
        this.description = description;
        this.matter = matter;
    }

    public Long getId() {
        return id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
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
