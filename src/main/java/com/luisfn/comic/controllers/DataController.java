package com.luisfn.comic.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {

	@Value("${spring.datasource.url}")
	private String url;

	@Value("${spring.datasource.username}")
	private String user;

	@Value("${spring.datasource.password}")
	private String password;

	@GetMapping("/data")
	public String getData() {

		StringBuilder sb = new StringBuilder();
		sb.append("URL:");
		sb.append(url);
		sb.append(",\nUSER:");
		sb.append(user);
		sb.append(",\nPASSWORD:");
		sb.append(password);

		return sb.toString();
	}

}
