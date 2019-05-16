package com.cice.gestioncice.controller.dto;

import com.cice.gestioncice.repository.entity.AlumnosEntity;
import com.cice.gestioncice.repository.entity.AulasEntity;
import com.cice.gestioncice.repository.entity.ProfesoresEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class CursoDTO {

    private Long id;
    private String codigo;
    private String nombre;
    private AulasEntity aulasDTO;
    private ProfesoresEntity profesoresDTO;
    private List<AlumnosEntity> alumnosDTOS;
}
