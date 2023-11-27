package org.acme

import jakarta.ws.rs.GET
import jakarta.ws.rs.Path
import jakarta.ws.rs.Produces
import jakarta.ws.rs.core.MediaType

@Path("/hello")
class GreetingResource {
    @GET
    @Path("/kotlin")
    @Produces(MediaType.TEXT_PLAIN)
    @Deprecated("Deprecated")
    fun helloDeprecatedKotlin() = "Hello from RESTEasy Reactive"

    @GET
    @Path("/java")
    @Produces(MediaType.TEXT_PLAIN)
    @java.lang.Deprecated(since="Deprecated")
    fun helloDeprecatedJava() = "Hello from RESTEasy Reactive"
}