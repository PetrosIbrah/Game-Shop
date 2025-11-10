package web.app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import web.app.Identification.Images;
import web.app.Identification.Requirements;

public interface ImagesRepository extends JpaRepository<Images, Long> {

}
