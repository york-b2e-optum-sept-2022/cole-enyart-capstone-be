package net.yorksolutions.coleenyartcapstonebe.repository;

import net.yorksolutions.coleenyartcapstonebe.entity.Process;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProcessRepository extends CrudRepository<Process, Long> { }
