package Abstract;

import Entities.Campaign;
import Entities.Game;
import Entities.User;

public interface BaseGameManager {

	void add(Campaign campaign);
	void update(Campaign campaign);
	void delete(Campaign campaign);
	void add(Game game);
	void buy(User user1, Game game1, Campaign campaign1);
	
	
}