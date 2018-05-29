package javacustom.yxl;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import javacustom.yxl.thread.RunnableTask;
import javacustom.yxl.thread.ThreadFactoryTask;

/**
 * �������
 * @author Administrator
 * @date 2018-05-25
 */
public class Main {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		new ThreadFactoryTask().newThread(new RunnableTask()).start();
		
		ThreadPoolExecutor a = new ThreadPoolExecutor(10, 100, 60, TimeUnit.MINUTES, new SynchronousQueue());
		a.execute(new RunnableTask());
	}
}