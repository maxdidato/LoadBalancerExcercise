package org.example.loadbalancer;

public interface LoadBalancer {
    String retrieveIP(String serviceName);

    void register(String serviceName,String ipAddress);
}
