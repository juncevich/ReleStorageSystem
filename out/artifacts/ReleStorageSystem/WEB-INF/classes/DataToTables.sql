INSERT INTO releSystemDatabase.unit (name) VALUES ('Свердловский');
INSERT INTO releSystemDatabase.unit (name) VALUES ('Режевской');
INSERT INTO releSystemDatabase.unit (name) VALUES ('Егоршинский');
INSERT INTO releSystemDatabase.unit (name) VALUES ('Алапаевский');

INSERT INTO releSystemDatabase.station (station_name, unit_id) VALUES ('Березит', 1);
INSERT INTO releSystemDatabase.station (station_name, unit_id) VALUES ('Егоршино', 3);

INSERT INTO releSystemDatabase.rele_type (name) VALUES ('НМШ-400');
INSERT INTO releSystemDatabase.rele_type (name) VALUES ('Ог-600');
INSERT INTO releSystemDatabase.rele_type (name) VALUES ('НМШМ-1440');

INSERT INTO releSystemDatabase.relay (serial_number, type_id, unit_id, station_id, manufacture_date, last_service, next_service, responible) VALUES (345345, 1, 1, 1, '2014-07-01', '2015-07-01', '2017-07-01', 'test');
INSERT INTO releSystemDatabase.relay (serial_number, type_id, unit_id, station_id, manufacture_date, last_service, next_service, responible) VALUES (12345, 2, 3, 2, '2014-07-02', '2015-07-02', '2017-07-02', 'test');