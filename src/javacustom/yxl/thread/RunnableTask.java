package javacustom.yxl.thread;

/**
 * Runnable �߳�
 * @author Administrator
 * @date 2018-05-25
 */
public class RunnableTask implements Runnable {

	public RunnableTask() {
		// TODO �Զ����ɵĹ��캯�����
	}

	@Override
	public void run() {
		// TODO �Զ����ɵķ������
		System.out.println(System.currentTimeMillis());
	}

}
