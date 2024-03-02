package com.srivatsan.gRPC_server.grpc.service;

import io.grpc.stub.StreamObserver;
import org.example.server.NumberRequest;
import org.example.server.NumberResponse;
import org.example.server.NumberServiceGrpc;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GrpcService extends NumberServiceGrpc.NumberServiceImplBase {
    private static Logger log = LoggerFactory.getLogger(GrpcService.class);

    @Override
    public void getNumber(NumberRequest request, StreamObserver<NumberResponse> responseObserver) {
        log.info("NumberService :: getNumber :: request :: {}", request);
        int number = request.getNumber();
        NumberResponse response = NumberResponse.newBuilder().setNumber(number + 10).build();
        log.info("NumberService :: getNumber :: response :: {}", response);
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

}
