package model.entities.domain;

import lombok.Getter;
import lombok.Setter;

public class Curso extends Conteudo{

    @Getter
    @Setter
    private Integer cargaHoraria;

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo= " + getTitulo() +
                "descricao= " + getDescricao() +
                '}' +
                "cargaHoraria= " + cargaHoraria +
                '}';
    }
}
