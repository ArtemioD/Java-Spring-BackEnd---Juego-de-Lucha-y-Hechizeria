package clases.artefacto;

public class MascaraOscura extends Artefacto {
	
	private int nivelOscuridad;

	public MascaraOscura(int nivelOscuridad) {
		super(nivelOscuridad * 2);
		this.nivelOscuridad = nivelOscuridad;	
	}

	public int getNivelOscuridad() {
		return nivelOscuridad;
	}

	public void setNivelOscuridad(int nivelOscuridad) {
		this.nivelOscuridad = nivelOscuridad;
	}

	@Override
	public String toString() {
		return "MáscaraOscura [nivelOscuridad=" + nivelOscuridad + 
				", unLucha=" + getUnLucha() + "]";
	}
	
	

}
