#
# Copyright (C) 2017 The havocOS Project
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

# Inherit from those products. Most specific first.
$(call inherit-product, $(SRC_TARGET_DIR)/product/core_64_bit.mk)
$(call inherit-product, $(SRC_TARGET_DIR)/product/full_base_telephony.mk)
$(call inherit-product, vendor/havoc/config/phone-xxhdpi-4096-dalvik-heap.mk)
$(call inherit-product, vendor/havoc/config/phone-xxhdpi-2048-hwui-memory.mk)

# Inherit from vince device
$(call inherit-product, device/xiaomi/vince/device.mk)

# Inherit some common havocOS stuff.
$(call inherit-product, vendor/havoc/config/common_full_phone.mk)

<<<<<<< HEAD:zenx_vince.mk
=======
# Boot Animation res
TARGET_BOOT_ANIMATION_RES := 1080

# Gapps
TARGET_GAPPS_ARCH := arm64

# Maintainer
PRODUCT_PROPERTY_OVERRIDES += \
        ro.xtended.maintainer=☭GH05T☭

#Bleed Zenx
ZENX_BUILD_TYPE := OFFICIAL

# Google Recorder
TARGET_SUPPORTS_GOOGLE_RECORDER := true

>>>>>>> d0d7641d... mido: Enable Google Recorder for all:zenx_mido.mk
# Device identifier. This must come after all inclusions
PRODUCT_DEVICE := vince
PRODUCT_NAME := havoc_vince
BOARD_VENDOR := Xiaomi
PRODUCT_BRAND := Xiaomi
PRODUCT_MODEL := Redmi 5 Plus
PRODUCT_MANUFACTURER := Xiaomi
TARGET_VENDOR := Xiaomi

PRODUCT_GMS_CLIENTID_BASE := android-xiaomi

PRODUCT_BUILD_PROP_OVERRIDES += \
    PRIVATE_BUILD_DESC="vince-user 8.1.0 OPM1.171019.019 V10.2.3.0.OEGMIXM release-keys"

# Set BUILD_FINGERPRINT variable to be picked up by both system and vendor build.prop
BUILD_FINGERPRINT := "google/coral/coral:10/QQ3A.200605.001/6392402:user/release-keys"

TARGET_VENDOR := xiaomi
