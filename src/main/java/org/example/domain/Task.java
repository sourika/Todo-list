package org.example.domain;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(schema = "todo", name = "task")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String description;

    @Enumerated(value = EnumType.ORDINAL)
    private Status status;

}
