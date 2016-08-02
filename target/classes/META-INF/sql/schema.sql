DROP TABLE IF EXISTS STATION;
DROP TABLE IF EXISTS STATIV;
DROP TABLE IF EXISTS RELAY;



CREATE TABLE STATION
(
    ID INTEGER AUTO_INCREMENT PRIMARY KEY NOT NULL,
    VERSION INTEGER DEFAULT 0 NOT NULL,
    STATION_NAME VARCHAR(10) NOT NULL
);
COMMENT ON COLUMN STATION.ID IS '';
COMMENT ON COLUMN STATION.VERSION IS '';
COMMENT ON COLUMN STATION.STATION_NAME IS '';

CREATE TABLE STATIV
(
    ID INTEGER AUTO_INCREMENT PRIMARY KEY NOT NULL,
    VERSION INTEGER DEFAULT 0 NOT NULL,
    STATION_ID INTEGER NOT NULL,
    CONSTRAINT FK_STATION_IN_STATIV FOREIGN KEY (STATION_ID) REFERENCES STATION (ID)
);
COMMENT ON COLUMN STATIV.ID IS '';
COMMENT ON COLUMN STATIV.VERSION IS '';
COMMENT ON COLUMN STATIV.STATION_ID IS '';


CREATE TABLE RELAY
(
    ID INTEGER AUTO_INCREMENT PRIMARY KEY NOT NULL,
    VERSION INTEGER DEFAULT 0 NOT NULL,
    SERIAL_NUMBER INTEGER NOT NULL,
    TYPE_ID VARCHAR(10) NOT NULL,
    SHELVE_POSITION INTEGER,
    SERVICE_DATE DATE,
    NEXT_SERVICE_DATE DATE,
    MANUFACTURE_DATE DATE,
    RESPONSIBLE_PERSON VARCHAR(40) NOT NULL,
    STATIV_ID INTEGER NOT NULL,
    CONSTRAINT FK_STATIV_IN_RELE FOREIGN KEY (STATIV_ID) REFERENCES STATIV (ID)
);
COMMENT ON COLUMN RELAY.ID IS '';
COMMENT ON COLUMN RELAY.VERSION IS '';
COMMENT ON COLUMN RELAY.SERIAL_NUMBER IS '';
COMMENT ON COLUMN RELAY.TYPE_ID IS '';
COMMENT ON COLUMN RELAY.SHELVE_POSITION IS '';
COMMENT ON COLUMN RELAY.SERVICE_DATE IS '';
COMMENT ON COLUMN RELAY.NEXT_SERVICE_DATE IS '';
COMMENT ON COLUMN RELAY.MANUFACTURE_DATE IS '';
COMMENT ON COLUMN RELAY.RESPONSIBLE_PERSON IS '';
COMMENT ON COLUMN RELAY.STATIV_ID IS '';
CREATE UNIQUE INDEX UQ_RELAY_1_INDEX_4 ON RELAY (SERIAL_NUMBER);









