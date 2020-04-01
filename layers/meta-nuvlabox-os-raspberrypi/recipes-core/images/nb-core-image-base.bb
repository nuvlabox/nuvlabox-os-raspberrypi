#
# NuvlaBox specific
#

SUMMARY = "NuvlaBox OS image for *Pi"
LICENSE = "Apache-2.0"
HOMEPAGE = "https://sixsq.com"

REQUIRED_DISTRO_FEATURES += " systemd linux-firmware-rpidistro"
IMAGE_FEATURES += "ssh-server-openssh package-management"

inherit core-image

# install docker-ce
IMAGE_INSTALL_append = " docker-ce \
                        python3-docker-compose \
                        cronie \
                        swarm-mode \
                        iptables \
                        ansible \
                        u-boot \
                        kernel-modules \
                        init-resize \
                        networkmanager"
