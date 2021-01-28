#language:es
Característica: registrar usuario

  Como usuario
  Necesito realizar el registro
  Para iniciar sesion

  Escenario: Completar exitosamente un registro
    Dado que el usuario esta en la pagina de utest
    Cuando completa el formulario de registro
      | nombre   | apellido | email                      | mesNacimiento | diaNacimiento | anioNacimiento | idioma  | sistemaOperativo | versionSO | idiomaSO | clave         | confirmarClave |
      | Santiago | Rios     | santiagorios20720@gmail.com | April         | 12            | 1992           | Spanish | Linux            | Ubuntu    | Spanish  | D-Testing2020 | D-Testing2020  |
    Entonces el visualizara el mensaje Welcome to the world's largest community of freelance software testers!