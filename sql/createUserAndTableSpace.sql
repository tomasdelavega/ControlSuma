
--------------------------------------------------------
-- Se crea el usurio de la BBDD 
--------------------------------------------
create user CONTROLSUMA identified by CONTROLSUMA;
grant all privileges to CONTROLSUMA;

--Se debe crear la carpeta CONTROLSUMA en C:\oraclexe\app\oracle\oradata

CREATE TABLESPACE D_CONTROLSUMA_DATA DATAFILE 'C:\oraclexe\app\oracle\oradata\CONTROLSUMA\controlsuma_data.dbf' SIZE 900M EXTENT MANAGEMENT LOCAL autoallocate SEGMENT SPACE MANAGEMENT AUTO;
#Este tablespace puede tener un tamaño mucho menor si se desea
CREATE TABLESPACE D_CONTROLSUMA_INDEX DATAFILE 'C:\oraclexe\app\oracle\oradata\CONTROLSUMA\controlsuma_index.dbf' SIZE 100M EXTENT MANAGEMENT LOCAL autoallocate SEGMENT SPACE MANAGEMENT AUTO;


--CREATE TABLESPACE D_CONTROLSUMA_DATA DATAFILE '/u01/app/oracle/oradata/CONTROL_SUMA\control_suma_data.dbf' SIZE 900M EXTENT MANAGEMENT LOCAL autoallocate SEGMENT SPACE MANAGEMENT AUTO;
--CREATE TABLESPACE D_CONTROLSUMA_INDEX DATAFILE '/u01/app/oracle/oradata/CONTROL_SUMA\controlsuma_index.dbf' SIZE 100M EXTENT MANAGEMENT LOCAL autoallocate SEGMENT SPACE MANAGEMENT AUTO;
