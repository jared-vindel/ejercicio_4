package unah.edu.ejercicio_4.Dtos;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import unah.edu.ejercicio_4.Entities.Abonado;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TiposResidenciaDto {
  private int idTipoResidencia;

  private String descripcion;

  private BigDecimal precioKw;

  private Abonado abonado;
}
