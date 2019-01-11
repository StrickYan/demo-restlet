package firstSteps;

import org.restlet.data.MediaType;
import org.restlet.representation.Representation;
import org.restlet.representation.StringRepresentation;
import org.restlet.resource.ServerResource;

/**
 * Resource which has only one representation.
 */
public class HelloWorldResource extends ServerResource {
    // 处理GET请求
    protected Representation get() {
        Representation str = new StringRepresentation("{\"k\":\"v1\"}", MediaType.TEXT_HTML);
        return str;
    }

    // 处理POST请求
    protected Representation post(Representation entity) {
        return new StringRepresentation("post");
    }

    // 处理PUT请求
    protected Representation put(Representation entity) {
        return new StringRepresentation("put");
    }

    // 处理DELETE请求
    protected Representation delete() {
        return new StringRepresentation("delete");
    }
}