package by.lebenkov.api.factories;

import by.lebenkov.api.dto.ProjectDto;
import by.lebenkov.api.dto.TaskStateDto;
import by.lebenkov.store.entities.ProjectEntity;
import by.lebenkov.store.entities.TaskStateEntity;
import org.springframework.stereotype.Component;

@Component
public class TaskStateDtoFactory {

    public TaskStateDto makeTaskStateDto(TaskStateEntity entity) {
        return TaskStateDto.builder()
                .id(entity.getId())
                .name(entity.getName())
                .createdAt(entity.getCreatedAt())
                .ordinal(entity.getOrdinal())
                .build();
    }
}
