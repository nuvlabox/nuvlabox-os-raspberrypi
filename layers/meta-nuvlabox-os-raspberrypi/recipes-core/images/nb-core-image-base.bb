#
# NuvlaBox specific
#

SUMMARY = "NuvlaBox OS image for *Pi"
LICENSE = "Apache-2.0"
HOMEPAGE = "https://sixsq.com"

REQUIRED_DISTRO_FEATURES += " systemd"
IMAGE_FEATURES += "splash"

inherit core-image

# remove x11 distro and consider virtualization distro from meta-virtualization
DISTRO_FEATURES_append = " systemd virtualization"
DISTRO_FEATURES_remove = "x11 wayland"
DISTRO_FEATURES_BACKFILL_CONSIDERED = "sysvinit"

# default to systemd
VIRTUAL-RUNTIME_init_manager = "systemd"
VIRTUAL-RUNTIME_initscripts = "systemd-compat-units"

# install docker-ce
IMAGE_INSTALL_append = " docker-ce wpa-supplicant openssh firewall iptables ansible u-boot"
