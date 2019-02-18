package cn.pojo;

public class Hero {
	public String name;
	public float hp;
	public synchronized void recover() {
		hp = hp+1;
		System.out.println("恢复1HP，血量为:"+hp);
		this.notify();
	}
	public synchronized void hurt() {
		if(hp==1) {
			try {
				this.wait();
			} catch (InterruptedException e) {
			e.printStackTrace();
			}
		}
		hp = hp-1;
		System.out.println("减少1HP，血量为:"+hp);
	}
	public void name() {
		
	}
	
}
