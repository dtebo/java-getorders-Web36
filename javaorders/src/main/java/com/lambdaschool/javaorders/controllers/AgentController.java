package com.lambdaschool.javaorders.controllers;

import com.lambdaschool.javaorders.models.Agent;
import com.lambdaschool.javaorders.services.AgentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/agents")
public class AgentController {
    @Autowired
    AgentService agentService;

    // http://localhost:2019/agents/agent/{id}
    @GetMapping(value = "/agents/agent/{id}", produces = "application/json")
    public ResponseEntity<?> findAgentByAgentId(@PathVariable long id){
        Agent agent = agentService.findAgentByAgentcode(id);

        return new ResponseEntity<>(agent, HttpStatus.OK);
    }
}
