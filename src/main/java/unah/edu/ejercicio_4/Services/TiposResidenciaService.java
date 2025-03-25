package unah.edu.ejercicio_4.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import unah.edu.ejercicio_4.Dtos.TiposResidenciaDto;
import unah.edu.ejercicio_4.Entities.TiposResidencia;
import unah.edu.ejercicio_4.Repositories.TiposResidenciaRepository;

@Service
public class TiposResidenciaService {
  @Autowired
  private TiposResidenciaRepository tiposResidenciaRepository;

  public TiposResidenciaDto crearTiposResidencia(TiposResidenciaDto tiposResidenciaDto){
    TiposResidencia tiposResidencia = new TiposResidencia();

    tiposResidencia.setDescripcion(tiposResidenciaDto.getDescripcion());
    tiposResidencia.setPrecioKw(tiposResidenciaDto.getPrecioKw());
    TiposResidencia saved = this.tiposResidenciaRepository.save(tiposResidencia);

    tiposResidenciaDto.setIdTipoResidencia(saved.getIdTipoResidencia());

    return tiposResidenciaDto;

  }
}
