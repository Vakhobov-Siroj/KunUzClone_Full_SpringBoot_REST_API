package com.company.repository;

import com.company.entity.email.EmailEntity;
import org.springframework.data.repository.CrudRepository;

public interface EmailRepository extends CrudRepository<EmailEntity, Integer> {
}
