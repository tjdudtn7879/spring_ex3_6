package com.lgy.springex_3_6;

public class DivAndRemains {
	public void process(int num) {
		int ten=num/10;
		int one=num%10;
		if (ten!=one) {
			System.out.println("입력된 수 : "+num+"은 10의자리와 1의자리가 다릅니다.");
		} else {
			System.out.println("입력된 수 : "+num+"은 10의자리와 1의자리가 같습니다.");
		}
	}
}
