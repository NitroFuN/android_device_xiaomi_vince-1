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

import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v14.preference.PreferenceFragment;
import android.support.v7.preference.Preference;
import android.support.v7.preference.PreferenceCategory;

import com.xiaomi.parts.kcal.KCalSettingsActivity;
import com.xiaomi.parts.preferences.CustomSeekBarPreference;
import com.xiaomi.parts.preferences.SecureSettingListPreference;
import com.xiaomi.parts.preferences.SecureSettingSwitchPreference;
<<<<<<< HEAD
import com.xiaomi.parts.preferences.VibratorStrengthPreference;
=======
import com.xiaomi.parts.preferences.VibrationSeekBarPreference;
>>>>>>> 3860be5... XiaomiParts: Add USB fastcharge switch

public class DeviceSettings extends PreferenceFragment implements
        Preference.OnPreferenceChangeListener {


    final static String PREF_TORCH_BRIGHTNESS = "torch_brightness";
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 3860be5... XiaomiParts: Add USB fastcharge switch
    private final static String TORCH_1_BRIGHTNESS_PATH = "/sys/devices/soc/800f000.qcom," +
            "spmi/spmi-0/spmi0-03/800f000.qcom,spmi:qcom,pm660l@3:qcom,leds@d300/leds/led:torch_0/max_brightness";
    private final static String TORCH_2_BRIGHTNESS_PATH = "/sys/devices/soc/800f000.qcom," +
            "spmi/spmi-0/spmi0-03/800f000.qcom,spmi:qcom,pm660l@3:qcom,leds@d300/leds/led:torch_1/max_brightness";

<<<<<<< HEAD
    final static String PREF_VIBRATION_STRENGTH = "vibration_strength";
    private final static String VIBRATION_STRENGTH_PATH = "/sys/devices/virtual/timed_output/vibrator/vtg_level";

    // value of vtg_min and vtg_max
<<<<<<< HEAD
    final static int MIN_VIBRATION = 116;
    final static int MAX_VIBRATION = 3596;
=======
    public static final int MIN_VIBRATION = 116;
    public static final int MAX_VIBRATION = 3596;

=======
>>>>>>> e3cd0f3... mido: XiaomiParts:: Implement New CustomSeekBar
    public static final String PREF_BACKLIGHT_DIMMER = "backlight_dimmer";
    public static final String BACKLIGHT_DIMMER_PATH = "/sys/module/mdss_fb/parameters/backlight_dimmer";

    public static final String PREF_ENABLE_HAL3 = "hal3";
    public static final String HAL3_SYSTEM_PROPERTY = "persist.camera.HAL3.enabled";
>>>>>>> 99bad28... mido: XiaomiParts: Add Backlight Dimmer toggle

    private static final String PREF_ENABLE_HAL3 = "hal3";
    private static final String HAL3_SYSTEM_PROPERTY = "persist.camera.HAL3.enabled";

    private static final String CATEGORY_DISPLAY = "display";
    private static final String PREF_DEVICE_KCAL = "device_kcal";

    private static final String PREF_SPECTRUM = "spectrum";
    private static final String SPECTRUM_SYSTEM_PROPERTY = "persist.spectrum.profile";

    private static final String PREF_ENABLE_DIRAC = "dirac_enabled";
    private static final String PREF_HEADSET = "dirac_headset_pref";
    private static final String PREF_PRESET = "dirac_preset_pref";
    final static String PREF_HEADPHONE_GAIN = "headphone_gain";
    private static final String HEADPHONE_GAIN_PATH = "/sys/kernel/sound_control/headphone_gain";
    final static String PREF_MICROPHONE_GAIN = "microphone_gain";
    private static final String MICROPHONE_GAIN_PATH = "/sys/kernel/sound_control/mic_gain";

    private SecureSettingSwitchPreference mEnableHAL3;
<<<<<<< HEAD
    private SecureSettingCustomSeekBarPreference mTorchBrightness;
    private VibrationSeekBarPreference mVibrationStrength;
<<<<<<< HEAD
=======
    public static final String TORCH_1_BRIGHTNESS_PATH = "/sys/devices/soc/qpnp-flash-led-25/leds/led:torch_0/max_brightness";
    public static final String TORCH_2_BRIGHTNESS_PATH = "/sys/devices/soc/qpnp-flash-led-25/leds/led:torch_1/max_brightness";

    public static final String PREF_BACKLIGHT_DIMMER = "backlight_dimmer";
    public static final String BACKLIGHT_DIMMER_PATH = "/sys/module/mdss_fb/parameters/backlight_dimmer";

    public static final String KEY_VIBSTRENGTH = "vib_strength";
    public static final String CATEGORY_DISPLAY = "display";
    public static final String PREF_DEVICE_KCAL = "device_kcal";

    public static final String PREF_SPECTRUM = "spectrum";
    public static final String SPECTRUM_SYSTEM_PROPERTY = "persist.spectrum.profile";

    public static final String PREF_ENABLE_DIRAC = "dirac_enabled";
    public static final String PREF_HEADSET = "dirac_headset_pref";
    public static final String PREF_PRESET = "dirac_preset_pref";
    public static final String PREF_HEADPHONE_GAIN = "headphone_gain";
    public static final String HEADPHONE_GAIN_PATH = "/sys/kernel/sound_control/headphone_gain";
    public static final String PREF_MICROPHONE_GAIN = "microphone_gain";
    public static final String MICROPHONE_GAIN_PATH = "/sys/kernel/sound_control/mic_gain";
    public static final String PREF_EARPIECE_GAIN = "earpiece_gain";
    public static final String EARPIECE_GAIN_PATH = "/sys/kernel/sound_control/earpiece_gain";
    public static final String CATEGORY_FASTCHARGE = "usb_fastcharge";
    //public static final String PREF_USB_FASTCHARGE = "fastcharge";
    //public static final String USB_FASTCHARGE_PATH = "/sys/kernel/fast_charge/force_fast_charge";

    private CustomSeekBarPreference mTorchBrightness;
    private VibratorStrengthPreference mVibratorStrength;
>>>>>>> d954cf5... Fix some stuff for XiaomiParts
=======
>>>>>>> 3860be5... XiaomiParts: Add USB fastcharge switch
=======
    private CustomSeekBarPreference mTorchBrightness;
    private VibratorStrengthPreference mVibratorStrength;
>>>>>>> 2695abd... XiaomiParts:: Implement New CustomSeekBar
    private Preference mKcal;
    private SecureSettingListPreference mSPECTRUM;
    private SecureSettingSwitchPreference mEnableDirac;
    private SecureSettingListPreference mHeadsetType;
    private SecureSettingListPreference mPreset;
<<<<<<< HEAD
    private SecureSettingCustomSeekBarPreference mHeadphoneGain;
    private SecureSettingCustomSeekBarPreference mMicrophoneGain;
=======
    private CustomSeekBarPreference mHeadphoneGain;
    private CustomSeekBarPreference mMicrophoneGain;
    private SecureSettingSwitchPreference mFastcharge;
>>>>>>> e3cd0f3... mido: XiaomiParts:: Implement New CustomSeekBar

    private SecureSettingSwitchPreference mBacklightDimmer;

    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        setPreferencesFromResource(R.xml.preferences_xiaomi_parts, rootKey);

        String device = FileUtils.getStringProp("ro.build.product", "unknown");

        mEnableHAL3 = (SecureSettingSwitchPreference) findPreference(PREF_ENABLE_HAL3);
        mEnableHAL3.setChecked(FileUtils.getProp(HAL3_SYSTEM_PROPERTY, false));
        mEnableHAL3.setOnPreferenceChangeListener(this);

        mTorchBrightness = (CustomSeekBarPreference) findPreference(PREF_TORCH_BRIGHTNESS);
        mTorchBrightness.setEnabled(FileUtils.fileWritable(TORCH_1_BRIGHTNESS_PATH) &&
                FileUtils.fileWritable(TORCH_2_BRIGHTNESS_PATH));
        mTorchBrightness.setOnPreferenceChangeListener(this);

        PreferenceCategory displayCategory = (PreferenceCategory) findPreference(CATEGORY_DISPLAY);

        mKcal = findPreference(PREF_DEVICE_KCAL);

        mKcal.setOnPreferenceClickListener(preference -> {
            Intent intent = new Intent(getActivity().getApplicationContext(), KCalSettingsActivity.class);
            startActivity(intent);
            return true;
        });

        mSPECTRUM = (SecureSettingListPreference) findPreference(PREF_SPECTRUM);
        mSPECTRUM.setValue(FileUtils.getStringProp(SPECTRUM_SYSTEM_PROPERTY, "0"));
        mSPECTRUM.setSummary(mSPECTRUM.getEntry());
        mSPECTRUM.setOnPreferenceChangeListener(this);

        if (FileUtils.fileWritable(BACKLIGHT_DIMMER_PATH)) {
            mBacklightDimmer = (SecureSettingSwitchPreference) findPreference(PREF_BACKLIGHT_DIMMER);
            mBacklightDimmer.setChecked(FileUtils.getFileValueAsBoolean(BACKLIGHT_DIMMER_PATH, false));
            mBacklightDimmer.setOnPreferenceChangeListener(this);
        } else {
            getPreferenceScreen().removePreference(findPreference(PREF_BACKLIGHT_DIMMER));
        }

        mVibratorStrength = (VibratorStrengthPreference) findPreference(KEY_VIBSTRENGTH);
        if (mVibratorStrength != null) {
            mVibratorStrength.setEnabled(VibratorStrengthPreference.isSupported());
        }

        boolean enhancerEnabled;
        try {
            enhancerEnabled = DiracService.sDiracUtils.isDiracEnabled();
        } catch (java.lang.NullPointerException e) {
            getContext().startService(new Intent(getContext(), DiracService.class));
            try {
                enhancerEnabled = DiracService.sDiracUtils.isDiracEnabled();
            } catch (NullPointerException ne) {
                // Avoid crash
                ne.printStackTrace();
                enhancerEnabled = false;
            }
        }

        mEnableDirac = (SecureSettingSwitchPreference) findPreference(PREF_ENABLE_DIRAC);
        mEnableDirac.setOnPreferenceChangeListener(this);
        mEnableDirac.setChecked(enhancerEnabled);

        mHeadsetType = (SecureSettingListPreference) findPreference(PREF_HEADSET);
        mHeadsetType.setOnPreferenceChangeListener(this);

        mPreset = (SecureSettingListPreference) findPreference(PREF_PRESET);
        mPreset.setOnPreferenceChangeListener(this);

        mHeadphoneGain = (CustomSeekBarPreference) findPreference(PREF_HEADPHONE_GAIN);
        mHeadphoneGain.setOnPreferenceChangeListener(this);

        mMicrophoneGain = (CustomSeekBarPreference) findPreference(PREF_MICROPHONE_GAIN);
        mMicrophoneGain.setOnPreferenceChangeListener(this);
    }

    @Override
    public boolean onPreferenceChange(Preference preference, Object value) {
        final String key = preference.getKey();
        switch (key) {
            case PREF_ENABLE_HAL3:
                FileUtils.setProp(HAL3_SYSTEM_PROPERTY, (Boolean) value);
                break;

            case PREF_TORCH_BRIGHTNESS:
                FileUtils.setValue(TORCH_1_BRIGHTNESS_PATH, (int) value);
                FileUtils.setValue(TORCH_2_BRIGHTNESS_PATH, (int) value);
                break;

            case PREF_SPECTRUM:
                mSPECTRUM.setValue((String) value);
                mSPECTRUM.setSummary(mSPECTRUM.getEntry());
                FileUtils.setStringProp(SPECTRUM_SYSTEM_PROPERTY, (String) value);
                break;

            case PREF_ENABLE_DIRAC:
                try {
                    DiracService.sDiracUtils.setEnabled((boolean) value);
                } catch (java.lang.NullPointerException e) {
                    getContext().startService(new Intent(getContext(), DiracService.class));
                    DiracService.sDiracUtils.setEnabled((boolean) value);
                }
                break;

            case PREF_HEADSET:
                try {
                    DiracService.sDiracUtils.setHeadsetType(Integer.parseInt(value.toString()));
                } catch (java.lang.NullPointerException e) {
                    getContext().startService(new Intent(getContext(), DiracService.class));
                    DiracService.sDiracUtils.setHeadsetType(Integer.parseInt(value.toString()));
                }
                break;

            case PREF_PRESET:
                try {
                    DiracService.sDiracUtils.setLevel(String.valueOf(value));
                } catch (java.lang.NullPointerException e) {
                    getContext().startService(new Intent(getContext(), DiracService.class));
                    DiracService.sDiracUtils.setLevel(String.valueOf(value));
                }
                break;

            case PREF_HEADPHONE_GAIN:
                FileUtils.setValue(HEADPHONE_GAIN_PATH, value + " " + value);
                break;

            case PREF_MICROPHONE_GAIN:
                FileUtils.setValue(MICROPHONE_GAIN_PATH, (int) value);
                break;

<<<<<<< HEAD
=======
            case PREF_USB_FASTCHARGE:
                FileUtils.setValue(USB_FASTCHARGE_PATH, (boolean) value);
                break;

            case PREF_BACKLIGHT_DIMMER:
                FileUtils.setValue(BACKLIGHT_DIMMER_PATH, (boolean) value);
                break;

>>>>>>> 99bad28... mido: XiaomiParts: Add Backlight Dimmer toggle
            default:
                break;
        }
        return true;
    }

    private boolean isAppNotInstalled(String uri) {
        PackageManager packageManager = getContext().getPackageManager();
        try {
            packageManager.getPackageInfo(uri, PackageManager.GET_ACTIVITIES);
            return false;
        } catch (PackageManager.NameNotFoundException e) {
            return true;
        }
    }
}
