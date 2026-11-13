package edu.questlink.domain;


import edu.questlink.domain.enums.QuestType;

public class Quest {

    // attributes that define a mission in our game:
    private String id;
    private String title;
    private QuestType type;
    private int damage;
    private int xpReward;
    private boolean completed;

    // provide a way to initialize a quest
    public Quest(String id, String title, QuestType type, int damage, int xpReward, boolean completed) {
        this.id =  id;
        this.title = title;
        this.type = type;
        this.damage =  damage;
        this.xpReward = xpReward;
        this.completed = completed;
    }


}
