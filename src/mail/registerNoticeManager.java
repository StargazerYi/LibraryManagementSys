package mail;
import java.util.*;

import javax.servlet.ServletContextEvent;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.LMS.ssh.daoImpl.BookDaoImpl;
import com.LMS.ssh.daoImpl.registerMailDaoImpl;

public class registerNoticeManager {
	private static final long PERIOD_DAY = 2*60*1000;
	private BookDaoImpl bookDao;
	private registerMailDaoImpl registerMail;
	public registerNoticeManager(ServletContextEvent event) {
		WebApplicationContext context = WebApplicationContextUtils.getRequiredWebApplicationContext(event.getServletContext()); 
		bookDao = (BookDaoImpl)context.getBean("bookDao"); 
		registerMail = (registerMailDaoImpl)context.getBean("registerMailDao");
		Calendar calendar = Calendar.getInstance();  
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
	  
		Date date=calendar.getTime(); //��һ��ִ�ж�ʱ�����ʱ��
	  
		/*//�����һ��ִ�ж�ʱ�����ʱ�� С�� ��ǰ��ʱ��
		//��ʱҪ�� ��һ��ִ�ж�ʱ�����ʱ�� ��һ�죬�Ա���������¸�ʱ���ִ�С��������һ�죬���������ִ�С�ѭ��ִ�е��������Ե�ǰʱ��Ϊ׼
		if (date.before(new Date())) {
			date = this.addDay(date, 1);
		}*/
		calendar.setTime(new Date());
		date = calendar.getTime();
		Timer timer = new Timer();
	  
		NoticeRegisterTask task = new NoticeRegisterTask(bookDao);
		//����ָ����������ָ����ʱ�俪ʼ�����ظ��Ĺ̶��ӳ�ִ�С�
		timer.schedule(task,date,PERIOD_DAY);
		
		Timer timer2 = new Timer();
		NoticeRegisterTask task2 = new NoticeRegisterTask(bookDao);
		timer2.schedule(task2, this.addMin(date,1), PERIOD_DAY);
	 	}


	 	// ���ӻ��������
	  	public Date addDay(Date date, int num) {
	  		Calendar startDT = Calendar.getInstance();
	  		startDT.setTime(date);
	  		startDT.add(Calendar.DAY_OF_MONTH, num);
	  		return startDT.getTime();
	  	}
	  	public Date addMin(Date date, int num) {
	  		Calendar startDT = Calendar.getInstance();
	  		startDT.setTime(date);
	  		startDT.add(Calendar.MINUTE, num);
	  		return startDT.getTime();
	  	}
}
