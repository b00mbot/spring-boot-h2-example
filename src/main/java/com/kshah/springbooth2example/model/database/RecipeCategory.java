package com.kshah.springbooth2example.model.database;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;

@Getter
@Setter
@ToString
@Entity
@Table(name = "RECIPE_CATEGORY")
public class RecipeCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME")
    private String name;

    @OneToMany(mappedBy = "recipeCategory", cascade = CascadeType.ALL)
    private Set<Recipe> recipes;

    protected RecipeCategory() {}

    public RecipeCategory(String name) {
        this.name = name;
    }


}
