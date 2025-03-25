package unah.edu.ejercicio_4.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import unah.edu.ejercicio_4.Dtos.TiposResidenciaDto;
import unah.edu.ejercicio_4.Services.TiposResidenciaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/TipoResidencia")
public class TiposResidenciaController {

  @Autowired
  private TiposResidenciaService tiposResidenciaService;

  @PostMapping("/crear")
  public TiposResidenciaDto crearTiposResidencia(@RequestBody TiposResidenciaDto tiposResidenciaDto) {
    return this.tiposResidenciaService.crearTiposResidencia(tiposResidenciaDto);
  }
  
}
