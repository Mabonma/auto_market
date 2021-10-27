create table Users (
    id serial,
    login varchar(50),
    password varchar(50),
    fio varchar(100),
    admin boolean,
    deleted boolean,
    PRIMARY KEY (id)
);

create table Style (
    id serial,
    brand varchar(50),
    model varchar(50),
    body smallint,
    PRIMARY KEY (id)
);

create table Performance (
    id serial,
    drivetrain smallint,
    transmission smallint,
    volume double precision,
    PRIMARY KEY (id)
);

create table Auto (
    id serial,
    id_style serial,
    id_performance serial,
    fuel varchar(50),
    year int,
    milage double precision,
    price numeric(12,2),
    description varchar(1000),
    news boolean,
    deleted boolean,
    PRIMARY KEY (id),
    CONSTRAINT StyleIdAuto FOREIGN KEY (id_style) REFERENCES Style(id),
    CONSTRAINT PerformanceIdAuto FOREIGN KEY (id_performance) REFERENCES Performance(id)
);

create table Image (
    id serial,
    type varchar(50),
    image bytea,
    main boolean,
    PRIMARY KEY (id)
);

create table AutoImage (
    id_auto serial,
    id_image serial,
    PRIMARY KEY (id_auto, id_image),
    CONSTRAINT AutoIdAImag FOREIGN KEY (id_auto) REFERENCES Auto(id),
    CONSTRAINT ImageIdAImag FOREIGN KEY (id_image) REFERENCES Image(id)
);