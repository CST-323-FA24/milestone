package org.gcu.milestone.data.service.product;

import org.gcu.milestone.data.entity.product.BrandEntity;
import org.gcu.milestone.data.repository.product.BrandRepository;
import org.gcu.milestone.data.service.DataService;
import org.springframework.stereotype.Service;

@Service
public class BrandDataService extends DataService<BrandEntity>
{
    public BrandDataService(BrandRepository brandRepository)
    {
        super(brandRepository);
    }
}
