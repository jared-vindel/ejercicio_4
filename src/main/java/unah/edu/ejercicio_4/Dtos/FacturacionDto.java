package unah.edu.ejercicio_4.Dtos;

import java.math.BigDecimal;
import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import unah.edu.ejercicio_4.Entities.Abonado;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class FacturacionDto {

  private LocalDate fechaFacturacion;

  private BigDecimal kwsConsumidos;

  private BigDecimal totalFacturaion;

  private Abonado abonado;
}
