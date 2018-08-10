package entities;

import entities.enums.Cores;

public abstract class Forma {

	private Cores cores;

	public Forma() {
		super();
	}

	public Forma(Cores cores) {
		super();
		this.cores = cores;
	}

	public Cores getCores() {
		return cores;
	}

	public void setCores(Cores cores) {
		this.cores = cores;
	}

	public abstract double area();
}
