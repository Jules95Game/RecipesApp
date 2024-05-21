package org.julian.recipesappspring.recipe;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface RecipeRepository extends JpaRepository<UUID, Recipe> {
}
