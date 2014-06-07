package controllers;

import play.*;
import play.mvc.*;
import javax.servlet.http.*;
import com.google.appengine.api.urlfetch.*;
import java.net.URL;
import views.html.*;

public class Application extends Controller {

    public static Result index() {
        return ok("hello");
    }

}
