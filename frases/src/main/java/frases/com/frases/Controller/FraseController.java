package frases.com.frases.Controller;

import frases.com.frases.DTO.FraseDTO;
import frases.com.frases.Service.FraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FraseController {

    @Autowired
    private FraseService servico;

    @GetMapping("/series/frases")
    public FraseDTO obterFrasesAleatoria(){
        return servico.obterFrasesAleatoria();
    }
}
