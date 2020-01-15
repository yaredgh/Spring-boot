package edu.mum.recipe.project.recipe.repo;

import edu.mum.recipe.project.recipe.modles.UnitMeasure;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UnitMeasureRepo extends CrudRepository<UnitMeasure,Long> {
    Optional<UnitMeasure> findByUom(String uom);
}
