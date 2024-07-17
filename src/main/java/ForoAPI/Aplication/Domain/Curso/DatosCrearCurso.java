package ForoAPI.Aplication.Domain.Curso;

import jakarta.validation.constraints.NotNull;

public record DatosCrearCurso(
        @NotNull
        String nombre,
        @NotNull
        Categoria categoria
) {
}
