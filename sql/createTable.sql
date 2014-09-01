
-- Archivo creado  - Domingo -julio-20-2014   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Sequence SEQ_ENTORNO
--------------------------------------------------------

   CREATE SEQUENCE  "SEQ_ENTORNO"  MINVALUE 1 MAXVALUE 999999999999999999999999999 INCREMENT BY 1 START WITH 1 NOCACHE  NOORDER  NOCYCLE ;
--------------------------------------------------------
--  DDL for Sequence SEQ_INVENTARIO
--------------------------------------------------------
   
   CREATE SEQUENCE  "SEQ_INVENTARIO"  MINVALUE 1 MAXVALUE 999999999999999999999999999 INCREMENT BY 1 START WITH 837 NOCACHE  NOORDER  NOCYCLE ;

   --------------------------------------------------------
--  DDL for Sequence SEQ_INVENTARIO_OTRAS
--------------------------------------------------------

   CREATE SEQUENCE  "SEQ_INVENTARIO_OTRAS"  MINVALUE 1 MAXVALUE 999999999999999999999999999 INCREMENT BY 1 START WITH 837 NOCACHE  NOORDER  NOCYCLE ;
   --------------------------------------------------------
--  DDL for Sequence SEQ_PERSONA
--------------------------------------------------------

   CREATE SEQUENCE  "SEQ_PERSONA"  MINVALUE 1 MAXVALUE 999999999999999999999999999 INCREMENT BY 1 START WITH 1 NOCACHE  NOORDER  NOCYCLE ;
--------------------------------------------------------
--  DDL for Sequence SEQ_TECNOLOGIA
--------------------------------------------------------

   CREATE SEQUENCE  "SEQ_TECNOLOGIA"  MINVALUE 1 MAXVALUE 999999999999999999999999999 INCREMENT BY 1 START WITH 1 NOCACHE  NOORDER  NOCYCLE ;
   
   
   --------------------------------------------------------
--  DDL for Sequence SEQ_AREA_FUNCIONAL
--------------------------------------------------------

   CREATE SEQUENCE  "SEQ_AREA_FUNCIONAL"  MINVALUE 1 MAXVALUE 999999999999999999999999999 INCREMENT BY 1 START WITH 1 NOCACHE  NOORDER  NOCYCLE ;
   
    --------------------------------------------------------
--  DDL for Sequence SEQ_ROL
--------------------------------------------------------

   CREATE SEQUENCE  "SEQ_ROL"  MINVALUE 1 MAXVALUE 999999999999999999999999999 INCREMENT BY 1 START WITH 1 NOCACHE  NOORDER  NOCYCLE ;
--------------------------------------------------------
--  DDL for Table TB_ENTORNO
--------------------------------------------------------

  CREATE TABLE "TB_ENTORNO" 
   (	"X_ENTORNO" NUMBER(8,0), 
	"T_ENTORNO" VARCHAR2(3 BYTE), 
	"T_URL" VARCHAR2(300 BYTE), 
	"T_RUTA_LOG" VARCHAR2(300 BYTE), 
	"T_DATOS_BBDD" VARCHAR2(300 BYTE), 
	"T_SERVIDOR_DESPLIEGUE" VARCHAR2(500 BYTE), 
	"T_CONF_LDAP" VARCHAR2(300 BYTE), 
	"T_RUTA_SVN" VARCHAR2(300 BYTE), 
	"T_VERSION_JAVA" VARCHAR2(50 BYTE), 
	"T_HERRAMIENTA_CONSTRUCCION" VARCHAR2(100 BYTE), 
	"T_FRAMEWORKS" VARCHAR2(300 BYTE), 
	"T_OBSERVACIONES" VARCHAR2(500 BYTE), 
	"INV_X_INVENTARIO" NUMBER(8,2), 
	"F_ALTA" DATE  DEFAULT (SYSDATE), 
	"F_ULT_MOD" DATE DEFAULT (SYSDATE)  --  Fecha de �ltima modificaci�n

   ) ;

   COMMENT ON COLUMN "TB_ENTORNO"."X_ENTORNO" IS 'Clave primaria autonum�rica sin significado ';
   COMMENT ON COLUMN "TB_ENTORNO"."T_ENTORNO" IS 'Tipo  de entorno (DES:Desarrollo, PRE:PreProducci�n, PRO: Producci�n)';
   COMMENT ON COLUMN "TB_ENTORNO"."T_URL" IS 'Url de acceso a la aplicaci�n';
   COMMENT ON COLUMN "TB_ENTORNO"."T_RUTA_LOG" IS 'Ruta donde est�n los log en el servidor';
   COMMENT ON COLUMN "TB_ENTORNO"."T_DATOS_BBDD" IS 'Datos de acceso a la base de datos';
   COMMENT ON COLUMN "TB_ENTORNO"."T_SERVIDOR_DESPLIEGUE" IS 'Datos de acceso al servidor de despliegue';
   COMMENT ON COLUMN "TB_ENTORNO"."T_CONF_LDAP" IS 'Datos de Acceso al LDAP';
   COMMENT ON COLUMN "TB_ENTORNO"."T_RUTA_SVN" IS 'Ruta de acceso al SVN';
   COMMENT ON COLUMN "TB_ENTORNO"."T_VERSION_JAVA" IS 'Versi�n JAVA';
   COMMENT ON COLUMN "TB_ENTORNO"."T_HERRAMIENTA_CONSTRUCCION" IS 'Herramientas de contruccci�n de proyectos utilizada';
   COMMENT ON COLUMN "TB_ENTORNO"."T_FRAMEWORKS" IS 'Frameworks de desarrollo que se utiliza';
   COMMENT ON COLUMN "TB_ENTORNO"."T_OBSERVACIONES" IS 'Observaciones/comentarios observadas sobre el entorno';
   COMMENT ON COLUMN "TB_ENTORNO"."INV_X_INVENTARIO" IS 'Clave ajena a la aplicaci�n a la que se hace referencia';
   COMMENT ON COLUMN "TB_ENTORNO"."F_ALTA" IS 'Fecha de alta en el sistema';
   COMMENT ON TABLE "TB_ENTORNO"  IS 'Tabla de los distintos entornos de la aplicaci�pm';
--------------------------------------------------------
--  DDL for Table TB_INVENTARIO
--------------------------------------------------------

  CREATE TABLE "TB_INVENTARIO" 
   (	"X_INVENTARIO" NUMBER(8,0), 
	"T_INVENTARIO" VARCHAR2(100 BYTE), 
	"T_COD_INVENTARIO" VARCHAR2(50 BYTE), 
	"T_COD_JIRA" VARCHAR2(50 BYTE),
	"T_DESCRIPCION" VARCHAR2(500 BYTE), 
	"T_VERSION" VARCHAR2(10 BYTE), 
	"AFU_X_AREA_FUNCIONAL" NUMBER(8,0), 
	"T_SUB_AREA_FUNCIONAL" VARCHAR2(200 BYTE), 
	"L_ACTIVO" NUMBER(1,0) DEFAULT 1, 
	"T_OBSERVACIONES" VARCHAR2(500 BYTE), 
	"PER_X_RESPONSABLE_GOB" NUMBER(8,0), 
	"PER_X_RESPONSABLE_SUMA" NUMBER(8,0), 
	"TEC_X_TECNOLOGIA" NUMBER(8,0), 
	"PER_X_USUARIO_FINAL" NUMBER(8,0), 
	"F_ALTA" DATE  DEFAULT (SYSDATE), 
	"F_ULT_MOD" DATE  DEFAULT (SYSDATE)
   );

   COMMENT ON COLUMN "TB_INVENTARIO"."X_INVENTARIO" IS 'Clave primaria autonum�rica sin significado';
   COMMENT ON COLUMN "TB_INVENTARIO"."T_INVENTARIO" IS 'Nombre de la aplicaci�n';
   COMMENT ON COLUMN "TB_INVENTARIO"."T_COD_INVENTARIO" IS 'C�digo identificativo de la aplicacion';
   COMMENT ON COLUMN "TB_INVENTARIO"."T_DESCRIPCION" IS 'Descripci�n larga asociada a la aplicaci�n';
   COMMENT ON COLUMN "TB_INVENTARIO"."L_ACTIVO" IS 'Inventario Activo';
   COMMENT ON COLUMN "TB_INVENTARIO"."PER_X_RESPONSABLE_GOB" IS 'Responsable de la aplicaci�n en el Gobierno';
   COMMENT ON COLUMN "TB_INVENTARIO"."PER_X_RESPONSABLE_SUMA" IS 'Responsable de la aplicaci�n en SUMA';
   COMMENT ON COLUMN "TB_INVENTARIO"."TEC_X_TECNOLOGIA" IS 'Tegnolog�a de la aplicaci�n';
   COMMENT ON COLUMN "TB_INVENTARIO"."PER_X_USUARIO_FINAL" IS 'Usuario final en la aplicaCi�n en Gobierno';
   COMMENT ON COLUMN "TB_INVENTARIO"."F_ALTA" IS 'Fecha de alta en el sistema';
   COMMENT ON COLUMN "TB_INVENTARIO"."F_ULT_MOD" IS 'Fecha de �ltima modificaci�n';
   COMMENT ON COLUMN "TB_INVENTARIO"."T_COD_JIRA"  IS 'C�digo en JIRA';
   COMMENT ON TABLE "TB_INVENTARIO"  IS 'Tabla de Inventario de las  diversas aplicaciones';

   

--------------------------------------------------------
--  DDL for Table TB_�REA FUNCIONAL
---------------------------------------------------------
   
     CREATE TABLE "TB_AREA_FUNCIONAL" 
   (	"X_AREA_FUNCIONAL" NUMBER(8,0), 
	"T_AREA_FUNCIONAL" VARCHAR2(100 BYTE), 
	"F_ALTA" DATE  DEFAULT (SYSDATE), 
	"F_ULT_MOD" DATE  DEFAULT (SYSDATE)
   ); 
   
    COMMENT ON COLUMN "TB_AREA_FUNCIONAL"."X_AREA_FUNCIONAL" IS 'Clave primaria autonum�rica sin significado';
	COMMENT ON COLUMN "TB_AREA_FUNCIONAL"."T_AREA_FUNCIONAL" IS 'Nombre del �rea';
    COMMENT ON COLUMN "TB_INVENTARIO"."F_ALTA" IS 'Fecha de alta en el sistema';
    COMMENT ON COLUMN "TB_INVENTARIO"."F_ULT_MOD" IS 'Fecha de �ltima modificaci�n';
    COMMENT ON TABLE "TB_AREA_FUNCIONAL"  IS 'Tabla de �rea Funcional';

--------------------------------------------------------
--  DDL for Table TB_INVENTARIO_OTRAS
--------------------------------------------------------

  CREATE TABLE "TB_INVENTARIO_OTRAS" 
   (	"X_INVENTARIO" NUMBER(8,0), 
	"T_TIPO_TRANSICION" VARCHAR2(30 BYTE), 
	"L_MANT_CORRECTIVO_PREVISTO" NUMBER(1,0), 
	"T_CORRECTIVO" VARCHAR2(500 BYTE), 
	"L_MANT_EVOLUTIVO_PREVISTO" NUMBER(1,0), 
	"T_EVOLUTIVO" VARCHAR2(500 BYTE), 
	"T_NIVEL_INCIDENCIAS" VARCHAR2(10 BYTE), 
	"T_PERIODO_USO_APLICACION" VARCHAR2(100 BYTE), 
	"L_DOC_ANALISIS_FUNCIONAL" NUMBER(1,0), 
	"L_DOC_DISENO_TECNICO" NUMBER(1,0), 
	"L_DOC_PLAN_PRUEBAS" NUMBER(1,0), 
	"L_DOC_MANUAL_INSTALACION" NUMBER(1,0), 
	"T_DOC_OTRA" VARCHAR2(500 BYTE), 
	"T_RUTA_DOC" VARCHAR2(255 BYTE), 
	"T_NIVEL_CALIDAD_CODIGO" VARCHAR2(100 BYTE), 
	"L_TRABAJOS_VUELO" NUMBER(1,0), 
	"T_TRABAJOS_VUELO" VARCHAR2(500 BYTE), 
	"T_INVENTARIO" VARCHAR2(500 BYTE), 
	"T_OBSERVACIONES" VARCHAR2(500 BYTE), 
    "F_ALTA" DATE  DEFAULT (SYSDATE), 
	"F_ULT_MOD" DATE  DEFAULT (SYSDATE)
   ) ;

   COMMENT ON COLUMN "TB_INVENTARIO_OTRAS"."X_INVENTARIO" IS 'Clave primaria autonum�rica sin significado';
   COMMENT ON COLUMN "TB_INVENTARIO_OTRAS"."T_TIPO_TRANSICION" IS 'Tipo de Transici�n (Acelerada,Est�ndar,Extendida)';
   COMMENT ON COLUMN "TB_INVENTARIO_OTRAS"."L_MANT_CORRECTIVO_PREVISTO" IS 'Si esta previsto el mantenimiento correctivo de la aplicaci�n';
   COMMENT ON COLUMN "TB_INVENTARIO_OTRAS"."T_CORRECTIVO" IS 'Texto para explicar el mantenimiento correctivo de la aplicaci�n';
   COMMENT ON COLUMN "TB_INVENTARIO_OTRAS"."L_MANT_EVOLUTIVO_PREVISTO" IS 'Si esta previsto el mantenimiento correctivo de la aplicaci�n';
   COMMENT ON COLUMN "TB_INVENTARIO_OTRAS"."T_EVOLUTIVO" IS 'Texto para explicar el mantenimiento evolutivo de la aplicaci�n';
   COMMENT ON COLUMN "TB_INVENTARIO_OTRAS"."T_NIVEL_INCIDENCIAS" IS 'Nivel de incidencia ( Cr�tico/Medio/Bajo/Nulo)';
   COMMENT ON COLUMN "TB_INVENTARIO_OTRAS"."T_PERIODO_USO_APLICACION" IS 'Periodo de uso de la aplicaci�n (Final de mes, Final de a�o, mes desde/hasta; etc.))';
   COMMENT ON COLUMN "TB_INVENTARIO_OTRAS"."L_DOC_ANALISIS_FUNCIONAL" IS 'Si existe la documentaci�n del An�lisis funcional';
   COMMENT ON COLUMN "TB_INVENTARIO_OTRAS"."L_DOC_DISENO_TECNICO" IS 'Si existe la documentaci�n del dise�o t�cnico';
   COMMENT ON COLUMN "TB_INVENTARIO_OTRAS"."L_DOC_PLAN_PRUEBAS" IS 'Si existe la documentaci�n del plan de pruebas';
   COMMENT ON COLUMN "TB_INVENTARIO_OTRAS"."L_DOC_MANUAL_INSTALACION" IS 'Si existe la documentaci�n manual de instalaci�n y puesta en producci�n';
   COMMENT ON COLUMN "TB_INVENTARIO_OTRAS"."T_DOC_OTRA" IS 'Si existe cualquier otra documentaci�n';
   COMMENT ON COLUMN "TB_INVENTARIO_OTRAS"."T_RUTA_DOC" IS 'La ruta donde se encuentra registrada la documentaci�n de la aplicaci�n';
   COMMENT ON COLUMN "TB_INVENTARIO_OTRAS"."T_NIVEL_CALIDAD_CODIGO" IS 'Nivel del c�digo fuente (Bien estructurado, Realizado hace poco, Muy parcheado, Aplicaci�n adaptada de otra AAPP, etc.)';
   COMMENT ON COLUMN "TB_INVENTARIO_OTRAS"."L_TRABAJOS_VUELO" IS 'Si existe trabajos que se est�n realizando antes de la toma de  contol por parte de SUMA';
   COMMENT ON COLUMN "TB_INVENTARIO_OTRAS"."T_TRABAJOS_VUELO" IS 'Texto de  trabajos que se est�n realizando antes de la toma de  contol por parte de SUMA';
   COMMENT ON COLUMN "TB_INVENTARIO_OTRAS"."T_INVENTARIO" IS 'Inventarios de objetos por cada tecnolog�a';
   COMMENT ON COLUMN "TB_INVENTARIO_OTRAS"."T_OBSERVACIONES" IS 'Alguna otra informaci�n relevante de la aplicaci�n';
   COMMENT ON COLUMN "TB_INVENTARIO_OTRAS"."F_ALTA" IS 'Fecha de alta en el sistema';
   COMMENT ON COLUMN "TB_INVENTARIO_OTRAS"."F_ULT_MOD" IS 'Fecha de �ltima modificaci�n';
   COMMENT ON TABLE "TB_INVENTARIO_OTRAS"  IS 'Tabla de otras informaciones de la aplicaci�n a su recepci�n';
--------------------------------------------------------
--  DDL for Table TB_PERSONA
--------------------------------------------------------

  CREATE TABLE "TB_PERSONA" 
   (	"X_PERSONA" NUMBER(8,0), 
	"T_COD_PERSONA" VARCHAR2(30 BYTE), 
	"T_NOMBRE" VARCHAR2(50 BYTE), 
	"T_APELLIDO1" VARCHAR2(50 BYTE), 
	"T_APELLIDO2" VARCHAR2(50 BYTE), 
	"T_EMAIL" VARCHAR2(255 BYTE), 
	"T_TELEFONO_CONTACTO" VARCHAR2(30 BYTE), 
 	"ROL_X_ROL" NUMBER(8,0), 
    "F_ALTA" DATE  DEFAULT (SYSDATE), 
	"F_ULT_MOD" DATE  DEFAULT (SYSDATE),
	"F_BAJA" DATE  DEFAULT NULL, 
	"T_COD_JIRA" VARCHAR2(30 BYTE)
   ) ;

   COMMENT ON COLUMN "TB_PERSONA"."X_PERSONA" IS 'Clave primaria autonum�rica sin significado';
   COMMENT ON COLUMN "TB_PERSONA"."T_COD_PERSONA" IS 'C�digo identificativo de la Persona (comunicaci�n otras fuentes)';
   COMMENT ON COLUMN "TB_PERSONA"."T_NOMBRE" IS 'Nombre de la Persona';
   COMMENT ON COLUMN "TB_PERSONA"."T_APELLIDO1" IS 'Apellido 1 de la Persona';
   COMMENT ON COLUMN "TB_PERSONA"."T_APELLIDO2" IS 'Apellido 2 de la Persona';
   COMMENT ON COLUMN "TB_PERSONA"."T_EMAIL" IS 'Email de la Persona';
   COMMENT ON COLUMN "TB_PERSONA"."T_TELEFONO_CONTACTO" IS 'T�lefono de Contacto de la Persona';
   COMMENT ON COLUMN "TB_PERSONA"."ROL_X_ROL" IS 'Tipo de Responsable (G:Gobierno,S:Suma,U:Usuario Final) ';
   COMMENT ON COLUMN "TB_PERSONA"."F_ALTA" IS 'Fecha de alta en el sistema';
   COMMENT ON COLUMN "TB_PERSONA"."F_ULT_MOD" IS 'Fecha de �ltima modificaci�n';
   COMMENT ON COLUMN "TB_PERSONA"."F_BAJA" IS 'Fecha de baja en el sistema';
   COMMENT ON COLUMN "TB_PERSONA"."T_COD_JIRA"  IS 'C�digo en JIRA';
   COMMENT ON TABLE "TB_PERSONA"  IS 'Personas Responsable en el Gobierno ';
   
   
   --------------------------------------------------------
--  DDL for Table TB_ROL
--------------------------------------------------------
CREATE TABLE "TB_ROL" 
   (	"X_ROL" NUMBER(8,0), 
	"T_ROL" VARCHAR2(50 BYTE), 
    "F_ALTA" DATE  DEFAULT (SYSDATE), 
	"F_ULT_MOD" DATE  DEFAULT (SYSDATE)
   ) ;

    COMMENT ON COLUMN "TB_ROL"."X_ROL" IS 'Clave primaria autonum�rica sin significado';
    COMMENT ON COLUMN "TB_ROL"."T_ROL" IS 'Nombre descriptivo del ROL';
    COMMENT ON COLUMN "TB_ROL"."F_ALTA" IS 'Fecha de alta en el sistema';
    COMMENT ON COLUMN "TB_ROL"."F_ULT_MOD" IS 'Fecha de �ltima modificaci�n';
    COMMENT ON TABLE "TB_ROL"  IS 'Roles en las aplicaciones';
--------------------------------------------------------
--  DDL for Table TB_TECNOLOGIA
--------------------------------------------------------

  CREATE TABLE "TB_TECNOLOGIA" 
   (	"X_TECNOLOGIA" NUMBER(8,0), 
	"T_COD_TECNOLOGIA" VARCHAR2(50 BYTE), 
	"T_DESCRIPCION" VARCHAR2(500 BYTE), 
	"F_ALTA" DATE  DEFAULT (SYSDATE),  --  Fecha de alta en el sistema
	"F_ULT_MOD" DATE  DEFAULT (SYSDATE)
   ) ;

   COMMENT ON COLUMN "TB_TECNOLOGIA"."X_TECNOLOGIA" IS 'Clave primaria autonum�rica sin significado';
   COMMENT ON COLUMN "TB_TECNOLOGIA"."T_COD_TECNOLOGIA" IS 'C�digo identificativo de la tecnologia';
   COMMENT ON COLUMN "TB_TECNOLOGIA"."T_DESCRIPCION" IS 'Descripci�n de la tecnolog�a';
   COMMENT ON COLUMN "TB_TECNOLOGIA"."F_ALTA" IS 'Fecha de alta en el sistema';
    COMMENT ON COLUMN "TB_TECNOLOGIA"."F_ULT_MOD" IS 'Fecha de �ltima modificaci�n';
   COMMENT ON TABLE "TB_TECNOLOGIA"  IS 'Tecnolog�as de las aplicaciones';
--------------------------------------------------------
--  DDL for Table TR_INVENTARIO_PERSONA
--------------------------------------------------------

  CREATE TABLE "TR_INVENTARIO_PERSONA" 
   (	"INV_X_INVENTARIO" NUMBER(8,0), 
	"PER_X_PERSONA" NUMBER(8,0), 
	"F_ALTA" DATE  DEFAULT (SYSDATE),  --  Fecha de alta en el sistema
	"F_ULT_MOD" DATE  DEFAULT (SYSDATE)
   ) ;
   COMMENT ON COLUMN "TR_INVENTARIO_PERSONA"."INV_X_INVENTARIO" IS 'Clave referencia a la tabla TB_INVENTARIO';
   COMMENT ON COLUMN "TR_INVENTARIO_PERSONA"."PER_X_PERSONA" IS 'Clave referencia a la tabla TB_PERSONAS';
   COMMENT ON COLUMN "TR_INVENTARIO_PERSONA"."F_ALTA" IS 'Fecha de alta en el sistema';
   COMMENT ON COLUMN "TR_INVENTARIO_PERSONA"."F_ULT_MOD" IS 'Fecha de �ltima modificaci�n';
   COMMENT ON TABLE "TR_INVENTARIO_PERSONA"  IS 'Tabla relaci�n de desarrolladores';
   
   -----------------------------------------------------
--  DDL for Index PK_X_INVENTARIO_OTRAS
--------------------------------------------------------

  CREATE UNIQUE INDEX "PK_X_INVENTARIO_OTRAS" ON "TB_INVENTARIO_OTRAS" ("X_INVENTARIO");
--------------------------------------------------------
--  DDL for Index PK_X_PERSONA
--------------------------------------------------------

  CREATE UNIQUE INDEX "PK_X_PERSONA" ON "TB_PERSONA" ("X_PERSONA");
--------------------------------------------------------
--  DDL for Index PK_X_ARE_FUNCIONAL
--------------------------------

  CREATE UNIQUE INDEX "PK_X_AREA_FUNCIONAL" ON "TB_AREA_FUNCIONAL" ("X_AREA_FUNCIONAL");
--------------------------------------------------------
--  DDL for Index PK_X_ENTORNO
--------------------------------------------------------

  CREATE UNIQUE INDEX "PK_X_ENTORNO" ON "TB_ENTORNO" ("X_ENTORNO");
--------------------------------------------------------
--  DDL for Index UK_COD_TECNOLOGIA
--------------------------------------------------------

  CREATE UNIQUE INDEX "UK_COD_TECNOLOGIA" ON "TB_TECNOLOGIA" ("T_COD_TECNOLOGIA") ;
--------------------------------------------------------
--  DDL for Index UK_COD_PERSONA
--------------------------------------------------------

  CREATE UNIQUE INDEX "UK_COD_PERSONA" ON "TB_PERSONA" ("T_COD_PERSONA");
  
  --------------------------------------------------------
--  DDL for Index UK_ROL
--------------------------------------------------------

  CREATE UNIQUE INDEX "UK_ROL" ON "TB_ROL" ("T_ROL");
--------------------------------------------------------
--  DDL for Index PK_X_TECNOLOGIA
--------------------------------------------------------

  CREATE UNIQUE INDEX "PK_X_TECNOLOGIA" ON "TB_TECNOLOGIA" ("X_TECNOLOGIA")  ;
--------------------------------------------------------
--  DDL for Index PK_X_INVENTARIO_PERSONA
--------------------------------------------------------

  CREATE UNIQUE INDEX "PK_X_INVENTARIO_PERSONA" ON "TR_INVENTARIO_PERSONA" ("INV_X_INVENTARIO", "PER_X_PERSONA") ;
--------------------------------------------------------
--  DDL for Index UK_COD_INVENTARIO
--------------------------------------------------------

  CREATE UNIQUE INDEX "UK_COD_INVENTARIO" ON "TB_INVENTARIO" ("T_COD_INVENTARIO") ;
--------------------------------------------------------
--  DDL for Index PK_X_INVENTARIO
--------------------------------------------------------

  CREATE UNIQUE INDEX "PK_X_INVENTARIO" ON "TB_INVENTARIO" ("X_INVENTARIO")  ;
--------------------------------------------------------
--  Constraints for Table TB_INVENTARIO_OTRAS
--------------------------------------------------------

  ALTER TABLE "TB_INVENTARIO_OTRAS" ADD CONSTRAINT "PK_X_INVENTARIO_OTRAS" PRIMARY KEY ("X_INVENTARIO");
  ALTER TABLE "TB_INVENTARIO_OTRAS" MODIFY ("X_INVENTARIO" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table TB_TECNOLOGIA
--------------------------------------------------------

  ALTER TABLE "TB_TECNOLOGIA" ADD CONSTRAINT "UK_COD_TECNOLOGIA" UNIQUE ("T_COD_TECNOLOGIA");
  ALTER TABLE "TB_TECNOLOGIA" ADD CONSTRAINT "PK_X_TECNOLOGIA" PRIMARY KEY ("X_TECNOLOGIA");
  ALTER TABLE "TB_TECNOLOGIA" MODIFY ("X_TECNOLOGIA" NOT NULL ENABLE);
  
  --------------------------------------------------------
--  Constraints for Table TB_AREA_FUNCIONAL
--------------------------------------------------------

  ALTER TABLE "TB_AREA_FUNCIONAL" ADD CONSTRAINT "PK_AREA_FUNCIONAL" PRIMARY KEY ("X_AREA_FUNCIONAL");
  ALTER TABLE "TB_AREA_FUNCIONAL" MODIFY ("X_AREA_FUNCIONAL" NOT NULL ENABLE);
    
  
--------------------------------------------------------
--  Constraints for Table TR_INVENTARIO_PERSONA
--------------------------------------------------------

  ALTER TABLE "TR_INVENTARIO_PERSONA" ADD CONSTRAINT "PK_X_INVENTARIO_PERSONA" PRIMARY KEY ("INV_X_INVENTARIO", "PER_X_PERSONA");
  ALTER TABLE "TR_INVENTARIO_PERSONA" MODIFY ("PER_X_PERSONA" NOT NULL ENABLE);
  ALTER TABLE "TR_INVENTARIO_PERSONA" MODIFY ("INV_X_INVENTARIO" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table TB_INVENTARIO
--------------------------------------------------------

  ALTER TABLE "TB_INVENTARIO" ADD CONSTRAINT "UK_COD_INVENTARIO" UNIQUE ("T_COD_INVENTARIO");
  ALTER TABLE "TB_INVENTARIO" ADD CONSTRAINT "PK_X_INVENTARIO" PRIMARY KEY ("X_INVENTARIO");
  ALTER TABLE "TB_INVENTARIO" MODIFY ("X_INVENTARIO" NOT NULL ENABLE);
  
    --------------------------------------------------------
--  Constraints for Table TB_ROL
--------------------------------------------------------

  ALTER TABLE "TB_ROL" ADD CONSTRAINT "PK_ROL" PRIMARY KEY ("X_ROL");
  ALTER TABLE "TB_ROL" MODIFY ("X_ROL" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table TB_PERSONA
--------------------------------------------------------

  ALTER TABLE "TB_PERSONA" ADD CONSTRAINT "UK_COD_PERSONA" UNIQUE ("T_COD_PERSONA");
  ALTER TABLE "TB_PERSONA" ADD CONSTRAINT "PK_X_PERSONA" PRIMARY KEY ("X_PERSONA");
  ALTER TABLE "TB_PERSONA" MODIFY ("X_PERSONA" NOT NULL ENABLE);
  
--------------------------------------------------------
--  Constraints for Table TB_ENTORNO
--------------------------------------------------------

  ALTER TABLE "TB_ENTORNO" ADD CONSTRAINT "PK_X_ENTORNO" PRIMARY KEY ("X_ENTORNO");
  ALTER TABLE "TB_ENTORNO" MODIFY ("X_ENTORNO" NOT NULL ENABLE);
--------------------------------------------------------
--  Ref Constraints for Table TB_ENTORNO
--------------------------------------------------------

  ALTER TABLE "TB_ENTORNO" ADD CONSTRAINT "INVENTARIOS_ENTORNOS" FOREIGN KEY ("INV_X_INVENTARIO")
	  REFERENCES "TB_INVENTARIO" ("X_INVENTARIO") ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table TB_INVENTARIO
--------------------------------------------------------

  ALTER TABLE "TB_INVENTARIO" ADD CONSTRAINT "INVENTARIOS_RESPONSABLE_GOB" FOREIGN KEY ("PER_X_RESPONSABLE_GOB")
	  REFERENCES "TB_PERSONA" ("X_PERSONA") ENABLE;
  ALTER TABLE "TB_INVENTARIO" ADD CONSTRAINT "INVENTARIOS_RESPONSABLE_SUMA" FOREIGN KEY ("PER_X_RESPONSABLE_SUMA")
	  REFERENCES "TB_PERSONA" ("X_PERSONA") ENABLE;
  ALTER TABLE "TB_INVENTARIO" ADD CONSTRAINT "INVENTARIOS_TECNOLOGIA" FOREIGN KEY ("TEC_X_TECNOLOGIA")
	  REFERENCES "TB_TECNOLOGIA" ("X_TECNOLOGIA") ENABLE;
	    ALTER TABLE "TB_INVENTARIO" ADD CONSTRAINT "INVENTARIOS_AREA_FUNCIONAL" FOREIGN KEY ("AFU_X_AREA_FUNCIONAL")
	  REFERENCES "TB_AREA_FUNCIONAL" ("X_AREA_FUNCIONAL") ENABLE;

------------------------------------------------------
--  Ref Constraints for Table TB_PERSONA
--------------------------------------------------------

  ALTER TABLE "TB_PERSONA" ADD CONSTRAINT "PERSONA_ROL" FOREIGN KEY ("ROL_X_ROL")
	  REFERENCES "TB_ROL" ("X_ROL") ENABLE;
	  
--------------------------------------------------------
--  Ref Constraints for Table TB_INVENTARIO_OTRAS
--------------------------------------------------------

  ALTER TABLE "TB_INVENTARIO_OTRAS" ADD CONSTRAINT "INVENTARIOS_OTRAS" FOREIGN KEY ("X_INVENTARIO")
	  REFERENCES "TB_INVENTARIO" ("X_INVENTARIO") ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table TR_INVENTARIO_PERSONA
--------------------------------------------------------

  ALTER TABLE "TR_INVENTARIO_PERSONA" ADD CONSTRAINT "INVENTARIOS_X_INVENTARIO" FOREIGN KEY ("INV_X_INVENTARIO")
	  REFERENCES "TB_INVENTARIO" ("X_INVENTARIO") ENABLE;
  ALTER TABLE "TR_INVENTARIO_PERSONA" ADD CONSTRAINT "INVENTARIOS_X_PERSONA" FOREIGN KEY ("PER_X_PERSONA")
	  REFERENCES "TB_PERSONA" ("X_PERSONA") ENABLE;
