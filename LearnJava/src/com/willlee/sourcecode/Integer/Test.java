package com.willlee.sourcecode.Integer;

public class Test {

	final static int[] sizeTable = { 9, 99, 999, 9999, 99999, 999999, 9999999,
			99999999, 999999999, Integer.MAX_VALUE };

	// Requires positive x
	static int stringSize(int x) {
		for (int i = 0;; i++)
			if (x <= sizeTable[i])
				return i + 1;
	}

	// iҪת����int��index������Ĵ�С��buf��char����
	static void getChars(int i, int index, char[] buf) {
		int q, r;
		int charPos = index;
		// �洢����
		char sign = 0;

		// ����Ǹ�������ôȡ����Ȼ����sign�洢����
		if (i < 0) {
			sign = '-';
			i = -i;
		}

		// ÿ��ѭ�����󣬶��Ὣi�е��ߺ���λ���浽�ַ�����buf�е������λ�У����߿��Խ�����i����Ϊ12345678����һ�£�
		// ��һ��ѭ������֮��buf[7] = 8,buf[6]=7���ڶ���ѭ������֮��buf[5] = 6,buf[4] = 5��
		while (i >= 65536) {
			q = i / 100;
			// really: r = i - (q * 100);
			r = i - ((q << 6) + (q << 5) + (q << 2));
			i = q;
			// ȡDigitOnes[r]��Ŀ����ʵȡ����r%10�Ľ��
			buf[--charPos] = DigitOnes[r];
			// ȡDigitTens[r]��Ŀ����ʵ��ȡ����r/10�Ľ��
			buf[--charPos] = DigitTens[r];
		}

		// Fall thru to fast mode for smaller numbers
		// assert(i <= 65536, i);
		// ѭ�����������ִ����ַ������п���λ��
		for (;;) {
			// ������ʵ���ǳ���10��ȡ��52429��16+3��ԭ���ں��ķ�����
			q = (i * 52429) >>> (16 + 3);
			// r = i-(q*10) ...
			r = i - ((q << 3) + (q << 1));
			// ������i�����һλ�����ַ����飬
			// ����12345678�Ǹ����ӣ����forѭ����һ�ν�����buf[3]=4��
			buf[--charPos] = digits[r];
			i = q;
			// forѭ��������buf����Ϊ��12345678����
			if (i == 0)
				break;
		}
		if (sign != 0) {
			buf[--charPos] = sign;
		}
	}

	// �����õ��ļ�������

	// 100���ڵ����ֳ���10�Ľ����ȡ������
	// ����ȡDigitTens[78]�����ص�������7
	// ֻҪ��70-79�����֣����صĶ���7���������ƣ������ܽ�����ɣ���ʵ���Ƿ��صĶ�Ӧ���ֳ�10ȡ���Ľ����
	final static char[] DigitTens = { '0', '0', '0', '0', '0', '0', '0', '0',
			'0', '0', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '2',
			'2', '2', '2', '2', '2', '2', '2', '2', '2', '3', '3', '3', '3',
			'3', '3', '3', '3', '3', '3', '4', '4', '4', '4', '4', '4', '4',
			'4', '4', '4', '5', '5', '5', '5', '5', '5', '5', '5', '5', '5',
			'6', '6', '6', '6', '6', '6', '6', '6', '6', '6', '7', '7', '7',
			'7', '7', '7', '7', '7', '7', '7', '8', '8', '8', '8', '8', '8',
			'8', '8', '8', '8', '9', '9', '9', '9', '9', '9', '9', '9', '9',
			'9', };

	// 100���ڵ����ֶ�10ȡģ�Ľ����
	// ����ȡDigitTens[78]�����ص�8
	final static char[] DigitOnes = { '0', '1', '2', '3', '4', '5', '6', '7',
			'8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0',
			'1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3',
			'4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6',
			'7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
			'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2',
			'3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5',
			'6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8',
			'9', };
	final static char[] digits = { '0', '1', '2', '3', '4', '5', '6', '7', '8',
			'9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
			'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y',
			'z' };

	public static String toString(int i) {
		if (i == Integer.MIN_VALUE)
			return "-2147483648";
		int size = (i < 0) ? stringSize(-i) + 1 : stringSize(i);
		char[] buf = new char[size];
		getChars(i, size, buf);
		return new String(buf);
	}

	public static void main(String[] args) {
		// Integer DecimalI = Integer.decode("+10");
		// Integer OctI = Integer.decode("-010");
		// Integer HexI = Integer.decode("-0x10");
		// Integer HexI1 = Integer.decode("#10");
		// System.out.println(DecimalI);
		// System.out.println(OctI);
		// System.out.println(HexI);
		// System.out.println(HexI1);
		char[] a = new char[9];
		getChars(123456789, 9, a);
	}
}
