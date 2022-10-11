package clases.artefacto;

public class CollarDivino extends Artefacto {
	
	private int perlas;

	public CollarDivino(int perlas) {
		super(perlas);
		this.perlas = perlas;
	}

	public int getPerlas() {
		return perlas;
	}

	public void setPerlas(int perlas) {
		this.perlas = perlas;
	}

	@Override
	public String toString() {
		return "CollarDivino [perlas=" + perlas + 
				",  unLucha=" + getUnLucha() + "]";
	}

}
