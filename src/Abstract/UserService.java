package Abstract;

import Entities.User;

public interface UserService {

	void save(User user);
	void update(User user);
	void delete(User user);
	
}