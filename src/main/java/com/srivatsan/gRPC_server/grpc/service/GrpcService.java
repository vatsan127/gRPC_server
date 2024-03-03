package com.srivatsan.gRPC_server.grpc.service;

import com.srivatsan.gRPC_server.GRpcServerApplication;
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
        int number = request.getNumber();

        NumberResponse response = NumberResponse.newBuilder()
                .setNumber(number)
                .setTxId(GRpcServerApplication.txId)
                .build();

        log.info("number - {} :: txId - {}", response.getNumber(),response.getTxId());
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

}
