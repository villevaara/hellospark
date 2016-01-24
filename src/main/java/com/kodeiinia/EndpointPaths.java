/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kodeiinia;

import spark.Request;
import spark.Response;
import spark.Route;
import static spark.Spark.get;

/**
 *
 * @author ville
 */
public class EndpointPaths {

    public EndpointPaths() {
        setupEndpoints();
    }
    
    private void setupEndpoints() {
                get("/", new Route() {
            @Override
            public Object handle(Request request, Response response) {
                return "Hello World!! Indeed hello!";
            }
        });

    }
    
}
