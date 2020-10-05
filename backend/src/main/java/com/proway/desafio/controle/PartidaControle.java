package com.proway.desafio.controle;

import com.proway.desafio.modelo.PartidaModelo;
import com.proway.desafio.modelo.RespostaModelo;
import com.proway.desafio.repositorio.PartidaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins ="http://localhost:4200")
@RestController
@RequestMapping("/api")
public class PartidaControle {

    @Autowired
    private PartidaRepositorio partidaRepositorio;

    @RequestMapping(value = "/partida", method= RequestMethod.GET)
    public @ResponseBody List<PartidaModelo> consultar(){
        return this.partidaRepositorio.findAll();
    }

    @RequestMapping(value="/partida/{jogo}", method = RequestMethod.GET)
    public @ResponseBody PartidaModelo buscar(@PathVariable("jogo") Integer jogo){
        return this.partidaRepositorio.findByJogo(jogo);
    }

    @RequestMapping(value="/partida", method = RequestMethod.POST)
    public @ResponseBody RespostaModelo salvar(@RequestBody PartidaModelo partida) {
        try {
            this.partidaRepositorio.save(partida);
            return new RespostaModelo("Registro gravado com sucesso");
        }catch (Exception e){
            return new RespostaModelo(e.getMessage());
        }
    }

    @RequestMapping(value="/partida", method = RequestMethod.PUT)
    public @ResponseBody RespostaModelo atualizar(@RequestBody PartidaModelo partida){
        try{
            this.partidaRepositorio.save(partida);
            return new RespostaModelo("Registro atualizado com sucesso");
        }catch (Exception e){
            return new RespostaModelo(e.getMessage());
        }
    }
}
