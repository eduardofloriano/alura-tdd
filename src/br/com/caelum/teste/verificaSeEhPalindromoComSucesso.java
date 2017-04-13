package br.com.caelum.teste;

import org.junit.Assert;
import org.junit.Test;

import br.com.caelum.desafio.Palindromo;

public class verificaSeEhPalindromoComSucesso {
	
	
	@Test
	public void verificaSeEhPalindromoComSucesso(){
		
		String frase = "NATAN";
		Palindromo palindromo = new Palindromo();
		boolean result = palindromo.ehPalindromo(frase);
		
		Assert.assertEquals(true, result);
		
		
	}
	
	@Test
    public void deveIdentificarPalindromoEFiltrarCaracteresInvalidos() {
        Palindromo p = new Palindromo();

        boolean resultado = p.ehPalindromo(
            "Socorram-me subi no onibus em Marrocos");
        Assert.assertTrue(resultado);
    }

    @Test
    public void deveIdentificarPalindromo() {
        Palindromo p = new Palindromo();

        boolean resultado = p.ehPalindromo(
            "Anotaram a data da maratona");
        Assert.assertTrue(resultado);
    }

    @Test
    public void deveIdentificarSeNaoEhPalindromo() {
        Palindromo p = new Palindromo();

        boolean resultado = p.ehPalindromo(
            "E preciso amar as pessoas como se nao houvesse amanha");
        Assert.assertFalse(resultado);
    }
	
}
