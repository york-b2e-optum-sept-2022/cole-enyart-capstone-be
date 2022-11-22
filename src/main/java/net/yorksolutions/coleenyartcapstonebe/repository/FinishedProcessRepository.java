package net.yorksolutions.coleenyartcapstonebe.repository;

import net.yorksolutions.coleenyartcapstonebe.entity.FinishedProcess;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FinishedProcessRepository extends CrudRepository<FinishedProcess, Long> {
}
