package com.example.gatekeeper.management.controller;

import com.example.gatekeeper.management.dto.response.HealthResponse;
import com.example.gatekeeper.management.service.HealthService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/health")
public class HealthController {
//    private String serviceName;
//    private String serviceDescription;
//
//    public HealthController(@Value("${info.app.name}") String serviceName,
//                            @Value("${info.app.description}") String serviceDescription){
//        this.serviceName=serviceName;
//        this.serviceDescription=serviceDescription;
//    }
    private final HealthService healthService;
    public HealthController(HealthService hs){
        this.healthService=hs;
    }

    @GetMapping
    public ResponseEntity<HealthResponse>health(){
        String dbStatus=healthService.getHealth();
        return ResponseEntity.ok(new HealthResponse("UP",dbStatus, LocalDateTime.now()));
    }
}
