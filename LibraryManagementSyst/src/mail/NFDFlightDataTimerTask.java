package mail;

import java.util.TimerTask;
import java.util.logging.Logger;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class NFDFlightDataTimerTask extends TimerTask {


	 private static Logger log = Logger.getLogger(NFDFlightDataTimerTask.class.toString());

	 public void sendEmail() {
	    	mailSender mail = new mailSender("727032989@qq.com","123","test");
	    	mail.run();
	    }
	 @Override
	  public void run() {
	   try {
	    //������д��Ҫִ�е�����
		  sendEmail();
	   } catch (Exception e) {
	    log.info("-------------������Ϣ�����쳣--------------");
	   }
	  }
	 }




