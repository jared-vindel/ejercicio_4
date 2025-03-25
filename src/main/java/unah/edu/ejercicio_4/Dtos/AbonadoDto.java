package unah.edu.ejercicio_4.Dtos;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import unah.edu.ejercicio_4.Entities.Facturacion;
import unah.edu.ejercicio_4.Entities.TiposResidencia;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AbonadoDto {

  private String dni;

  private String nombre;

  private String telefono;

  private String apellido;

  private int idTipoResidencia;

  private TiposResidencia tiposResidencia;

  private List<Facturacion> facturacion;
  
}
