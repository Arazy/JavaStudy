package javacustom.yxl.thread;
/**
 * �߳�Thread
 * @author Administrator
 *
 */
public class ThreadTask extends Thread {

	/**
	 * 
	 */
	public ThreadTask() {
		// TODO �Զ����ɵĹ��캯�����
	}
	
    @Override
    public void run() {
    	System.out.println(System.currentTimeMillis());
    }

}
