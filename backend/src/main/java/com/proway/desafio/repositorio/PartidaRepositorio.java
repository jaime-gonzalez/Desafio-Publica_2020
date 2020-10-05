package com.proway.desafio.repositorio;

import java.util.List;
import org.springframework.data.repository.Repository;
import com.proway.desafio.modelo.PartidaModelo;

public interface PartidaRepositorio extends Repository<PartidaModelo, Integer>{

    void save(PartidaModelo partida);
    List<PartidaModelo> findAll();
    PartidaModelo findByJogo(Integer jogo);

}
