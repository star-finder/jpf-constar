FROM ubuntu:14.04
MAINTAINER Quoc-Sang Phan <phanquocsang@gmail.com>

#############################################################################
# Setup base image 
#############################################################################
RUN \
  apt-get update -y && \
  apt-get install software-properties-common -y && \
  echo oracle-java8-installer shared/accepted-oracle-license-v1-1 select true | debconf-set-selections && \
  add-apt-repository ppa:webupd8team/java -y && \
  apt-get update -y && \
  apt-get install -y oracle-java8-installer
# Cut it in two---java takes a long time to install
RUN  apt-get install -y \
                        unzip \
                        ant \
                        build-essential \
                        mercurial \
                        git \
                        vim && \
  rm -rf /var/lib/apt/lists/* && \
  rm -rf /var/cache/oracle-jdk8-installer

#############################################################################
# Environment 
#############################################################################

# set java env
ENV JAVA_HOME /usr/lib/jvm/java-8-oracle
ENV JUNIT_HOME /usr/share/java

# Make dir for distribution
WORKDIR /
RUN mkdir tools
ENV TOOLS_ROOT /tools


#############################################################################
# Install and configure jpf-related tools 
#############################################################################

# Set up jpf conf initially
RUN mkdir /root/.jpf
RUN echo "jpf-core = ${TOOLS_ROOT}/jpf-core" >> /root/.jpf/site.properties
RUN echo "jpf-symbc = ${TOOLS_ROOT}/jpf-symbc" >> /root/.jpf/site.properties
RUN echo "starlib = ${TOOLS_ROOT}/starlib" >> /root/.jpf/site.properties
RUN echo "jpf-star = ${TOOLS_ROOT}/jpf-star" >> /root/.jpf/site.properties
RUN echo "jpf-costar = ${TOOLS_ROOT}/jpf-costar" >> /root/.jpf/site.properties

RUN echo "export JPF_HOME=${TOOLS_ROOT}/jpf-core" >> /root/.bashrc
RUN echo "export PATH=\${JPF_HOME}/bin:$PATH" >> /root/.bashrc
RUN /bin/bash -c "source /root/.bashrc"

# Set extensions var
RUN echo "extensions=\${jpf-core},\${jpf-symbc},\${starlib},\${jpf-star},\${jpf-costar}" >> /root/.jpf/site.properties

# Install jpf-core
WORKDIR ${TOOLS_ROOT}
RUN git clone https://github.com/star-finder/jpf-core

WORKDIR ${TOOLS_ROOT}/jpf-core
RUN ant

# Install jpf-symbc
WORKDIR ${TOOLS_ROOT}
RUN git clone https://github.com/star-finder/jpf-symbc

WORKDIR ${TOOLS_ROOT}/jpf-symbc
RUN ant
# Install s2sat solver
WORKDIR ${TOOLS_ROOT}
RUN git clone https://github.com/star-finder/s2sat
# The s2sat solver uses the absolute path
RUN cp -a s2sat/. /usr/local/bin/

WORKDIR ${TOOLS_ROOT}
RUN git clone https://github.com/star-finder/starlib

WORKDIR ${TOOLS_ROOT}/starlib
RUN ant

WORKDIR ${TOOLS_ROOT}
RUN git clone https://github.com/star-finder/jpf-star

WORKDIR ${TOOLS_ROOT}/jpf-star
RUN ant

WORKDIR ${TOOLS_ROOT}
RUN wget https://github.com/star-finder/benchmarks/raw/master/PLEXIL5-0.0.tar.gz
RUN tar -xvzf PLEXIL5-0.0.tar.gz

WORKDIR ${TOOLS_ROOT}
RUN git clone https://github.com/star-finder/jpf-costar -b artifact

WORKDIR ${TOOLS_ROOT}/jpf-costar
RUN ant

# Let's go!
WORKDIR ${TOOLS_ROOT}/jpf-costar
