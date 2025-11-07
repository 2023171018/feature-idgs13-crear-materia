package mx.edu.uteq.idgs13.microservicio_coordinador.service;

import mx.edu.uteq.idgs13.microservicio_coordinador.dto.MateriasDto;
import mx.edu.uteq.idgs13.microservicio_coordinador.entity.MateriasEntity;
import mx.edu.uteq.idgs13.microservicio_coordinador.repository.MateriasRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class MateriasService {

    @Autowired
    private MateriasRepository materiasRepository;

    public List<MateriasDto> getAllMaterias() {
        List<MateriasEntity> materias = materiasRepository.findAll();
        return materias.stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }

    public MateriasDto getMateriaById(Long id) {
        Optional<MateriasEntity> materia = materiasRepository.findById(id);
        return materia.map(this::convertToDto).orElse(null);
    }

    private MateriasDto convertToDto(MateriasEntity materia) {
        MateriasDto materiaDto = new MateriasDto();
        BeanUtils.copyProperties(materia, materiaDto);
        return materiaDto;
    }
}