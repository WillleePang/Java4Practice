package com.willlee.sourcecode.Enum;

//ʹ�ýӿ���֯ö�� 
public interface Food {
	enum Coffee implements Food {
		BLACK_COFFEE, DECAF_COFFEE, LATTE, CAPPUCCINO
	}

	enum Dessert implements Food {
		FRUIT, CAKE, GELATO
	}
}
