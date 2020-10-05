CREATE DATABASE desafio_publica;
USE desafio_publica;
CREATE TABLE partidas (
int not null auto_increment primary key,
int not null placar,
int not null minimoTemporada,
int not null maximoTemporada,
tinyint quebraRecordeMinimo,
tinyint quebraRecordeMaximo
)
