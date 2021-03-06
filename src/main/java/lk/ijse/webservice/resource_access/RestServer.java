package lk.ijse.webservice.resource_access;

import lk.ijse.webservice.resource_access.api.ResourceAccessRest;
import lk.ijse.webservice.resource_access.servlet.ChatConnectionServlet;
import lk.ijse.webservice.resource_access.servlet.ChatReceiveServlet;
import lk.ijse.webservice.resource_access.servlet.ChatSendServlet;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;

public class RestServer {
    private Server server;


    public void start() throws Exception {
        Server server = new Server(5000);
        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
        context.setContextPath("/");

        context.addServlet(ResourceAccessRest.class, "/hello");
        context.addServlet(ChatConnectionServlet.class, "/connect");
        context.addServlet(ChatReceiveServlet.class, "/receive");
        context.addServlet(ChatSendServlet.class, "/send");
        server.setHandler(context);
        server.start();
        server.join();
    }
}