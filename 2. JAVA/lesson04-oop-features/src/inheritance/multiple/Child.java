package inheritance.multiple;

//public class Child extends Father, Mother {
public class child implements Dad, Mom {
	public static void main(String[] args) {
		Child son = new Child();
		son.smoking();
		son.playsport();
	}

	@Override
	public void shopping() {
		// TODO Auto-generated method stub

	}

	@Override
	public void smoking() {
		// TODO Auto-generated method stub

	}

	@Override
	public void playSport() {
		// TODO Auto-generated method stub

	}
}
