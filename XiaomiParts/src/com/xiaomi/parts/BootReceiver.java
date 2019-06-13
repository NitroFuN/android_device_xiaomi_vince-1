/*
 * Copyright (C) 2018 The Asus-SDM660 Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License
 */

package com.xiaomi.parts;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import androidx.preference.PreferenceManager;
import android.provider.Settings;
import android.text.TextUtils;
import com.xiaomi.parts.preferences.LedBlinkPreference;
import com.xiaomi.parts.preferences.VibratorStrengthPreference;
import com.xiaomi.parts.preferences.VibratorCallStrengthPreference;
import com.xiaomi.parts.preferences.VibratorNotifStrengthPreference;
import com.xiaomi.parts.preferences.YellowFlashPreference;

import com.xiaomi.parts.kcal.Utils;
import com.xiaomi.parts.ambient.SensorsDozeService;

public class BootReceiver extends BroadcastReceiver implements Utils {

    public void onReceive(Context context, Intent intent) {

        SharedPreferences sharedPrefs = PreferenceManager.getDefaultSharedPreferences(context);

        FileUtils.setValue(DeviceSettings.BACKLIGHT_DIMMER_PATH, Settings.Secure.getInt(context.getContentResolver(),
                DeviceSettings.PREF_BACKLIGHT_DIMMER, 0));

        if (Settings.Secure.getInt(context.getContentResolver(), PREF_ENABLED, 0) == 1) {
            FileUtils.setValue(KCAL_ENABLE, Settings.Secure.getInt(context.getContentResolver(),
                    PREF_ENABLED, 0));

            String rgbValue = Settings.Secure.getInt(context.getContentResolver(),
                    PREF_RED, RED_DEFAULT) + " " +
                    Settings.Secure.getInt(context.getContentResolver(), PREF_GREEN,
                            GREEN_DEFAULT) + " " +
                    Settings.Secure.getInt(context.getContentResolver(), PREF_BLUE,
                            BLUE_DEFAULT);

            FileUtils.setValue(KCAL_RGB, rgbValue);
            FileUtils.setValue(KCAL_MIN, Settings.Secure.getInt(context.getContentResolver(),
                    PREF_MINIMUM, MINIMUM_DEFAULT));
            FileUtils.setValue(KCAL_SAT, Settings.Secure.getInt(context.getContentResolver(),
                    PREF_GRAYSCALE, 0) == 1 ? 128 :
                    Settings.Secure.getInt(context.getContentResolver(),
                            PREF_SATURATION, SATURATION_DEFAULT) + SATURATION_OFFSET);
            FileUtils.setValue(KCAL_VAL, Settings.Secure.getInt(context.getContentResolver(),
                    PREF_VALUE, VALUE_DEFAULT) + VALUE_OFFSET);
            FileUtils.setValue(KCAL_CONT, Settings.Secure.getInt(context.getContentResolver(),
                    PREF_CONTRAST, CONTRAST_DEFAULT) + CONTRAST_OFFSET);
            FileUtils.setValue(KCAL_HUE, Settings.Secure.getInt(context.getContentResolver(),
                    PREF_HUE, HUE_DEFAULT));
            LedBlinkPreference.restore(context);
            VibratorStrengthPreference.restore(context);
	    VibratorCallStrengthPreference.restore(context);
	    VibratorNotifStrengthPreference.restore(context);
            YellowFlashPreference.restore(context);
        }

        FileUtils.setValue(DeviceSettings.TORCH_1_BRIGHTNESS_PATH,
                Settings.Secure.getInt(context.getContentResolver(),
<<<<<<< HEAD
                        DeviceSettings.PREF_TORCH_BRIGHTNESS, 100));
        FileUtils.setValue(DeviceSettings.TORCH_2_BRIGHTNESS_PATH,
                Settings.Secure.getInt(context.getContentResolver(),
                        DeviceSettings.PREF_TORCH_BRIGHTNESS, 100));
<<<<<<< HEAD
<<<<<<< HEAD
        FileUtils.setValue(VIBRATION_STRENGTH_PATH, Settings.Secure.getInt(
=======
        FileUtils.setValue(DeviceSettings.VIBRATION_STRENGTH_PATH, Settings.Secure.getInt(
>>>>>>> 263864f... mido: XiaomiParts: Add USB fastcharge switch
                context.getContentResolver(), DeviceSettings.PREF_VIBRATION_STRENGTH, 80) / 100.0 * (DeviceSettings.MAX_VIBRATION - DeviceSettings.MIN_VIBRATION) + DeviceSettings.MIN_VIBRATION);
=======
>>>>>>> e3cd0f3... mido: XiaomiParts:: Implement New CustomSeekBar
=======
                        DeviceSettings.KEY_WHITE_TORCH_BRIGHTNESS, 100));
        FileUtils.setValue(DeviceSettings.TORCH_2_BRIGHTNESS_PATH,
                Settings.Secure.getInt(context.getContentResolver(),
                        DeviceSettings.KEY_YELLOW_TORCH_BRIGHTNESS, 100));
<<<<<<< HEAD
>>>>>>> 3acb0fc... mido: XiaomiParts: Separate Yellow and White Torch Brightness
=======
        FileUtils.setValue(DeviceSettings.MSM_THERMAL_PATH, Settings.Secure.getInt(context.getContentResolver(),
                DeviceSettings.PERF_MSM_THERMAL, 0));
        FileUtils.setValue(DeviceSettings.CORE_CONTROL_PATH, Settings.Secure.getInt(context.getContentResolver(),
                DeviceSettings.PERF_CORE_CONTROL, 0));
        FileUtils.setValue(DeviceSettings.VDD_RESTRICTION_PATH, Settings.Secure.getInt(context.getContentResolver(),
                DeviceSettings.PERF_VDD_RESTRICTION, 0));
>>>>>>> fe69e78... mido: XiaomiParts: Add MSM Thermal Control
        int gain = Settings.Secure.getInt(context.getContentResolver(),
                DeviceSettings.PREF_HEADPHONE_GAIN, 4);
        FileUtils.setValue(DeviceSettings.HEADPHONE_GAIN_PATH, gain + " " + gain);
        FileUtils.setValue(DeviceSettings.MICROPHONE_GAIN_PATH, Settings.Secure.getInt(context.getContentResolver(),
                DeviceSettings.PREF_MICROPHONE_GAIN, 0));
<<<<<<< HEAD
<<<<<<< HEAD
=======
        FileUtils.setValue(DeviceSettings.EARPIECE_GAIN_PATH, Settings.Secure.getInt(context.getContentResolver(),
                DeviceSettings.PREF_EARPIECE_GAIN, 0));
<<<<<<< HEAD
<<<<<<< HEAD
        FileUtils.setValue(DeviceSettings.USB_FASTCHARGE_PATH, Settings.Secure.getInt(context.getContentResolver(),
                DeviceSettings.PREF_USB_FASTCHARGE, 0));
>>>>>>> 0c9feb4... mido: XiaomiParts: Add Earpiece Gain
=======
=======
        FileUtils.setValue(DeviceSettings.SPEAKER_GAIN_PATH, Settings.Secure.getInt(context.getContentResolver(),
                DeviceSettings.PREF_SPEAKER_GAIN, 0));
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 82e3f4e... mido: XiaomiParts: Add Speaker Gain
       // FileUtils.setValue(DeviceSettings.USB_FASTCHARGE_PATH, Settings.Secure.getInt(context.getContentResolver(),
       //         DeviceSettings.PREF_USB_FASTCHARGE, 0));
>>>>>>> ab3b7cc... mido: XiaomiParts: Disable USB Fastcharge toggle
=======
=======
        FileUtils.setValue(DeviceSettings.HIGH_AUDIO_PATH, Settings.Secure.getInt(context.getContentResolver(),
                DeviceSettings.HIGH_PERF_AUDIO, 0));
>>>>>>> 20d6ff7... mido: XiaomiParts: Add Audio High Performance mode toggle
        FileUtils.setValue(DeviceSettings.USB_FASTCHARGE_PATH, Settings.Secure.getInt(context.getContentResolver(),
                DeviceSettings.PREF_USB_FASTCHARGE, 0));
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 1448afb... Revert "mido: XiaomiParts: Disable USB Fastcharge toggle"
=======
=======
        FileUtils.setValue(DeviceSettings.MSM_TOUCHBOOST_PATH, Settings.Secure.getInt(context.getContentResolver(),
                DeviceSettings.PREF_MSM_TOUCHBOOST, 0));
>>>>>>> ba23a0f... mido: XiaomiParts: Add TouchBoost toggles
        // Dirac
>>>>>>> a2e2ce2... mido: XiaomiParts: Add Ambient Display Gestures
=======
        FileUtils.setValue(DeviceSettings.USB_FASTCHARGE_PATH, Settings.Secure.getInt(context.getContentResolver(),
                DeviceSettings.PREF_USB_FASTCHARGE, 0));
>>>>>>> 263864f... mido: XiaomiParts: Add USB fastcharge switch
        context.startService(new Intent(context, DiracService.class));

       // Ambient
        context.startService(new Intent(context, SensorsDozeService.class));

        boolean enabled = sharedPrefs.getBoolean(DeviceSettings.PREF_KEY_FPS_INFO, false);
        if (enabled) {
            context.startService(new Intent(context, FPSInfoService.class));
        }
    }
}
