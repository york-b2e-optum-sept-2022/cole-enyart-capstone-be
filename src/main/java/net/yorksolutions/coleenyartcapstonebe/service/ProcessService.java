package net.yorksolutions.coleenyartcapstonebe.service;

import net.yorksolutions.coleenyartcapstonebe.dto.UpdateProcessDTO;
import net.yorksolutions.coleenyartcapstonebe.repository.ProcessRepository;
import net.yorksolutions.coleenyartcapstonebe.entity.Process;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

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

    public void deleteProcess(Long processId) { processRepository.deleteById(processId); }

    public Process updateProcess(UpdateProcessDTO process) {
        Optional<Process> processOpt = this.processRepository.findById(process.id);
        if (processOpt.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        Process currentProcess = processOpt.get();
        currentProcess.setTitle(process.title);
        currentProcess.setChildren(process.stage);

        return processRepository.save(currentProcess);
    }
}
