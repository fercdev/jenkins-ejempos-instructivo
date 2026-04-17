node {
    stage('parallel') {
        parallel(
            A: {
                echo 'Tarea A'
                sh 'sleep 5' // Simulamos una tarea que tarda 5 segundos
            },
            B: {
                echo 'Tarea B'
                sh 'sleep 3' // Simulamos una tarea que tarda 3 segundos
            },
        )
    }
}