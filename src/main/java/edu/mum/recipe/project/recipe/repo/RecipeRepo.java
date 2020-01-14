package edu.mum.recipe.project.recipe.repo;

import edu.mum.recipe.project.recipe.modles.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepo extends CrudRepository<Recipe,Long> {
}
