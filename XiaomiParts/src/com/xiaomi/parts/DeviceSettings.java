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
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import androidx.preference.PreferenceFragment;
import androidx.preference.PreferenceManager;
import androidx.preference.SwitchPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceCategory;

import com.xiaomi.parts.kcal.KCalSettingsActivity;
import com.xiaomi.parts.ambient.AmbientGesturePreferenceActivity;
import com.xiaomi.parts.preferences.CustomSeekBarPreference;
import com.xiaomi.parts.preferences.SecureSettingListPreference;
import com.xiaomi.parts.preferences.SecureSettingSwitchPreference;
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
import com.xiaomi.parts.preferences.LedBlinkPreference;
>>>>>>> 39816f5... XiaomiParts: add Charging LED Blinking Intensity
import com.xiaomi.parts.preferences.VibratorStrengthPreference;
=======
import com.xiaomi.parts.preferences.VibrationSeekBarPreference;
>>>>>>> 3860be5... XiaomiParts: Add USB fastcharge switch
=======
import com.xiaomi.parts.preferences.VibratorStrengthPreference;
<<<<<<< HEAD
>>>>>>> c6225e6...  Fix some stuff for XiaomiParts
=======
import com.xiaomi.parts.preferences.VibratorCallStrengthPreference;
import com.xiaomi.parts.preferences.VibratorNotifStrengthPreference;
<<<<<<< HEAD
>>>>>>> b181f5b... XiaomiParts: Add new Vibration Control
=======
import com.xiaomi.parts.preferences.YellowFlashPreference;
>>>>>>> 614130e... XiaomiParts: Camera Flash Yellow Light Intensity Controller

public class DeviceSettings extends PreferenceFragment implements
        Preference.OnPreferenceChangeListener {

<<<<<<< HEAD
<<<<<<< HEAD

    final static String PREF_TORCH_BRIGHTNESS = "torch_brightness";
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 3860be5... XiaomiParts: Add USB fastcharge switch
=======
>>>>>>> c6225e6...  Fix some stuff for XiaomiParts
=======
>>>>>>> 02a21e0... XiaomiParts: Fix Torch
    private final static String TORCH_1_BRIGHTNESS_PATH = "/sys/devices/soc/800f000.qcom," +
=======
    final static String PREF_TORCH_BRIGHTNESS = "torch_brightness";
    public static final String TORCH_1_BRIGHTNESS_PATH = "/sys/devices/soc/800f000.qcom," +
>>>>>>> 263864f... mido: XiaomiParts: Add USB fastcharge switch
            "spmi/spmi-0/spmi0-03/800f000.qcom,spmi:qcom,pm660l@3:qcom,leds@d300/leds/led:torch_0/max_brightness";
    public static final String TORCH_2_BRIGHTNESS_PATH = "/sys/devices/soc/800f000.qcom," +
            "spmi/spmi-0/spmi0-03/800f000.qcom,spmi:qcom,pm660l@3:qcom,leds@d300/leds/led:torch_1/max_brightness";
=======
    public static final String TORCH_1_BRIGHTNESS_PATH = "/sys/devices/soc/qpnp-flash-led-25/leds/led:torch_0/max_brightness";
    public static final String TORCH_2_BRIGHTNESS_PATH = "/sys/devices/soc/qpnp-flash-led-25/leds/led:torch_1/max_brightness";
>>>>>>> d954cf5... Fix some stuff for XiaomiParts

<<<<<<< HEAD
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
=======
=======
    public static final String KEY_YELLOW_TORCH_BRIGHTNESS = "yellow_torch_brightness";
    public static final String KEY_WHITE_TORCH_BRIGHTNESS = "white_torch_brightness";
>>>>>>> 3acb0fc... mido: XiaomiParts: Separate Yellow and White Torch Brightness
    public static final String TORCH_1_BRIGHTNESS_PATH = "/sys/class/leds/led:torch_0/max_brightness";
    public static final String TORCH_2_BRIGHTNESS_PATH = "/sys/class/leds/led:torch_1/max_brightness";

<<<<<<< HEAD
>>>>>>> e4c0ed6... XiaomiParts: Fix Torch
=======
    public static final String PREF_CHARGING_LED = "charging_led";
    public static final String CHARGING_LED_PATH = "/sys/class/leds/charging/max_brightness";

>>>>>>> 4c1e9aa... mido: XiaomiParts: add Charging LED Blinking Intensity
    public static final String PREF_BACKLIGHT_DIMMER = "backlight_dimmer";
    public static final String BACKLIGHT_DIMMER_PATH = "/sys/module/mdss_fb/parameters/backlight_dimmer";

<<<<<<< HEAD
<<<<<<< HEAD
    public static final String PREF_ENABLE_HAL3 = "hal3";
    public static final String HAL3_SYSTEM_PROPERTY = "persist.camera.HAL3.enabled";
>>>>>>> 99bad28... mido: XiaomiParts: Add Backlight Dimmer toggle
=======
    public static final String KEY_VIBSTRENGTH = "vib_strength";
=======
    public static final String KEY_VIBSTRENGTH = "vib_strength";    
    public static final String KEY_CALL_VIBSTRENGTH = "vib_call_strength";
    public static final String KEY_NOTIF_VIBSTRENGTH = "vib_notif_strength";
    
>>>>>>> 9b83574... XiaomiParts: Add new Vibration Control
    public static final String CATEGORY_DISPLAY = "display";
    public static final String PREF_DEVICE_KCAL = "device_kcal";
>>>>>>> d954cf5... Fix some stuff for XiaomiParts
=======
    public static final String PREF_VIBRATION_STRENGTH = "vibration_strength";
    public static final String VIBRATION_STRENGTH_PATH = "/sys/devices/virtual/timed_output/vibrator/vtg_level";

    // value of vtg_min and vtg_max
    public static final int MIN_VIBRATION = 116;
    public static final int MAX_VIBRATION = 3596;

    public static final String PREF_ENABLE_HAL3 = "hal3";
    public static final String HAL3_SYSTEM_PROPERTY = "persist.camera.HAL3.enabled";
>>>>>>> 263864f... mido: XiaomiParts: Add USB fastcharge switch

    public static final String CATEGORY_DISPLAY = "display";
    public static final String PREF_DEVICE_KCAL = "device_kcal";

<<<<<<< HEAD
<<<<<<< HEAD
    private static final String CATEGORY_DISPLAY = "display";
    private static final String PREF_DEVICE_KCAL = "device_kcal";

    private static final String PREF_SPECTRUM = "spectrum";
    private static final String SPECTRUM_SYSTEM_PROPERTY = "persist.spectrum.profile";
=======
=======
    public static final String PREF_SPECTRUM = "spectrum";
    public static final String SPECTRUM_SYSTEM_PROPERTY = "persist.spectrum.profile";

>>>>>>> 263864f... mido: XiaomiParts: Add USB fastcharge switch
    public static final String PREF_ENABLE_DIRAC = "dirac_enabled";
    public static final String PREF_HEADSET = "dirac_headset_pref";
    public static final String PREF_PRESET = "dirac_preset_pref";
    public static final String PREF_HEADPHONE_GAIN = "headphone_gain";
    public static final String HEADPHONE_GAIN_PATH = "/sys/kernel/sound_control/headphone_gain";
    public static final String PREF_MICROPHONE_GAIN = "microphone_gain";
    public static final String MICROPHONE_GAIN_PATH = "/sys/kernel/sound_control/mic_gain";
<<<<<<< HEAD
    public static final String PREF_EARPIECE_GAIN = "earpiece_gain";
    public static final String EARPIECE_GAIN_PATH = "/sys/kernel/sound_control/earpiece_gain";
    public static final String PREF_SPEAKER_GAIN = "speaker_gain";
    public static final String SPEAKER_GAIN_PATH = "/sys/kernel/sound_control/speaker_gain";
    public static final String CATEGORY_FASTCHARGE = "usb_fastcharge";
<<<<<<< HEAD
<<<<<<< HEAD
    public static final String PREF_USB_FASTCHARGE = "fastcharge";
    public static final String USB_FASTCHARGE_PATH = "/sys/kernel/fast_charge/force_fast_charge";
<<<<<<< HEAD
>>>>>>> 0c9feb4... mido: XiaomiParts: Add Earpiece Gain

    private static final String PREF_ENABLE_DIRAC = "dirac_enabled";
    private static final String PREF_HEADSET = "dirac_headset_pref";
    private static final String PREF_PRESET = "dirac_preset_pref";
    final static String PREF_HEADPHONE_GAIN = "headphone_gain";
    private static final String HEADPHONE_GAIN_PATH = "/sys/kernel/sound_control/headphone_gain";
    final static String PREF_MICROPHONE_GAIN = "microphone_gain";
    private static final String MICROPHONE_GAIN_PATH = "/sys/kernel/sound_control/mic_gain";
=======
    //public static final String PREF_USB_FASTCHARGE = "fastcharge";
    //public static final String USB_FASTCHARGE_PATH = "/sys/kernel/fast_charge/force_fast_charge";
>>>>>>> ab3b7cc... mido: XiaomiParts: Disable USB Fastcharge toggle
=======
    public static final String PREF_USB_FASTCHARGE = "fastcharge";
    public static final String USB_FASTCHARGE_PATH = "/sys/kernel/fast_charge/force_fast_charge";
<<<<<<< HEAD
>>>>>>> 1448afb... Revert "mido: XiaomiParts: Disable USB Fastcharge toggle"
=======
    public static final String PREF_KEY_FPS_INFO = "fps_info";
>>>>>>> 494253b... mido: XiaomiParts: Add FPS info
=======
    public static final String PREF_KEY_FPS_INFO = "fps_info";
>>>>>>> 494253b... mido: XiaomiParts: Add FPS info

<<<<<<< HEAD
<<<<<<< HEAD
=======

    public static final String CATEGORY_FASTCHARGE = "usb_fastcharge";
    public static final String PREF_USB_FASTCHARGE = "fastcharge";
    public static final String USB_FASTCHARGE_PATH = "/sys/kernel/fast_charge/force_fast_charge";

>>>>>>> 263864f... mido: XiaomiParts: Add USB fastcharge switch
    private SecureSettingSwitchPreference mEnableHAL3;
<<<<<<< HEAD
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

=======
=======
    public static final String CATEGORY_TOUCHBOOST = "msm_touchboost";
=======
>>>>>>> df09bdf... mido: XiaomiParts: Fix Parallax Hub Crash for other Kernel
    public static final String PREF_MSM_TOUCHBOOST = "touchboost";
    public static final String MSM_TOUCHBOOST_PATH = "/sys/module/msm_performance/parameters/touchboost";
    public static final String KEY_FLASH = "yellow_flash";

<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> ba23a0f... mido: XiaomiParts: Add TouchBoost toggles
<<<<<<< HEAD
>>>>>>> 30973e7... XiaomiParts: Add TouchBoost toggles
    private CustomSeekBarPreference mTorchBrightness;
    private VibratorStrengthPreference mVibratorStrength;
>>>>>>> d954cf5... Fix some stuff for XiaomiParts
=======
>>>>>>> 3860be5... XiaomiParts: Add USB fastcharge switch
=======
=======
=======
=======
    public static final String HIGH_PERF_AUDIO = "highperfaudio";
    public static final String HIGH_AUDIO_PATH = "/sys/module/snd_soc_wcd9330/parameters/high_perf_mode";

<<<<<<< HEAD
>>>>>>> 20d6ff7... mido: XiaomiParts: Add Audio High Performance mode toggle
=======
    public static final String PERF_MSM_THERMAL = "msmthermal";
    public static final String MSM_THERMAL_PATH = "/sys/module/msm_thermal/parameters/enabled";
    public static final String PERF_CORE_CONTROL = "corecontrol";
    public static final String CORE_CONTROL_PATH = "/sys/module/msm_thermal/core_control/enabled";
    public static final String PERF_VDD_RESTRICTION = "vddrestrict";
    public static final String VDD_RESTRICTION_PATH = "/sys/module/msm_thermal/vdd_restriction/enabled";
    public static final String PREF_CPUCORE = "cpucore";
    public static final String CPUCORE_SYSTEM_PROPERTY = "persist.cpucore.profile";
    public static final String PREF_LKM = "lkmprofile";
    public static final String LKM_SYSTEM_PROPERTY = "persist.lkm.profile";
    public static final String PREF_TCP = "tcpcongestion";
    public static final String TCP_SYSTEM_PROPERTY = "persist.tcp.profile";
<<<<<<< HEAD

<<<<<<< HEAD
>>>>>>> fe69e78... mido: XiaomiParts: Add MSM Thermal Control
=======
=======
>>>>>>> e1339fb... mido: XiaomiParts: Add TCP Congestion Algorithm

>>>>>>> 8dbeb06... Add TCP Congestion Algorithm
    public static final String PREF_GPUBOOST = "gpuboost";
    public static final String GPUBOOST_SYSTEM_PROPERTY = "persist.gpuboost.profile";
    public static final String PREF_CPUBOOST = "cpuboost";
    public static final String CPUBOOST_SYSTEM_PROPERTY = "persist.cpuboost.profile";

<<<<<<< HEAD
>>>>>>> c6f87a8... mido: XiaomiParts: Add GPU Boost Controler
>>>>>>> 0fe3911... XiaomiParts: Add GPU Boost Controller
    private CustomSeekBarPreference mTorchBrightness;
=======
    private CustomSeekBarPreference mWhiteTorchBrightness;
    private CustomSeekBarPreference mYellowTorchBrightness;
>>>>>>> 3acb0fc... mido: XiaomiParts: Separate Yellow and White Torch Brightness
    private LedBlinkPreference mLedBlink;
    private YellowFlashPreference mYellowFlash;
    private SecureSettingSwitchPreference mHighAudio;
    private SecureSettingSwitchPreference mMsmThermal;
    private SecureSettingSwitchPreference mCoreControl;
    private SecureSettingSwitchPreference mVddRestrict;
    private SecureSettingListPreference mCPUCORE;
    private SecureSettingListPreference mLKM;
    private SecureSettingListPreference mTCP;
    private VibratorStrengthPreference mVibratorStrength;
<<<<<<< HEAD
>>>>>>> 2695abd... XiaomiParts:: Implement New CustomSeekBar
=======
    private VibratorCallStrengthPreference mVibratorCallStrength;
    private VibratorNotifStrengthPreference mVibratorNotifStrength;
>>>>>>> b181f5b... XiaomiParts: Add new Vibration Control
    private Preference mKcal;
    private SecureSettingListPreference mSPECTRUM;
    private Preference mAmbientPref;
    private SecureSettingSwitchPreference mEnableDirac;
    private SecureSettingListPreference mHeadsetType;
    private SecureSettingListPreference mPreset;
<<<<<<< HEAD
    private SecureSettingCustomSeekBarPreference mHeadphoneGain;
    private SecureSettingCustomSeekBarPreference mMicrophoneGain;
<<<<<<< HEAD
=======
    private CustomSeekBarPreference mHeadphoneGain;
    private CustomSeekBarPreference mMicrophoneGain;
    private CustomSeekBarPreference mEarpieceGain;
<<<<<<< HEAD
<<<<<<< HEAD
    private SecureSettingSwitchPreference mFastcharge;
<<<<<<< HEAD
>>>>>>> e3cd0f3... mido: XiaomiParts:: Implement New CustomSeekBar

=======
>>>>>>> 0c9feb4... mido: XiaomiParts: Add Earpiece Gain
=======
=======
    private CustomSeekBarPreference mSpeakerGain;
<<<<<<< HEAD
>>>>>>> 82e3f4e... mido: XiaomiParts: Add Speaker Gain
    //private SecureSettingSwitchPreference mFastcharge;
>>>>>>> ab3b7cc... mido: XiaomiParts: Disable USB Fastcharge toggle
=======
    private SecureSettingSwitchPreference mFastcharge;
>>>>>>> 1448afb... Revert "mido: XiaomiParts: Disable USB Fastcharge toggle"
    private SecureSettingSwitchPreference mBacklightDimmer;
    private SecureSettingSwitchPreference mTouchboost;
    private SecureSettingListPreference mGPUBOOST;
    private SecureSettingListPreference mCPUBOOST;
    private static Context mContext;
=======
    private SecureSettingSwitchPreference mFastcharge;
>>>>>>> 263864f... mido: XiaomiParts: Add USB fastcharge switch

    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        setPreferencesFromResource(R.xml.preferences_xiaomi_parts, rootKey);
        mContext = this.getContext();
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(mContext);

        String device = FileUtils.getStringProp("ro.build.product", "unknown");

<<<<<<< HEAD
        mEnableHAL3 = (SecureSettingSwitchPreference) findPreference(PREF_ENABLE_HAL3);
        mEnableHAL3.setChecked(FileUtils.getProp(HAL3_SYSTEM_PROPERTY, false));
        mEnableHAL3.setOnPreferenceChangeListener(this);

        mTorchBrightness = (CustomSeekBarPreference) findPreference(PREF_TORCH_BRIGHTNESS);
        mTorchBrightness.setEnabled(FileUtils.fileWritable(TORCH_1_BRIGHTNESS_PATH) &&
                FileUtils.fileWritable(TORCH_2_BRIGHTNESS_PATH));
        mTorchBrightness.setOnPreferenceChangeListener(this);
=======
        mWhiteTorchBrightness = (CustomSeekBarPreference) findPreference(KEY_WHITE_TORCH_BRIGHTNESS);
        mWhiteTorchBrightness.setEnabled(FileUtils.fileWritable(TORCH_1_BRIGHTNESS_PATH));
        mWhiteTorchBrightness.setOnPreferenceChangeListener(this);

        mYellowTorchBrightness = (CustomSeekBarPreference) findPreference(KEY_YELLOW_TORCH_BRIGHTNESS);
        mYellowTorchBrightness.setEnabled(FileUtils.fileWritable(TORCH_2_BRIGHTNESS_PATH));
        mYellowTorchBrightness.setOnPreferenceChangeListener(this);
>>>>>>> 3acb0fc... mido: XiaomiParts: Separate Yellow and White Torch Brightness

        PreferenceCategory displayCategory = (PreferenceCategory) findPreference(CATEGORY_DISPLAY);

        mKcal = findPreference(PREF_DEVICE_KCAL);

        mKcal.setOnPreferenceClickListener(preference -> {
            Intent intent = new Intent(getActivity().getApplicationContext(), KCalSettingsActivity.class);
            startActivity(intent);
            return true;
        });

        mAmbientPref = findPreference("ambient_display_gestures");
        mAmbientPref.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() {
            @Override
            public boolean onPreferenceClick(Preference preference) {
                Intent intent = new Intent(getContext(), AmbientGesturePreferenceActivity.class);
                startActivity(intent);
                return true;
            }
        });

        mSPECTRUM = (SecureSettingListPreference) findPreference(PREF_SPECTRUM);
        mSPECTRUM.setValue(FileUtils.getStringProp(SPECTRUM_SYSTEM_PROPERTY, "0"));
        mSPECTRUM.setSummary(mSPECTRUM.getEntry());
        mSPECTRUM.setOnPreferenceChangeListener(this);

        if (FileUtils.fileWritable(BACKLIGHT_DIMMER_PATH)) {
            mBacklightDimmer = (SecureSettingSwitchPreference) findPreference(PREF_BACKLIGHT_DIMMER);
            mBacklightDimmer.setEnabled(BacklightDimmer.isSupported());
            mBacklightDimmer.setChecked(BacklightDimmer.isCurrentlyEnabled(this.getContext()));
            mBacklightDimmer.setOnPreferenceChangeListener(new BacklightDimmer(getContext()));
        } else {
            getPreferenceScreen().removePreference(findPreference(PREF_BACKLIGHT_DIMMER));
        }

	mVibratorStrength = (VibratorStrengthPreference) findPreference(KEY_VIBSTRENGTH);
        if (mVibratorStrength != null)
            mVibratorStrength.setEnabled(VibratorStrengthPreference.isSupported());
        mVibratorCallStrength = (VibratorCallStrengthPreference) findPreference(KEY_CALL_VIBSTRENGTH);
        if (mVibratorCallStrength != null)
            mVibratorCallStrength.setEnabled(VibratorCallStrengthPreference.isSupported());
        mVibratorNotifStrength = (VibratorNotifStrengthPreference) findPreference(KEY_NOTIF_VIBSTRENGTH);
        if (mVibratorNotifStrength != null)
            mVibratorNotifStrength.setEnabled(VibratorNotifStrengthPreference.isSupported());

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

        if (FileUtils.fileWritable(HIGH_AUDIO_PATH)) {
            mHighAudio = (SecureSettingSwitchPreference) findPreference(HIGH_PERF_AUDIO);
            mHighAudio.setChecked(FileUtils.getFileValueAsBoolean(HIGH_AUDIO_PATH, true));
            mHighAudio.setOnPreferenceChangeListener(this);
        } else {
            getPreferenceScreen().removePreference(findPreference(HIGH_PERF_AUDIO));
        }

        mHeadphoneGain = (CustomSeekBarPreference) findPreference(PREF_HEADPHONE_GAIN);
        mHeadphoneGain.setOnPreferenceChangeListener(this);

        mMicrophoneGain = (CustomSeekBarPreference) findPreference(PREF_MICROPHONE_GAIN);
        mMicrophoneGain.setOnPreferenceChangeListener(this);
<<<<<<< HEAD
<<<<<<< HEAD
=======

        mEarpieceGain = (CustomSeekBarPreference) findPreference(PREF_EARPIECE_GAIN);
        mEarpieceGain.setOnPreferenceChangeListener(this);

        mSpeakerGain = (CustomSeekBarPreference) findPreference(PREF_SPEAKER_GAIN);
        mSpeakerGain.setOnPreferenceChangeListener(this);

        if (FileUtils.fileWritable(USB_FASTCHARGE_PATH)) {
            mFastcharge = (SecureSettingSwitchPreference) findPreference(PREF_USB_FASTCHARGE);
            mFastcharge.setEnabled(Fastcharge.isSupported());
            mFastcharge.setChecked(Fastcharge.isCurrentlyEnabled(this.getContext()));
            mFastcharge.setOnPreferenceChangeListener(new Fastcharge(getContext()));
        } else {
            getPreferenceScreen().removePreference(findPreference(CATEGORY_FASTCHARGE));
        }
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 0c9feb4... mido: XiaomiParts: Add Earpiece Gain
=======
*/
>>>>>>> ab3b7cc... mido: XiaomiParts: Disable USB Fastcharge toggle
=======
>>>>>>> 1448afb... Revert "mido: XiaomiParts: Disable USB Fastcharge toggle"
=======
=======
>>>>>>> 494253b... mido: XiaomiParts: Add FPS info

        if (FileUtils.fileWritable(MSM_TOUCHBOOST_PATH)) {
            mTouchboost = (SecureSettingSwitchPreference) findPreference(PREF_MSM_TOUCHBOOST);
            mTouchboost.setEnabled(Touchboost.isSupported());
            mTouchboost.setChecked(Touchboost.isCurrentlyEnabled(this.getContext()));
            mTouchboost.setOnPreferenceChangeListener(new Touchboost(getContext()));
        } else {
            getPreferenceScreen().removePreference(findPreference(PREF_MSM_TOUCHBOOST));
        }

        mGPUBOOST = (SecureSettingListPreference) findPreference(PREF_GPUBOOST);
        mGPUBOOST.setValue(FileUtils.getStringProp(GPUBOOST_SYSTEM_PROPERTY, "0"));
        mGPUBOOST.setSummary(mGPUBOOST.getEntry());
        mGPUBOOST.setOnPreferenceChangeListener(this);

        mCPUBOOST = (SecureSettingListPreference) findPreference(PREF_CPUBOOST);
        mCPUBOOST.setValue(FileUtils.getStringProp(CPUBOOST_SYSTEM_PROPERTY, "0"));
        mCPUBOOST.setSummary(mCPUBOOST.getEntry());
        mCPUBOOST.setOnPreferenceChangeListener(this);

        mYellowFlash = (YellowFlashPreference) findPreference(KEY_FLASH);
        if (mYellowFlash != null) {
            mYellowFlash.setEnabled(YellowFlashPreference.isSupported());
        }

        if (FileUtils.fileWritable(MSM_THERMAL_PATH)) {
            mMsmThermal = (SecureSettingSwitchPreference) findPreference(PERF_MSM_THERMAL);
            mMsmThermal.setChecked(FileUtils.getFilesValueAsBoolean(MSM_THERMAL_PATH, true));
            mMsmThermal.setOnPreferenceChangeListener(this);
        } else {
            getPreferenceScreen().removePreference(findPreference(PERF_MSM_THERMAL));
        }

        if (FileUtils.fileWritable(CORE_CONTROL_PATH)) {
            mCoreControl = (SecureSettingSwitchPreference) findPreference(PERF_CORE_CONTROL);
            mCoreControl.setChecked(FileUtils.getFileValueAsBoolean(CORE_CONTROL_PATH, true));
            mCoreControl.setOnPreferenceChangeListener(this);
        } else {
            getPreferenceScreen().removePreference(findPreference(PERF_CORE_CONTROL));
        }

        if (FileUtils.fileWritable(VDD_RESTRICTION_PATH)) {
            mVddRestrict = (SecureSettingSwitchPreference) findPreference(PERF_VDD_RESTRICTION);
            mVddRestrict.setChecked(FileUtils.getFileValueAsBoolean(VDD_RESTRICTION_PATH, true));
            mVddRestrict.setOnPreferenceChangeListener(this);
        } else {
            getPreferenceScreen().removePreference(findPreference(PERF_VDD_RESTRICTION));
        }

        mCPUCORE = (SecureSettingListPreference) findPreference(PREF_CPUCORE);
        mCPUCORE.setValue(FileUtils.getStringProp(CPUCORE_SYSTEM_PROPERTY, "0"));
        mCPUCORE.setSummary(mCPUCORE.getEntry());
        mCPUCORE.setOnPreferenceChangeListener(this);

        mLKM = (SecureSettingListPreference) findPreference(PREF_LKM);
        mLKM.setValue(FileUtils.getStringProp(LKM_SYSTEM_PROPERTY, "0"));
        mLKM.setSummary(mLKM.getEntry());
        mLKM.setOnPreferenceChangeListener(this);

        mTCP = (SecureSettingListPreference) findPreference(PREF_TCP);
        mTCP.setValue(FileUtils.getStringProp(TCP_SYSTEM_PROPERTY, "0"));
        mTCP.setSummary(mTCP.getEntry());
        mTCP.setOnPreferenceChangeListener(this);

        mLedBlink = (LedBlinkPreference) findPreference(PREF_CHARGING_LED);
        if (mLedBlink != null) {
            mLedBlink.setEnabled(LedBlinkPreference.isSupported());
        }

        SwitchPreference fpsInfo = (SwitchPreference) findPreference(PREF_KEY_FPS_INFO);
        fpsInfo.setChecked(prefs.getBoolean(PREF_KEY_FPS_INFO, false));
        fpsInfo.setOnPreferenceChangeListener(this);
<<<<<<< HEAD
>>>>>>> 494253b... mido: XiaomiParts: Add FPS info
=======
>>>>>>> 494253b... mido: XiaomiParts: Add FPS info
=======

        if (FileUtils.fileWritable(USB_FASTCHARGE_PATH)) {
            mFastcharge = (SecureSettingSwitchPreference) findPreference(PREF_USB_FASTCHARGE);
            mFastcharge.setChecked(FileUtils.getFileValueAsBoolean(USB_FASTCHARGE_PATH, true));
            mFastcharge.setOnPreferenceChangeListener(this);
        } else {
            getPreferenceScreen().removePreference(findPreference(CATEGORY_FASTCHARGE));
        }
>>>>>>> 263864f... mido: XiaomiParts: Add USB fastcharge switch
    }


    @Override
    public boolean onPreferenceChange(Preference preference, Object value) {
        final String key = preference.getKey();
        switch (key) {
<<<<<<< HEAD
            case PREF_ENABLE_HAL3:
                FileUtils.setProp(HAL3_SYSTEM_PROPERTY, (Boolean) value);
                break;

            case PREF_TORCH_BRIGHTNESS:
=======
            case KEY_WHITE_TORCH_BRIGHTNESS:
>>>>>>> 3acb0fc... mido: XiaomiParts: Separate Yellow and White Torch Brightness
                FileUtils.setValue(TORCH_1_BRIGHTNESS_PATH, (int) value);
                break;

            case KEY_YELLOW_TORCH_BRIGHTNESS:
                FileUtils.setValue(TORCH_2_BRIGHTNESS_PATH, (int) value);
                break;

            case PERF_MSM_THERMAL:
                FileUtils.setValue(MSM_THERMAL_PATH, (boolean) value);
                break;

            case PERF_CORE_CONTROL:
                FileUtils.setValue(CORE_CONTROL_PATH, (boolean) value);
                break;

            case PERF_VDD_RESTRICTION:
                FileUtils.setValue(VDD_RESTRICTION_PATH, (boolean) value);
                break;

            case PREF_CPUCORE:
                mCPUCORE.setValue((String) value);
                mCPUCORE.setSummary(mCPUCORE.getEntry());
                FileUtils.setStringProp(CPUCORE_SYSTEM_PROPERTY, (String) value);
                break;

            case PREF_LKM:
                mLKM.setValue((String) value);
                mLKM.setSummary(mLKM.getEntry());
                FileUtils.setStringProp(LKM_SYSTEM_PROPERTY, (String) value);
                break;

            case PREF_TCP:
                mTCP.setValue((String) value);
                mTCP.setSummary(mTCP.getEntry());
                FileUtils.setStringProp(TCP_SYSTEM_PROPERTY, (String) value);
                break;

            case PREF_SPECTRUM:
                mSPECTRUM.setValue((String) value);
                mSPECTRUM.setSummary(mSPECTRUM.getEntry());
                FileUtils.setStringProp(SPECTRUM_SYSTEM_PROPERTY, (String) value);
                break;

            case HIGH_PERF_AUDIO:
                FileUtils.setValue(HIGH_AUDIO_PATH, (boolean) value);
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
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
            case PREF_EARPIECE_GAIN:
                FileUtils.setValue(EARPIECE_GAIN_PATH, (int) value);
                break;

<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 0c9feb4... mido: XiaomiParts: Add Earpiece Gain
=======
=======
            case PREF_SPEAKER_GAIN:
                 FileUtils.setValue(SPEAKER_GAIN_PATH, (int) value);
                break;
<<<<<<< HEAD
>>>>>>> 82e3f4e... mido: XiaomiParts: Add Speaker Gain
/*
>>>>>>> ab3b7cc... mido: XiaomiParts: Disable USB Fastcharge toggle
=======

<<<<<<< HEAD
>>>>>>> 1448afb... Revert "mido: XiaomiParts: Disable USB Fastcharge toggle"
=======
>>>>>>> 263864f... mido: XiaomiParts: Add USB fastcharge switch
            case PREF_USB_FASTCHARGE:
                FileUtils.setValue(USB_FASTCHARGE_PATH, (boolean) value);
                break;

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
            case PREF_BACKLIGHT_DIMMER:
                FileUtils.setValue(BACKLIGHT_DIMMER_PATH, (boolean) value);
                break;

<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 99bad28... mido: XiaomiParts: Add Backlight Dimmer toggle
=======
>>>>>>> cd02f85... mido: XiaomiParts: Backlight Dimmer improvement
=======
=======
>>>>>>> 494253b... mido: XiaomiParts: Add FPS info
=======
>>>>>>> 8f858c9... mido: XiaomiParts: USB Fastcharge Improvement
=======
            case PREF_MSM_TOUCHBOOST:
                FileUtils.setValue(MSM_TOUCHBOOST_PATH, (boolean) value);
                break;

<<<<<<< HEAD
>>>>>>> ba23a0f... mido: XiaomiParts: Add TouchBoost toggles
=======
>>>>>>> c094bfb... mido: XiaomiParts: TouchBoost Improvements
=======
            case PREF_GPUBOOST:
                mGPUBOOST.setValue((String) value);
                mGPUBOOST.setSummary(mGPUBOOST.getEntry());
                FileUtils.setStringProp(GPUBOOST_SYSTEM_PROPERTY, (String) value);
                break;

<<<<<<< HEAD
>>>>>>> c6f87a8... mido: XiaomiParts: Add GPU Boost Controler
=======
            case PREF_CPUBOOST:
                mCPUBOOST.setValue((String) value);
                mCPUBOOST.setSummary(mCPUBOOST.getEntry());
                FileUtils.setStringProp(CPUBOOST_SYSTEM_PROPERTY, (String) value);
                break;

>>>>>>> 6544015... mido: XiaomiParts: Add CPU Boost profile
            case PREF_KEY_FPS_INFO:
                boolean enabled = (Boolean) value;
                Intent fpsinfo = new Intent(this.getContext(), FPSInfoService.class);
                if (enabled) {
                    this.getContext().startService(fpsinfo);
                } else {
                    this.getContext().stopService(fpsinfo);
                }
                break;
<<<<<<< HEAD
>>>>>>> 494253b... mido: XiaomiParts: Add FPS info
=======
>>>>>>> 494253b... mido: XiaomiParts: Add FPS info
=======
>>>>>>> 263864f... mido: XiaomiParts: Add USB fastcharge switch
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
