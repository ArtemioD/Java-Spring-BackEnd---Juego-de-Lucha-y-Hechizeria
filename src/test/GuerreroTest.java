package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import clases.Guerrero;
import clases.artefacto.Armadura;
import clases.artefacto.Artefacto;
import clases.artefacto.CollarDivino;
import clases.artefacto.Espada;
import clases.artefacto.MascaraOscura;
import org.junit.Assert;

class GuerreroTest {
	
//	3 pasos a seguir:
//		1. Generar los recursos necesarios para hacer las pruebas
//		2. Ejecutamos el metodo de prueba
//		3. Realizamos las comprabaciones con assert
	
	Espada espada;
	CollarDivino collarDivino;
	MascaraOscura mascaraOscura;
	Armadura armadura;
	List<Artefacto> artefactos;
	Guerrero guerrero;
	
	@BeforeEach
	public void before() {
		espada = new Espada(10);
		collarDivino = new CollarDivino(3);
		mascaraOscura = new MascaraOscura(5);
		armadura = new Armadura(4);
		artefactos = new ArrayList<Artefacto>();
		
		artefactos.add(espada);
		artefactos.add(collarDivino);
		artefactos.add(mascaraOscura);
		
		guerrero = new Guerrero("pepe", artefactos);		
	}

	@DisplayName("Nivel de Lucha")
	@Test
	void nivelLuchaGuerrero1() {
		int nivelEsperado = (espada.getUnLucha() + 
				collarDivino.getUnLucha() + mascaraOscura.getUnLucha());
		
		Assert.assertEquals(nivelEsperado, guerrero.getNivelLucha());	
	}
	
	@DisplayName("Nivel de Lucha esperamos obtener otro y que falle")
	@Test
	void nivelLuchaGuerreroFail1() {
		int nivelEsperado = (espada.getUnLucha() + 
				collarDivino.getUnLucha() + mascaraOscura.getUnLucha() + 1);
		
		Assert.assertNotEquals(nivelEsperado, guerrero.getNivelLucha());	
	}
	
	@DisplayName("Nivel de Lucha con Armadura")
	@Test
	void nivelLuchaGuerrero2() {
		guerrero.addArmadura(armadura);
		int nivelEsperado = (espada.getUnLucha() + collarDivino.getUnLucha() 
		+ mascaraOscura.getUnLucha() + armadura.getUnLucha());
		
		Assert.assertEquals(nivelEsperado, guerrero.getNivelLucha());	
	}
	
	@DisplayName("Nivel de Lucha con Armadura, esperamos obtener otro y que falle")
	@Test
	void nivelLuchaGuerreroFail2() {
		guerrero.addArmadura(armadura);
		int nivelEsperado = (espada.getUnLucha() + collarDivino.getUnLucha() 
		+ mascaraOscura.getUnLucha() + armadura.getUnLucha() + 1);
		
		Assert.assertNotEquals(nivelEsperado, guerrero.getNivelLucha());
	}

}
