package javacustom.yxl.thread;
/**
 * 线程Thread
 * @author Administrator
 *
 */
public class ThreadTask extends Thread {

	/**
	 * 
	 */
	public ThreadTask() {
		// TODO 自动生成的构造函数存根
	}
	
    @Override
    public void run() {
    	System.out.println(System.currentTimeMillis());
    }

}
