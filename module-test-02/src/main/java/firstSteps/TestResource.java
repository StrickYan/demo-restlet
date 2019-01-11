package firstSteps;

import com.beishanwen.demo.Part05;
import org.restlet.data.MediaType;
import org.restlet.representation.Representation;
import org.restlet.representation.StringRepresentation;
import org.restlet.resource.ServerResource;

/**
 * Resource which has only one representation.
 */
public class TestResource extends ServerResource {
    // 处理GET请求
    protected Representation get() {
        String text = (new Part05()).sayTest();
        Representation str = new StringRepresentation(text, MediaType.TEXT_HTML);
        return str;
    }
}