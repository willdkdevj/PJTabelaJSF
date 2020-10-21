package br.com.supernova.model;

public class Livro {
	private String titulo;
	private String autor;
	private String editora;
	private Integer numpag;
	private boolean edit;

    public Livro(){
        
    }
    
    public Livro(String titulo, String autor, String editora, Integer numpag, boolean valor){
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.numpag = numpag;
        this.edit = valor;
    }
    
	public void setTitulo(String titulo){
		this.titulo = titulo;
	}

	public String getTitulo(){
		return titulo;
	}

	public void setAutor(String autor){
		this.autor = autor;
	}

	public String getAutor(){
		return autor;
	}

	public void setEditora(String editora){
		this.editora = editora;
	}

	public String getEditora(){
		return editora;
	}

	public void setNumPag(Integer numpag){
		this.numpag = numpag;
	}

	public Integer getNumPag(){
		return numpag;
	}
	
	public void setEdit(boolean valor){
	    this.edit = valor;
	}
	
	public boolean isEdit(){
	    return edit;
	}
}
