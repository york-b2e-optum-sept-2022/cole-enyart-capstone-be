package net.yorksolutions.coleenyartcapstonebe.controller;

import net.yorksolutions.coleenyartcapstonebe.dto.UpdateProcessDTO;
import net.yorksolutions.coleenyartcapstonebe.service.ProcessService;
import net.yorksolutions.coleenyartcapstonebe.entity.Process;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/process")
@CrossOrigin
public class ProcessController {
    ProcessService processService;

    public ProcessController(ProcessService processService) {
        this.processService = processService;
    }

    @GetMapping
    public Iterable<Process> getProcessList() {
        return this.processService.getAllProcesses();
    }

    @PostMapping
    public Process createProcess (@RequestBody Process process) {
        return this.processService.createProcess(process);
    }

    @DeleteMapping
    public void deleteProcess(@RequestParam Long processId) {
        this.processService.deleteProcess(processId);
    }

    @PutMapping
    public Process updateProcess(@RequestBody UpdateProcessDTO process) { return this.processService.updateProcess(process); }


}
