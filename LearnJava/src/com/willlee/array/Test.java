package com.willlee.array;

public class Test {
	public static void main(String[] args) {
//		test1();
//		test2();
//		test3();
		
		int[] arr = new int[3];
		System.out.println(arr.getClass());
		
		String a = new String("aa");
		String b= a;
		System.out.println(a.equals(b));
		
		System.out.println(String.valueOf(b).equals(a));
		
		System.out.println(new String(b.getBytes()).equals(a));
	}

	/**
	 * ��������������ԣ� �����������A��B�����B�̳У�extends����A����ôA[]���͵����þͿ���ָ��B[]���͵Ķ���
	 * ����������������ԶԲ������ݵı�����
	 */
	private static void test3() {
		String[] a = new String[3];
		doArray(a);
	}

	private static void doArray(Object[] objs) {

	}

	private static void doArray1(Object obj) {
		// ������Object�������飬��Ϊ�����޷��������Ԫ�ؽ��з���
		// obj[1] //����

		// ����ڷ����ڲ���objת�͵����飬��������ת���쳣�ķ���
		// Object[] objs = (Object[]) obj;
	}

	private static void doArray2(String[] strs) {
		// ��������ض����͵����飬�����������ͣ�ʧȥ����Ժ�ͨ����
	}

	private static void doArray3(String name, int age, String id, float account) {
		// �������������������δ��ݲ�������ʹ�����б����߳��������Ķ�
	}

	/**
	 * ��������ļ��ɹ�ϵ, �������ļ̳й�ϵ�Ƿ��������Ԫ�ص������й�
	 */
	private static void test2() {

		// 1 ��test1()���Ѿ����Եõ����½���: ����Ҳ�Ƕ���, ����Ķ��㸸����Object, ���Կ�������ת��
		int[] a = new int[8];
		Object obj = a; // ����ĸ���Ҳ��Object,���Խ�a����ת�͵�Object

		// 2 ��ô������ת����?
		int[] b = (int[]) obj; // ���Խ�������ת��

		// 3 ��ʹ��instanceof�ؼ����ж���?
		if (obj instanceof int[]) { // ������instanceof�ؼ��ֽ��������ж�
			System.out.println("obj����ʵ������int[]");
		}

		// 4 ������������?
		String[] s = new String[5];
		Object[] obja = s; // ����,˵��������Object[]������������String[]�Ķ���

		// 5 ��ôString[] ��ֱ�Ӹ�����Object[] ���� Object?
		System.out.println(s.getClass().getSuperclass().getName());
		// ��ӡ���Ϊjava.lang.Object,˵��String[] ��ֱ�Ӹ����� Object������Object[]

		// 6 ���������? Father��Son��ֱ�Ӹ���
		Son[] sons = new Son[3];
		Father[] fa = sons; // ����

		// 7 ��ôSon[] ��ֱ�Ӹ�����Father[] ���� Object[] ������Object?
		System.out.println(sons.getClass().getSuperclass().getName());
		// ��ӡ���Ϊjava.lang.Object,˵��Son[]��ֱ�Ӹ�����Object

		/**
		 * ��һ���ܽ�, ���A��B�ĸ���, ��ôA[] ���͵����ÿ���ָ�� B[]���͵ı��� ����B[]��ֱ�Ӹ�����Object,
		 * ��������ĸ��඼��Object
		 */

		// 8 ����Ľ��ۿ�����չ����ά����
		Son[][] sonss = new Son[2][4];
		Father[][] fathers = sonss;
		// ��Father[][]���鿴����һά����, ���Ǹ������е�Ԫ��ΪFather[]
		// ��Son[][]���鿴����һά����, ���Ǹ������е�Ԫ��ΪSon[]
		// ��ΪFather[]���͵����ÿ���ָ��Son[]���͵Ķ���
		// ����,��������Ľ���,Father[][]�����ÿ���ָ��Son[][]���͵Ķ���

		/**
		 * ��չ����: ��ΪObject�������������͵ĸ��� ����Object[]�����ÿ���ָ���κ������������͵�����Ķ���. ��: Object[]
		 * objs = new String[1]; Object[] objs = new Son[1];
		 * 
		 */

		// 9 ����Ĵ��������?
		int[] aa = new int[4];
		// Object[] objaa = aa; //����ģ�����ͨ������
		// ���Ǵ����, ��ΪObject����int�ĸ���,�������Զ�װ�䲻������

		// 10 ����������
		Object[] objss = { "aaa", 1, 2.5 };// ����
	}

	/**
	 * ������java������,�����ǲ��Ƕ��� ����Ƕ���, ��ô����������ʲô?
	 */
	private static void test1() {
		int[] a = new int[4];
		// a.length; //�����Ե����ò��ܵ������
		int len = a.length; // �����б���һ���ֶ�, ��ʾ����ĳ���

		// ���·���˵��������Ե��÷���,java�е������Ƕ���.��Щ������Object�еķ���,���Կ��Կ϶�,�������㸸��Ҳ��Object
		a.clone();
		a.toString();

		/**
		 * java��ǿ���͵�����,һ�������ܻ���һ���ض�������,���� Person p = new Person();
		 * ����p(ȷ�е�˵������)��������Person��, ���Person���������Լ���д�� ��ô�����������ʲô��? ����ʹ�÷���ķ�ʽ������֤
		 */
		int[] a1 = { 1, 2, 3, 4 };
		System.out.println(a1.getClass().getName());
		// ��ӡ���������������Ϊ[I

		String[] s = new String[2];
		System.out.println(s.getClass().getName());
		// ��ӡ���������������Ϊ [Ljava.lang.String;

		String[][] ss = new String[2][3];
		System.out.println(ss.getClass().getName());
		// ��ӡ���������������Ϊ [[Ljava.lang.String;

		/**
		 * ����,����Ҳ�������͵�,ֻ����������Ͳ����г���Ա�Լ��������, Ҳ����jdk���� ����, ���������������ʱר�Ŵ�������
		 * ���͵�����������: ÿһά����һ��[��ʾ; [������������Ԫ�ص�����(���������������ͺ�������������)
		 * 
		 * ��java���Բ�����,s������,Ҳ��һ������,��ô��������Ӧ����String[],
		 * ������JVM��,��������Ϊ[java.lang.String
		 * 
		 * ˳��˵һ����ͨ������JVM�������Ϊ ����+����, Ҳ����ȫ�޶���
		 */
	}

	public static class Father {

	}

	public static class Son extends Father {

	}
}
