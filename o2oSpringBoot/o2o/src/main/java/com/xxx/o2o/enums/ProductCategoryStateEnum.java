package com.xxx.o2o.enums;

public enum ProductCategoryStateEnum {
	SUCCESS(1, "Success"), INNER_ERROR(-1001, "Unsuccess"), EMPTY_LIST(-1002, "Add at least one record");

	private int state;

	private String stateInfo;

	private ProductCategoryStateEnum(int state, String stateInfo) {
		this.state = state;
		this.stateInfo = stateInfo;
	}

	public int getState() {
		return state;
	}

	public String getStateInfo() {
		return stateInfo;
	}

	public static ProductCategoryStateEnum stateOf(int index) {
		for (ProductCategoryStateEnum state : values()) {
			if (state.getState() == index) {
				return state;
			}
		}
		return null;
	}
}
