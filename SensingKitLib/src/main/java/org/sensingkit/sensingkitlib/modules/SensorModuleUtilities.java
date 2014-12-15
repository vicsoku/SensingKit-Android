/*
 * Copyright (c) 2014. Queen Mary University of London
 * Kleomenis Katevas, k.katevas@qmul.ac.uk
 *
 * This file is part of SensingKit-Android library.
 * For more information, please visit http://www.sensingkit.org
 *
 * SensingKit-Android is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * SensingKit-Android is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with SensingKit-Android.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.sensingkit.sensingkitlib.modules;

import org.sensingkit.sensingkitlib.SKException;
import org.sensingkit.sensingkitlib.SKExceptionErrorCode;

public final class SensorModuleUtilities {

    private static final String TAG = "SensorModuleUtilities";

    /*public static String getSensorFilename(SensorModuleType SensorModuleType) throws SKException {

        switch (SensorModuleType) {

            case ACCELEROMETER:
                return "Accelerometer.csv";

            case STEP_DETECTOR:
                return "Step_Detector.csv";

            case STEP_COUNTER:
                return "Step_Counter.csv";

            case LIGHT:
                return "Light.csv";

            case LOCATION:
                return "Location.csv";

            case ACTIVITY:
                return "Activity.csv";

            case BATTERY:
                return "Battery.csv";

            default:
                throw new SKException(TAG, "Not a native SensorModule", SKExceptionErrorCode.UNKNOWN_ERROR);
        }
    }*/

}