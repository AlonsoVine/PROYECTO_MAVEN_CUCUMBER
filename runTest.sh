#Este Script da fallo porque no tenemos permisos de administrador y no los puedo cambiar(chmod)

#EJECUTAMOS LOS TEST

#Ejecutamos los grupos:
.\mvnw clean test -Dgroups="smoke"
.\mvnw clean test -Dgroups="regression"

#Ejecuta el package
.\mvnw clean test -Dtest="pruebas.**"


# REALIZAMOS LOS TEST Y LEVANTAMOS LA SUITE DE SUREFIRE
.\mvnw clean test -Dgroups="smoke" surefire-report:report
.\mvnw clean test -Dgroups="regression" surefire-report:report
#podemos ver el reporte en la siguiente ubicacion:
#target/site/surefire-report.html


# REALIZAMOS LOS TEST Y LEVANTAMOS LA SUITE DE ALLURE
#da fallo porque no tenemos permisos(creo)
.\mvnw allure:serve

############################################################33
# Test de cumcumber por terminar agurpados por grupo
.\mvnw clean test -Dgroups=smoke
.\mvnw clean test -Dgroups=regression