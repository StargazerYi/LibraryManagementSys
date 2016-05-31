package mail;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
public class mailSender implements Runnable{
	/*public static void main(String[] args) throws Exception {
		mailSender mail = new mailSender("727032989@qq.com","test","just test");
		mail.run();
	}*/
	private String receiver = "";
	private String title = "";
	private String content = "";
	public mailSender(String reciver, String title, String content) {
		this.receiver = reciver;
		this.title = title;
		this.content = content;
	}
	public MimeMessage createSimpleMail(Session session
			,String receiver,String title,String content) throws Exception {
		// �����ʼ�����
		MimeMessage message = new MimeMessage(session);
		// ָ���ʼ��ķ�����
		message.setFrom(new InternetAddress("myownsky_mail@sina.com"));
		// ָ���ʼ����ռ��ˣ����ڷ����˺��ռ�����һ���ģ��Ǿ����Լ����Լ���
		message.setRecipient(Message.RecipientType.TO, new InternetAddress(receiver));
		// �ʼ��ı���
		message.setSubject(title);
		// �ʼ����ı�����
		message.setContent(content, "text/html;charset=UTF-8");
		// ���ش����õ��ʼ�����
		return message;
	}

	public void sendMail(String receiver, String title, String content) {
		try {
			Properties prop = new Properties();
			prop.setProperty("mail.host", "smtp.sina.cn");
			prop.setProperty("mail.transport.protocol", "smtp");
			prop.setProperty("mail.smtp.auth", "true");
			// ʹ��JavaMail�����ʼ���5������
			// 1������session
			Session session = Session.getInstance(prop);
			// ����Session��debugģʽ�������Ϳ��Բ鿴��������Email������״̬
			session.setDebug(true);
			// 2��ͨ��session�õ�transport����
			Transport ts = session.getTransport();
			// 3��ʹ��������û��������������ʼ��������������ʼ�ʱ����������Ҫ�ύ������û����������smtp���������û��������붼ͨ����֤֮����ܹ����������ʼ����ռ��ˡ�
			ts.connect("smtp.sina.cn", "myownsky_mail@sina.com", "myownsky");
			// 4�������ʼ�
			Message message = createSimpleMail(session,receiver,title,content);
			// 5�������ʼ�
			ts.sendMessage(message, message.getAllRecipients());
			ts.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		sendMail(receiver, title, content);
	}
}
