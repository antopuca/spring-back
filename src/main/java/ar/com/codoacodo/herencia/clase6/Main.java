package ar.com.codoacodo.herencia.clase6;
import ar.com.codoacodo.herencia.Articulo;
import ar.com.codoacodo.herencia.Buscador;


public class Main {
	static String claveDeUsuario;


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Libro libro1=new Libro("/libro.jpg","Iron Men","alguien",3500);
		//Articulo a = new Libro("/libro.jpg","Iron Men2","alguien2",4500);
		//Libro libroDentroDeA = (Libro)a;	
		
		
		claveDeUsuario = "iron men";
		Buscador miBuscador = new Buscador(claveDeUsuario);
		miBuscador.buscar();
		Articulo [] resultados = miBuscador.getResultados();
	//	miBuscador.mostrarResultados();
		for(Articulo unResultado : resultados) {
			 if(unResultado instanceof Libro) {
					Libro l = (Libro)unResultado;
					l.getNroDePaginas();
					l.getIsbn();					
					System.out.println(l.toString());
		}
			 if(unResultado instanceof Musica) {
					Musica m = (Musica)unResultado;
					m.getSello();
					m.getTemas();
					System.out.println(m.toString());
		}
			 if(unResultado instanceof Pelicula) {
				 Pelicula p = (Pelicula)unResultado;
					p.getProductora();
					p.getFormato();
				 System.out.println(p.toString());
					
		}
			 
		}
		

}
}