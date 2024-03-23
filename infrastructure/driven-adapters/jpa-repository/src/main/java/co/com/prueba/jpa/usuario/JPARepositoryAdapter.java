package co.com.prueba.jpa.usuario;

import co.com.prueba.jpa.helper.AdapterOperations;
import co.com.prueba.model.usuario.Usuario;
import org.reactivecommons.utils.ObjectMapper;
import org.springframework.stereotype.Repository;

@Repository
public class JPARepositoryAdapter extends AdapterOperations<Usuario/* change for domain model */, UsuarioEntity/* change for adapter model */, String, JPARepository>
// implements ModelRepository from domain
{

    public JPARepositoryAdapter(JPARepository repository, ObjectMapper mapper) {
        /**
         *  Could be use mapper.mapBuilder if your domain model implement builder pattern
         *  super(repository, mapper, d -> mapper.mapBuilder(d,ObjectModel.ObjectModelBuilder.class).build());
         *  Or using mapper.map with the class of the object model
         */
        super(repository, mapper, d -> mapper.map(d, Usuario.class/* change for domain model */));
    }
}
