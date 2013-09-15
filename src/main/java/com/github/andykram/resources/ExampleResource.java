package com.github.andykram.resources;

import com.github.andykram.MessageEntity;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Author: @andykram
 */
@Path("/example")
public class ExampleResource {

    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public Response getExample() {
        return Response.ok()
                       .entity(new MessageEntity("hello world"))
                       .build();
    }
}
