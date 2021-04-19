package it.prova.ricercalibro.model;

public class Libro {
	private String titolo;
	private String genere;
	private Integer numeroPagine;
	
	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getGenere() {
		return genere;
	}

	public void setGenere(String genere) {
		this.genere = genere;
	}

	public Integer getNumeroPagine() {
		return numeroPagine;
	}

	public void setNumeroPagine(Integer numeroPagine) {
		this.numeroPagine = numeroPagine;
	}

	public Libro(String titolo, String genere, Integer numeroPagine) {
		super();
		this.titolo = titolo;
		this.genere = genere;
		this.numeroPagine = numeroPagine;
	}

	@Override
	public String toString() {
		return "Libro [titolo=" + titolo + ", genere=" + genere + ", numeroPagine=" + numeroPagine + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((genere == null) ? 0 : genere.hashCode());
		result = prime * result + ((numeroPagine == null) ? 0 : numeroPagine.hashCode());
		result = prime * result + ((titolo == null) ? 0 : titolo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		if (genere == null) {
			if (other.genere != null)
				return false;
		} else if (!genere.equals(other.genere))
			return false;
		if (numeroPagine == null) {
			if (other.numeroPagine != null)
				return false;
		} else if (!numeroPagine.equals(other.numeroPagine))
			return false;
		if (titolo == null) {
			if (other.titolo != null)
				return false;
		} else if (!titolo.equals(other.titolo))
			return false;
		return true;
	}
	
	
	
	
}
