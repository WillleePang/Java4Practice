package com.willlee.designpatterns.singleton;

public class LockSingleton {
	private static LockSingleton singleTon = null;

	public LockSingleton() {
	}

	public static LockSingleton getInstance() {
		// Double-Check Locking
		/*
		 * 为何要使用双重检查锁定呢？ 考虑这样一种情况，就是有两个线程同时到达，即同时调用 GetInstance（）， 此时由于
		 * singleton == null ，所以很明显，两个线程都可以通过第一重的 singleton == null ， 进入第一重 if
		 * 语句后，由于存在锁机制，所以会有一个线程进入 lock 语句并进入第二重 singleton == null ， 而另外的一个线程则会在
		 * lock 语句的外面等待。 而当第一个线程执行完 new Singleton（）语句后，便会退出锁定区域，此时，第二个线程便可以进入
		 * lock 语句块， 此时，如果没有第二重 singleton == null 的话，那么第二个线程还是可以调用 new
		 * Singleton（）语句， 这样第二个线程也会创建一个 Singleton 实例，这样也还是违背了单例模式的初衷的，
		 * 所以这里必须要使用双重检查锁定。 细心的朋友一定会发现，如果我去掉第一重 singleton == null
		 * ，程序还是可以在多线程下完好的运行的， 考虑在没有第一重 singleton == null 的情况下， 当有两个线程同时到达，此时，由于
		 * lock 机制的存在，第一个线程会进入 lock 语句块，并且可以顺利执行 new Singleton（）， 当第一个线程退出 lock
		 * 语句块时， singleton 这个静态变量已不为 null 了，所以当第二个线程进入 lock 时， 还是会被第二重 singleton
		 * == null 挡在外面，而无法执行 new Singleton（）， 所以在没有第一重 singleton == null
		 * 的情况下，也是可以实现单例模式的？那么为什么需要第一重 singleton == null 呢？
		 * 这里就涉及一个性能问题了，因为对于单例模式的话，new Singleton（）只需要执行一次就 OK 了， 而如果没有第一重
		 * singleton == null 的话，每一次有线程进入 GetInstance（）时，均会执行锁定操作来实现线程同步，
		 * 这是非常耗费性能的，而如果我加上第一重 singleton == null 的话， 那么就只有在第一次，也就是 singleton
		 * ==null 成立时的情况下执行一次锁定以实现线程同步， 而以后的话，便只要直接返回 Singleton 实例就 OK 了而根本无需再进入
		 * lock 语句块了，这样就可以解决由线程同步带来的性能问题了。
		 * 好，关于多线程下单例模式的实现的介绍就到这里了，但是，关于单例模式的介绍还没完。
		 */
		if (singleTon == null) {
			synchronized (LockSingleton.class) {
				if (singleTon == null) {
					singleTon = new LockSingleton();
				}
			}
		}
		return singleTon;
	}
}
