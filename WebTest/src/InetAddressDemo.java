//InetAddress���̽

import java.net.*;

public class InetAddressDemo {
	static public void main(String [] argc){
		try {
			
			InetAddress inet1;
			inet1 = InetAddress.getByName("www.baidu.com");
			System.out.println(inet1);
			
			InetAddress inet2;
			inet2=InetAddress.getByName("14.17.32.211");
			System.out.println(inet2);
			
			InetAddress inet3;
			inet3=InetAddress.getLocalHost();
			System.out.println(inet3);
			String host=inet3.getHostName();
			System.out.printf("host:%s\n",host);
			String IP=inet3.getHostAddress();
			System.out.printf("IP:%s\n",IP);
		} catch (UnknownHostException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
	}
}
