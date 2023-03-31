package com.enesbayram.constant;

public class ProjectConstant {
	
	//Aşağıdaki yolları dışarıya exclude ettik. Herhangi bir authentication'a tabi tutmadık.
	public static final String[] SWAGGER_PATHS = {
			"/swagger-ui/**",
			"/v3/api-docs/**"
	};

}
