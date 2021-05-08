package Abstract;

import Entities.Campaign;

public abstract class BaseCampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		
		System.out.println("The campaign was added " + campaign.getName());
		
	}

	@Override
	public void update(Campaign campaign) {
		
		System.out.println("The campaign has been updated " + campaign.getName());
		
	}

	@Override
	public void delete(Campaign campaign) {
		
		System.out.println("The campaign was deleted " + campaign.getName());
		
	}

}