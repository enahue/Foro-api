package ForoAPI.Aplication.Domain.Topico.Respuestas.Validaciones;

import ForoAPI.Aplication.Domain.Topico.Respuestas.DatosCrearRespuesta;

public interface ValidadorRespuesta {
    public void validar(DatosCrearRespuesta datos);
}