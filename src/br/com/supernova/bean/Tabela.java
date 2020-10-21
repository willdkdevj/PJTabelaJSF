package br.com.supernova.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.faces.model.ListDataModel;
import javax.inject.Named;

import br.com.supernova.model.Livro;

@Named("tabela")
@SessionScoped
public class Tabela implements Serializable {
	
	private List<Livro> livros;
	private ListDataModel<Livro> listaLivros;
      
    public Tabela(){    	
        
        
    }
    
	@PostConstruct
    public void init() {
    	livros = new ArrayList<>();
    	listaLivros = new ListDataModel<>(livros);
    	
    	livros.add(new Livro("Java para Web", "José Silva", "Livro & CIA", 256, true));
        livros.add(new Livro("Java Server Faces", "Maria Oliveira", "Novo Livro", 344, false));
        livros.add(new Livro("", "", "", 0, true));        
        
    }
    
    public String inserir(){
        Livro l = new Livro();
        l.setEdit(true);
        livros.add(l);
        return null;
    }   
    
	public String gravar(Livro livro){
		livro.setEdit(false);
		return null;
	}

	public String editar(Livro livro){
		livro.setEdit(true);
		return null;
	}

	public String excluir(Livro livro){
		livros.remove(livro);
		return null;
	}
	
	public ListDataModel<Livro> getListaLivros(){
		return listaLivros;
	}
	
	public void setListaLivros(ListDataModel<Livro> livros) {
		this.listaLivros = livros;
	}
}
