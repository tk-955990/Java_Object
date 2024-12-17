public class Item {
	private String name; // 商品名
	private int price; // 商品の価格

	// コンストラクタ
	public Item(String name, int price) {
		this.name = name;
		this.price = price;
	}

	// 商品名を取得するメソッド
	public String getName() {
		return name;
	}

	// 商品価格を取得するメソッド
	public int getPrice() {
		return price;
	}
}
