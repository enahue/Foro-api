package ForoAPI.Aplication.Domain.Topico.Respuestas.Validaciones;

import ForoAPI.Aplication.Domain.Topico.Respuestas.DatosCrearRespuesta;
import ForoAPI.Aplication.Domain.Usuario.UsuarioRepository;
import ForoAPI.Aplication.Domain.Topico.Respuestas.RespuestaRepository;
import ForoAPI.Aplication.Domain.Topico.TopicoRepository;
import ForoAPI.Aplication.Infra.Errores.ValidacionDeIntegridad;
import jakarta.validation.ValidationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RespuestaValida implements ValidadorRespuesta {

    @Autowired
    RespuestaRepository respuestaRepository;

    @Autowired
    UsuarioRepository usuarioRepository;

    @Autowired
    TopicoRepository topicoRepository;

    @Override
    public void validar(DatosCrearRespuesta datos) {
        if (datos.mensaje() == null) {
            throw new ValidacionDeIntegridad("mensaje no encontrado");
        }

        if (respuestaRepository.existsByTopicoAndMensajeAndAutorRespuesta(
                topicoRepository.getReferenceById(datos.idTopico()),
                datos.mensaje(),
                usuarioRepository.getReferenceById(datos.idAutor()))) {
            throw new ValidationException("Ya existe una respuesta igual para el topico");
        }
    }
}