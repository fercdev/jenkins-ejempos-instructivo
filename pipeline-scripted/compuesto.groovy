node {
    stage('Init') {
        echo 'Init stage'
    }

    stage('Condicion') {
        def env = "dev"

        if (env == "prod") {
            echo "Desplegando en prod"
        } else {
            echo "No realizar deploy.."
        }
    }

    stage('Paralelo') {
        parallel(
            "Tarea 1": {
                echo "Ejecutando tarea 1"
            },
            "Tarea 2": {
                echo "Ejecutando tarea 2"
            }
        )
    }

    stage('Final') {
        echo 'Final stage'
    }
}