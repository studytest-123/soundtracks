package paf.project.soundtracks.model;

import java.math.BigDecimal;
import jakarta.persistence.*;
import paf.project.soundtracks.util.RatingUtils;

@Embeddable
public class RestroomRating {
    
    private BigDecimal restroomCleanliness;
    private BigDecimal restroomAccessibility;
    private BigDecimal restroomSupplies;
    private BigDecimal restroomSize;

    // constructors
    public RestroomRating() {
    }

    public RestroomRating(BigDecimal restroomCleanliness,
                          BigDecimal restroomAccessibility, BigDecimal restroomSupplies, BigDecimal restroomSize) {
        this.restroomCleanliness = restroomCleanliness;
        this.restroomAccessibility = restroomAccessibility;
        this.restroomSupplies = restroomSupplies;
        this.restroomSize = restroomSize;
    }

    // getters and setters
    public BigDecimal getRestroomCleanliness() {
        return restroomCleanliness;
    }
    public void setRestroomCleanliness(BigDecimal restroomCleanliness) {
        this.restroomCleanliness = restroomCleanliness;
    }
    public BigDecimal getRestroomAccessibility() {
        return restroomAccessibility;
    }
    public void setRestroomAccessibility(BigDecimal restroomAccessibility) {
        this.restroomAccessibility = restroomAccessibility;
    }
    public BigDecimal getRestroomSupplies() {
        return restroomSupplies;
    }
    public void setRestroomSupplies(BigDecimal restroomSupplies) {
        this.restroomSupplies = restroomSupplies;
    }
    public BigDecimal getRestroomSize() {
        return restroomSize;
    }
    public void setRestroomSize(BigDecimal restroomSize) {
        this.restroomSize = restroomSize;
    }

    // domain-logic methods
    public BigDecimal getAverage() {
        return RatingUtils.average(
            restroomCleanliness,
            restroomAccessibility,
            restroomSupplies,
            restroomSize
        );
    }
}
