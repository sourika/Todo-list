package org.example.controller;

import lombok.Data;
import org.example.domain.Status;

@Data
public class TaskInfo {

    private String description;
    private Status status;
}
