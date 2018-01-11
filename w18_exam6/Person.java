class Person {
	private String name, rank;
	Person(String name, String rank) {
		this.name = name;
		switch (rank) {
			case "二兵":
			case "一兵":
			case "上兵":
			case "下士":
			case "中士":
			case "上士":
			case "三等長":
			case "二等長":
			case "一等長":
				this.rank = rank;
				break;
			default:
				this.rank = "菜鳥";
				break;
		}
	}
	int getrankorder() {
		String ranklist[] = new String[]{"菜鳥", "二兵", "一兵", "上兵", "下士", "中士", "上士", "三等長", "二等長", "一等長"};
		for (int q=0; q<ranklist.length; q++) {
			if (rank.equals(ranklist[q])) {
				return q;
			}
		}
		return -1;
	}
	void saymyselftype() {
		System.out.println("我不是軍人");
	}
	void hello(Person person) {
		int sametype = 0;
		if (this instanceof Land) {
			if (person instanceof Land) {
				sametype = 1;
			} else {
				sametype = 2;
			}
		} else if (this instanceof Air) {
			if (person instanceof Air) {
				sametype = 1;
			} else {
				sametype = 2;
			}
		} else if (this instanceof Sea) {
			if (person instanceof Sea) {
				sametype = 1;
			} else {
				sametype = 2;
			}
		} else {
			sametype = 3;
		}
		System.out.print(name+"：");
		switch (sametype) {
			case 1:
				if (this.getrankorder() > person.getrankorder()) {
					System.out.println("學弟，打招呼啊!");
				} else if (this.getrankorder() < person.getrankorder()) {
					System.out.println("學長好!");
				} else {
					System.out.println("同學好!");
				}
				break;
			case 2:
			case 3:
				saymyselftype();
				break;
		}
	}
}
