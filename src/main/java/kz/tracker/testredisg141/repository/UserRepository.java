package kz.tracker.testredisg141.repository;

import kz.tracker.testredisg141.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, String> {
}
