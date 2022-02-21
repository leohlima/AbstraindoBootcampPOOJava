package model.entities.domain;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;


public class Mentoria extends Conteudo {

    @Getter
    @Setter
    private LocalDate data;


    @Override
    public double calcularXp() {
        return XP_PADRAO + 20.0;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "data=" + data +
                "titulo=" + getTitulo() +
                "descricao=" + getDescricao() +
                '}';
    }
}
