package de.university.connect;

// Client.java

// import java.net.Socket;
import java.io.*;

public class Client {

    public void join(String user) throws IOException {
        String ip = "52.170.119.223"; // localhost
        int port = 5565;
        java.net.Socket socket = new java.net.Socket(ip,port); // verbindet sich mit Server
        String zuSendendeNachricht = "join-"+user;
        schreibeNachricht(socket, zuSendendeNachricht);
    }

    public void score(String user, int score) throws IOException{
        String ip = "52.170.119.223"; // localhost
        int port = 5565;
        java.net.Socket socket = new java.net.Socket(ip,port); // verbindet sich mit Server
        String zuSendendeNachricht = "score-"+user+"-"+score;
        schreibeNachricht(socket, zuSendendeNachricht);
    }

    void schreibeNachricht(java.net.Socket socket, String nachricht) throws IOException {
        PrintWriter printWriter =
                new PrintWriter(
                        new OutputStreamWriter(
                                socket.getOutputStream()));
        printWriter.print(nachricht);
        printWriter.flush();
    }
    String leseNachricht(java.net.Socket socket) throws IOException {
        BufferedReader bufferedReader =
                new BufferedReader(
                        new InputStreamReader(
                                socket.getInputStream()));
        char[] buffer = new char[200];
        int anzahlZeichen = bufferedReader.read(buffer, 0, 200); // blockiert bis Nachricht empfangen
        String nachricht = new String(buffer, 0, anzahlZeichen);
        return nachricht;
    }
}
