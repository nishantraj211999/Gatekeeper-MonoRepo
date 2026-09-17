package com.example.gatekeeper.analytics.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class HealthResponse {
    private String serviceName;
    private String serviceDescription;
    private String serviceStatus;
}
