import br.udesc.dao.jpa.JPAUtil;
import br.udesc.loman.dao.jpa.JPADAOFactory;
import br.udesc.loman.modelo.Unidade;


public class TesteRoteiro {

	
	public static void main(String[] args) throws Exception {
		
		JPAUtil.inicializar("loman");
        JPADAOFactory daoFac = new JPADAOFactory();
        
        Unidade unidade = daoFac.getUnidadeDAO().ler(15);
        System.out.println( unidade.getRoteiro().getId() );

	}

}
