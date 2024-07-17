package ForoAPI.Aplication.Domain.Topico.Validacion;

import ForoAPI.Aplication.Domain.Usuario.UsuarioRepository;
import ForoAPI.Aplication.Domain.Topico.DatosCrearTopico;
import jakarta.validation.ValidationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UsuarioExistente implements ValidadorTopico{

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public void validar(DatosCrearTopico datos) {
        var usuario = usuarioRepository.existsById(datos.idAutor());

        if (!usuario) {
            new ValidationException("No registrado.");
        }

    }
}