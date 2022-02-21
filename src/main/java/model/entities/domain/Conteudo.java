package model.entities.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
public abstract class Conteudo {

    protected static final double XP_PADRAO = 10.0;

    private String titulo;
    private String descricao;

    public abstract double calcularXp();
}
