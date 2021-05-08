import java.util.GregorianCalendar;

import Abstract.BaseCampaignManager;
import Abstract.BaseGameManager;
import Abstract.BaseUserManager;
import Adapters.MernisServiceAdapter;
import Concrete.CampaignManager;

import Concrete.UserManager;
import Entities.Campaign;
import Entities.Game;
import Entities.User;

public class Main {

	public static void main(String[] args) {
		
		BaseUserManager baseUserManager = new UserManager(new MernisServiceAdapter());
		BaseGameManager baseGameManager = new GameManager();
		BaseCampaignManager baseCampaignManager = new CampaignManager();
		
		User user1 = new User(1, "Seda", "Ceylan", new GregorianCalendar(1998,01,05).getTime(), "58697412365");
		Game game1 = new Game(1, "Metro Exodus Gold Edition", 380);
		Campaign campaign1 = new Campaign(1, "100 tl discount", 100);
		
		baseUserManager.save(user1);
		baseCampaignManager.add(campaign1);
		baseGameManager.add(game1);
		baseGameManager.buy(user1, game1,campaign1);

	}

}