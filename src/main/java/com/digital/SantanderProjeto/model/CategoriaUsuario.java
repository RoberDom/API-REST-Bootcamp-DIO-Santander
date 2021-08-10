package com.digital.SantanderProjeto.model;

import lombok.*;
import org.hibernate.envers.Audited;
import javax.persistence.Entity;
import javax.persistence.Id;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
@Audited

public class CategoriaUsuario {
    @Id

    private long id;
    private String descricao;

}
