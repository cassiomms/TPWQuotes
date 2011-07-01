#!/bin/bash

LIB=lib/

JUNIT_FILE=junit-4.8.2.jar
JUNIT_SOURCE=ftp://mirrors.ibiblio.org/pub/mirrors/maven2/junit/junit/4.8.2/junit-4.8.2.jar

POSTGRES_FILE=postgresql-9.0-801.jdbc4.jar
POSTGRES_SOURCE=http://jdbc.postgresql.org/download/$POSTGRES_FILE

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

COMMONSFILEUPLOAD_FILE=commons-fileupload-1.2.2.jar
COMMONSFILEUPLOAD_SOURCE=http://mirrors.ibiblio.org/pub/mirrors/maven2/commons-fileupload/commons-fileupload/1.2.2/commons-fileupload-1.2.2.jar

COMMONSIO_FILE=commons-io-2.0.1.jar
COMMONSIO_SOURCE=http://mirrors.ibiblio.org/pub/mirrors/maven2/commons-io/commons-io/2.0.1/commons-io-2.0.1.jar

CGLIB_FILE=cglib-nodep-2.2.2.jar
CGLIB_SOURCE=http://mirrors.ibiblio.org/pub/mirrors/maven2/cglib/cglib-nodep/2.2.2/cglib-nodep-2.2.2.jar

JTA_FILE=jta-1.1.jar
JTA_SOURCE=http://mirrors.ibiblio.org/pub/mirrors/maven2/javax/transaction/jta/1.1/jta-1.1.jar

#SERVLETAPI_FILE=servlet-api-5.5.23.jar
#SERVLETAPI_SOURCE=http://mirrors.ibiblio.org/pub/mirrors/maven2/tomcat/servlet-api/5.5.23/servlet-api-5.5.23.jar

#JSPAPI_FILE=jsp-api-2.0.jar
#JSPAPI_SOURCE=ftp://mirrors.ibiblio.org/pub/mirrors/maven2/jspapi/jsp-api/2.0/jsp-api-2.0.jar



if [ ! -d $LIB ]; then
  mkdir -v -p $LIB
fi

if [ ! -f $LIB/$POSTGRES_FILE ]; then
  echo Downloading PostgreSQL JAR
  wget -P $LIB $POSTGRES_SOURCE
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

if [ ! -f $LIB/$COMMONSFILEUPLOAD_FILE ]; then
  echo Downloading Apache Commons Fileupload
  wget -P $LIB $COMMONSFILEUPLOAD_SOURCE
fi

if [ ! -f $LIB/$COMMONSIO_FILE ]; then
  echo Downloading Apache Commons IO
  wget -P $LIB $COMMONSIO_SOURCE
fi

if [ ! -f $LIB/$CGLIB_FILE ]; then
  echo Downloading CGLib
  wget -P $LIB $CGLIB_SOURCE
fi

if [ ! -f $LIB/$JTA_FILE ]; then
  echo Downloading Javax Transaction API
  wget -P $LIB $JTA_SOURCE
fi

#if [ ! -f $LIB/$SERVLETAPI_FILE ]; then
#  echo Downloading Servlet API
#  wget -P $LIB $SERVLETAPI_SOURCE
#fi

#if [ ! -f $LIB/$JSPAPI_FILE ]; then
#  echo Downloading JSP API
#  wget -P $LIB $JSPAPI_SOURCE
#fi


if [ ! -f $LIB/$JUNIT_FILE ]; then
  echo Downloading jUnit API
  wget -P $LIB $JUNIT_SOURCE
fi
