package org.gcu.milestone.data.repository.product;

import org.gcu.milestone.data.entity.product.ProductEntity;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<ProductEntity, Long>
{
}
