package org.gcu.milestone.data.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

public interface DataEntity<ID>
{
    public ID getId();
}
