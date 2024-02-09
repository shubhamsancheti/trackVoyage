package com.trackvoyage.common;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class User {
	private Integer id;
	private String name;
	private String phoneNumber1;
	private String phoneNumber2;
}
