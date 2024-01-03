package java_Concepts;

public class ThreadLocalClassCOncept {

	public static void main(String a[]) {

		ThreadLocal<Object> threadLocal = new ThreadLocal<>();

		System.out.println(threadLocal.get());

		threadLocal.set("Dummy");

		System.out.println(threadLocal.get());

		threadLocal.remove();

		System.out.println(threadLocal.get());

		ThreadLocal.withInitial(() -> "abc");

		System.out.println(threadLocal.get());
	}

}
