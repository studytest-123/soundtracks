package paf.project.soundtracks.model;

import java.util.HashSet;
import java.util.Set;
import java.util.List;

public class Person {
    private Long personId;
    private String userName;
    private Integer reviewCount;
    private Integer eventCount;
    private Double reviewScore;
    private Set<Role> personRoles = new HashSet<>();
    private List<EventParticipation> eventParticipations;

    // constructors
    public Person() {
    }
    public Person(Long personId, String userName, Integer reviewCount, Integer eventCount,
                  Double reviewScore, Set<Role> personRoles) {
        this.personId = personId;
        this.userName = userName;
        this.reviewCount = reviewCount;
        this.eventCount = eventCount;
        this.reviewScore = reviewScore;
        this.personRoles = personRoles;
    }

    // getters and setters
    public Long getPersonId() {
        return personId;
    }
    public void setPersonId(Long personId) {
        this.personId = personId;
    }
    public String getUserName() {   
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName; 
    }
    public Integer getReviewCount() {
        return reviewCount;
    }
    public void setReviewCount(Integer reviewCount) {
        this.reviewCount = reviewCount;
    }
    public Integer getEventCount() {
        return eventCount;
    }
    public void setEventCount(Integer eventCount) {
        this.eventCount = eventCount;
    }
    public Double getReviewScore() {
        return reviewScore;
    }
    public void setReviewScore(Double reviewScore) {
        this.reviewScore = reviewScore;
    }
    public Set<Role> getPersonRoles() {
        return personRoles;
    }
    public void setPersonRoles(Set<Role> personRoles) {
        this.personRoles = personRoles;
    }  
    public List<EventParticipation> getEventParticipations() {
        return eventParticipations;
    }
    public void setEventParticipations(List<EventParticipation> eventParticipations) {
        this.eventParticipations = eventParticipations;
    }

    @Override
    public String toString() {
        return "Person [personId=" + personId + ", userName=" + userName + ", reviewCount=" + reviewCount
                + ", eventCount=" + eventCount + ", reviewScore=" + reviewScore + ", personRoles=" + personRoles + "]";
    }
}