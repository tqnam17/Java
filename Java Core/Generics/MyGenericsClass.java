
public class MyGenericsClass<Thing extends Number, Thing2 extends Number> {
	Thing x;
	Thing2 y;
	public MyGenericsClass(Thing x, Thing2 y) {
		this.x = x;
		this.y = y;
	}

	public Thing2 getVlue() {
		return y;
	}
}
