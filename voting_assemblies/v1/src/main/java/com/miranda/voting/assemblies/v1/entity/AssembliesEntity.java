package com.miranda.voting.assemblies.v1.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@NoArgsConstructor
public class AssembliesEntity extends AbstractEntity<Long> implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @OneToOne
    private AssociateEntity associate;

    private Boolean vote;

    private LocalDateTime time;

    @ManyToOne
    private ScheduleEntity schedule;
}
