package com.kodeiinia;

//import spark.Request;
//import spark.Response;
//import spark.Route;
//import static spark.Spark.*;
//import com.kodeiinia.EndpointPaths;
import static spark.Spark.setIpAddress;
import static spark.Spark.setPort;
import static spark.SparkBase.staticFileLocation;

public class Bootstrap {

    private static final String IP_ADDRESS = System.getenv("OPENSHIFT_DIY_IP")
            != null ? System.getenv("OPENSHIFT_DIY_IP") : "localhost";
    
    private static final int PORT = System.getenv("OPENSHIFT_DIY_PORT")
            != null ? Integer.parseInt(System.getenv("OPENSHIFT_DIY_PORT")) : 8080;

    public static void main(String[] args) {

        setIpAddress(IP_ADDRESS);
        setPort(PORT);
        staticFileLocation("/public");

        EndpointPaths paths = new EndpointPaths();
//        get("/", new Route() {
//            @Override
//            public Object handle(Request request, Response response) {
//                return "Hello World!!";
//            }
//        });
    }
}
