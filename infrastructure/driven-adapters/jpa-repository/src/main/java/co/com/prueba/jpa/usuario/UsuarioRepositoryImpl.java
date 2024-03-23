package co.com.prueba.jpa.usuario;

import co.com.prueba.model.usuario.Usuario;
import co.com.prueba.model.usuario.gateways.UsuarioRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@AllArgsConstructor
public class UsuarioRepositoryImpl implements UsuarioRepository {

    //Persistencia de datos
    private final JPARepositoryAdapter jpaRepositoryAdapter;
    @Override
    public Usuario save(Usuario usuario) {
        return jpaRepositoryAdapter.save(usuario);
    }
    @Override
    public Usuario findById(String id) {
        return jpaRepositoryAdapter.findById(id);
    }

    @Override
    public List<Usuario> findAll() {
        return jpaRepositoryAdapter.findAll();
    }
    @Override
    public void delete(String id) {
        jpaRepositoryAdapter.deleteById(id);
    }
}
