import java.io.File;

public class Crawler {
	public static void main(String []argc){
		//�鿴���Ԫ�ػ�ö�Ӧurl
		String url="http://210.42.121.241/servlet/Svlt_QueryStuScore?year=0&term=&learnType=&scoreFlag=0&t=Sun%20Sep%2020%202015%2000:06:15%20GMT+0800%20(%D6%D0%B9%FA%B1%EA%D7%BC%CA%B1%BC%E4)";
		//���url���ʹ���cookie��get����
		HttpRequest response=HttpRequest .get(url).header("Cookie","JSESSIONID=CA7E2EF2C06EBD5F984B541D12CF8E25.tomcat2");
		//����html�ļ����ѷ��صĶ�������Ϣ���뵽����ļ���
		String fileName="test.html";
		response.receive(new File(fileName));
	}
}

