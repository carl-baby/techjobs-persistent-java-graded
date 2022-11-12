package org.launchcode.techjobs.persistent.models.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface EmployerRepository extends CrudRepository {};
