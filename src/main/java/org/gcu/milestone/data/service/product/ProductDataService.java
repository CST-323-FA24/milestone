package org.gcu.milestone.data.service.product;

import org.gcu.milestone.data.entity.product.ProductEntity;
import org.gcu.milestone.data.repository.product.ProductRepository;
import org.gcu.milestone.data.service.DataService;
import org.springframework.stereotype.Service;

@Service
public class ProductDataService extends DataService<ProductEntity, Long>
{
    public ProductDataService(ProductRepository repository)
    {
        super(repository);
    }
}
