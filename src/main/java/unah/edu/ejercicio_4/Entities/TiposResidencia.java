package unah.edu.ejercicio_4.Entities;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tiposresidencia")
public class TiposResidencia {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "idtiporesidencia")
  private int idTipoResidencia;

  private String descripcion;

  @Column(name = "preciokw") 
  private BigDecimal preciokw;

  @OneToOne(mappedBy = "tiposResidencia", orphanRemoval = true)
  private Abonado abonado;
}
