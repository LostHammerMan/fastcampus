package ch06.review;

public class OrderTest {
	public static void main(String[] args) {
		
		Order order = new Order("202011020003", "01023456788", "서울시 강남구 역삼동 111-333", 20201102, 130258, 35000, "0003");
		
		order.showOrderInfo();
	}

}
