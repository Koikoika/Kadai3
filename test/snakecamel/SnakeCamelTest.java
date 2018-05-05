package snakecamel;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;


public class SnakeCamelTest {

	@Test
	public void snakeToCamelcaseで正しい結果が得られる() {
		SnakeCamelUtil util  = new SnakeCamelUtil();
		String expected = "AbcDefGhi";
		String camelcase = util.snakeToCamelcase("abc_def_ghi");
		assertThat(camelcase,is(expected));
	}
	@Test
	public void camelToSnakecaseで正しい結果が得られる() {
		SnakeCamelUtil util  = new SnakeCamelUtil();
		String expected = "abc_def_ghi";
		String snakecase = util.camelToSnakecase("AbcDefGhi");
		assertThat(snakecase,is(expected));
	}
	@Test
	public void capitalizeで正しい結果が得られる() {
		SnakeCamelUtil util  = new SnakeCamelUtil();
		String expected = "Abc";
		String st = util.capitalize("abc");
		assertThat(st,is(expected));
	}
	@Test
	public void uncapitalizeで正しい結果が得られる() {
		SnakeCamelUtil util  = new SnakeCamelUtil();
		String expected = "abc";
		String st = util.uncapitalize("Abc");
		assertThat(st,is(expected));
	}

}
