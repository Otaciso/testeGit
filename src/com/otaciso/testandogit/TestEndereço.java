package com.otaciso.testandogit;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import com.sun.xml.internal.ws.policy.spi.AssertionCreationException;

public class TestEndereço {
	private Endereco endereco;

	@Test
	public void test() {
		fail("Not yet implemented");
	}

	// Quero testar os endereços aqui!! nome; numero; bairro; Cidade; estado.
	public void criarEndereço() throws Exception {
		endereco = new Endereco("Boa Hancok", 1234, "Aurora", "Campina grande",
				"Paraiba");
	}

	// Ideia minha mesmo. depois conversamos mais sobre isso.
	@Test
	public void testaLançamentoDeExecoes() {

		try {
			new Endereco("", 1234, "Aurora", "Campina grande", "Paraiba");
			// no lancamento saberemos se a execesão esta correta.
			Assert.fail("Lança exeção de nome vazio");
		} catch (Exception e) {
			// O asser cria um objeto e comparo com mensagem de retorno.
			Assert.assertEquals("Mensagem Errada!", "Nome da Rua Invalido!",
					e.getMessage());
		}

		try {
			new Endereco(null, 1234, "Aurora", "Campina grande", "Paraiba");

			Assert.fail("Lança exeção de nome com nome vazio");
		} catch (Exception e) {

			Assert.assertEquals("Mensagem Errada!", "Nome da Rua Invalido!",
					e.getMessage());
		}

		try {
			new Endereco("Boa Hancok", -1234, "Aurora", "Campina grande",
					"Paraiba");

			Assert.fail("Lança exeção de nome vazio");
		} catch (Exception e) {

			Assert.assertEquals("Mensagem Errada!", "Nome da Rua Invalido!",
					e.getMessage());
		}

		try {
			new Endereco("Boa Hancok", 1234, "", "Campina grande", "Paraiba");

			Assert.fail("Devia Lançar Exeção Bairro Invalido!");
		} catch (Exception e) {

			Assert.assertEquals("Mensagem Errada!", "Nome da Rua Invalido!",
					e.getMessage());
		}

		try {
			new Endereco("Boa Hancok", 1234, "Aurora", "", "Paraiba");

			Assert.fail("Devia Lançar Exeção Cidade Invalido!");
		} catch (Exception e) {

			Assert.assertEquals("Mensagem Errada!", "Nome da cidade Invalido!",
					e.getMessage());
		}

		try {
			new Endereco("Boa Hancok", 1234, "Aurora", "Campina grande", "");

			Assert.fail("Devia Lançar Exeção Estado Invalido!");
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
	public void testaEndereço() {

		Assert.assertArrayEquals("Nome da rua errado", "Otaciso Silva",
				endereco.getRua());
		Assert.assertTrue(1234 == endereco.getNumero());
	}

}
