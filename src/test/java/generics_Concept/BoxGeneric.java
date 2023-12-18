package generics_Concept;


public class BoxGeneric<T> {

	private T t;

	public void set(T t) {
		this.t = t;
	}

	public Object get() {
		return t;
	}

	
}
