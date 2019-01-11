package com.beishanwen.demo;

import org.restlet.Component;
import org.restlet.data.Protocol;
import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;

public class Part05 extends ServerResource {
    public static void main(String[] args) throws Exception {
        // Create a new Restlet component and add a HTTP server connector to it
        Component component = new Component();
        component.getServers().add(Protocol.HTTP, 8183);

        // Then attach it to the local host
        component.getDefaultHost().attach("/trace", Part05.class);

        // Now, let's start the component!
        // Note that the HTTP server connector is also automatically started.
        component.start();
    }

    @Get("txt")
    public String toString() {
        // Print the requested URI path
        return "Resource URI  : " + getReference() + '\n' + "Root URI      : "
                + getRootRef() + '\n' + "Routed part   : "
                + getReference().getBaseRef() + '\n' + "Remaining part: "
                + getReference().getRemainingPart();
    }

    public String sayTest() {
        return "say test";
    }
}
