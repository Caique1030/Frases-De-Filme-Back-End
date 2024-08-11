package frases.com.frases.Repositorios;

import frases.com.frases.Model.Frases;
import org.hibernate.type.descriptor.converter.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface FraseRepositorio extends JpaRepository<Frases,Long> {
    @Query("SELECT f FROM Frases f ORDER BY random() LIMIT 1")
    Frases buscaFraseAleatoria();
}
