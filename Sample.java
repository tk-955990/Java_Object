public class Sample {

	public static void main(String[] args) {
		// 商品のインスタンスを作成
		Item apple = new Item("apple", 100);
		Item orange = new Item("orange", 120);
		Item banana = new Item("banana", 80);

		// ショッピングカートのインスタンスを作成
		ShoppingCart cart = new ShoppingCart();

		// 注文をカートに追加
		cart.add(new Order(3, apple)); // りんごを3個注文
		cart.add(new Order(2, orange)); // オレンジを2個注文
		cart.add(new Order(5, banana)); // バナナを5個注文

		// 合計金額を取得
		int result = cart.getTotal();
		System.out.println(result); // 合計金額を表示
	}
}
