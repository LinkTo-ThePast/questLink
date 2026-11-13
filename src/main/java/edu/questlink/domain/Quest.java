package edu.questlink.domain;


public class Quest {

    // defining an enum for mission type>
    private static enum MissionType {
        STORY,
        COMBAT,
        PUZZLE,
        BOSS,
    }

    // attributes that define a mission in our game:
    private String id;
    private String title;
    private MissionType type;
    private int damage;
    private int xpReward;
    private boolean completed;

}
