/**
 * 
 */
package br.com.kezia.dao.jpa;

import br.com.kezia.dao.generic.jpa.GenericJpaDB1DAO;
import br.com.kezia.domain.jpa.ClienteJpa;


public class ClienteJpaDAO extends GenericJpaDB1DAO<ClienteJpa, Long> implements IClienteJpaDAO<ClienteJpa> {

	public ClienteJpaDAO() {
		super(ClienteJpa.class);
	}

}
