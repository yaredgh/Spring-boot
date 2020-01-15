package edu.mum.recipe.project.recipe.repo;

import edu.mum.recipe.project.recipe.modles.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CategoryRepo extends CrudRepository<Category,Long> {
    Optional<Category> findByDescription(String description);
}


