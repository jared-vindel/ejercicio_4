package unah.edu.ejercicio_4.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import unah.edu.ejercicio_4.Dtos.AbonadoDto;
import unah.edu.ejercicio_4.Services.AbonadoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/Abonado")
public class AbonadoController {

  @Autowired
  AbonadoService abonadoService;

  @PostMapping("/crear")
  public AbonadoDto crearAbonado(@RequestBody AbonadoDto abonadoDto) {
      
      return this.abonadoService.crearAbonado(abonadoDto);
  }
  

}
