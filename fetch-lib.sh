#!/bin/bash

LIB=lib/
FILE=postgresql-9.0-801.jdbc4.jar
SOURCE=http://jdbc.postgresql.org/download/$FILE

EJB3_FILE=ejb3-persistence-1.0.2.GA.jar
EJB3_SOURCE=http://mirrors.ibiblio.org/pub/mirrors/maven2/org/hibernate/ejb3-persistence/1.0.2.GA/ejb3-persistence-1.0.2.GA.jar

ANNOTATIONS_FILE=hibernate-annotations-3.2.0.ga.jar
ANNOTATIONS_SOURCE=http://mirrors.ibiblio.org/pub/mirrors/maven/org.hibernate/jars/hibernate-annotations-3.2.0.ga.jar

HIBERNATE_FILE=hibernate-3.2.4.ga.jar
HIBERNATE_SOURCE=http://mirrors.ibiblio.org/pub/mirrors/maven/org.hibernate/jars/hibernate-3.2.4.ga.jar

DOM4J_FILE=dom4j-1.6.jar
DOM4J_SOURCE=http://mirrors.ibiblio.org/pub/mirrors/maven/dom4j/jars/dom4j-1.6.jar

COMMONSLOGGING_FILE=commons-logging-1.0.4.jar
COMMONSLOGGING_SOURCE=http://mirrors.ibiblio.org/pub/mirrors/maven/commons-logging/jars/commons-logging-1.0.4.jar

COMMONSCOLLECTIONS_FILE=commons-collections-3.2.jar
COMMONSCOLLECTIONS_SOURCE=http://mirrors.ibiblio.org/pub/mirrors/maven/commons-collections/jars/commons-collections-3.2.jar

CGLIB_FILE=cglib-nodep-2.2.2.jar
CGLIB_SOURCE=http://mirrors.ibiblio.org/pub/mirrors/maven2/cglib/cglib-nodep/2.2.2/cglib-nodep-2.2.2.jar

JTA_FILE=jta-1.1.jar
JTA_SOURCE=http://mirrors.ibiblio.org/pub/mirrors/maven2/javax/transaction/jta/1.1/jta-1.1.jar

if [ ! -d $LIB ]; then
  mkdir -v -p $LIB
fi

if [ ! -f $LIB/$FILE ]; then
  echo Downloading PostgreSQL JAR
  wget -P $LIB $SOURCE
fi

if [ ! -f $LIB/$EJB3_FILE ]; then
  echo Downloading Javax Persistence API JAR
  wget -P $LIB $EJB3_SOURCE
fi

if [ ! -f $LIB/$ANNOTATIONS_FILE ]; then
  echo Downloading Hibernate Annotations API JAR
  wget -P $LIB $ANNOTATIONS_SOURCE
fi
  
if [ ! -f $LIB/$HIBERNATE_FILE ]; then
  echo Downloading Hibernate
  wget -P $LIB $HIBERNATE_SOURCE
fi

if [ ! -f $LIB/$DOM4J_FILE ]; then
  echo Downloading Dom4J
  wget -P $LIB $DOM4J_SOURCE
fi

if [ ! -f $LIB/$COMMONSLOGGING_FILE ]; then
  echo Downloading Apache Commons Logging
  wget -P $LIB $COMMONSLOGGING_SOURCE
fi

if [ ! -f $LIB/$COMMONSCOLLECTIONS_FILE ]; then
  echo Downloading Apache Commons Collections
  wget -P $LIB $COMMONSCOLLECTIONS_SOURCE
fi

if [ ! -f $LIB/$CGLIB_FILE ]; then
  echo Downloading CGLib
  wget -P $LIB $CGLIB_SOURCE
fi

if [ ! -f $LIB/$JTA_FILE ]; then
  echo Downloading Javax Transaction API
  wget -P $LIB $JTA_SOURCE
fi
