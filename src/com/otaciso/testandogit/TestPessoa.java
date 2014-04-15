package com.otaciso.testandogit;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;
@Before
public class TestPessoa throws Exception{

	@Test
	public void test() {
		fail("Not yet implemented");
	}

	private Pessoa pessoa;
	private Endereco endereco;

	@Before
	public void criarPessoa() throws Exception{
		endereco = new Endereco ("Marta Jabs", 198, "Rocha" ,"Rio Tinto", "Paraiba")
		pessoa = new Pessoa("Otaciso ", 25, "Masculino ", "078.059.234-42", "8.392.44", endereco);
	}

	public void testPessoa() {
		Assert.assertEquals("Nome errado!", "Otaciso", pessoa.getNome());
	}
}
