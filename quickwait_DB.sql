/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     30/04/2021 22:05:28                          */
/*==============================================================*/


drop table if exists AUTOR;

drop table if exists AUTOR_NOTICIA;

drop table if exists BULA;

drop table if exists CONVENIO;

drop table if exists CONVENIO_UNIDADE_DE_SAUDE;

drop table if exists EDITORA;

drop table if exists ENDERECO;

drop table if exists ESPECIALIDADE;

drop table if exists ESPECIALIDADE_DA_UNIDADE_DE_SAUDE;

drop table if exists LEMBRETE;

drop table if exists MEDICAMENTO;

drop table if exists NOTICIA;

drop table if exists STATUS_UNIDADE_DE_SAUDE;

drop table if exists TARJA;

drop table if exists TIPO_UNIDADE_DE_SAUDE;

drop table if exists UNIDADE_DE_SAUDE;

drop table if exists USUARIO;

drop table if exists USUARIO_UNIDADE_DE_SAUDE;

/*==============================================================*/
/* Table: AUTOR                                                 */
/*==============================================================*/
create table AUTOR
(
   COD_AUTOR            bigint not null,
   NOM_AUTOR            varchar(50)
);

alter table AUTOR
   add primary key (COD_AUTOR);

/*==============================================================*/
/* Table: AUTOR_NOTICIA                                         */
/*==============================================================*/
create table AUTOR_NOTICIA
(
   COD_AUTOR_NOTICIA    integer not null,
   COD_NOTICIA_         integer not null,
   COD_AUTOR            bigint not null
);

alter table AUTOR_NOTICIA
   add primary key (COD_AUTOR_NOTICIA);

/*==============================================================*/
/* Table: BULA                                                  */
/*==============================================================*/
create table BULA
(
   COD_BULA             bigint not null,
   DES_CONTRAINDICACOES varchar(10000),
   DES_PRESCRICAO       varchar(10000),
   DES_ADMINISTRACAO    varchar(10000),
   DES_ADVERTENCIA      varchar(10000)
);

alter table BULA
   add primary key (COD_BULA);

/*==============================================================*/
/* Table: CONVENIO                                              */
/*==============================================================*/
create table CONVENIO
(
   COD_CONVENIO         mediumint not null,
   NOM_CONVENIO         varchar(100)
);

alter table CONVENIO
   add primary key (COD_CONVENIO);

/*==============================================================*/
/* Table: CONVENIO_UNIDADE_DE_SAUDE                             */
/*==============================================================*/
create table CONVENIO_UNIDADE_DE_SAUDE
(
   COD_CONVENIO_UNIDADE_DE_SAUDE int not null,
   COD_UNIDADE_DE_SAUDE integer not null,
   COD_CONVENIO         mediumint not null
);

alter table CONVENIO_UNIDADE_DE_SAUDE
   add primary key (COD_CONVENIO_UNIDADE_DE_SAUDE);

/*==============================================================*/
/* Table: EDITORA                                               */
/*==============================================================*/
create table EDITORA
(
   COD_EDITORA          mediumint not null,
   NOM_EDITORA          varchar(50)
);

alter table EDITORA
   add primary key (COD_EDITORA);

/*==============================================================*/
/* Table: ENDERECO                                              */
/*==============================================================*/
create table ENDERECO
(
   COD_ENDERECO         mediumint not null,
   DES_LOGRADOURO       varchar(100),
   DES_COMPLEMENTO      varchar(50),
   NUM_CEP              varchar(25),
   DES_BAIRRO           varchar(50),
   DES_CIDADE           varchar(50),
   DES_UF               varchar(50),
   NUM_NUMERO           smallint
);

alter table ENDERECO
   add primary key (COD_ENDERECO);

/*==============================================================*/
/* Table: ESPECIALIDADE                                         */
/*==============================================================*/
create table ESPECIALIDADE
(
   COD_ESPECIALIDADE    mediumint not null,
   DES_ESPECIALIDADE    varchar(100)
);

alter table ESPECIALIDADE
   add primary key (COD_ESPECIALIDADE);

/*==============================================================*/
/* Table: ESPECIALIDADE_DA_UNIDADE_DE_SAUDE                     */
/*==============================================================*/
create table ESPECIALIDADE_DA_UNIDADE_DE_SAUDE
(
   COD_ESPECIALIDADE_DA_UNIDADE_DE_SAUDE mediumint not null,
   COD_UNIDADE_DE_SAUDE integer not null,
   COD_ESPECIALIDADE    mediumint not null
);

alter table ESPECIALIDADE_DA_UNIDADE_DE_SAUDE
   add primary key (COD_ESPECIALIDADE_DA_UNIDADE_DE_SAUDE);

/*==============================================================*/
/* Table: LEMBRETE                                              */
/*==============================================================*/
create table LEMBRETE
(
   COD_LEMBRETE_        mediumint not null,
   DTA_LEMBRETE         datetime,
   DIA_SEMANA           varchar(20),
   DES_LEMBRETE_        varchar(300),
   COD_USUARIO          bigint not null
);

alter table LEMBRETE
   add primary key (COD_LEMBRETE_);

/*==============================================================*/
/* Table: MEDICAMENTO                                           */
/*==============================================================*/
create table MEDICAMENTO
(
   COD_MEDICAMENTO      bigint not null,
   NOM_NOME_MEDICAMENTO varchar(100),
   NUM_QUANTIDADE       float(10,2),
   COD_LEMBRETE_        mediumint not null,
   COD_BULA             bigint not null,
   COD_TARJA            mediumint not null
);

alter table MEDICAMENTO
   add primary key (COD_MEDICAMENTO);

/*==============================================================*/
/* Table: NOTICIA                                               */
/*==============================================================*/
create table NOTICIA
(
   COD_NOTICIA_         integer not null,
   NOM_NOTICIA          varchar(100),
   DES_NOTICIA          text,
   DTA_PUBLICACAO       datetime,
   COD_USUARIO          bigint not null,
   COD_EDITORA          mediumint
);

alter table NOTICIA
   add primary key (COD_NOTICIA_);

/*==============================================================*/
/* Table: STATUS_UNIDADE_DE_SAUDE                               */
/*==============================================================*/
create table STATUS_UNIDADE_DE_SAUDE
(
   COD_STATUS_UNIDADE_DE_SAUDE mediumint not null,
   DES_STATUS_UNIDADE_DE_SAUDE varchar(100)
);

alter table STATUS_UNIDADE_DE_SAUDE
   add primary key (COD_STATUS_UNIDADE_DE_SAUDE);

/*==============================================================*/
/* Table: TARJA                                                 */
/*==============================================================*/
create table TARJA
(
   COD_TARJA            mediumint not null,
   DES_TARJA            varchar(100)
);

alter table TARJA
   add primary key (COD_TARJA);

/*==============================================================*/
/* Table: TIPO_UNIDADE_DE_SAUDE                                 */
/*==============================================================*/
create table TIPO_UNIDADE_DE_SAUDE
(
   COD_TIPO_UNIDADE_DE_SAUDE mediumint not null,
   DES_TIPO_UNIDADE_DE_SAUDE varchar(100)
);

alter table TIPO_UNIDADE_DE_SAUDE
   add primary key (COD_TIPO_UNIDADE_DE_SAUDE);

/*==============================================================*/
/* Table: UNIDADE_DE_SAUDE                                      */
/*==============================================================*/
create table UNIDADE_DE_SAUDE
(
   COD_UNIDADE_DE_SAUDE integer not null,
   NUM_CNPJ             varchar(50),
   NUM_LEITOS_DISPONIVEIS smallint,
   HOR_FUNCIONAMENTO    time,
   DIA_FUNCIONAMENTO    date,
   COD_ENDERECO         mediumint not null,
   COD_STATUS_UNIDADE_DE_SAUDE mediumint not null,
   COD_TIPO_UNIDADE_DE_SAUDE mediumint not null
);

alter table UNIDADE_DE_SAUDE
   add primary key (COD_UNIDADE_DE_SAUDE);

/*==============================================================*/
/* Table: USUARIO                                               */
/*==============================================================*/
create table USUARIO
(
   COD_USUARIO          bigint not null,
   NOM_USUARIO          varchar(100),
   NUM_CPF              varchar(20),
   NUM_SENHA            varchar(50),
   NUM_TELEFONE         varchar(20)
);

alter table USUARIO
   add primary key (COD_USUARIO);

/*==============================================================*/
/* Table: USUARIO_UNIDADE_DE_SAUDE                              */
/*==============================================================*/
create table USUARIO_UNIDADE_DE_SAUDE
(
   COD_USUARIO_UNIDADE_DE_SAUDE integer not null,
   COD_USUARIO          bigint not null,
   COD_UNIDADE_DE_SAUDE integer not null
);

alter table USUARIO_UNIDADE_DE_SAUDE
   add primary key (COD_USUARIO_UNIDADE_DE_SAUDE);

alter table AUTOR_NOTICIA add constraint FK_FK_AUTOR_AUTOR_NOTICIA foreign key (COD_AUTOR)
      references AUTOR (COD_AUTOR) on delete restrict on update restrict;

alter table AUTOR_NOTICIA add constraint FK_FK_NOTICIA_AUTOR_NOTICIA foreign key (COD_NOTICIA_)
      references NOTICIA (COD_NOTICIA_) on delete restrict on update restrict;

alter table CONVENIO_UNIDADE_DE_SAUDE add constraint FK_FK_CONVENIO_CONVENIO_UNIDADE_DE_SAUDE foreign key (COD_CONVENIO)
      references CONVENIO (COD_CONVENIO) on delete restrict on update restrict;

alter table CONVENIO_UNIDADE_DE_SAUDE add constraint FK_FK_UNIDADE_DE_SAUDE_CONVENIO_UNIDADE_DE_SAUDE foreign key (COD_UNIDADE_DE_SAUDE)
      references UNIDADE_DE_SAUDE (COD_UNIDADE_DE_SAUDE) on delete restrict on update restrict;

alter table ESPECIALIDADE_DA_UNIDADE_DE_SAUDE add constraint FK_COD_ESPECIALIDADED_ESPECIALIDADE_DA_UNIDADE_DE_SAUDE foreign key (COD_ESPECIALIDADE)
      references ESPECIALIDADE (COD_ESPECIALIDADE) on delete restrict on update restrict;

alter table ESPECIALIDADE_DA_UNIDADE_DE_SAUDE add constraint FK_FK_UNIDADE_DE_SAUDE_ESPECIALIDADE_DA_UNIDADE_DE_SAUDE foreign key (COD_UNIDADE_DE_SAUDE)
      references UNIDADE_DE_SAUDE (COD_UNIDADE_DE_SAUDE) on delete restrict on update restrict;

alter table LEMBRETE add constraint FK_FK_USUARIO_LEMBRETE foreign key (COD_USUARIO)
      references USUARIO (COD_USUARIO) on delete restrict on update restrict;

alter table MEDICAMENTO add constraint FK_FK_BULA_MEDICAMENTO foreign key (COD_BULA)
      references BULA (COD_BULA) on delete restrict on update restrict;

alter table MEDICAMENTO add constraint FK_FK_LEMBRETE_MEDICAMENTO foreign key (COD_LEMBRETE_)
      references LEMBRETE (COD_LEMBRETE_) on delete restrict on update restrict;

alter table MEDICAMENTO add constraint FK_FK_TARJA_MEDICAMENTO foreign key (COD_TARJA)
      references TARJA (COD_TARJA) on delete restrict on update restrict;

alter table NOTICIA add constraint FK_FK_EDITORA_NOTICIA foreign key (COD_EDITORA)
      references EDITORA (COD_EDITORA) on delete restrict on update restrict;

alter table NOTICIA add constraint FK_FK_USUARIO_NOTICIA foreign key (COD_USUARIO)
      references USUARIO (COD_USUARIO) on delete restrict on update restrict;

alter table UNIDADE_DE_SAUDE add constraint FK_FK_ENDERECO_UNIDADE_DE_SAUDE foreign key (COD_ENDERECO)
      references ENDERECO (COD_ENDERECO) on delete restrict on update restrict;

alter table UNIDADE_DE_SAUDE add constraint FK_FK_STATUS_UNIDADE_DE_SAUDE_UNIDADE_DE_SAUDE foreign key (COD_STATUS_UNIDADE_DE_SAUDE)
      references STATUS_UNIDADE_DE_SAUDE (COD_STATUS_UNIDADE_DE_SAUDE) on delete restrict on update restrict;

alter table UNIDADE_DE_SAUDE add constraint FK_FK_TIPO_UNIDADE_DE_SAUDE_UNIDADE_DE_SAUDE foreign key (COD_TIPO_UNIDADE_DE_SAUDE)
      references TIPO_UNIDADE_DE_SAUDE (COD_TIPO_UNIDADE_DE_SAUDE) on delete restrict on update restrict;

alter table USUARIO_UNIDADE_DE_SAUDE add constraint FK_FK_UNIDADE_DE_SAUDE_USUARIO_UNIDADE_DE_SAUDE foreign key (COD_UNIDADE_DE_SAUDE)
      references UNIDADE_DE_SAUDE (COD_UNIDADE_DE_SAUDE) on delete restrict on update restrict;

alter table USUARIO_UNIDADE_DE_SAUDE add constraint FK_FK_USUARIO_USUARIO_UNIDADE_DE_SAUDE foreign key (COD_USUARIO)
      references USUARIO (COD_USUARIO) on delete restrict on update restrict;

