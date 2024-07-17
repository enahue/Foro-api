package ForoAPI.Aplication.Domain.Curso.Validacion;

import ForoAPI.Aplication.Domain.Curso.DatosCrearCurso;
import ForoAPI.Aplication.Infra.Errores.ValidacionDeIntegridad;
import org.springframework.stereotype.Component;

@Component
public class CategoriaValida implements ValidadorCurso{

    @Override
    public void validar(DatosCrearCurso datos) {
        if (datos.categoria() == null) {
            throw new ValidacionDeIntegridad("Asigna una categoria");
        }
    }
}