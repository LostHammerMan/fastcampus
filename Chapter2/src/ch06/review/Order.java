package ch06.review;

public class Order {

	String order_num;
	String cellPhone;
	String address;
	int order_date;
	int order_time;
	int price;
	String menu_num;
	
	public Order(String order_num, String cellPhone,String address, int order_date, int order_time, int price, String menu_num) {
		this.order_num = order_num;
		this.cellPhone = cellPhone;
		this.address = address;
		this.order_date = order_date;
		this.order_time = order_time;
		this.price = price;
		this.menu_num = menu_num;
	}
	
	public void showOrderInfo() {
		System.out.println("주문 접수 번호 : " + order_num);
		System.out.println("주문 핸드폰 번호 : " + cellPhone);
		System.out.println("주문 집 주소 : " + address);
		System.out.println("주문 날짜 : " + order_date);
		System.out.println("주문 시간 : " + order_time);
		System.out.println("주문 가격 : " + price);
		System.out.println("메뉴 번호 : " + menu_num);
		
	}
	
}
