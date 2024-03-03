package com.srivatsan.gRPC_server.grpc.host;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class HostNamePrinter {

    public static void print() {
        try {
            System.out.println("Processed by host :: " + InetAddress.getLocalHost().getHostName());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }

}