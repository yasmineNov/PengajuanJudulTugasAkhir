/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     07/01/2020 19:02:17                          */
/*==============================================================*/


drop table if exists Dospem;

drop table if exists Judul;

drop table if exists KeputusanDospem;

drop table if exists KeputusanProdi;

drop table if exists Mahasiswa;

drop table if exists Prodi;

/*==============================================================*/
/* Table: Dospem                                                */
/*==============================================================*/
create table Dospem
(
   npp                  varchar(254) not null,
   nama                 varchar(254),
   nik                  varchar(254),
   jenisKelamin         varchar(254),
   tanggalLahir         varchar(254),
   alamat               varchar(254),
   noTelp               varchar(254),
   email                varchar(254),
   agama                varchar(254),
   primary key (npp)
);

/*==============================================================*/
/* Table: Judul                                                 */
/*==============================================================*/
create table Judul
(
   idJudul              int not null,
   nim                  varchar(254) not null,
   npp			varchar(254) not null,
   namaJudul            varchar(254),
   deskripsi            varchar(254),
   TglPengajuan		Date,
   primary key (idJudul)
);

/*==============================================================*/
/* Table: KeputusanDospem                                       */
/*==============================================================*/
create table KeputusanDospem
(
   idKeputusanDospem    int not null,
   npp                  varchar(254) not null,
   idJudul              int not null,
   statusDospem         bool,
   tglAccDosen		Date,
   primary key (idKeputusanDospem)
);

/*==============================================================*/
/* Table: KeputusanProdi                                        */
/*==============================================================*/
create table KeputusanProdi
(
   idKeputusanProdi     int not null,
   idProdi              int not null,
   idJudul              int not null,
   statusProdi          bool,
   tglAccProdi		Date,
   primary key (idKeputusanProdi)
);

/*==============================================================*/
/* Table: Mahasiswa                                             */
/*==============================================================*/
create table Mahasiswa
(
   nim                  varchar(254) not null,
   idProdi              int,
   nama                 varchar(254),
   nik                  varchar(254),
   jenisKelamin         varchar(254),
   tanggalLahir         varchar(254),
   alamat               varchar(254),
   noTelp               varchar(254),
   email                varchar(254),
   agama                varchar(254),
   primary key (nim)
);

/*==============================================================*/
/* Table: Prodi                                                 */
/*==============================================================*/
create table Prodi
(
   idProdi              int not null,
   namaProdi            varchar(254),
   primary key (idProdi)
);

alter table Judul add constraint FK_judulMhs foreign key (nim)
      references Mahasiswa (nim) on delete restrict on update restrict;

alter table Judul add constraint FK_dosenToJudul foreign key (npp)
      references Dospem (npp) on delete restrict on update restrict;

alter table KeputusanDospem add constraint FK_accDospem foreign key (npp)
      references Dospem (npp) on delete restrict on update restrict;

alter table KeputusanDospem add constraint FK_judulAccDosen foreign key (idJudul)
      references Judul (idJudul) on delete restrict on update restrict;

alter table KeputusanProdi add constraint FK_putusanJudul foreign key (idJudul)
      references Judul (idJudul) on delete restrict on update restrict;

alter table KeputusanProdi add constraint FK_accProdi foreign key (idProdi)
      references Prodi (idProdi) on delete restrict on update restrict;

alter table Mahasiswa add constraint FK_mhsToProdi foreign key (idProdi)
      references Prodi (idProdi) on delete restrict on update restrict;



/*==============================================================*/
/* Table: Login                                                 */
/*==============================================================*/
create table Login
(
   idLogin              varchar(254) not null,
   Password            	varchar(254),
   typeLogin		varchar(254),
   primary key (idLogin)
);
