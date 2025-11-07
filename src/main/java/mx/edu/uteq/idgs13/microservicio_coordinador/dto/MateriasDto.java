package mx.edu.uteq.idgs13.microservicio_coordinador.dto;

import lombok.Data;

@Data
public class MateriasDto {
    private Long id;
    private String nombre;
    private String descripcion;
    private Boolean status;
}