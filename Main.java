
public class Main {
	public static void main(String[] args) {

		int[] array = new int[3];
		array[0] = 10;
		array[1] = 20;
		array[2] = 30;

		int[] array2 = array;

		for (int num : array2) {
			System.out.println(num);
		}

		array[1] = 100;

		for (int num : array) {
			System.out.println(num);
		}

		System.out.println(A.NUM);
		A.test();
		// A a = new A();
//		A b = new A("Hello");
//		a.test();
//		a.test("test");
//		a.test("Hello", 100);
//		a.test(100, "Hello");

		Item item = new Item("apple", 100);

//		item.setName("apple");
//		item.setPrice(300);

		Order order = new Order(3, item);

//		order.setItem(item);
//		order.setQty(3);

		int result = order.getTotal();

		System.out.println(result);

	}
}
