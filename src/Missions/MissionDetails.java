package Missions;

import javax.swing.*;

public class MissionDetails {
    private String title;
    private String Objective;
    private String directions;
    private String location;

    // Getter and setter for title

    public String getTitle() {

        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    // Getter and setter for Objective
    public String getObjective() {
        return Objective;
    }

    public void setObjective(String Objective) {
        this.Objective = Objective;
    }

    // Getter and setter for directions
    public String getDirections() {
        return directions;
    }

    public void setDirections(String directions) {
        this.directions = directions;
    }

    // Getter and setter for location
    public String getLocation() {

        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public static void mission1(JTextArea textArea){ // mission 1 calling its details.
        MissionDetails mission = getMissionDetails1();

        textArea.append("\nMission Title: " + mission.getTitle());
        textArea.append("\nLocation: " + mission.getLocation());
        textArea.append("Mission Objective: " + mission.getObjective());

    }

    public static MissionDetails getMissionDetails1(){ // mission 1 details that are set for it.
        MissionDetails mission = new MissionDetails();
        mission.setLocation("Jack Malone's Office\n");
        mission.setTitle("Good things come to those who work!"); // Quote by Greg Dortch.
        mission.setObjective("\nGrab your stuff before leaving to find coach.");
        return mission;
    }

    public static void mission2(JTextArea textArea) { // mission 1 calling its details.
        MissionDetails mission = getMissionDetails2();
        textArea.append("\nMission Title: " + mission.getTitle());
        textArea.append("\nMission Objective: " + mission.getObjective());
    }

    private static MissionDetails getMissionDetails2() { // mission 2 details that are set for it.
        MissionDetails mission = new MissionDetails();
        mission.setTitle(" Every day is an opportunity disguised as a challenge"); // Quote by Tiki Barber
        mission.setObjective(" Track down coach Marlowe based on the clues around the stadium");
        // Continue off of the story plot point given here.
        return mission;
    }

    public static void mission3(JTextArea textArea) { // mission 3 calling its details.
        MissionDetails mission = getMissionDetails3();
        textArea.append("\nMission Title: " + mission.getTitle());
        textArea.append("\nMission Objective: " + mission.getObjective());
    }

    private static MissionDetails getMissionDetails3() { // mission 3 details that are set for it.
        MissionDetails mission = new MissionDetails();
        mission.setTitle("You cannot make progress with excuses"); // Quote by Cam Newton
        mission.setObjective("Check out Coach Marlowe's computer"); // Continue off of the story plot point given here.
        return mission;
    }

//    public static void mission2Details() {
//        textArea = new JTextArea("You are in Detective's Office");
//        textArea.setEditable(false);
//        textArea.setLineWrap(true);
//        textArea.setWrapStyleWord(true);
//        JScrollPane scrollPane = new JScrollPane(textArea);
//        textPanel = new JPanel(new BorderLayout());
//        textPanel.add(scrollPane, BorderLayout.CENTER);
//        add(textPanel, BorderLayout.CENTER);
//
//        // Add the mission one detail
//        mission1(textArea);
//    }

    /*
    public static void main(String[] args) {
        MissionDetails mission = new MissionDetails();
        mission.setTitle("The Missing Artifact");
        mission.setObjective("Investigate the disappearance of a valuable artifact from the museum.");
        System.out.println("Mission Title: " + mission.getTitle());
        System.out.println("Mission Objective: " + mission.getObjective());
    }
     */
}