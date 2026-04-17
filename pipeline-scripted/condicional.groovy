 node {
    stage('condicional') {
        def ejecutar = true

        if (ejecutar) {
            echo 'Ejecutando el bloque de código...'
        } else {
            echo 'No se ejecutará el bloque de código.'
        }
    }
 }