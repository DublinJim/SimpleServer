import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) throws IOException {
        System.out.println("begin");

        Student student = new Student(25, "Bob");

        //create sockets for the incoming and outgoing
        ///////////////////////////////////////////////////////
        ServerSocket serverSocket = new ServerSocket(9090);
        Socket socket = serverSocket.accept();


        /*   create a print writer object and a reader object */

        PrintWriter printWriter = new PrintWriter(socket.getOutputStream(), true);
        BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        String msg;
        msg = "out from the server";

        /*     send out a string */
        printWriter.println(msg);

        closeSockets(serverSocket, socket);

    }

    private static void closeSockets(ServerSocket serverSocket, Socket socket) throws IOException {
        serverSocket.close();
        socket.close();
    }
}
