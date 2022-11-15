package net.yorksolutions.coleenyartcapstonebe.service;

import net.yorksolutions.coleenyartcapstonebe.repository.ProcessRepository;
import net.yorksolutions.coleenyartcapstonebe.entity.Process;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProcessService {
    ProcessRepository processRepository;

    @Autowired
    public ProcessService(ProcessRepository processRepository) {
        this.processRepository = processRepository;
    }

    public Iterable<Process> getAllProcesses() {
        return processRepository.findAll();
    }

    public Process createProcess(Process process) {
        return this.processRepository.save(process);
    }
}
