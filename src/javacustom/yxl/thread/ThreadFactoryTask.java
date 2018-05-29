package javacustom.yxl.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadFactory;

/**
 * 线程工厂
 * @author Administrator
 * @date 2018-05-29
 */
public class ThreadFactoryTask implements ThreadFactory {

	private List<Thread> list = new ArrayList<>();
	public ThreadFactoryTask() {
		// TODO 自动生成的构造函数存根
	}

	@Override
	public Thread newThread(Runnable runnable) {
		// TODO 自动生成的方法存根
		Thread thread = new Thread(runnable);
		list.add(thread);
		return thread;
	}

}
