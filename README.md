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
En la carpeta Values en el archivo llamado `colors.xml` se agregaron colores
```xml
<?xml version="1.0" encoding="utf-8"?>
<resources>
    <color name="purple_200">#FFBB86FC</color>
    <color name="purple_500">#FF6200EE</color>
    <color name="purple_700">#FF3700B3</color>
    <color name="teal_200">#FF03DAC5</color>
    <color name="teal_700">#FF018786</color>
    <color name="black">#FF000000</color>
    <color name="white">#FFFFFFFF</color>
    <color name="Teal_Blue">#043c5c</color>
    <color name="Gothic">#7294a4</color>
    <color name="Heather">#c6d1d9</color>
    <color name="astronaut">#245470</color>
</resources>
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
│    │                ├── noticias 
│    │                └── # MainActivity
│    │
│    ├── com.cibertec.cibertecapp (androidTest)   
│    └── com.cibertec.cibertecapp (test) 
│   
├── res
│    ├── drawable
│    ├── layout
│    │     ├── # activity_login.xml
│    │     ├── # activity_main.xml
│    │     ├── # activity_noticias.xml
│    │     └── # item_noticia.xml
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

## Semana 02 
En esta semana seguimos en la practica de la semana 01 sobre las vistas, pero en esta ocasion mostramos una lista de noticias y usamos mas las clases que son la parte logica de la aplicación.

![noticias](/public/noticias.jpg)

## Semana 03
En esta semana nos centramos en cambiar la perspectiva del como usar los Linear Layout para mostrar un listado. (A continuacion se muetran los tipos de ordenamiento que se enseñaron en clase)
```kotlin
             layoutManager = LinearLayoutManager(context)
             layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
             layoutManager = GridLayoutManager(context, 2)
             layoutManager = StaggeredGridLayoutManager(2, LinearLayoutManager.VERTICAL)
```
![libros](/public/libros.jpg)
