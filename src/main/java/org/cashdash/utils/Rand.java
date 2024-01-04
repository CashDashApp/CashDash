package org.cashdash.utils;

import java.security.SecureRandom;
import java.util.Calendar;
import java.util.Random;
import org.cashdash.services.TransactionService;

public class Rand {
    
    private static final String PREFIX = "INV";
    private static final Random RAND = new Random();

    
    public static String generateUniqueString() throws Exception {
        StringBuilder result = new StringBuilder();

        // Get current year and month
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR) % 100; // last 2 digits of the year
        int month = calendar.get(Calendar.MONTH) + 1; // months are 0-based, so add 1

        // Format year and month with leading zeros if needed
        String formattedYear = String.format("%02d", year);
        String formattedMonth = String.format("%02d", month);

        // Append components to the result string
        result.append(PREFIX).append("-").append(formattedYear).append(formattedMonth);

        // Query the database for the highest existing unique number
        int highestUniqueNumberFromDB = TransactionService.getHighestId();

        // Use the higher of the existing unique number and the current unique number
        int uniqueNumber = highestUniqueNumberFromDB +1;

        // Append unique increment number
        String formattedUniqueNumber = String.format("%02d", uniqueNumber++);
        result.append(formattedUniqueNumber);

        return result.toString();
    }
}
