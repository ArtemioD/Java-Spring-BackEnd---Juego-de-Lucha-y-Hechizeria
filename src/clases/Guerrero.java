package clases;

import java.util.List;

import clases.artefacto.Armadura;
import clases.artefacto.Artefacto;

public class Guerrero {
	
	private String name;
	private List<Artefacto> artefactos;
	private int nivelLucha;
	
	public Guerrero(String name) {
		this.name = name;
	}

	public Guerrero(String name, List<Artefacto> artefactos) {
		this.name = name;
		this.artefactos = artefactos;
		getNivel();
	}
	
	private void getNivel() {
		int nivel = 0;
		for (Artefacto artefacto : artefactos) {
			nivel += artefacto.getUnLucha();		
		}
		this.nivelLucha = nivel;
	
	}
	
	public int CountArtefacts() {
		return artefactos.size();
	}
	
	public void addArmadura(Armadura armadura) {
		artefactos.add(armadura);
		getNivel();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Artefacto> getArtefactos() {
		return artefactos;
	}

	public void setArtefactos(List<Artefacto> artefactos) {
		this.artefactos = artefactos;
	}

	public int getNivelLucha() {
		return nivelLucha;
	}


	@Override
	public String toString() {
		return "Guerrero [name=" + name + 
				", artefactos=" + artefactos + 
				", nivelLucha=" + nivelLucha + "]";
	}
	
	
	
	
	
	
	

}
