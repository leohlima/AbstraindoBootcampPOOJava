package model.entities.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.*;

@EqualsAndHashCode
@Setter
@Getter
@ToString
public class Bootcamp {

    private String name;
    private String descricao;
    private final LocalDate dataInicial = LocalDate.now();
    private final LocalDate dataFinal = dataInicial.plusDays(45);
    private Set<Dev> devsIncritos = new HashSet<>();
    private Set<Conteudo> conteudos = new LinkedHashSet<>();

}
