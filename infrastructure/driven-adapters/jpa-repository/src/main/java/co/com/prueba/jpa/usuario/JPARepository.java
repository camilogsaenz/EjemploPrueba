package co.com.prueba.jpa.usuario;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

public interface JPARepository extends CrudRepository<UsuarioEntity/* change for adapter model */, String>, QueryByExampleExecutor<UsuarioEntity/* change for adapter model */> {
}
