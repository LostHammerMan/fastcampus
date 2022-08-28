package ch06.review;

public class Customer {
	
	int height;
	int weight;
	String sex;
	String name;
	int age;
	
	public Customer(int height, int weight, String sex, String name, int age) {
		this.height = height;
		this.weight = weight;
		this.sex = sex;
		this.name = name;
		this.age = age;
	}
	
	public void showCustomerInfo() {
		System.out.println(name + " 님의 키는" + height + " 이고, 몸무게는 " + weight + " 인" + sex + "입니다");
	}

}
