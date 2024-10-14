package org.gcu.milestone.data.repository.product;

import org.gcu.milestone.data.entity.product.SizeEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SizeRepository extends CrudRepository<SizeEntity, Long>
{
}