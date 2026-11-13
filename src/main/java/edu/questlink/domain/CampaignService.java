package edu.questlink.domain;

import edu.questlink.domain.enums.QuestType;

public class CampaignService {

    public static void main(String[] args) {

        String id = "A1B2C3";
        String title = "Colossus number 16: Malus.";
        QuestType type = QuestType.STORY;
        int damage = 60;
        int xpReward = 999;
        boolean completed = false;

        Quest myNewQuest = new Quest(id, title, type, damage, xpReward, completed);

    }
}
