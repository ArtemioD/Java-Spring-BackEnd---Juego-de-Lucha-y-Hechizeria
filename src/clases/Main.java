package clases;

import java.util.ArrayList;
import java.util.List;

import clases.artefacto.Armadura;
import clases.artefacto.Artefacto;
import clases.artefacto.CollarDivino;
import clases.artefacto.Espada;
import clases.artefacto.MascaraOscura;

public class Main {

	public static void main(String[] args) {
		test();

	}
	
	private static void test() {
		Espada espada = new Espada(10);
		CollarDivino collarDivino = new CollarDivino(3);
		MascaraOscura mascaraOscura = new MascaraOscura(5);
		Armadura armadura = new Armadura(4);
		List<Artefacto> artefactos = new ArrayList<Artefacto>();
		
		artefactos.add(espada);
		artefactos.add(collarDivino);
		artefactos.add(mascaraOscura);
		
		Guerrero guerrero = new Guerrero("pepe", artefactos);
		System.out.println(guerrero);
		guerrero.addArmadura(armadura);
		System.out.println(guerrero);
	}

}
