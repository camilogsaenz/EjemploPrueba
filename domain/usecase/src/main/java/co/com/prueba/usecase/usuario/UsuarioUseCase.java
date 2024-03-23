package co.com.prueba.usecase.usuario;

import co.com.prueba.model.usuario.Usuario;
import co.com.prueba.model.usuario.gateways.UsuarioRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class UsuarioUseCase {
    private final UsuarioRepository usuarioRepository;
    public void delete(String id) {
        usuarioRepository.delete(id);
    }
    public void save(Usuario usuario) {
        usuarioRepository.save(usuario);
    }
    public Usuario findById(String id) {
        return usuarioRepository.findById(id);
    }
    public List<Usuario> findAll() {
        return usuarioRepository.findAll();
    }
}
