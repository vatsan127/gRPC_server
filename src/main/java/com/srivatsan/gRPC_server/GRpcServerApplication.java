package com.srivatsan.gRPC_server;

import com.srivatsan.gRPC_server.grpc.server.GrpcServer;
import com.srivatsan.gRPC_server.grpc.service.GrpcService;
import com.srivatsan.gRPC_server.transaction.TransactionId;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@SpringBootApplication
public class GRpcServerApplication {
    private static Logger log = LoggerFactory.getLogger(GRpcServerApplication.class);

    public static final String txId = TransactionId.generateTransactionId();

    public static void startServer() {
        log.info("Initializing gRPC server .");
        GrpcServer.create(new GrpcService()).start().await();
    }

    public static void main(String[] args) {
        SpringApplication.run(GRpcServerApplication.class, args);
        startServer();
    }

}
