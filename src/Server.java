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
        System.out.println("[SERVER]...  AWAITING CONNECTION ");
        Socket socket = serverSocket.accept();
        System.out.println("[SERVER]...  CONNECTED  ");

        /*   create a print writer object and a reader object */

        PrintWriter sender = new PrintWriter(socket.getOutputStream(), true);
        BufferedReader reciever = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        String msg;
        msg = "... MESSAGE FROM SERVER.....   ";

        /*     send out a string */
        sender.println(msg);
        System.out.println("[SERVER]...  DATA SENT  ");
        closeSockets(serverSocket, socket);

    }

    private static void closeSockets(ServerSocket serverSocket, Socket socket) throws IOException {
        serverSocket.close();
        socket.close();
        System.out.println("[SERVER]...  CLOSED  ");
    }
}
