package com.digital.SantanderProjeto.model;
import lombok.*;
import org.hibernate.envers.Audited;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//Anotações do Lombok para gerar métodos Getters, Setters e construtores automaticamente:
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity // Mapeia como uma entidade(table) no Banco de Dados
@Audited



public class JornadaTrabalho {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE) // Gera  um ID automaticamente
    private long id;
    private String descricao;

}
