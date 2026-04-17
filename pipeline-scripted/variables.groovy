node {
    stage('Variables') {
        def mensaje = "Hola, Jenkins!"
        echo mensaje
        
        // Variables de entorno
        env.MI_VARIABLE = "Valor de la variable de entorno"
        echo "Variable de entorno: ${env.MI_VARIABLE}"
       
    }
}