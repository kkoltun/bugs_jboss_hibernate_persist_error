CREATE TABLE simple_object
(
    objid INTEGER,
    data  VARCHAR(255),
    CONSTRAINT PK_simple_object PRIMARY KEY (objid)
);

CREATE TABLE primary_keys
(
    ckey   VARCHAR(255) NOT NULL,
    cvalue INTEGER,
    CONSTRAINT PK_ec_primary_keys PRIMARY KEY (ckey)
);