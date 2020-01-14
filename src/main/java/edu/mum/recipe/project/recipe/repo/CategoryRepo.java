package edu.mum.recipe.project.recipe.repo;

import edu.mum.recipe.project.recipe.modles.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepo extends CrudRepository<Category,Long> {
}
