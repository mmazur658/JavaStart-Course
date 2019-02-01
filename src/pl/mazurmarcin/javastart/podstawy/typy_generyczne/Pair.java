package pl.mazurmarcin.javastart.podstawy.typy_generyczne;

public class Pair<T, V> {

	private T t;
	private V v;

	public Pair(T t, V v) {
		this.t = t;
		this.v = v;
	}

	public Pair() {

	}

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

	public V getV() {
		return v;
	}

	public void setV(V v) {
		this.v = v;
	}

	@Override
	public String toString() {
		return t+" "+v;
	}
	
	
	

}
