package paf.project.soundtracks.model;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

import org.checkerframework.checker.units.qual.C;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "person")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "person_id")
    private Long personId;
    @Column(name = "user_name")
    private String userName;
    @Column(name = "review_count")
    private Integer reviewCount;
    @Column(name = "event_count") 
    private Integer eventCount;
    @Column(name = "review_score")
    private BigDecimal reviewScore;
    /* 
    private Set<Role> personRoles = new HashSet<>();
    private List<EventParticipation> eventParticipations;
 */
    // constructors
    public Person() {
    }
    public Person(Long personId, String userName, Integer reviewCount, Integer eventCount,
                  BigDecimal reviewScore) {
        this.personId = personId;
        this.userName = userName;
        this.reviewCount = reviewCount;
        this.eventCount = eventCount;
        this.reviewScore = reviewScore;
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
    public BigDecimal getReviewScore() {
        return reviewScore;
    }
    public void setReviewScore(BigDecimal reviewScore) {
        this.reviewScore = reviewScore;
    }
    /* public Set<Role> getPersonRoles() {
        return personRoles;
    }
    public void setPersonRoles(Set<Role> personRoles) {
        this.personRoles = personRoles;
    }  
    public List<EventParticipation> getEventParticipations() {
        return eventParticipations;
    }
    public void setEventParticipations(List<EventParticipation> eventParticipations) {
        this.eventParticipations = eventParticipations; }*/
    

    @Override
    public String toString() {
        return "Person [personId=" + personId + ", userName=" + userName + ", reviewCount=" + reviewCount
                + ", eventCount=" + eventCount + ", reviewScore=" + reviewScore + "]";
    }
}