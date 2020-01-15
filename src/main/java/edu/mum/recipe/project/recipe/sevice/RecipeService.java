package edu.mum.recipe.project.recipe.sevice;

import edu.mum.recipe.project.recipe.modles.Recipe;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public interface RecipeService {
    Set<Recipe> getRecipe();
}
