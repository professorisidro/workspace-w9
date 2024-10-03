
public class Time {
	private int h;
	private int m;
	private int s;
	
	public int getH() {
		return h;
	}
	public void setH(int h) {
		this.h = h;
	}
	public int getM() {
		return m;
	}
	public void setM(int m) {
		this.m = m;
	}
	public int getS() {
		return s;
	}
	public void setS(int s) {
		this.s = s;
	}
	
	public void setTime(int h, int m, int s) {
		this.h = h;
		this.m = m;
		this.s = s;
	}
	
	public void setTime(int h, int m) {
		this.setTime(h,m,0);
//		this.h = h;
//		this.m = m;
////		this.s = 0;
	}
	
	public void setTime(int h) {
		this.setTime(h,0,0);
//		this.h = h;
//		this.m = 0;
//		this.s = 0;
	}

	public String getTime() {
		return h+":"+m+":"+s;
	}
}
