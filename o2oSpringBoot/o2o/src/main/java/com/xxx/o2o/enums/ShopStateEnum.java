package com.xxx.o2o.enums;

public enum ShopStateEnum {
	CHECK(0, "Processing"), OFFLINE(-1, "Invalid shop"), SUCCESS(1, "Success"), PASS(2, "Valid shop"), INNER_ERROR(-1001,
			"Internal error"), NULL_SHOPID(-1002, "ShopId is empty"),NULL_SHOP(-1003, "Shop info is empty");
	private int state;
	private String stateInfo;

	private ShopStateEnum(int state, String stateInfo) {
		this.state = state;
		this.stateInfo = stateInfo;
	}

	/**
	 * 依据传入的state返回相应的enum值
	 */
	public static ShopStateEnum stateOf(int state) {
		for (ShopStateEnum stateEnum : values()) {
			if (stateEnum.getState() == state) {
				return stateEnum;
			}
		}
		return null;
	}

	public int getState() {
		return state;
	}

	public String getStateInfo() {
		return stateInfo;
	}

}
