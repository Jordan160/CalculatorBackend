package com.jvetter2.jax;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/calculate")
public class CalculatorApplication {
    @GET
    @Path("/multiply")
    @Produces(MediaType.TEXT_PLAIN)
    public Response getMultiplication (@QueryParam("a") int a, @QueryParam("b") int b) {
        return Response.ok(String.valueOf(a * b), MediaType.TEXT_PLAIN).build();
    }

    @GET
    @Path("/add")
    @Produces(MediaType.TEXT_PLAIN)
    public Response getAddition (@QueryParam("a") int a, @QueryParam("b") int b) {
        return Response.ok(String.valueOf(a + b), MediaType.TEXT_PLAIN).build();
    }

    @GET
    @Path("/subtract")
    @Produces(MediaType.TEXT_PLAIN)
    public Response getSubtraction (@QueryParam("a") int a, @QueryParam("b") int b) {
        return Response.ok(String.valueOf(a - b), MediaType.TEXT_PLAIN).build();
    }

    @GET
    @Path("/divide")
    @Produces(MediaType.TEXT_PLAIN)
    public Response getDivision (@QueryParam("a") int a, @QueryParam("b") int b) {
        return Response.ok(String.valueOf(a / b), MediaType.TEXT_PLAIN).build();
    }
}
