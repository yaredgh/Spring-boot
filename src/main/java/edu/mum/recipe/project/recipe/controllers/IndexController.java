package edu.mum.recipe.project.recipe.controllers;


import edu.mum.recipe.project.recipe.sevice.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    private RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping(value = {"","/","/index"})
    public String getIndex(Model model){
        model.addAttribute("recipe",recipeService.getRecipe());
        return "index";
    }
}
