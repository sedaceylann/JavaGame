package Concrete;

import Abstract.BaseUserManager;
import Abstract.UserCheckService;
import Entities.User;

public class UserManager extends BaseUserManager {

	private UserCheckService userCheckService;
	
	public UserManager(UserCheckService userCheckService) {
		this.userCheckService = userCheckService;
	}

	@Override
	public void save(User user) {
		
		try {
			if(userCheckService.CheckIfRealPerson(user)) {
				super.save(user);
			}
		} catch (Exception e) {
			
		}
	}
	
	@Override
	public void update(User user) {
		
		super.update(user);
	}
	
	@Override
	public void delete(User user) {
	
		super.delete(user);
	}
	
}