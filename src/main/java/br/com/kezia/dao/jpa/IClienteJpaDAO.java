/**
 * 
 */
package br.com.kezia.dao.jpa;

import br.com.kezia.dao.generic.jpa.IGenericJapDAO;
import br.com.kezia.domain.jpa.Persistente;

/**
 * @author rodrigo.pires
 *
 */
public interface IClienteJpaDAO<T extends Persistente> extends IGenericJapDAO<T, Long>{

}
