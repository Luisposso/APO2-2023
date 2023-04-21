package Ejerciciotres;

public class EjercicioTres {

	int Libro;
	private String isbn;
	private String titulo;
	private String autor;
	private  int numPaginas; 
  
    
    // Constructor  
    public EjercicioTres(String isbn, String titulo, String autor, int numPagina) {
    	this.isbn = isbn;
    	this.titulo = titulo;
    	this.autor = autor;
    	this.numPaginas = numPaginas;
    }
    
    
    //get
    public String getIsbn() {
    	return isbn;
    }
    public String getTitulo() {
    	return titulo;
    }
    public String getAutor() {
    	return autor;
    }
   public int getNumPaginas() {
	   return numPaginas;
   }
  
    // Sets
   public void setIsbn (String isbn) {
	   this.isbn = isbn;
   }
    public void setTitulo(String titulo) {
    	this.titulo = titulo;
    }
    public void setAutor(String autor) {
    	this.autor = autor;
    }
    public void setNumPaginas(int numPaginas) {
    	this.numPaginas = numPaginas;
    }
   
    // toString
    public String toString() {
    	return "El libro con ISBN"+ isbn + "creado por " + autor + "tiene " + numPaginas + "paginas.";
    }
    
}

