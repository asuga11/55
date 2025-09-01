package mn.onlineshop.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "category")
public class Category extends BaseEntity {
    private String name;
    private String description;

    @Column(name="description", length = 200)
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Column(name = "name",length = 40,nullable = false)
    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }
}
