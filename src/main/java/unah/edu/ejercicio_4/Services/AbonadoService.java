package unah.edu.ejercicio_4.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import unah.edu.ejercicio_4.Dtos.AbonadoDto;
import unah.edu.ejercicio_4.Entities.Abonado;
import unah.edu.ejercicio_4.Repositories.AbonadoRepository;

@Service
public class AbonadoService {

  @Autowired
  AbonadoRepository abonadoRepository;

  public AbonadoDto crearAbonado(AbonadoDto abonadoDto){
    Abonado abonado  = new Abonado();
    abonado.setNombre(abonadoDto.getNombre());
    abonado.setApellido(abonadoDto.getApellido());
    abonado.setTelefono(abonadoDto.getTelefono());
    abonado.setDni(abonadoDto.getDni());
    
    this.abonadoRepository.save(abonado);

    return abonadoDto;
  }
}
