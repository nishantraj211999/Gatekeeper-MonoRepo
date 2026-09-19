package com.example.gatekeeper.management.service;


import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class HealthService {
    private  final JdbcTemplate jdbcTemplate;

    public String getHealth(){
        String result = "DOWN";
        try {
            int tempres = jdbcTemplate.queryForObject("SELECT 1", Integer.class);
            if (Integer.valueOf(1).equals(tempres)) {
             result="UP";
            }
        }catch (Exception e){
            System.out.println("MYSQL health check failed!!!");
        }
        return result;
    }
}
