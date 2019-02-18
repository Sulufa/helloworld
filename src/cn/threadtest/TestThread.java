package cn.threadtest;

import cn.pojo.Hero;

public class TestThread {

	public static void main(String[] args) {
		final Hero gareen = new Hero();
		gareen.name="盖伦";
		gareen.hp = 60;
		Thread t1 = new Thread() {
			@Override
			public void run() {
				while (true) {
					gareen.hurt();
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};
		t1.start();
		Thread t2 = new Thread() {
			@Override
			public void run() {
				while (true) {
					gareen.recover();
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};
		t2.start();
		
	}

}
