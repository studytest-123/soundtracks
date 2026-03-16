package paf.project.soundtracks.util;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class RatingUtils {

    public static BigDecimal average(BigDecimal... values) {

    BigDecimal sum = BigDecimal.ZERO;
    int count = 0;

    for (BigDecimal v : values) {

        if (v != null) {
            sum = sum.add(v);
            count++;
        }

    }

    if (count == 0) {
        return BigDecimal.ZERO;
    }

    return sum.divide(
            BigDecimal.valueOf(count),
            2,
            RoundingMode.HALF_UP
    );
    }
}