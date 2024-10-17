package org.gcu.milestone.data.service.product;

import org.gcu.milestone.data.entity.product.CategoryEntity;
import org.gcu.milestone.data.repository.product.CategoryRepository;
import org.gcu.milestone.data.service.DataService;
import org.springframework.stereotype.Service;

@Service
public class CategoryDataService extends DataService<CategoryEntity>
{
    public CategoryDataService(CategoryRepository categoryRepository)
    {
        super(categoryRepository);
    }
}
