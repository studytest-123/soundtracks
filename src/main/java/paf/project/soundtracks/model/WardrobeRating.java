package paf.project.soundtracks.model;

import java.math.BigDecimal;
import jakarta.persistence.*;
import paf.project.soundtracks.util.RatingUtils;

@Embeddable
public class WardrobeRating {
    
    private BigDecimal wardrobePrice;
    private BigDecimal wardrobeStaffEfficiency;
    private BigDecimal wardrobeStaffFriendliness;
    private BigDecimal wardrobeQuality;
    
    // constructors
    public WardrobeRating() {
    }

    public WardrobeRating(BigDecimal wardrobePrice,
                          BigDecimal wardrobeStaffEfficiency, BigDecimal wardrobeStaffFriendliness, BigDecimal wardrobeQuality) {
        this.wardrobePrice = wardrobePrice;
        this.wardrobeStaffEfficiency = wardrobeStaffEfficiency;
        this.wardrobeStaffFriendliness = wardrobeStaffFriendliness;
        this.wardrobeQuality = wardrobeQuality;
    }

    // getters and setters
    public BigDecimal getWardrobePrice() {
        return wardrobePrice;
    }
    public void setWardrobePrice(BigDecimal wardrobePrice) {
        this.wardrobePrice = wardrobePrice;
    }
    public BigDecimal getWardrobeStaffEfficiency() {
        return wardrobeStaffEfficiency;
    }
    public void setWardrobeStaffEfficiency(BigDecimal wardrobeStaffEfficiency) {
        this.wardrobeStaffEfficiency = wardrobeStaffEfficiency;
    }
    public BigDecimal getWardrobeStaffFriendliness() {
        return wardrobeStaffFriendliness;
    }
    public void setWardrobeStaffFriendliness(BigDecimal wardrobeStaffFriendliness) {
        this.wardrobeStaffFriendliness = wardrobeStaffFriendliness;
    }
    public BigDecimal getWardrobeQuality() {
        return wardrobeQuality;
    }
    public void setWardrobeQuality(BigDecimal wardrobeQuality) {
        this.wardrobeQuality = wardrobeQuality;
    }

    // domain-logic methods
    public BigDecimal getAverage() {
        return RatingUtils.average(
            wardrobePrice,
            wardrobeStaffEfficiency,
            wardrobeStaffFriendliness,
            wardrobeQuality
        );
    }
}