package snakecamel;

public class SnakeCamelUtil {
	
	public static void main(String[] args) {
		System.out.println(capitalize("a"));
		System.out.println(uncapitalize("A"));
		
		System.out.println(snakeToCamelcase("abc_def"));
		System.out.println(camelToSnakecase("AbcDef"));
	}

	public static String snakeToCamelcase(String snake_case) {//入力された小文字の文字列を_で分けてそれぞれの最初の文字を大文字にする
		String[] words = snake_case.split("_");
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < words.length; i++) {
			sb.append(capitalize(words[i]));
		}
		return new String(sb);
	}
	 
	public static String camelToSnakecase(String camelcase) {//入力された文字列を小文字と_のみで構成された文字列に変換して返す
		StringBuilder sb = new StringBuilder();
		int j = 0;
		for (int i = 0; i < camelcase.length(); i++) {
			char c = camelcase.charAt(i);
			if (Character.isUpperCase(c)) {//もしcが大文字だったら
				sb.append(camelcase.substring(j, i));//j番目の文字からi文字分だけ加える
				if (sb.length() > 0) {//sbが空でなかったら
					sb.append("_");
				}
				sb.append(Character.toLowerCase(c));//小文字にしたcを加える
				j = i+1;
			}
		}
		sb.append(camelcase.substring(j));
		return new String(sb);
	}
	
	static String capitalize(String s) {//入力された文字列の頭文字を大文字にして返す
		char first = s.charAt(0);
		char upperFirst = Character.toUpperCase(first);
		String rest = s.substring(1);
		return upperFirst + rest;
	}

	static String uncapitalize(String s) {//入力された文字列の頭文字を小文字にして返す
		char first = s.charAt(0);
		char lowerFirst = Character.toLowerCase(first);
		String rest = s.substring(1);
		return lowerFirst + rest;
	}
	
}
