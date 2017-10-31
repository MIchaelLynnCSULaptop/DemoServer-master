package edu.csu2017fa314.DemoServer;
// master change
import edu.csu2017fa314.DemoServer.Server.Server;
//branch change
//branch #2
public class Demo {
    public static void main(String[] args) {
        System.out.println("Welcome to TripCo");
        Server s = new Server();
        s.serve();
    }
}
