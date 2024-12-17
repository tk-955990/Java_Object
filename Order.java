public class Order {
	private int qty; // 注文数量
	private Item item; // 商品インスタンス

	// コンストラクタ
	public Order(int qty, Item item) {
		this.qty = qty;
		this.item = item;
	}

	// 注文の合計金額を計算するメソッド
	public int getTotal() {
		return this.item.getPrice() * this.qty; // 商品の単価と注文数量の積を返す
	}
}
