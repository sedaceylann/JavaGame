package Abstract;

import Entities.Campaign;
import Entities.Game;

public interface GameService {

	void add(Campaign campaign);
	void update(Campaign campaign);
	void delete(Campaign campaign);
	void add(Game game);
	
	
}