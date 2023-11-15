import static java.lang.System.out;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.InputStreamReader;
import java.io.BufferedReader;

class Server
{
	static public void main(String...ar)throws Exception
	{
	ServerSocket ss=new ServerSocket(2000);
	out.println("SERVER IS READY");
	
	 Socket socket=ss.accept();
	InputStreamReader isr=new InputStreamReader(socket.getInputStream());
	BufferedReader br=new BufferedReader(isr);
	
	while(true)
	{
	String data=br.readLine();
	if(data.equals("bye"))
	break;
	out.println(data);
	}	
	}
}