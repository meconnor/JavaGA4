package org.launchcode.techjobs.persistent.models.data;

import jakarta.transaction.Transactional;
import org.launchcode.techjobs.persistent.models.Job;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRepository extends CrudRepository<Job, Integer> {
}
