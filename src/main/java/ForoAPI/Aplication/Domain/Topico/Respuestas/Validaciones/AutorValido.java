package ForoAPI.Aplication.Domain.Topico.Respuestas.Validaciones;

import ForoAPI.Aplication.Domain.Topico.Respuestas.DatosCrearRespuesta;
import ForoAPI.Aplication.Domain.Usuario.UsuarioRepository;
import ForoAPI.Aplication.Infra.Errores.ValidacionDeIntegridad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AutorValido implements ValidadorRespuesta {

    @Autowired
    UsuarioRepository usuarioRepository;

    @Override
    public void validar(DatosCrearRespuesta datos) {
        if (datos.idAutor() == null || !usuarioRepository.existsById(datos.idAutor())) {
            throw new ValidacionDeIntegridad("Autor no encontrado");
        }
    }
}