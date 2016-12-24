package com.accounting.initialtest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTests {

	private static Pattern pattern;
    private static Matcher matcher;
	public static void main(String[] args) {
		pattern = Pattern.compile("Hugo");
		matcher = pattern.matcher("Hugo Etiévant");
		while (matcher.find()) {
			System.out.println("Trouvé !");
		}

	}

}
