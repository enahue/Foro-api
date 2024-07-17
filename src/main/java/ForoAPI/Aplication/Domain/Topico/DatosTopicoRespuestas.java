package ForoAPI.Aplication.Domain.Topico;

import ForoAPI.Aplication.Domain.Topico.Respuestas.DatosRespuesta;
import org.springframework.data.domain.Page;

public record DatosTopicoRespuestas(DatosTopico topico, Page<DatosRespuesta> respuestas) {
}