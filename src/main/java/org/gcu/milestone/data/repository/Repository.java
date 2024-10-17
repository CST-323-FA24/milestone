package org.gcu.milestone.data.repository;

import org.springframework.data.repository.CrudRepository;

public interface Repository<T> extends CrudRepository<T, Long>
{
}
