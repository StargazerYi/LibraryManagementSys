package mail;

import java.util.*;

public class timeManager {
	private static final long PERIOD_DAY = 60*1000;
	  
	  public timeManager() {
	   Calendar calendar = Calendar.getInstance();  
	         
	   /*** ����ÿ��2:00ִ�з��� ***/ 


	  calendar.set(Calendar.HOUR_OF_DAY, 14);
	  calendar.set(Calendar.MINUTE, 0);
	  calendar.set(Calendar.SECOND, 0);
	  
	  Date date=calendar.getTime(); //��һ��ִ�ж�ʱ�����ʱ��
	  
	  //�����һ��ִ�ж�ʱ�����ʱ�� С�� ��ǰ��ʱ��
	  //��ʱҪ�� ��һ��ִ�ж�ʱ�����ʱ�� ��һ�죬�Ա���������¸�ʱ���ִ�С��������һ�죬���������ִ�С�ѭ��ִ�е��������Ե�ǰʱ��Ϊ׼
	  if (date.before(new Date())) {
	      date = this.addDay(date, 1);
	  }
	  
	  Timer timer = new Timer();
	  
	  NFDFlightDataTimerTask task = new NFDFlightDataTimerTask();
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
