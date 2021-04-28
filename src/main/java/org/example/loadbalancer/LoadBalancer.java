package org.example.loadbalancer;

public interface LoadBalancer {

    String retrieveIP(String serviceName);
    boolean register(String serviceName,String ipAddress);
}
