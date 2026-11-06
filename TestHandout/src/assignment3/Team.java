package assignment3;

import java.awt.*;
import java.util.ArrayList;
import java.util.Comparator;

public class Team {
   private ArrayList<TeamMember> members = new ArrayList<>();

    // Adds a team member to the instance field members

    public void addTeamMember(TeamMember m) {
        members.add(m);
    }
    
    // Nothing to do here!

    public void addTeamMembers(ArrayList<TeamMember> t) {
        members.addAll(t);
    }
    
    // Nothing to do here!

    public ArrayList<TeamMember> getAllMembers() {
        return members;
    }
    
    // TeamMember to remove. Return true if a TeamMember was removed

    public boolean removeTeamMember(TeamMember m){
        if(members.remove(m)){
            return true;
        }
        return false;
    }

    // Retrieve members by role

    public ArrayList<TeamMember> retriveMembersByRole(String role) {
        ArrayList<TeamMember> result = new ArrayList<>();

        for (TeamMember member : members){
            if(member.getRole().equalsIgnoreCase(role)){
                result.add(member);
            }
        }
        return result;
    }

    // Sort the TeamMember list in ascending order by name

    public void sortByNameAsc() {
        members.sort(Comparator.comparing(TeamMember::getName));
    }

    // Sort the TeamMember list in descending order by role

    public void sortByRoleDesc() {
        members.sort(Comparator.comparing(TeamMember::getRole).reversed());
    }

    /* Return the next available id
     * The id must start at 0. If a member is removed from the list, the id must be freed for the next member.
     * The next id must always be the smallest possible id number */

    public int getNextId() {
        int id = 0;

        while (true) {
            boolean found = false;

            for (TeamMember member : members) {
                if (member.getId() == id) {
                    found = true;
                }
            }

            if (!found) return id;
            id++;
        }
    }
}
