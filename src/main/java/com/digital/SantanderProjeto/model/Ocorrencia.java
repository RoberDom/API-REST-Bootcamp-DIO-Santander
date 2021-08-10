package com.digital.SantanderProjeto.model;

import lombok.*;
import org.hibernate.envers.Audited;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
@Audited

public class Ocorrencia {

    @Id
    @GeneratedValue
    private long id;
    private String nome;
    private String descricao;

}
