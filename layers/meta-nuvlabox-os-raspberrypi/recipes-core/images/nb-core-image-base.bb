#
# NuvlaBox specific
#

SUMMARY = "NuvlaBox OS image for *Pi"
LICENSE = "Apache-2.0"
HOMEPAGE = "https://sixsq.com"

REQUIRED_DISTRO_FEATURES += " systemd"
IMAGE_FEATURES += "splash"

inherit core-image

# install docker-ce
IMAGE_INSTALL_append = " docker-ce wpa-supplicant openssh firewall iptables ansible u-boot"
