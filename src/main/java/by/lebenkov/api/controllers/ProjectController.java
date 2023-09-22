package by.lebenkov.api.controllers;

import by.lebenkov.api.dto.ProjectDto;
import by.lebenkov.api.exceptions.BadRequestException;
import by.lebenkov.api.factories.ProjectDtoFactory;
import by.lebenkov.store.entities.ProjectEntity;
import by.lebenkov.store.repositories.ProjectRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@Transactional
@RestController
public class ProjectController {

    ProjectDtoFactory projectDtoFactory;

    ProjectRepository projectRepository;

    public static final String CREATE_PROJECT = "/api/projects";

    @PostMapping(CREATE_PROJECT)
    public ProjectDto createProject(@RequestParam String name) {
        projectRepository.
                findByName(name)
                .ifPresent(project -> {
                    throw new BadRequestException(String.format("Project \"%s\" already exists", name));
                });

        //TODO: uncomment and insert entity in method
        return null;
    }
}
