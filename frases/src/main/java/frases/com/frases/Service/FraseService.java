package frases.com.frases.Service;

import frases.com.frases.DTO.FraseDTO;
import frases.com.frases.Model.Frases;
import frases.com.frases.Repositorios.FraseRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FraseService {

    @Autowired
    private FraseRepositorio repositorio;

    public FraseDTO obterFrasesAleatoria() {
       Frases frase = repositorio.buscaFraseAleatoria();
        return new FraseDTO(frase.getTitulo(),frase.getFrase(), frase.getPersonagem(), frase.getPoster());
    }
}
