package paf.project.soundtracks.model;

import java.math.BigDecimal;
import jakarta.persistence.*;
import paf.project.soundtracks.util.RatingUtils;

@Embeddable
public class MerchandiseRating {

    private BigDecimal merchandiseOverallQuality;
    private BigDecimal merchandiseVariety;
    private BigDecimal merchandisePrices;
    private BigDecimal merchandiseStaffEfficiency;
    private BigDecimal merchandisePaymentMethods;
    private BigDecimal merchandiseAvailability;

    // constructors
    public MerchandiseRating() {
    }

    public MerchandiseRating(BigDecimal merchandiseOverallQuality,
                       BigDecimal merchandiseVariety, BigDecimal merchandisePrices, BigDecimal merchandiseStaffEfficiency, BigDecimal merchandisePaymentMethods, BigDecimal merchandiseAvailability) {
        this.merchandiseOverallQuality = merchandiseOverallQuality;
        this.merchandiseVariety = merchandiseVariety;
        this.merchandisePrices = merchandisePrices;
        this.merchandiseStaffEfficiency = merchandiseStaffEfficiency;
        this.merchandisePaymentMethods = merchandisePaymentMethods;
        this.merchandiseAvailability = merchandiseAvailability;
    }

    // getters and setters
    public BigDecimal getMerchandiseOverallQuality() {
        return merchandiseOverallQuality;
    }
    public void setMerchandiseOverallQuality(BigDecimal merchandiseOverallQuality) {
        this.merchandiseOverallQuality = merchandiseOverallQuality;
    }
    public BigDecimal getMerchandiseVariety() {
        return merchandiseVariety;
    }
    public void setMerchandiseVariety(BigDecimal merchandiseVariety) {
        this.merchandiseVariety = merchandiseVariety;
    }
    public BigDecimal getMerchandisePrices() {
        return merchandisePrices;
    }
    public void setMerchandisePrices(BigDecimal merchandisePrices) {
        this.merchandisePrices = merchandisePrices;
    }
    public BigDecimal getMerchandiseStaffEfficiency() {
        return merchandiseStaffEfficiency;
    }
    public void setMerchandiseStaffEfficiency(BigDecimal merchandiseStaffEfficiency) {
        this.merchandiseStaffEfficiency = merchandiseStaffEfficiency;
    }
    public BigDecimal getMerchandisePaymentMethods() {
        return merchandisePaymentMethods;
    }
    public void setMerchandisePaymentMethods(BigDecimal merchandisePaymentMethods) {
        this.merchandisePaymentMethods = merchandisePaymentMethods;
    }
    public BigDecimal getMerchandiseAvailability() {
        return merchandiseAvailability;
    }
    public void setMerchandiseAvailability(BigDecimal merchandiseAvailability) {
        this.merchandiseAvailability = merchandiseAvailability;
    }

    // domain-logic methods
    public BigDecimal getAverage() {
        return RatingUtils.average(
            merchandiseOverallQuality,
            merchandiseVariety,
            merchandisePrices,
            merchandiseStaffEfficiency,
            merchandisePaymentMethods,
            merchandiseAvailability
        );
    }
}
