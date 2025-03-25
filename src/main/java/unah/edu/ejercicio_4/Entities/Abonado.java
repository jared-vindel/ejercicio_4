package unah.edu.ejercicio_4.Entities;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "abonado")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Abonado {
  @Id
  @Column(name = "dni")
  private String dni;

  private String nombre;

  private String telefono;

  private String apellido;
  
  @OneToOne()
  @JoinColumn(name = "idtiporesidencia", referencedColumnName = "idtiporesidencia")
  private TiposResidencia tiposResidencia;

  @OneToMany(mappedBy = "abonado", orphanRemoval = true)
  private List<Facturacion> facturacion;
  
}
