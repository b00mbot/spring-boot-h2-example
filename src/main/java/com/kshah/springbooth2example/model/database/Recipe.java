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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Getter
@Setter
@ToString
@Entity
@Table(name = "RECIPE")
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "SERVINGS")
    private Integer servings;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "RECIPE_CATEGORY_ID")
    private RecipeCategory recipeCategory;


    protected Recipe() {}

    public Recipe(String title, String description) {
        this.title = title;
        this.description = description;
    }

}
