package org.gcu.milestone.data.repository.product;

import org.gcu.milestone.data.entity.product.BrandEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrandRepository extends CrudRepository<BrandEntity, Long>
{
}
