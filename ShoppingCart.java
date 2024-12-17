public class ShoppingCart {
	// 注文を格納する配列。最大10つの注文をサポート
	private Order[] orders = new Order[10];
	private int index = 0; // 配列の現在のインデックス

	// 注文を追加するメソッド
	public void add(Order order) {
		this.orders[index] = order; // 指定された注文を配列の次の空き位置に追加
		index++; // インデックスを1つ増やす
	}

	// 合計金額を計算するメソッド
	public int getTotal() {
		int total = 0;
		// 配列の中のすべての注文の合計を計算する
		for (int i = 0; i < index; i++) {
			total += orders[i].getTotal(); // 各注文の合計金額を追加
		}
		return total;
	}
}
