package co.com.prueba.model.usuario.gateways;

import co.com.prueba.model.usuario.Usuario;

import java.util.List;

public interface UsuarioRepository {
    Usuario save(Usuario usuario);
    Usuario findById(String id);
    List<Usuario> findAll();
    void delete(String id);
}
