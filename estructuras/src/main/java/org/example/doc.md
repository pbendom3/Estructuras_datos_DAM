# Práctica: Servicio de compra online en MERCADAM

![logo.png](..%2F..%2F..%2F..%2F..%2F..%2F..%2FDownloads%2Flogo.png)

## ÍNDICE

1. [Resumen](#resumen)
2. [Estructura de clases](#estructura-de-clases)
3. [Programa principal](#programa-principal)
4. [Pruebas](#pruebas)
5. [Entrega](#entrega)


## Resumen
> Este proyecto consiste en una app de compra online para un supermercado ficticio llamado **MERCADAM**.

El programa se divide en dos partes:
- **App de gestión**: crear clientes y productos.
- **App de zona de clientes**: autenticación, selección de productos y realización de pedidos.

## Estructura de clases

```` PlantUML
@startuml
class Estudiante {
  - nombre: String
  - curso: String
  - nia: int
  - email: String
  - librosPrestados: ArrayList<Libro>
  + getNombre(): String
  + getCurso(): String
  + getNia(): int
  + getEmail(): String
  + anyadirLibro(Libro): void
  + borrarLibro(Libro): void
}

class Libro {
  - titulo: String
  - autor: String
  - id: String
  - disponible: boolean
  - estudiantePrestado: Estudiante
  - editorial: Editorial
  + prestar(Estudiante): Prestamo
  + devolver(Estudiante): void
}

class Prestamo {
  - estudiante: Estudiante
  - libro: Libro
  - fecha: LocalDate
}

class Editorial {
  - nombre: String
  - pais: String
  - listaLibros: ArrayList<Libro>
  + anyadirLibro(Libro): void
  + eliminarLibro(Libro): void
}

Estudiante "1" o-- "*" Libro : librosPrestados
Libro "1" -- "1" Estudiante : estudiantePrestado
Libro "1" -- "1" Prestamo
Estudiante "1" -- "*" Prestamo
Libro "1" -- "1" Editorial : pertenece a
Editorial "1" o-- "*" Libro : publica

@enduml

````

## Programa principal

## Pruebas


## Entrega