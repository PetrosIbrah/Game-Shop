package web.app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import web.app.Identification.Images;

public interface ImagesRepository extends JpaRepository<Images, Long> {
}
