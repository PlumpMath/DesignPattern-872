package sequence;

public class Client {
	Server server;

	void work(){
		server.open();
		server.print("Hello");
		server.close();
	}
}
