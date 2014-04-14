package com.otaciso.testandogit;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import com.sun.xml.internal.ws.policy.spi.AssertionCreationException;

public class TestEndere�o {
	private Endereco endereco;

	@Test
	public void test() {
		fail("Not yet implemented");
	}

	// Quero testar os endere�os aqui!! nome; numero; bairro; Cidade; estado.
	public void criarEndere�o() throws Exception {
		endereco = new Endereco("Boa Hancok", 1234, "Aurora", "Campina grande",
				"Paraiba");
	}

	// Ideia minha mesmo. depois conversamos mais sobre isso.
	@Test
	public void testaLan�amentoDeExecoes() {

		try {
			new Endereco("", 1234, "Aurora", "Campina grande", "Paraiba");
			// no lancamento saberemos se a execes�o esta correta.
			Assert.fail("Lan�a exe��o de nome vazio");
		} catch (Exception e) {
			// O asser cria um objeto e comparo com mensagem de retorno.
			Assert.assertEquals("Mensagem Errada!", "Nome da Rua Invalido!",
					e.getMessage());
		}

		try {
			new Endereco(null, 1234, "Aurora", "Campina grande", "Paraiba");

			Assert.fail("Lan�a exe��o de nome com nome vazio");
		} catch (Exception e) {

			Assert.assertEquals("Mensagem Errada!", "Nome da Rua Invalido!",
					e.getMessage());
		}

		try {
			new Endereco("Boa Hancok", -1234, "Aurora", "Campina grande",
					"Paraiba");

			Assert.fail("Lan�a exe��o de nome vazio");
		} catch (Exception e) {

			Assert.assertEquals("Mensagem Errada!", "Nome da Rua Invalido!",
					e.getMessage());
		}

		try {
			new Endereco("Boa Hancok", 1234, "", "Campina grande", "Paraiba");

			Assert.fail("Devia Lan�ar Exe��o Bairro Invalido!");
		} catch (Exception e) {

			Assert.assertEquals("Mensagem Errada!", "Nome da Rua Invalido!",
					e.getMessage());
		}

		try {
			new Endereco("Boa Hancok", 1234, "Aurora", "", "Paraiba");

			Assert.fail("Devia Lan�ar Exe��o Cidade Invalido!");
		} catch (Exception e) {

			Assert.assertEquals("Mensagem Errada!", "Nome da cidade Invalido!",
					e.getMessage());
		}

		try {
			new Endereco("Boa Hancok", 1234, "Aurora", "Campina grande", "");

			Assert.fail("Devia Lan�ar Exe��o Estado Invalido!");
		} catch (Exception e) {

			Assert.assertEquals("Mensagem Errada!", "Nome do Estado Invalido!",
					e.getMessage());
		}
	}

	//
	// @Test (expected = Exception.class)
	// public void testaConstrutorParamRuaNull() throwa Exeption{
	// new Endereco (null, 1234, "Aurora", "Campina grande", "Paraiba");
	// }
	//

	@Test
	public void testaEndere�o() {

		Assert.assertArrayEquals("Nome da rua errado", "Otaciso Silva",
				endereco.getRua());
		Assert.assertTrue(1234 == endereco.getNumero());
	}

}
