
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
			//建立连接
			socket=new Socket(IP,port);
			//发送数据
			outStream=socket.getOutputStream();
			outStream.write(data.getBytes());
			//接收数据
			inStream=socket.getInputStream();
			byte dataGet[]=new byte [1000];
			int n=inStream.read(dataGet);
			System.out.println("返回信息："+new String(dataGet,0,n));			
		}catch(Exception e){
			e.printStackTrace();
			System.out.print("错误");
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
