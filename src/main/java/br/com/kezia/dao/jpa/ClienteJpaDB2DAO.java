/**
 * 
 */
package br.com.kezia.dao.jpa;

import br.com.kezia.dao.generic.jpa.GenericJpaDB2DAO;
import br.com.kezia.domain.jpa.ClienteJpa;

public class ClienteJpaDB2DAO extends GenericJpaDB2DAO<ClienteJpa, Long> implements IClienteJpaDAO<ClienteJpa> {

	public ClienteJpaDB2DAO() {
		super(ClienteJpa.class);
	}

}
