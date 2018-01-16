Book-service registers itself to the discovery server using @EnableDiscoveryClient with the help of spring cloud 
which in turns help it to call or connect to other services like :
author-service (https://github.com/swapnil222359/sc-author-service) consumes book service using discovery server registry.

discovery-server = https://github.com/swapnil222359/sc-discovery-server.
