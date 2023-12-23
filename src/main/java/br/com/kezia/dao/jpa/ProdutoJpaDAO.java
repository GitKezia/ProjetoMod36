/**
 * 
 */
package br.com.kezia.dao.jpa;

import br.com.kezia.dao.generic.jpa.GenericJpaDB1DAO;
import br.com.kezia.domain.jpa.ProdutoJpa;

/**
 * @author rodrigo.pires
 *
 */
public class ProdutoJpaDAO extends GenericJpaDB1DAO<ProdutoJpa, Long> implements IProdutoJpaDAO {

	public ProdutoJpaDAO() {
		super(ProdutoJpa.class);
	}

}
