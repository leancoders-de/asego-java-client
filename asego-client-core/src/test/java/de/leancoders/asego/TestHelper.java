package de.leancoders.asego;

import com.google.common.base.Charsets;
import lombok.NonNull;
import org.apache.commons.text.CharacterPredicates;
import org.apache.commons.text.RandomStringGenerator;

import javax.annotation.Nonnull;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;
import java.util.stream.Collectors;

public class TestHelper {

    @Nonnull
    public static String readFile(@NonNull final Class clazz,
                                  @NonNull final String path) throws IOException {

        final InputStream resourceAsStream = clazz.getResourceAsStream(path);

        return read(resourceAsStream);
    }

    @Nonnull
    public static String read(@NonNull final InputStream input) throws IOException {
        try (final BufferedReader buffer = new BufferedReader(new InputStreamReader(input, Charsets.UTF_8))) {
            return buffer.lines().collect(Collectors.joining("\n"));
        }
    }

    private static final Random R = new Random();
    private static final RandomStringGenerator RSG = new RandomStringGenerator.Builder().filteredBy(CharacterPredicates.ASCII_ALPHA_NUMERALS).build();

    public static boolean randomBoolean() {
        return R.nextBoolean();
    }

    @Nonnull
    public static String randomText(final int length) {
        return randomText(length, length);
    }

    @Nonnull
    public static String randomText(final int min, final int maxLength) {
        final int len = randomInt(min, maxLength);
        return RSG.generate(len);
    }

    @Nonnull
    public static BigDecimal randomBigDecimal(final int max) {
        return randomBigDecimal(0, max, 2);
    }

    @Nonnull
    public static BigDecimal randomBigDecimal(final int min, final int max, final int digits) {
        float random = min + (float) (Math.random() * (max - min));
        return BigDecimal.valueOf(random).setScale(digits, RoundingMode.HALF_UP);
    }

    public static int randomInt(final int max) {
        return randomInt(0, max);
    }

    public static int randomInt(final int min, final int max) {
        return min + (int) (Math.random() * (max - min));
    }

    public static long randomLong(final long max) {
        return randomLong(0, max);
    }

    public static long randomLong(final long min, final long max) {
        return min + (long) (Math.random() * (max - min));
    }


}
