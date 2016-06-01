package mail;
import java.util.*;

public class registerNoticeManager {
	private static final long PERIOD_DAY = 4*60*1000;
	
	public registerNoticeManager() {
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
	  
		Timer timer = new Timer();
	  
		NoticeRegisterTask task = new NoticeRegisterTask();
		//����ָ����������ָ����ʱ�俪ʼ�����ظ��Ĺ̶��ӳ�ִ�С�
		timer.schedule(task,date,PERIOD_DAY);
	 	}


	 	// ���ӻ��������
	  	public Date addDay(Date date, int num) {
	  		Calendar startDT = Calendar.getInstance();
	  		startDT.setTime(date);
	  		startDT.add(Calendar.DAY_OF_MONTH, num);
	  		return startDT.getTime();
	  	}
}
