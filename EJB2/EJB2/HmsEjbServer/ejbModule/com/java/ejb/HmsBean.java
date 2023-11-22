package com.java.ejb;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 * Session Bean implementation class HmsBean
 */
@Stateless
@Remote(HmsBeanRemote.class)
public class HmsBean implements HmsBeanRemote {

  @PersistenceContext(unitName="HmsMgmtPU")
  private EntityManager entityManager;
	
    public HmsBean() {
        // TODO Auto-generated constructor stub
    }

	@Override	
	public List<Doctor> showDoctor() {
		System.out.println("Entity Manager is "+entityManager);
		Query query = entityManager.createQuery("SELECT d FROM Doctor d");
		return (List<Doctor>) query.getResultList();
	}

}
