package students.main;

import java.util.ArrayList;
import java.util.List;


public class University {

	private List<Group> groupsList = new ArrayList<>();
	
	

	public void addGroup(Group group) {
		groupsList.add(group);
	}

	public String getRewardedGroups() {
		String rewardedGroups = "Congratulations, ";
		for (int i = 0; i < groupsList.size(); i++) {
			Group group = groupsList.get(i);
			if (group.isRewarded()) {
				rewardedGroups = rewardedGroups + group.getName();
			}
		}
		return rewardedGroups;
	}

}
