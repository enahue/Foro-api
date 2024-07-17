package ForoAPI.Aplication.Domain.Topico.Validacion;

import ForoAPI.Aplication.Domain.Curso.CursoRepository;
import ForoAPI.Aplication.Domain.Topico.DatosCrearTopico;
import ForoAPI.Aplication.Infra.Errores.ValidacionDeIntegridad;
import jakarta.validation.ValidationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CursoExistente implements ValidadorTopico{

    @Autowired
    private CursoRepository cursoRepository;

    @Override
    public void validar(DatosCrearTopico datos) {
        if (datos.idCurso() == null) {
            throw new ValidacionDeIntegridad("Error");
        }
        var curso = cursoRepository.findById(datos.idCurso());

        if (!curso.isPresent()) {
            throw new ValidationException("Error no existe.");
        }
    }
}