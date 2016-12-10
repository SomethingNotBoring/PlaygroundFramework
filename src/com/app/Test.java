package com.app;

import java.io.IOException;

public class Test {

	public static void main(String[] args) {
		try {
			System.out.println("repoPath: "+ Config.getProperty("repoPath"));
			System.out.println("dbpassword: "+ Config.getProperty("dbpassword"));
			System.out.println("database: "+ Config.getProperty("database"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
