package org.gcu.milestone.data.service.product;

import org.gcu.milestone.data.entity.product.SizeEntity;
import org.gcu.milestone.data.repository.product.SizeRepository;
import org.gcu.milestone.data.service.DataService;
import org.springframework.stereotype.Service;

@Service
public class SizeDataService extends DataService<SizeEntity>
{
    public SizeDataService(SizeRepository repository)
    {
        super(repository);
    }
}
