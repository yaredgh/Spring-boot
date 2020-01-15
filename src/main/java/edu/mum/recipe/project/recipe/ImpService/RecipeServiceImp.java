package edu.mum.recipe.project.recipe.ImpService;

import edu.mum.recipe.project.recipe.modles.Recipe;
import edu.mum.recipe.project.recipe.repo.RecipeRepo;
import edu.mum.recipe.project.recipe.sevice.RecipeService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
@Service
public class RecipeServiceImp implements RecipeService {
    private final RecipeRepo recipeRepo;

    public RecipeServiceImp(RecipeRepo recipeRepo) {
        this.recipeRepo = recipeRepo;
    }

    @Override
    public Set<Recipe> getRecipe() {
        Set<Recipe>recipeSet = new HashSet<>();
        recipeRepo.findAll().iterator().forEachRemaining(recipeSet::add);
        return recipeSet;
    }
}
