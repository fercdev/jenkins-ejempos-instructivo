
node {
    stage('try-catch') {
        try {
            sh 'exit 1' // Simulamos un error
        } catch (e) {
            echo "Se ha producido un error: ${e.getMessage()}"
            currentBuild.result = 'FAILURE' // Marcamos el build como fallido
        }
    }
 }