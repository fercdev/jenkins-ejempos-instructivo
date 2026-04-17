 node {
    stage('Iteraciones') {
        for (int i = 0; i < 5; i++) {
            echo "Iteración ${i}"
        }
    }
 }