package persistence;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerHelper {
	
public static EntityManagerFactory emf = Persistence.createEntityManagerFactory("s3g5progettosettimanale");
	
	public static EntityManager getEntityManager() {
		
		return emf.createEntityManager();

	}

}
