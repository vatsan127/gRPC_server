package com.srivatsan.gRPC_server;

import com.srivatsan.gRPC_server.grpc.server.GrpcServer;
import com.srivatsan.gRPC_server.grpc.service.GrpcService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class GRpcServerApplication {
    private static Logger log = LoggerFactory.getLogger(GRpcServerApplication.class);

    public static void startServer() {
        log.info("Initializing gRPC server .");
        GrpcServer.create(new GrpcService()).start().await();
    }

    public static void main(String[] args) {
        SpringApplication.run(GRpcServerApplication.class, args);
        startServer();
    }

}
