package org.gcu.milestone.data.repository.product;

import org.gcu.milestone.data.entity.product.CategoryEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends CrudRepository<CategoryEntity, Long>
{
}