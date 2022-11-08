package br.com.nidonoga.designpattern.chainofresponsibility;

import br.com.nidonoga.designpattern.chainofresponsibility.middlewares.CheckPermissionMiddleware;
import br.com.nidonoga.designpattern.chainofresponsibility.middlewares.CheckUserMiddleware;
import br.com.nidonoga.designpattern.chainofresponsibility.middlewares.Middleware;
import br.com.nidonoga.designpattern.chainofresponsibility.server.Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static Server server;
    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        init();

        boolean done;

        do{
            System.out.println("E-mail: ");
            String email = reader.readLine();

            System.out.println("Senha: ");
            String password = reader.readLine();

            done = server.logIn(email, password);
        } while(!done);

    }

    public static void init() {
        server = new Server();
        server.registerUser("teste@gmail.com", "123456");
        server.registerUser("user@gmail.com", "654321");

        Middleware middleware = new CheckUserMiddleware(server);
        middleware.linkWith(new CheckPermissionMiddleware());

        server.setMiddleware(middleware);

    }
}