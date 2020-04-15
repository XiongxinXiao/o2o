package com.xxx.o2o.enums;

/**
 * 使用枚举表述常量数据字典
 */
public enum PersonInfoStateEnum {

	SUCCESS(0, "Success"), INNER_ERROR(-1001, "Unsuccess"), EMPTY(-1002, "Person info is empty");

	private int state;

	private String stateInfo;

	private PersonInfoStateEnum(int state, String stateInfo) {
		this.state = state;
		this.stateInfo = stateInfo;
	}

	public int getState() {
		return state;
	}

	public String getStateInfo() {
		return stateInfo;
	}

	public static PersonInfoStateEnum stateOf(int index) {
		for (PersonInfoStateEnum state : values()) {
			if (state.getState() == index) {
				return state;
			}
		}
		return null;
	}

}