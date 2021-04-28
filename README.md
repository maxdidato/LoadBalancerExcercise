# Simple Load Balancer

We want to implement a simple load balancer to put in front of some services. 
The load balancer implementation need to extend the LoadBalancer interface which provides two methods:
```java
void register(String serviceName,String ipAddress);
```
which is used by an instance of a service to register its ip address
```java
String retrieveIP(String serviceName);
```
which is used by a client to retrieve the ip address of a given service

Example:
```java
//Web Backend service instance 1
...
loadBalancerInstance.register("BACKEND","192.168.1.1");

//Web Backend service instance 2
...
loadBalancerInstance.register("BACKEND","192.168.1.2");

//Web Frontend service instance
...
String backendIpAddress = loadBalancerInstance.retrieveIP("BACKEND");
new BackEndApiClient(backendIpAddress).retrieveListOfUsers();
....
```

The LoadBalancer by default will select the ip address of a given service randomly. But we might want to implement a different selection algorithm (Round Robin)

