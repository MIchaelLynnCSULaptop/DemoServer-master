package edu.csu2017fa314.DemoServer;
// master change
//master#2
import edu.csu2017fa314.DemoServer.Server.Server;
//branch change
public class Demo {
    public static void main(String[] args) {
        System.out.println("Welcome to TripCo");
        Server s = new Server();
        s.serve();
    }
}
