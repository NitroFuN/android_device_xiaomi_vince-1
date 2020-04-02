#
# Copyright (C) 2017-2019 The LineageOS Project
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#      http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.
#

$(call inherit-product, vendor/xiaomi/vince/vince-vendor.mk)
$(call inherit-product, $(SRC_TARGET_DIR)/product/product_launched_with_n_mr1.mk)

# Overlay
DEVICE_PACKAGE_OVERLAYS += $(LOCAL_PATH)/overlay

# Audio configuration
PRODUCT_COPY_FILES += \
    $(LOCAL_PATH)/audio/audio_platform_info.xml:$(TARGET_COPY_OUT_VENDOR)/etc/audio_platform_info.xml \
    $(LOCAL_PATH)/audio/mixer_paths_mtp.xml:$(TARGET_COPY_OUT_VENDOR)/etc/mixer_paths_mtp.xml

# Camera
PRODUCT_PACKAGES += \
    camera.msm8953 \
    libmm-qcamera

# Charging
PRODUCT_PACKAGES += \
    charger_res_images \
    product_charger_res_images

# ConsumerIr
PRODUCT_PACKAGES += \
    android.hardware.ir@1.0-impl \
    android.hardware.ir@1.0-service


# Properties
-include device/xiaomi/vince/prop.mk

# Prebuilts
PRODUCT_PACKAGES += \
    GoogleCameraGo

# Ramdisk
PRODUCT_PACKAGES += \
    init.goodix.sh \
    init.recovery.qcom.rc \
    init.recovery.qcom.usb.rc \
    init.vince.rc \
    init.safailnet.rc

# Sensors
PRODUCT_COPY_FILES += \
    $(LOCAL_PATH)/configs/sensors/sensor_def_qcomdev.conf:$(TARGET_COPY_OUT_VENDOR)/etc/sensors/sensor_def_qcomdev.conf

<<<<<<< HEAD
# Inherit from msm8953-common
$(call inherit-product, device/xiaomi/msm8953-common/msm8953.mk)
=======
# TextClassifier smart selection model files
PRODUCT_PACKAGES += \
    textclassifier.bundle1

# Thermal
PRODUCT_PACKAGES += \
    android.hardware.thermal@1.0-impl \
    android.hardware.thermal@1.0-service \
    thermal.msm8953

PRODUCT_COPY_FILES += \
    $(LOCAL_PATH)/configs/thermal-engine.conf:$(TARGET_COPY_OUT_VENDOR)/etc/thermal-engine.conf

# USB HAL
PRODUCT_PACKAGES += \
    android.hardware.usb@1.0-service.basic

# Vibrator
PRODUCT_PACKAGES += \
    android.hardware.vibrator@1.0-impl \
    android.hardware.vibrator@1.0-service

# VNDK
PRODUCT_PACKAGES += \
    vndk-sp

# VR
PRODUCT_PACKAGES += \
    android.hardware.vr@1.0-impl \
    android.hardware.vr@1.0-service \
    vr.msm8953

# Whitelisted apps
PRODUCT_COPY_FILES += \
    $(LOCAL_PATH)/configs/privapp-permissions-qti.xml:$(TARGET_COPY_OUT_SYSTEM)/etc/permissions/privapp-permissions-qti.xml \
    $(LOCAL_PATH)/configs/qti_whitelist.xml:$(TARGET_COPY_OUT_SYSTEM)/etc/sysconfig/qti_whitelist.xml

# Wifi
PRODUCT_PACKAGES += \
    android.hardware.wifi@1.0-service \
    libcld80211 \
    libwpa_client \
    hostapd \
    libwifi-hal-qcom \
    wpa_supplicant \
    wpa_supplicant.conf

PRODUCT_COPY_FILES += \
    $(LOCAL_PATH)/wifi/p2p_supplicant_overlay.conf:$(TARGET_COPY_OUT_VENDOR)/etc/wifi/p2p_supplicant_overlay.conf \
    $(LOCAL_PATH)/wifi/wpa_supplicant_overlay.conf:$(TARGET_COPY_OUT_VENDOR)/etc/wifi/wpa_supplicant_overlay.conf \
    $(LOCAL_PATH)/wifi/WCNSS_qcom_cfg.ini:$(TARGET_COPY_OUT_VENDOR)/firmware/wlan/prima/WCNSS_qcom_cfg.ini

# Wi-Fi Display
PRODUCT_BOOT_JARS += \
    WfdCommon

# XiaomiParts
PRODUCT_PACKAGES += \
<<<<<<< HEAD
=======
    android.hardware.thermal@1.0-impl \
    android.hardware.thermal@1.0-service \
    thermal.msm8953

PRODUCT_COPY_FILES += \
    $(LOCAL_PATH)/configs/thermal-engine.conf:$(TARGET_COPY_OUT_VENDOR)/etc/thermal-engine.conf

# USB HAL
PRODUCT_PACKAGES += \
    android.hardware.usb@1.0-service.basic

# Vibrator
PRODUCT_PACKAGES += \
    android.hardware.vibrator@1.0-impl \
    android.hardware.vibrator@1.0-service

# VNDK
PRODUCT_PACKAGES += \
    vndk-sp

# VR
PRODUCT_PACKAGES += \
    android.hardware.vr@1.0-impl \
    android.hardware.vr@1.0-service \
    vr.msm8953

# Whitelisted apps
PRODUCT_COPY_FILES += \
    $(LOCAL_PATH)/configs/privapp-permissions-qti.xml:$(TARGET_COPY_OUT_SYSTEM)/etc/permissions/privapp-permissions-qti.xml \
    $(LOCAL_PATH)/configs/qti_whitelist.xml:$(TARGET_COPY_OUT_SYSTEM)/etc/sysconfig/qti_whitelist.xml

# Wifi
PRODUCT_PACKAGES += \
    android.hardware.wifi@1.0-service \
    libcld80211 \
    libwpa_client \
    hostapd \
    libwifi-hal-qcom \
    wpa_supplicant \
    wpa_supplicant.conf

PRODUCT_COPY_FILES += \
    $(LOCAL_PATH)/wifi/p2p_supplicant_overlay.conf:$(TARGET_COPY_OUT_VENDOR)/etc/wifi/p2p_supplicant_overlay.conf \
    $(LOCAL_PATH)/wifi/wpa_supplicant_overlay.conf:$(TARGET_COPY_OUT_VENDOR)/etc/wifi/wpa_supplicant_overlay.conf \
    $(LOCAL_PATH)/wifi/WCNSS_qcom_cfg.ini:$(TARGET_COPY_OUT_VENDOR)/firmware/wlan/prima/WCNSS_qcom_cfg.ini

# Wi-Fi Display
PRODUCT_BOOT_JARS += \
    WfdCommon

# XiaomiParts
PRODUCT_PACKAGES += \
>>>>>>> 12c8c1a... mido: Import XiaomiParts v2.0
    XiaomiParts
>>>>>>> 12c8c1a0... mido: Import XiaomiParts v2.0
