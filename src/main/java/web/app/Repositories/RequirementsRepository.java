package web.app.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import web.app.Identification.Requirements;

public interface RequirementsRepository extends JpaRepository<Requirements, Long> {

}
