PGDMP         -                {            Examen_Progra    15.2    15.2     �           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            �           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            �           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            �           1262    17311    Examen_Progra    DATABASE     �   CREATE DATABASE "Examen_Progra" WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE_PROVIDER = libc LOCALE = 'Spanish_Ecuador.1252';
    DROP DATABASE "Examen_Progra";
                postgres    false            �            1259    17320    empleado    TABLE     8  CREATE TABLE public.empleado (
    emp_id integer NOT NULL,
    emp_cedula character varying(10),
    emp_nombres character varying(50),
    emp_apellidos character varying(50),
    emp_fecha_contrato date,
    emp_salario double precision,
    emp_discapacidad boolean,
    emp_horario character varying(50)
);
    DROP TABLE public.empleado;
       public         heap    postgres    false            �            1259    17319    empleado_emp_id_seq    SEQUENCE     �   CREATE SEQUENCE public.empleado_emp_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 *   DROP SEQUENCE public.empleado_emp_id_seq;
       public          postgres    false    215            �           0    0    empleado_emp_id_seq    SEQUENCE OWNED BY     K   ALTER SEQUENCE public.empleado_emp_id_seq OWNED BY public.empleado.emp_id;
          public          postgres    false    214            e           2604    17323    empleado emp_id    DEFAULT     r   ALTER TABLE ONLY public.empleado ALTER COLUMN emp_id SET DEFAULT nextval('public.empleado_emp_id_seq'::regclass);
 >   ALTER TABLE public.empleado ALTER COLUMN emp_id DROP DEFAULT;
       public          postgres    false    215    214    215            �          0    17320    empleado 
   TABLE DATA           �   COPY public.empleado (emp_id, emp_cedula, emp_nombres, emp_apellidos, emp_fecha_contrato, emp_salario, emp_discapacidad, emp_horario) FROM stdin;
    public          postgres    false    215   �       �           0    0    empleado_emp_id_seq    SEQUENCE SET     A   SELECT pg_catalog.setval('public.empleado_emp_id_seq', 3, true);
          public          postgres    false    214            g           2606    17325    empleado pk_persona 
   CONSTRAINT     U   ALTER TABLE ONLY public.empleado
    ADD CONSTRAINT pk_persona PRIMARY KEY (emp_id);
 =   ALTER TABLE ONLY public.empleado DROP CONSTRAINT pk_persona;
       public            postgres    false    215            �   _   x�E˽@0��뻐{�G�b3���P����ӳI�zLΰ�ޣ�G81H�B�5���a�t���(J���u��c��9���â�F��R+�^���     