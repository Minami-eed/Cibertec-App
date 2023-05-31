# Desarrollo de Aplicaciónes Moviles I
![logo](/public/logo.jpg)

## Algunas modificaciones inciales
En la parte de dependecias del Archivo `build.gradle (Module :app)` se han cambiado las versiones de esas dos lineas para tener el diseño usado en clase
```Groovy
dependencies {
    implementation 'androidx.core:core-ktx:1.7.0'
    implementation 'com.google.android.material:material:1.8.0'
}
```

## Estructura del Proyecto
```
$app
├── manifests
│    └── # AndroidManifests.xml
│
├── java
│    ├── com.cibertec.cibertecapp
│    │                ├── login
│    │                │     └── # LoginActivity
│    │                └── # MainActivity
│    │
│    ├── com.cibertec.cibertecapp (androidTest)   
│    └── com.cibertec.cibertecapp (test) 
│   
├── res
│    ├── drawable
│    ├── layout
│    │     ├── # activity_login.xml
│    │     └── # activity_main.xml
│    │
│    ├── mipmap
│    ├── values
│    └── xml
│
└── res (generated)
```

## Bienvenida
Hola a todos, soy Minami y hoy les voy a hablar de un curso que les enseñará cómo crear aplicaciones usando Android Studio y el lenguaje Kotlin. Android Studio es un entorno de desarrollo integrado (IDE) que facilita la creación de aplicaciones para dispositivos Android. Kotlin es un lenguaje de programación moderno, conciso y seguro que se puede usar con Android Studio. En este curso, aprenderán los conceptos básicos de Android Studio y Kotlin, cómo diseñar interfaces de usuario, cómo acceder a datos y servicios web, cómo usar sensores y mapas, y cómo publicar sus aplicaciones en la tienda de Google Play. Si les interesa aprender a crear aplicaciones para Android con Android Studio y Kotlin, echenle un vistazo a los commit's ya que esto se actualizara cada semana.

## Semana 01
La clase se enfocó en la elaboración de una vista llamada Login, que es la pantalla que permite al usuario ingresar sus credenciales para acceder a la aplicación. Para crear esta vista se utilizaron dos elementos principales: el diseño y la programación.

![login](/public/login.jpg)
