def saludar(nombre) {
    echo "Hola, ${nombre}!"
}


node {
    stage('Funciones') {
        for (int i = 0; i < 5; i++) {
            saludar("Usuario: ${i}")
        }

        saludar("Luis Fernando")
    }
 }