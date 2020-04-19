
@Regresion
Feature: Plataforma de Transferencia Bancaria
				 Portal de transacciones ACH para los distintos canales SVP/APP

  @Caso1
  Scenario: Visualizar resumenes enviados
    Given Yo como analista deseo ingresar a ptb con usuario  y password
    And   lograr ingresar a la opcion visualizar resumenes enviados
    When selecciono la fecha a validar de operaciones enviadas a consultar
    Then valido la informacion mostrada en la tabla de resumenes enviadas
    And lo comparo con el total enviado de operaciones ach del dia consultado

