package org.gcu.milestone.data.service.product;

import org.gcu.milestone.data.entity.product.ColorEntity;
import org.gcu.milestone.data.repository.product.ColorRepository;
import org.gcu.milestone.data.service.DataService;
import org.springframework.stereotype.Service;

@Service
public class ColorDataService extends DataService
{
    public ColorDataService(ColorRepository repository)
    {
        super(repository);
    }
}
