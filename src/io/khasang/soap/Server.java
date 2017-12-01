package io.khasang.soap;

import javax.xml.ws.Endpoint;

public class Server {
    private static final String ADDRESS = "http://127.0.0.1:8080/Service";

    public static void main(String[] args) throws Exception {
        new Server();
        System.out.println("Service listen at " + ADDRESS);
        System.out.println("WSDL host at " + ADDRESS + "?wsdl");
    }

    protected Server() throws Exception {
        System.out.println("Starting server...");
        Object implementator = new Hello();
        Endpoint.publish(ADDRESS, implementator);
    }
}