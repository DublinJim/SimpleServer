package myPackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client {


    public static void main(String[] args) throws IOException {
        System.out.println("client active");

        Socket socket = new Socket("localhost", 9090);
     /*   InputStreamReader inputStreamReader = new InputStreamReader(socket.getInputStream());*/
        BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String incomingMsg = input.readLine();

        System.out.println("message from server " + incomingMsg);

    }

}
