package com.cice.gestioncice.repository.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class AulasEntity {

    private Long id;
    private String nombre;
    private ProfesoresEntity profesoresDTO;
    private List<AlumnosEntity> alumnosDTOS;
}
