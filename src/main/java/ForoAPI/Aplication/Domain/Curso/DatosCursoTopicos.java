package ForoAPI.Aplication.Domain.Curso;

import ForoAPI.Aplication.Domain.Topico.DatosTopico;
import org.springframework.data.domain.Page;

public record DatosCursoTopicos(DatosCurso curso, Page<DatosTopico> topicos) {

}