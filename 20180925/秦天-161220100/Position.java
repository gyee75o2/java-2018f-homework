//package qt;

public class Position {
	private int x;
	private int y;
	public Position() {
		x=-1;
		y=-1;
	}
	public Position(int x,int y) {
		this.x=x;
		this.y=y;
	}
	public void set(int x,int y) {
		this.x=x;
		this.y=y;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
}
