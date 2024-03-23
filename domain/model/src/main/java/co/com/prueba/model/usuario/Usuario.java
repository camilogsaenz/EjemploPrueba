package co.com.prueba.model.usuario;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class Usuario {
    private  String id;
    private  String nombre;

}
