package com.myprograms.algorithms.utility;

public final class DistanceUtility {

    private static double RADIUS_OF_EARTH_AT_EQUATOR_IN_MILES = 3963;
    private static double RADIUS_OF_EARTH_AT_EQUATOR_IN_KM = 6378;
    private static double ONE_MILE_IN_KILOMETER = 1.60934;

    public static double convertDegreeToRadian(final String latitudeLongitude) {
        String[] values = latitudeLongitude.split(Constants.DOT_DELIMITER);
        int valuesSize = values.length;

        final String compassDirection = values[valuesSize - 1].
                substring(values[valuesSize - 1].length() - 1, values[valuesSize - 1].length());

        values[valuesSize - 1] = values[valuesSize - 1].substring(0, values[valuesSize - 1].length() - 1);

        double degree = (Double.parseDouble(values[0])
                + (Double.parseDouble(values[1])) / 60
                + (Double.parseDouble(values[2])) / 3600);

        if (Constants.S.equalsIgnoreCase(compassDirection) || Constants.W.equalsIgnoreCase(compassDirection))
            degree *= -1;

        return degree * Math.PI / 180;
    }

    public static double findDistanceBetweenTwoCoordinatesInMiles(final String originLatitude, final String originLongitude,
                                                                  final String destinationLatitude, final String destinationLongitude) {

        final double originLatitudeInRadian = convertDegreeToRadian(originLatitude);
        final double originLongitudeInRadian = convertDegreeToRadian(originLongitude);
        final double destinationLatitudeInRadian = convertDegreeToRadian(destinationLatitude);
        final double destinationLongitudeInRadian = convertDegreeToRadian(destinationLongitude);

        final double distanceInMiles =
                (RADIUS_OF_EARTH_AT_EQUATOR_IN_MILES * Math.acos(Math.sin(originLatitudeInRadian) *
                        Math.sin(destinationLatitudeInRadian) +
                        Math.cos(originLatitudeInRadian) * Math.cos(destinationLatitudeInRadian)
                                * Math.cos(destinationLongitudeInRadian - originLongitudeInRadian)));
        return distanceInMiles;
    }

    public static double convertMilesToKilometers(double miles) {
        return miles * ONE_MILE_IN_KILOMETER;
    }

    public static double findDistanceBetweenTwoCoordinatesInKm(final String originLatitude, final String originLongitude,
                                                                  final String destinationLatitude, final String destinationLongitude) {

        final double originLatitudeInRadian = convertDegreeToRadian(originLatitude);
        final double originLongitudeInRadian = convertDegreeToRadian(originLongitude);
        final double destinationLatitudeInRadian = convertDegreeToRadian(destinationLatitude);
        final double destinationLongitudeInRadian = convertDegreeToRadian(destinationLongitude);

        final double differenceInLatitudes = destinationLatitudeInRadian - originLatitudeInRadian;
        final double differenceInLongitudes = destinationLongitudeInRadian - originLongitudeInRadian;

        double a = Math.sin(differenceInLatitudes/2) * Math.sin(differenceInLatitudes/2) +
                        Math.cos(originLatitudeInRadian) * Math.cos(destinationLatitudeInRadian) *
                                Math.sin(differenceInLongitudes/2) * Math.sin(differenceInLongitudes/2);

        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
        double distanceInKm = RADIUS_OF_EARTH_AT_EQUATOR_IN_KM * c;
        return distanceInKm;
    }
}
