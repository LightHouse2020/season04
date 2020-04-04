CREATE TABLE public.login1
(
    id integer NOT NULL,
    user_name character varying(64) COLLATE pg_catalog."default",
    password character varying(64) COLLATE pg_catalog."default",
    phone_number character varying(64) COLLATE pg_catalog."default",
    CONSTRAINT lesson_pkey PRIMARY KEY (id)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.login1
    OWNER to postgres;