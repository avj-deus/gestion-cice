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
public class CursosEntity {

    private Long id;
    private String codigo;
    private String nombre;
    private AulasEntity aulasDTO;
    private ProfesoresEntity profesoresDTO;
    private List<AlumnosEntity> alumnosDTOS;

}
