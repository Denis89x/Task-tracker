package by.lebenkov.store.repositories;

import by.lebenkov.store.entities.ProjectEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProjectRepository extends JpaRepository<ProjectEntity, Long>  {
    Optional<ProjectEntity> findByName(String name);
}
