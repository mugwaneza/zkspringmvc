PGDMP     &    *                |            zk_db    15.8    15.8     �           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            �           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            �           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            �           1262    16493    zk_db    DATABASE     �   CREATE DATABASE zk_db WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE_PROVIDER = libc LOCALE = 'English_United States.1252';
    DROP DATABASE zk_db;
                postgres    false            �            1259    16521    students    TABLE     �   CREATE TABLE public.students (
    id bigint NOT NULL,
    sd_fname character varying(220),
    sd_lname character varying(220),
    date timestamp without time zone
);
    DROP TABLE public.students;
       public         heap    postgres    false            �          0    16521    students 
   TABLE DATA           @   COPY public.students (id, sd_fname, sd_lname, date) FROM stdin;
    public          postgres    false    214   �       e           2606    16525    students students_id_key 
   CONSTRAINT     Q   ALTER TABLE ONLY public.students
    ADD CONSTRAINT students_id_key UNIQUE (id);
 B   ALTER TABLE ONLY public.students DROP CONSTRAINT students_id_key;
       public            postgres    false    214            g           2606    16527    students students_pkey 
   CONSTRAINT     T   ALTER TABLE ONLY public.students
    ADD CONSTRAINT students_pkey PRIMARY KEY (id);
 @   ALTER TABLE ONLY public.students DROP CONSTRAINT students_pkey;
       public            postgres    false    214            �      x������ � �     