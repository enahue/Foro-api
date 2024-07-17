package ForoAPI.Aplication.Domain.Curso.Validacion;

import ForoAPI.Aplication.Domain.Curso.DatosCrearCurso;

public interface ValidadorCurso {
    public void validar(DatosCrearCurso datos);
}