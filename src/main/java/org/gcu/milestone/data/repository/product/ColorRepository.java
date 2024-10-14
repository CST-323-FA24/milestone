package org.gcu.milestone.data.repository.product;

import org.gcu.milestone.data.entity.DataEntity;
import org.gcu.milestone.data.entity.product.ColorEntity;
import org.gcu.milestone.data.entity.product.ProductEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ColorRepository extends CrudRepository<DataEntity, Long>
{
}
