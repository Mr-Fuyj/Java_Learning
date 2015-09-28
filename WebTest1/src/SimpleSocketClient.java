
import java.net.*;
import java.io.*;


public class SimpleSocketClient {
	static public void main(String []argc){
		InputStream inStream=null;
		OutputStream outStream=null;
		Socket socket=null;
		String IP="www.baidu.com";
		int port=10000;
		String data="Hello";
		try{
			//��������
			socket=new Socket(IP,port);
			//��������
			outStream=socket.getOutputStream();
			outStream.write(data.getBytes());
			//��������
			inStream=socket.getInputStream();
			byte dataGet[]=new byte [1000];
			int n=inStream.read(dataGet);
			System.out.println("������Ϣ��"+new String(dataGet,0,n));			
		}catch(Exception e){
			e.printStackTrace();
			System.out.print("����");
		}finally{
			try{
			inStream.close();
			outStream.close();
			socket.close();
			}catch(Exception e2){
				System.out.print("cuocuocuo");
			}
		}
		System.out.print("aaa");
	}
}
