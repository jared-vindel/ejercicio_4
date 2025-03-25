package unah.edu.ejercicio_4.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import unah.edu.ejercicio_4.Dtos.AbonadoDto;
import unah.edu.ejercicio_4.Entities.Abonado;
import unah.edu.ejercicio_4.Entities.TiposResidencia;
import unah.edu.ejercicio_4.Repositories.AbonadoRepository;
import unah.edu.ejercicio_4.Repositories.TiposResidenciaRepository;

@Service
public class AbonadoService {

  @Autowired
  AbonadoRepository abonadoRepository;
  
  @Autowired
  TiposResidenciaRepository tiposResidenciaRepository;

  public AbonadoDto crearAbonado(AbonadoDto abonadoDto){
    Abonado abonado  = new Abonado();
    abonado.setNombre(abonadoDto.getNombre());
    abonado.setApellido(abonadoDto.getApellido());
    abonado.setTelefono(abonadoDto.getTelefono());
    abonado.setDni(abonadoDto.getDni());

    if(tiposResidenciaRepository.existsById(abonadoDto.getIdTipoResidencia())){
      TiposResidencia tiposResidencia = tiposResidenciaRepository.findById(abonadoDto.getIdTipoResidencia()).get();
      abonado.setTiposResidencia(tiposResidencia);
    }

    this.abonadoRepository.save(abonado);

    return abonadoDto;
  }

  public AbonadoDto obtenerAbonado(String dni){
    if(this.abonadoRepository.existsById(dni)){
      Abonado abonado = this.abonadoRepository.findById(dni).get();
      AbonadoDto abonadoDto = new AbonadoDto();
      abonadoDto.setDni(abonado.getDni());
      abonadoDto.setNombre(abonado.getNombre());
      abonadoDto.setApellido(abonado.getApellido());
      abonadoDto.setTelefono(abonado.getTelefono());
      return abonadoDto;
    }
    return null;
  }

  public String eliminarAbonado(String dni){
    if(this.abonadoRepository.existsById(dni) && this.abonadoRepository.findById(dni).get().getTiposResidencia() != null){

      Abonado abonado = this.abonadoRepository.findById(dni).get();
      abonado.setFacturacion(null);
      TiposResidencia rs = this.abonadoRepository.findById(dni).get().getTiposResidencia();
      rs.setAbonado(null);
      this.tiposResidenciaRepository.save(rs);
      return "Se eliminó correctamente";
    } else if(this.abonadoRepository.existsById(dni)){
      Abonado abonado = this.abonadoRepository.findById(dni).get();
      abonado.setFacturacion(null);
      this.abonadoRepository.deleteById(dni);
      return "jajaja";
    }

    return "No existe el abonado";
  }
}
