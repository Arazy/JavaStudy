package javacustom.yxl.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadFactory;

/**
 * �̹߳���
 * @author Administrator
 * @date 2018-05-29
 */
public class ThreadFactoryTask implements ThreadFactory {

	private List<Thread> list = new ArrayList<>();
	public ThreadFactoryTask() {
		// TODO �Զ����ɵĹ��캯�����
	}

	@Override
	public Thread newThread(Runnable runnable) {
		// TODO �Զ����ɵķ������
		Thread thread = new Thread(runnable);
		list.add(thread);
		return thread;
	}

}
