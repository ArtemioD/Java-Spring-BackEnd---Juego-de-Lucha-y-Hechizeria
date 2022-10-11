package clases.artefacto;

public class Armadura extends Artefacto {
	
	private int cantidadPiezas;

	public Armadura(int cantidadPiezas) {
		super(10 + cantidadPiezas / 2);
		this.cantidadPiezas = cantidadPiezas;
	}

	public int getCantidadPiezas() {
		return cantidadPiezas;
	}

	public void setCantidadPiezas(int cantidadPiezas) {
		this.cantidadPiezas = cantidadPiezas;
	}

	@Override
	public String toString() {
		return "Armadura [cantidadPiezas=" + cantidadPiezas + ", unLucha=" + getUnLucha() + "]";
	}	

}
