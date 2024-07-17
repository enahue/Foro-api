package ForoAPI.Aplication.Domain.Topico.Respuestas.Validaciones;

import ForoAPI.Aplication.Domain.Topico.Respuestas.DatosCrearRespuesta;
import ForoAPI.Aplication.Domain.Topico.TopicoRepository;
import ForoAPI.Aplication.Infra.Errores.ValidacionDeIntegridad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TopicoValido implements ValidadorRespuesta {

    @Autowired
    TopicoRepository topicoRepository;

    @Override
    public void validar(DatosCrearRespuesta datos) {
        if (datos.idTopico() == null || !topicoRepository.existsById(datos.idTopico())) {
            throw new ValidacionDeIntegridad("Topico no encontrado");
        }
    }
}